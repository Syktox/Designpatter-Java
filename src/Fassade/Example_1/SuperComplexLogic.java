package Fassade.Example_1;

import java.util.Scanner;

public class SuperComplexLogic {
    private void print() {
        System.out.println("Printed");
    }

    private void calculateProcess() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib 2 Zahlen ein: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.println(x + y);
    }

    private void DoSomeThingCool() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Message ein");
        String message = scan.next();
        System.out.println(message);
    }

    public void fassade() {
        print();
        calculateProcess();
        DoSomeThingCool();
    }
}
