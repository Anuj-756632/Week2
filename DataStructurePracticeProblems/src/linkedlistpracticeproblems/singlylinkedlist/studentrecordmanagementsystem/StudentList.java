package linkedlistpracticeproblems.singlylinkedlist;

public class StudentList {
    private Student head;

    public StudentList(){
        this.head=null;
    }
    public void addAtBeginning(int rollNumber,String name,int age,char grade){
        Student newStudent=new Student(199,"Anuj",21,'A');
        newStudent.next=head;
        head=newStudent;

    }
    public void addAtEnd(int rollNumber,String name,int age,char grade){
        Student newStudent=new Student(121,"Abhi",20,'A');
        if(head==null){
            head=newStudent;
        }else{
            Student temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newStudent;
        }
    }
    public void addAtPosition(int rollNumber,String name,int age,char grade,int pos){
        Student newStudent=new Student(132,"julie",18,'B');
        if(pos==0){
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp=head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position is out of range.");
        } else {
            newStudent.next = temp.next;
            temp.next = newStudent;
        }

    }
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        } else {
            temp.next = temp.next.next;
        }
    }
    public void searchByRollNumber ( int rollNumber){
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

        // Display all student records
    public void displayAllStudents() {
        if (head == null) {
            System.out.println("No students in the list.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
    public void updateGrade(int rollNumber, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully for Roll No: " + temp.rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }
}
