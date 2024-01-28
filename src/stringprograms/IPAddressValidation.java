package stringprograms;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressValidation {
    public static void main(String[] args) {
		String str="123.176.34.76";
		try {
			InetAddress ipa = InetAddress.getByName(str);
			if(ipa instanceof Inet4Address) {
				System.out.println(ipa+" is valid IP4 Address");
			}else if(ipa instanceof Inet6Address) {
				System.out.println(ipa+" is valid IP6 Address");
			}else {
				System.out.println("Invalid IP Address");
			}
		} catch (UnknownHostException e) {
			System.out.println("Invalid IP Address");
		}
	}
}
