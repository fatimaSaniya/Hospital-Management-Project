package Hospital_Management;

public class Doctor {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final String speciality;
    public Doctor(String name,String speciality){
        this.id = ++idCounter;
        this.name = name;
        this.speciality = speciality;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "Patient Id: " + id + "/nName: " + name+ "/nSpeciality: " + speciality;
    }
}
