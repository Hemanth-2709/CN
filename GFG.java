package Program4;
//Program to determine the IP address and host name of the local computer.

import java.io.*;
import java.net.InetAddress;
public class GFG {
public static void main(String[] args) throws Exception {
InetAddress addr = InetAddress.getLocalHost();
System.out.println("Local HostAddress: "+ addr.getHostAddress());
System.out.println("Local host name: "+ addr.getHostName());
}
}