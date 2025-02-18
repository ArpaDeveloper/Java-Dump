package main;

public class Author {
   
    //Variables
    private String name;
    private String nationality;

    //Constructor
    public Author(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }
}
