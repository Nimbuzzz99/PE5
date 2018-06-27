package main.java.exercise;

import java.util.*;

public class AddAndRemove {
    public static List<String> update(List<String> update){
    	update.set(0, "kiwi");
    	return update;
    }
    public static List<?> remove(List<String> remove){
        remove.clear();
        return remove;
    }
}
