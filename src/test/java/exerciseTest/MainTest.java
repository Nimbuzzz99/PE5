package test.java.exerciseTest;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import main.java.exercise.Student;
import main.java.exercise.StudentSorter;

public class MainTest {
	
	@Test
	public void stuComp() {
		Student s1 = new Student(111, 20, "Gohan");
		Student s2 = new Student(112, 25, "chichi");
		Student s3 = new Student(113, 25, "vegeta");
		Student s4 = new Student(114, 26, "Goku");
		Student s5 = new Student(115, 30, "Roshi");
		List<Student> studentCompare = new ArrayList<Student>();
		studentCompare.add(s1);
		studentCompare.add(s2);
		studentCompare.add(s3);
		studentCompare.add(s4);
		studentCompare.add(s5);
		Collections.sort(studentCompare, new StudentSorter());
		assertEquals("[Student [id=115, age=30, name=Roshi], Student [id=114, age=26, name=Goku], Student [id=113, age=25, name=vegeta], "
				+ "Student [id=112, age=25, name=chichi], Student [id=111, age=20, name=Gohan]]",studentCompare.toString());
	}
}
