import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        

        System.out.print("ENTER THE ROLL NUMBER: ");
        int rollnumber = s1.nextInt();
        
        s1.nextLine();
        

        System.out.print("ENTER THE NAME OF STUDENT: ");
        String name = s1.nextLine();

        System.out.print("ENTER PHYSICS MARKS: ");
        int physics = s1.nextInt();

        System.out.print("ENTER CHEMISTRY MARKS: ");
        int chemistry = s1.nextInt();

        System.out.print("ENTER COMPUTER APPLICATION MARKS: ");
        int computerapplication = s1.nextInt();

        int totalmarks = physics + chemistry + computerapplication;
        int maxmarks = 300;
        double percentage = (totalmarks * 100.0) / maxmarks;

        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 80) {
            System.out.println(name + " got FIRST DIVISION");
        } else if (percentage >= 70) {
            System.out.println(name + " got SECOND DIVISION");
        } else if (percentage >= 60) {
            System.out.println(name + " got THIRD DIVISION");
        } else {
            System.out.println(name + " is FAIL");
        }

        s1.close();
    }
}
