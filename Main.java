




import java.lang.management.ManagementFactory;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;

class Main {
  public static void main(String[] args) throws InstanceNotFoundException, AttributeNotFoundException, MalformedObjectNameException, ReflectionException, MBeanException  {
  /* Total number of processors or cores available to the JVM */
  

      MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
      Object attribute = mBeanServer.getAttribute(new ObjectName("java.lang","type","OperatingSystem"), "TotalPhysicalMemorySize");
      Object attribute2 = mBeanServer.getAttribute(new ObjectName("java.lang","type","OperatingSystem"), "FreePhysicalMemorySize");
      System.out.println("Total memory: "+ Long.parseLong(attribute.toString()) / 1024/1024/1024   + " Go");
      System.out.println("Free  memory: "+ Long.parseLong(attribute2.toString()) / 1024/1024/1024  + " Go");	

 }
}
