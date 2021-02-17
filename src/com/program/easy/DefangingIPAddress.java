package com.program.easy;

public class DefangingIPAddress {

	public static void main(String[] args) {
		DefangingIPAddress obj =  new DefangingIPAddress();
		
		String ipAddress = obj.defangIPaddr("255.100.50.0");
		System.out.println(ipAddress);
	}
	
	public String defangIPaddr(String address) {
		int leftP = 0, rightP = 0;
		String newStr = "";
		for(int i = 0; i<address.length(); i++) {
			if(address.charAt(i) == '.') {
				rightP = i;
				newStr = newStr.concat(address.substring(leftP, rightP)).concat("[.]");
				leftP = i+1;
			} 
		}
		newStr = newStr.concat(address.substring(leftP, address.length()));
        return newStr;
    }

}

