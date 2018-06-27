package test.java.exerciseTest;

import static org.junit.Assert.*;

import java.util.*;
import main.java.exercise.*;
import main.java.exercise.SortedSet;

import org.junit.Test;

public class SortedSetTest {

	@Test
	public void testOrder() {
		Set<String> exp1 = new HashSet<String>();
		exp1.add("Harry");
		exp1.add("Olive");
		exp1.add("Alice");
		exp1.add("Bluto");
		exp1.add("Eugene");
		Set<String> exp2 = new TreeSet<String>();
		exp2.add("Harry");
		exp2.add("Olive");
		exp2.add("Alice");
		exp2.add("Bluto");
		exp2.add("Eugene");
		assertEquals(exp2 , SortedSet.order(exp1));
	}
	
	@Test
	public void testSetConversion() {
		Set<String> exp1 = new HashSet<String>();
		exp1.add("Harry");
		exp1.add("Olive");
		exp1.add("Alice");
		exp1.add("Bluto");
		exp1.add("Eugene");
		List<String> exp2 = new ArrayList<String>();
		exp2.add("Alice");
		exp2.add("Bluto");
		exp2.add("Eugene");
		exp2.add("Harry");
		exp2.add("Olive");
		assertEquals(exp2 , SortedSet.setConversion(exp1));
	}

}
