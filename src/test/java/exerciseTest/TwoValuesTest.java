package test.java.exerciseTest;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import main.java.exercise.TwoValues;

public class TwoValuesTest {

	@Test
	public void testSwap() {
		HashMap<String , String> exp1 = new HashMap<String , String>();
		HashMap<String , String> exp2 = new HashMap<String , String>();
		exp1.put("value1", "java");
		exp1.put("value2", "c++");
		exp2.put("value1", " ");
		exp2.put("value2", "java");
		assertEquals(exp2 , TwoValues.swap(exp1));
	}

}
