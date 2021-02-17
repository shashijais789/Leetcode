package com.program.medium;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int arr[] = {3,4,5,2,7,9,1,4};
		
		
		
	}
	
	public int getSecondHighest(int a[]) {
		
		int len = a.length;
		int max=0, max2=0;
		
		max =a[0]; 
		max2 = max; 
		for(int i=1;i<len;i++) {
			if(max<a[i]) {
				max2 = max;
				max = a[i];
			}
		}
		
		
		return max2;
	}
	
	
	public List<Student> getStudentListWithMarksGreaterThan800(){
		Student s1 = new Student("S101", "Ram1", 900);
		Student s2 = new Student("S102", "Ram2", 1000);
		Student s3 = new Student("S103", "Ram3", 600);
		Student s4 = new Student("S104", "Ram4", 500);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		return studentList;
		
		//studentList.stream().allMatch(predicate)
	}

}

class Student {
	private String id;
	private String name;
	private int marks;
	public Student(String id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	//getter and setter
}


