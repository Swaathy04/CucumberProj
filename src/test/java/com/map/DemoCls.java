package com.map;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class DemoCls {
	
	public static void main(String[] args) {
		
		List<LinkedHashMap<String,String>> li1 = new ArrayList<LinkedHashMap<String,String>>();
		
		//0
		
		LinkedHashMap<String, String> m1 = new LinkedHashMap<String, String>();
		
		m1.put("firstname", "Swaathi");
		m1.put("surname", "K");
		m1.put("mobile num", "9876453621");
		m1.put("new password", "sweet123");
		
		// 1
		
LinkedHashMap<String, String> m2 = new LinkedHashMap<String, String>();
		
		m2.put("firstname", "Twinkle");
		m2.put("surname", "U");
		m2.put("mobile num", "8967551954");
		m2.put("new password", "twin5678");
		
		li1.add(m1);
		li1.add(m2);
		
		
	}

}
