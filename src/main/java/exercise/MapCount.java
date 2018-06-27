package main.java.exercise;

import java.util.*;

public class MapCount {
		public static String count(String str) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			String str1[] = str.split("\\s"); 
			for(String s : str1) {
				if(map.containsKey(s)) {
					 int count = map.get(s);
	                 map.put(s, count + 1);
				}
				else {
					map.put(s,1);
				}
			}
			String concat = "";
			for(String k : map.keySet()) {
				Integer value = map.get(k);
				concat += k +"="+value+" ";
			}
			return concat.trim();
		}
}
