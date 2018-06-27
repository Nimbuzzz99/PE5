package test.java.exerciseTest;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import main.java.exercise.MapCount;

public class MapCountTest {

	@Test
	public void testCount() {
		assertEquals("one=5 two=2 three=2",MapCount.count("one one one two three one three one two"));
	}

}
