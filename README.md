# Enhanced vijava Library

## History

This library is an evolution of the [old vijava lib](http://vijava.sf.net).
The original README and release notes can be found in the files [OLD_README.txt](OLD_README.txt) and [rel-note.txt](rel-note.txt)

## License

This library is distributed under the BSD-3 License.
The original license information is found in [License.txt](License.txt)
I cannot give any guaranty for this library, and you use it on your own risk.

## Versioning

The versioning is now changed, so you can see what API version is implemented.
Here an example:</br>
7.0.1-2.5 -> 7.0.1 is the implemented API Version and 2.5 is the Version of the library itself

## Changelog

#### 7.0.1-2.5.3
  * GuestInfo.hwVersion is now implemented
  * VirtualMachineGuestSummary.hwVersion is now implemented

#### 7.0.1-2.5.2
  * Error in HostNetworkSystem.queryNetworkHint fixed
  * XML generation can now handle Lists

#### 7.0.1-2.5.1
  * VirtualMachineConfigSummary.hwVersion is now implemented
  * DateFormatter is now thread-safe handled
  * a non existing field is now only logged as Error Level Message and not throws a NoSuchFieldException

#### 7.0.1-2.5
  * API Version up to 7.0.1 is fully implemented, but not fully tested (i do not have enough features in test environment)
  * migrating methods from the large VimStub class into the ManagedObjects  itself, so handling is more intuitive and not much indirect
  * the heavily used classes have now correct exception handling, no more throwing of only RemoteException
  * renaming some methods with an illegal naming e.g. _Task suffix
  * **BREAKING_CHANGE**: because of renaming and exception handling it is important to change the code that uses this library

#### 2.0.1
  * wrong ordering of the fields in the classes, the ordering is important on some DataObjects

#### 2.0.0
  * improved some methods and try to generify some of them
  * use more than one HTTP library, automatically decide the fastest version (Apache HttpClient, Java11 HttpClient and the old Java HttpUrlConnection)

## Usage

You can use this library for connecting to a ESX or vCenter Server.
The entrypoint is the ServiceInstance class, there you find all other methods and classes.
To use the library it is very helpful to look in the official API documentation, currently it is found under [All APIs in Version 7.0](https://code.vmware.com/web/sdk/7.0/vsphere-management) and more precise [direct to vSphere Web Services API](https://code.vmware.com/apis/1067/vsphere)

Here is a short code snippet
```java
public class Test {
    public void test() throws Exception {
        final URL url = new URL("https://" + HOSTNAME + "/sdk");
        instance = new ServiceInstance(url, USERNAME, PASSWORD, true);

        final Capability capability = instance.getCapability();
        LOGGER.debug(capability.toString());
        
        instance.getServerConnection().logout();
    }
}
```

the sample and samples folders are old ones that maybe not usable anymore, but it should be useful to imagine a normal usage.

## Next Steps

- [ ] more rewriting of classes and convert to more modern code style
- [ ] convert more arrays to Lists, for input and output
- [ ] implement an alternative to dom4j, current measurements shows the implementation in Java11 is faster than dom4j
- [ ] implement the VMware Storage Policy API to also use storage profiles
