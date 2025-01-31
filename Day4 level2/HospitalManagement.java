import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor to initialize the hospital
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to show all doctors in the hospital
    public void showDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("  Doctor: " + doctor.getName());
        }
    }

    // Method to show all patients in the hospital
    public void showPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println("  Patient: " + patient.getName());
        }
    }
}

//Doctor class
public class Doctor {
    private String name;
    private List<Patient> patients; // A doctor can consult multiple patients

    // Constructor to initialize the doctor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Method for a doctor to consult with a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            System.out.println(name + " is consulting " + patient.getName());
        } else {
            System.out.println(name + " has already consulted " + patient.getName());
        }
    }

    // Get the name of the doctor
    public String getName() {
        return name;
    }

    // Method to show all patients the doctor has consulted
    public void showConsultedPatients() {
        System.out.println(name + " has consulted the following patients:");
        for (Patient patient : patients) {
            System.out.println("  Patient: " + patient.getName());
        }
    }
}

//Patient Classs
public class Patient {
    private String name;
    private List<Doctor> doctors; // A patient can consult multiple doctors

    // Constructor to initialize the patient
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Method for a patient to consult with a doctor
    public void consult(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            System.out.println(name + " is consulting " + doctor.getName());
        } else {
            System.out.println(name + " has already consulted " + doctor.getName());
        }
    }

    // Get the name of the patient
    public String getName() {
        return name;
    }

    // Method to show all doctors the patient has consulted
    public void showConsultedDoctors() {
        System.out.println(name + " has consulted the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  Doctor: " + doctor.getName());
        }
    }
}

//
public class HospitalManagement {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");

        // Create patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Show all doctors and patients in the hospital
        hospital.showDoctors();
        hospital.showPatients();

        // Simulate consultations between doctors and patients
        doctor1.consult(patient1); // Dr. Smith consults Alice
        doctor1.consult(patient2); // Dr. Smith consults Bob
        doctor2.consult(patient1); // Dr. Johnson consults Alice

        // Show the patients consulted by each doctor
        doctor1.showConsultedPatients();
        doctor2.showConsultedPatients();

        // Show the doctors consulted by each patient
        patient1.showConsultedDoctors();
        patient2.showConsultedDoctors();
    }
}
