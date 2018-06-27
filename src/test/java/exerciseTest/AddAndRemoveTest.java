package test.java.exerciseTest;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import main.java.exercise.AddAndRemove;

public class AddAndRemoveTest {

	@Test
	public void testUpdate() {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grape");
		list.add("melon");
		list.add("berry");
		List<String> list1 = new ArrayList<String>();
		list1.add("kiwi"); list1.add("grape"); list1.add("melon"); list1.add("berry");
		assertEquals(list1 , AddAndRemove.update(list));
	}

	@Test
	public void testRemove() {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grape");
		list.add("melon");
		list.add("berry");
		List<String> list1 = new ArrayList<String>();
		assertEquals(list1 , AddAndRemove.remove(list));
	}

}
