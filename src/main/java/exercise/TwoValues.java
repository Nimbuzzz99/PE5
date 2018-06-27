package main.java.exercise;

import java.util.*;

public class TwoValues {
	public static HashMap<String , String>swap(HashMap<String, String> exp1){
		if(!(exp1.get("value1") == "")) {
			exp1.put("value2", exp1.get("value1"));
			exp1.put("value1", " ");
		}
		return exp1;
	}

}
