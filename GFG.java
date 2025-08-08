package Program3and4;
//PROGRAM-3
//Program to find the IP address of the given hostname:

import java.io.*;
import java.util.*;
import java.net.*;
public class GFG {
public static void main(String[] args) {
String host = "www.google.com"; 
try {
InetAddress[] iaddress = InetAddress.getAllByName(host);
for (InetAddress ipaddresses : iaddress)
{
System.out.println(ipaddresses.toString());
}
}
catch (UnknownHostException e) {
System.out.println(e);
}
}
}



//PROGRAM-4
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