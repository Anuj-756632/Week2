package encapsulationsprograms.hospitalmanagementsystem;

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;
    private double surgeryCharge;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate, double surgeryCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.surgeryCharge = surgeryCharge;
    }

    @Override
    public double calculateBill() {
        return (daysAdmitted * dailyRate) + surgeryCharge;
    }

    // Getters for encapsulation
    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getSurgeryCharge() {
        return surgeryCharge;
    }
}
