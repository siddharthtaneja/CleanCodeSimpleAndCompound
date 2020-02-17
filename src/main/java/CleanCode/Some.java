package CleanCode;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class SimpleAndCompoundInterest {
    PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
    Scanner s = new Scanner(System.in);
    double Principal;
    double Rate;
    double Amount;
    int Time;
    double res;
    void Intro(){
        myout.println("Enter 1 for Simple Interest " + "\n" + "Enter 2 for Compound Interest" + "\n" + "Enter 0 to exit the application");
    }
    void Principal(){
        myout.println("Enter Principal Amount");
    }
    void Time(){
        myout.println("Enter Time");
    }
    void rate(){
        myout.println("Enter rate of interest");
    }
    void SimpleOrCompound() {
        Intro();
        int Choice = s.nextInt();
        while(Choice != 0) {
            if (Choice == 1) {
                SimpleInterest();
                Intro();
            } else if (Choice == 2) {
                CompoundInterest();
                Intro();
            } else {
                myout.println("Enter a valid choice");
                Intro();
            }
            Choice = s.nextInt();
        }
    }

    void SimpleInterest() {
        Principal();
        Principal = s.nextInt();
        rate();
        Rate = s.nextInt();
        Time();
        Time = s.nextInt();
        res =(double)(Principal * Rate * Time)/100;
        myout.println("Simple Interest :" + res);
    }
    void CompoundInterest() {
        Principal();
        Principal = s.nextInt();
        rate();
        Rate = s.nextInt();
        Time();
        Time = s.nextInt();
        Amount = Principal * ( Math.pow(1+(Rate/100),Time) );
        res = Amount - Principal;
        myout.println("Compound Interest :" + res);
    }
}
