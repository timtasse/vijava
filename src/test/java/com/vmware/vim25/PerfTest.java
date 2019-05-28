package com.vmware.vim25;

import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.PerformanceManager;
import com.vmware.vim25.mo.ServiceInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 06.11.18.
 */
public class PerfTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerfTest.class);
    public static final int[] COUNTER_IDS = {262144, 655362, 655363, 655370, 655371, 655366, 131078, 131079, 131091, 131076, 131077, 262171,
            196616, 196621, 196617, 196625, 196619, 196623, 196609, 196614, 196620, 196624, 196615, 196622, 196618, 196612, 196613, 196626};

    @Test
    public void testCounter() throws Exception {
        final URL url = new URL("https://or-esx3-2.vmware.freenet-rz.de/sdk");
        final ServiceInstance si = new ServiceInstance(url, "kum", "#123kum", true);
        final HostSystem host = (HostSystem) new InventoryNavigator(si.getRootFolder()).searchManagedEntity(HostSystem.class.getSimpleName(), "or-esx3-2.vmware.freenet-rz.de");
        final PerformanceManager performanceManager = si.getPerformanceManager();
        final PerfCounterInfo[] perfCounterInfos = performanceManager.queryPerfCounter(COUNTER_IDS);
        LOGGER.debug("perfCounterInfos.count = {}", perfCounterInfos.length);
        final PerfMetricId[] perfMetricIds = performanceManager.queryAvailablePerfMetric(host, null, null, 20);
        LOGGER.debug("perfMetricIds.count = {}", perfMetricIds.length);
        final Map<Integer, List<String>> collect = Arrays.stream(perfMetricIds).map(val -> new AbstractMap.SimpleEntry<Integer, String>(val.getCounterId(), val.getInstance()))
                .collect(Collectors.groupingBy(val -> val.getKey(), Collectors.mapping(val -> val.getValue(), Collectors.toList())));
        final List<PerfMetricId> metricIdList = Arrays.stream(COUNTER_IDS).mapToObj(val -> Integer.valueOf(val))
                .flatMap(val -> collect.get(val).stream().map(entry -> {
                    final PerfMetricId id = new PerfMetricId();
                    id.setCounterId(val);
                    id.setInstance(entry);
                    return id;
                })).collect(Collectors.toList());
        final PerfMetricId[] metricIds = metricIdList.toArray(new PerfMetricId[]{});
        LOGGER.debug("metricIds.count = {}", metricIds.length);
        final PerfQuerySpec querySpec = new PerfQuerySpec();
        querySpec.setEntity(host.getMOR());
        querySpec.setMaxSample(3);
        querySpec.setMetricId(metricIds);
        querySpec.setIntervalId(20);
        final PerfEntityMetricBase[] queryPerf = performanceManager.queryPerf(new PerfQuerySpec[]{querySpec});
        LOGGER.debug("queryPerf.count = {}", queryPerf.length);
        Arrays.stream(queryPerf).map(val -> (PerfEntityMetric) val).forEach(val -> LOGGER.debug("{} : {}", val.getSampleInfo(), val.getValue()));
        final PerfEntityMetric perfEntityMetric = (PerfEntityMetric) queryPerf[0];
        Arrays.stream(perfEntityMetric.getSampleInfo()).forEach(val -> LOGGER.debug("interval={}, timestamp={}", val.getInterval(), val.getTimestamp().getTime()));
        for (PerfMetricSeries metricSeries : perfEntityMetric.getValue()) {
            final PerfMetricIntSeries metricIntSeries = (PerfMetricIntSeries) metricSeries;
            if (metricIntSeries.getId().counterId == 196624 || metricIntSeries.getId().counterId == 196625) {
                LOGGER.debug("{}.{} = {}", metricIntSeries.getId().counterId, metricIntSeries.getId().getInstance(), metricIntSeries.getValue());
            }
        }
        si.getServerConnection().logout();
    }

    @Test
    public void testInterval() throws Exception {
        while (true) {
            this.testCounter();
            Thread.sleep(60000);
        }
    }

}
