public class Patient {
    // Static variable to store the hospital name shared across all patients
    static String hospitalName = "City Hospital";

    // Static variable to track the total number of patients admitted
    static int totalPatients = 0;

    // Instance variables for name, age, ailment, and final patientID
    String name;
    int age;
    String ailment;
    final String patientID;  // final variable to ensure patientID is unique and cannot be changed

    // Constructor to initialize name, age, and ailment, and automatically assign a unique patientID
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;  // Increment the total patient count whenever a new patient is added
    }

    // Static method to get the total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails(Object obj) {
        // Check if the object is an instance of Patient before displaying details
        if (obj instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("This is not a valid patient object.");
        }
    }

    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient("Alice", 30, "Flu", "P001");
        Patient patient2 = new Patient("Bob", 45, "COVID-19", "P002");

        // Display total patients admitted
        Patient.getTotalPatients();

        // Display patient details
        patient1.displayDetails(patient1);
        patient2.displayDetails(patient2);

        // Trying to display details with a non-patient object (invalid operation)
        String notAPatient = "Not a patient";
        patient1.displayDetails(notAPatient);
    }
}
