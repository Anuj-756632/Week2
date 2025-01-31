package encapsulationsprograms.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patient objects
        InPatientWithRecords inPatient = new InPatientWithRecords("IP001", "John Doe", 45, 5, 300.0, 1000.0);

        // Adding medical records
        inPatient.addRecord("Surgery performed on 01/10/2025.");
        inPatient.addRecord("Recovered well, discharge planned for 01/15/2025.");



        // Creating a list of patients
        List<Patient> patients = new ArrayList<>();
        patients.add(inPatient);


        // Processing the patients and calculating their bills
        double totalRevenue = 0;
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            double totalBill = patient.calculateBill();
            System.out.println("Total Bill: " + totalBill);
            totalRevenue += totalBill;
            System.out.println();

            if (patient instanceof MedicalRecord) {
                MedicalRecord recordPatient = (MedicalRecord) patient;
                recordPatient.viewRecords();
                System.out.println();
            }
        }

        // Display total revenue
        System.out.println("Total Revenue Generated: $" + totalRevenue);
    }
}

