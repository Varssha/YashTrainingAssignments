package collections;

import java.util.Arrays;
import java.util.List;

public class ResultTest {

	public static void main(String[] args) {

		
		Student s = new Student(101, "vishal", "java", 490);
		Student s1 = new Student(105, "Neha", ".net", 330);
		Student s2 = new Student(104, "amit", "python", 420);
		Student s3 = new Student(106, "Ram", "cc", 220);
		
		List<Student> list = Arrays.asList(s, s1, s2, s3);
		
		list.stream().sorted((o1,o2)->o2.getTotalmarks()-o1.getTotalmarks()).limit(3).forEach(System.out::println);
//		System.out.println(list);

		for (Student student : list) {
			int avg = (student.getTotalmarks() * 100 / 500);
		//	System.out.println(avg);

			if (avg < 50 && avg > 35) {
				System.out.println("student name who score between 50% to 35 %  :" + student.getSname());
			} else if (avg < 35) {
				System.out.println("student name who score below 35%  :" + student.getSname());
			} else if (avg > 75) {
				System.out.println("student name who score above 75%  :" + student.getSname());
			}
		}
		System.out.println("==============================================");
		list.stream().sorted((a,b)->b.getTotalmarks()-a.getTotalmarks()).limit(2).forEach(System.out::println);
		for (Student student : list) {
			System.out.println(student);
		}
		//System.out.println("First Rank Student is :- "+first.get().getName()+" with totalMarks are : "+first.get().getTotalMarks());
	}
}
