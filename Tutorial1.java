import java.util.Scanner;
public class Tutorial1 {
    public static void main(String[] args) {
        System.out.println("Hello,World");
        Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your name: ");
     String name = scanner.nextLine();

     System.out.print("Enter your student ID: ");
     String studentID = scanner.nextLine();

     System.out.print("Enter your coding mark: ");
     String codingMarks = scanner.nextLine();

     System.out.println("Hello " + name + studentID);
     System.out.println("Coding Marks is " + codingMarks);




}
}