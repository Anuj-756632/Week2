package inheritanceproblems.assestedproblems;
import java.util.Random;
public class UseEmployee {
    public static String idGenerator(){
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        String rand_int1 = Integer.toString(rand.nextInt(1000));
        return rand_int1;
    }
    public static void main(String[] args){
        Manager manager=new Manager("Vishal",idGenerator(),500000,5);
        manager.displayDetails();
        Developer developer=new Developer("Anuj",idGenerator(),1500000,"JAVA");
        developer.displayDetails();
        Intern intern=new Intern("XYz",idGenerator(),20000);
        intern.displayDetails();
    }
}
