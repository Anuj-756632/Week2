package encapsulationsprograms.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

class InPatientWithRecords extends InPatient implements MedicalRecord {
    private List<String> medicalRecords;

    public InPatientWithRecords(String patientId, String name, int age, int daysAdmitted, double dailyRate, double surgeryCharge) {
        super(patientId, name, age, daysAdmitted, dailyRate, surgeryCharge);
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for In-Patient: " + getName());
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}
