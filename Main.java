package main;


public class Main 
{
    public static void main( String[] args )
    {
        //Inputs/Variables
        String courseName = "Programming 101";
        int maxStudents = 30;
        String name1 = "John Smith";
        String studentId1 = "S001";
        String name2 = "Alice Johnson";
        String studentId2 = "S002";
        
        Course course = new Course(courseName, maxStudents);
        Student student1 = new Student(name1, studentId1);
        Student student2 = new Student(name2, studentId2);

        
        System.out.println("Course Information:");
        System.out.println("Name: "+ course.getCourseName());
        System.out.println("Maximum students: "+ course.getMaxStudents());
        System.out.println();
        System.out.println("Student Information:");
        System.out.println("Student 1 - Name: "+ student1.getName()+", ID: "+student1.getStudentId());
        System.out.println("Student 2 - Name: "+ student2.getName()+", ID: "+student2.getStudentId());

    }
}
