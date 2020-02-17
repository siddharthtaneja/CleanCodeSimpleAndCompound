package CleanCode;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
        Scanner s = new Scanner(System.in);
        myout.println("Enter 1 to calculate Simple or Compound INterest" + "\n" + "Enter 2 to calculate House Construction cost" + "\n" + "Enter 0 to exit ");
        int choice = s.nextInt();

        SimpleAndCompoundInterest simpleAndCompoundInterest = new SimpleAndCompoundInterest();
        HouseConstruction houseConstruction = new HouseConstruction();
        while(choice != 0) {
            if (choice == 1) {
                simpleAndCompoundInterest.SimpleOrCompound();
            } else if (choice == 2) {
                houseConstruction.Function();
            } else {
                myout.println("Plz Enter a valid choice");
            }
            myout.println("Enter 1 to calculate Simple or Compound INterest" + "\n" + "Enter 2 to calculate House Construction cost" + "\n" + "Enter 0 to exit ");
            choice = s.nextInt();
        }
    }
}
