package Student_Info;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import customexpection.StudentNotFoundException;
import customsorting.Sortstudentbymarks;
public class Student_management1 implements Student_management{
   
	Map<String,Student> db=new LinkedHashMap<String, Student>();
	Scanner sc=new Scanner(System.in);
	@Override
	public void addStudent() {
		
		 System.out.println("enter name of student");
		String Sname=sc.next();
		 System.out.println("enter the subject name");
		 String subjects=sc.next();
		 System.out.println("enter the grades");
		 int grades=sc.nextInt();
		 Student s=new Student(Sname, subjects, grades);
		 db.put(s.getSid(), s);
		  System.out.println("Student Record is successfully inserted");
		  System.out.println("your Student Id is "+s.getSid());
	}

	@Override
	public void removeStudent() {
		System.out.println("enter the student id");
		String sid=sc.next();
		sid=sid.toUpperCase();
		if(db.containsKey(sid))
		{
			Student s=db.get(sid);
			System.out.println(s);
			db.remove(sid);
			System.out.println("Student with id "+sid+" deleted Successfully");
		}
		
	}

	
	
	@Override
	public void displayStudent() {
		System.out.println("enter Student Id: ");
		String sid=sc.next().toUpperCase();
       
		//id=id.toUppercase();//convert-> touppercase()
		//checking if id is present or not using containKey()
		if(db.containsKey(sid))
		{
			//if->get the value(Student Object) ->use getter methods
			System.out.println("Student Record present");
			Student s=db.get(sid);
			System.out.println("Student Details:");
			System.out.println("-------------------------");
			System.out.println("Id: "+s.getSid());
			System.out.println("Name: "+s.getSname());
			System.out.println("SUbjects: "+s.getSubjects());
			System.out.println("Grades: "+s.getGrades());
		}
		else
		{
			try {
				String message="Student with id "+sid+" is not found";
				throw new StudentNotFoundException(message);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void displayAllStudent() {
		if(!db.isEmpty())
		{
			System.out.println("Students records are as follows: ");
			System.out.println("----------------------------");

			Set<String> keys=db.keySet();//JSP101 JSP102 JSP103......
			for(String key:keys)
			{ 
				
				System.out.println(db.get(key));
			}
		}
		else
		{
			// StudentNotFoundException -> custom message
			try {
				String messege="no students record are to display";
				throw new StudentNotFoundException(messege);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}

		}
		
	}

	
	

	@Override
	public void findStudentwithHighestgrade() {
		List <Student> list=new ArrayList<Student>();
		Set<String> keys=db.keySet();
		for(String key :keys)
		{
			list.add(db.get(key));
		}
		Collections.sort(list,new Sortstudentbymarks());
		System.out.println("Highest grade: " +list.get(list.size()-1));
		
	}

	@Override
	public void findStudentwithLowestgrade() {
		List <Student> list=new ArrayList<Student>();
		Set<String> keys=db.keySet();
		for(String key :keys)
		{
			list.add(db.get(key));
		}
		Collections.sort(list,new Sortstudentbymarks());
		System.out.println("lowest grade: " +list.get(0));
		
	}

	@Override
	public void findAvgeragegrade() {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		double[] grade=new double[size];
		System.out.println("enter the Student grades");
		for(int i=0;i<grade.length;i++)
		{
			grade[i]=sc.nextDouble();
		}
		 
		double sum=0;
		for(int i=0;i<grade.length;i++)
		 
		{
			sum=sum+grade[i];
		}
		 
		System.out.println("the average grade of the student is "+sum/grade.length);
		
	}
 
}
