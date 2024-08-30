import Hospital_Management_Objects.Appointment;
import Hospital_Management_Objects.Doctor;
import Hospital_Management_Objects.Patient;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("Hospital Management : ");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            ch = sc.nextInt();
            switch(ch){
                case 0 :
                    System.out.println("Exit!");
                    break;
                case 1 :
                    addPatient(sc);
                    break;
                case 2 :
                    addDoctor(sc);
                    break;
                case 3 :
                    scheduleAppointment(sc);
                    break;
                case 4 :
                    viewPatient();
                    break;
                case 5:
                    viewDoctor();
                    break;
                case 6 :
                    viewAppointment();
                    break;
                default :
                    System.out.println("Invalid choice, Try Again!");
            }
        }while (ch!=0);
    }
    private static void addPatient(Scanner sc) {
        System.out.println("Enter Patient name : ");
        String name = sc.nextLine();
        System.out.println("Enter Patient gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter Patient age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        Patient p = new Patient(name, gender, age);
        patients.add(p);
        System.out.println("Patient added successfully");

    }

    private static void addDoctor(Scanner sc) {
        System.out.println("Enter Doctor name : ");
        String name = sc.nextLine();
        System.out.println("Enter Doctor speciality: ");
        String speciality = sc.nextLine();
        Doctor d = new Doctor(name,speciality);
        doctors.add(d);
        System.out.println("Doctor added successfully!");
    }

    private static void scheduleAppointment(Scanner sc) {
        System.out.println("Enter patient name:");
        String patientName = sc.nextLine();
        System.out.println("Enter patient gender:");
        String patientGender = sc.nextLine();
        System.out.println("Enter patient age:");
        int patientAge = sc.nextInt();
        sc.nextLine(); // consume the newline

        Patient patient = new Patient(patientName, patientGender, patientAge);

        System.out.println("Enter doctor name:");
        String doctorName = sc.nextLine();
        System.out.println("Enter doctor speciality:");
        String doctorSpeciality = sc.nextLine();

        Doctor doctor = new Doctor(doctorName, doctorSpeciality);

        System.out.println("Enter appointment date (YYYY-MM-DD):");
        String date = sc.nextLine();

        Appointment appointment = new Appointment(patient, doctor, date);
        appointments.add(appointment);

        System.out.println("Appointment scheduled successfully!");
    }
    private static void viewAppointment() {
        System.out.println(appointments);
    }

    private static void viewDoctor() {
        System.out.println(doctors);
    }

    private static void viewPatient() {
        System.out.println(patients);
    }

}