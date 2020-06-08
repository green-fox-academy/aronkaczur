import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Cohort extends  Person{
   private String name;
   private ArrayList<Student> students;
   private ArrayList<Mentor> mentors;

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<Student>();
        this.mentors = new ArrayList<Mentor>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addMentor(Mentor mentor){
        this.mentors.add(mentor);
    }

    public void info(){
        System.out.println("This "+this.name+" cohort has "+this.students.size()+" students and "+this.mentors.size()+" mentors.");
    }

}
