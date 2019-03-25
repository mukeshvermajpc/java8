package com.funcational;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExamThree {
   public static void main(String args[])
   {
	   Function<Student,String>f=s->{
		 int marks=s.marks;
		 String grade="";
		 if(marks>80)grade="A[Dictinction]";
		 else if(marks>60)grade="B[First Division]";
		 else if(marks>50)grade="C[Second Class]";
		 else if(marks>35)grade="D[Third Class]";
		 else grade="D[Failed]";
		 return grade;
	   };
	   Predicate<Student>p=s->s.marks>60;
	   Student[] stu= {
			          new Student("Durga",100),
			          new Student("Sunny",80),
			          new Student("Manish",60),
			          new Student("Rahul",45),
			          new Student("Sunil",25)
	   				  };
	   for(Student s1:stu)
	   {
		   if(p.test(s1))
		   {
			   System.out.println("Student Name: "+s1.name);
			   System.out.println("Student Marks: "+s1.marks);
			   System.out.println("Student grade: "+f.apply(s1));
		       System.out.println(); 
		   }

	   }
   }
}
