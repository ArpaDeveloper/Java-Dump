package main;

public class Course {
 
   //Variables
    private String courseName;
    private int maxStudents;

    //Constructor
    public Course(String courseName, int maxStudents){
        this.courseName = courseName;
        this.maxStudents = maxStudents;
    }

    //Getters
    public String getCourseName(){
         return courseName;
    }

    public int getMaxStudents(){
         return maxStudents;
    }

}
