package inheritanceproblems.assestedproblems;

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer Details");
        super.displayDetails();
        System.out.println("Language: "+programmingLanguage);
    }
}
