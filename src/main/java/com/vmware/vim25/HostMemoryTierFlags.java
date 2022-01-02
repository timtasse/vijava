package com.vmware.vim25;

/**
 * Enumeration of flags pertaining to a memory tier.
 * Here are some examples of what the flags will look like for various memory configurations:
 * <p>
 * - Traditional memory (MemoryTieringType#noTiering): The host has a DRAM tier for the main memory and nothing else.
 * The DRAM tier will have the MemoryTierFlags#memoryTier flag.
 * - App Direct mode (MemoryTieringType#noTiering): The host has a DRAM tier and a PMem tier, but the two are independent and unrelated.
 * The PMem tier is non-volatile and is exposed as an NVDIMM device.
 * Applications can decide whether to direct the reads and writes to DRAM or PMem by using the appropriate system call.
 * The DRAM tier will have the MemoryTierFlags#memoryTier flag and the PMem tier will have the MemoryTierFlags#persistentTier flag.
 * - Memory mode (MemoryTieringType#hardwareTiering): The host has a DRAM tier and a PMem tier,
 * but the DRAM is hidden from applications and is just a cache for the PMem main memory.
 * The PMem tier is volatile, and is abstracted by the hardware layer to look like traditional memory.
 * Applications can read from/write to memory using the traditional memory system calls.
 * The memory controller in the hardware will internally direct those to the DRAM cache first,
 * and on a cache miss redirect them to the PMem main memory.
 * The DRAM tier will have the MemoryTierFlags#cachingTier flag and the PMem tier will have the MemoryTierFlags#memoryTier flag.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public enum HostMemoryTierFlags {

    cachingTier,
    memoryTier,
    persistentTier

}
