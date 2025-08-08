package Program3;
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