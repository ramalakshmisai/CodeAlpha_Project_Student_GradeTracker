package customsorting;

import java.util.Comparator;

import Student_Info.Student;

public class Sortstudentbymarks implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.getGrades()-y.getGrades();
	}

}
