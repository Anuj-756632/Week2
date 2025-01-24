public class Patient {
    // Static variable shared by all patients
    static String hospitalName = "City Hospital";  // Shared across all patients
    private static int totalPatients = 0;  // Counter to track total patients admitted

    // Final variable for patientID (ensures it cannot be changed once assigned)
    private final String patientID;

    // Instance variables for patient details
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize name, age, ailment, and patientID
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;  // Increment the total patient count when a new patient is added
    }

    // Static method to get the total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details if the object is an instance of Patient class
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("This is not a valid Patient object.");
        }
    }

    // Getter methods for patient details
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public String getPatientID() {
        return patientID;
    }

    public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient("Alice", 30, "Fever", "P12345");
        Patient patient2 = new Patient("Bob", 40, "Cough", "P12346");

        // Displaying total patients admitted
        Patient.getTotalPatients();

        // Displaying patient details
        patient1.displayPatientDetails(patient1);
        patient2.displayPatientDetails(patient2);
    }
}
