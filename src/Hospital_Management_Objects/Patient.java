package Hospital_Management;

public class Patient {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final String gender;
    private final int age;
    public Patient(String name,String gender, int age){
        this.id = ++idCounter;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public int getId(){
        return id;
    }

    public String toString(){
        return "Patient Id: " + id + "/nName: " + name+ "/nGender: " + gender + "/nAge: " +age;
    }
}
