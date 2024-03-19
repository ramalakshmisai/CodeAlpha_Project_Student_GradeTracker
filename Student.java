package Student_Info;

public class Student {
	private String sid;
 private String Sname;
 
 private String subjects;
 private int grades;
 static int count=101;
public Student(String sname,String subjects, int grades) {
	super();
	Sname = sname;
	this.sid="JSP"+count;
	count++;
	this.subjects = subjects;
	this.grades = grades;
}

public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSubjects() {
	return subjects;
}
public void setSubjects(String subjects) {
	this.subjects = subjects;
}
public int getGrades() {
	return grades;
}
public void setGrades( int grades) {
	this.grades = grades;
}
 
@Override
public String toString() {
	return "Student [Sname=" + Sname + ", sid=" + sid + ", subjects=" + subjects + ", grades=" + grades+ "]";
}

}
