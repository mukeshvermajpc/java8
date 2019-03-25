package com.consumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import com.funcational.Student;
public class ConsumerExampleTwo {
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
		   Consumer<Student>c=s1->{
			   System.out.println(s1.name);
			   System.out.println(s1.marks);
			   System.out.println(f.apply(s1));
			   System.out.println();
		   };
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
				  c.accept(s1);
		   }
	   }

}
