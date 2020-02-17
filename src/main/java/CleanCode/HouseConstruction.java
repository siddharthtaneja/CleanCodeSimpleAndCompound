package CleanCode;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class HouseConstruction {
    PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));

    Scanner s = new Scanner(System.in);
    int Choice;
    int area;

    void Intro() {
        myout.println("Press 1 for Standard Material" + "\n" + "Press 2 for Above Standards " + "\n" + "Press 3 for High Standards" + "\n" + "Press 4 for Fully Automated" + "\n" + "Press 0 for Exiting the Application");
    }

    void Function() {
        myout.println("Enter area of the house");
        area = s.nextInt();
        Intro();
        Choice = s.nextInt();
        while(Choice != 0) {
            if (Choice == 1) {
                Standard();
                Intro();
            }
            else if(Choice == 2) {
                AboveStandard();
                Intro();
            }
            else if(Choice == 3) {
                HighStandards();
                Intro();
            }
            else if(Choice == 4){
                FullyAutomated();
                Intro();
            }
            else {
                System.out.println("Inappropaite");
                Intro();
            }
            Choice = s.nextInt();
        }
    }

    void FullyAutomated() {
        myout.println(area * 2400);
    }

    void HighStandards() {
        myout.println(area * 1800);
    }

    void AboveStandard() {
       myout.println(area * 1500);
    }
    void Standard() {
        myout.println(area * 1200);
    }
}
