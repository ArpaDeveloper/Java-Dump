package main;

//Imports
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Student implements Serializable{

    //Variables
    private String s_name;
    private String s_number; //int

    //Arraylist for grades
    private ArrayList<Grade> studies = new ArrayList<>();

    //Constructor
    public Student(String s_name, String s_number){
        this.s_name = s_name;
        this.s_number = s_number;
    }

    public void addGrade(String course, int grade)
    {
       //Lets add a grade in the Arraylist
       studies.add(new Grade(course, grade));

    }

    public void printCourses() {
        if (studies.isEmpty()) {
            System.out.println("No courses completed yet.");
        } else {
            for (Grade grade : studies) {
                System.out.println(grade.getCourse()+": "+grade.getGrade());
            }
        }
    }
    
    public ArrayList<Grade> getGrades(){
        return studies;
    }

    //Getters
    public String getName(){
        return s_name;
    }

    public String getNumber(){
        return s_number;
    }
    
  
}
