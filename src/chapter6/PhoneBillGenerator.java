package chapter6;

import java.util.Scanner;

public class PhoneBillGenerator {

    private Scanner scanner = new Scanner(System.in);
    private double overageRate = 0.25;
    private double taxRate = 0.07;


    public static void main(String[] args) {

        PhoneBillGenerator billGenerator = new PhoneBillGenerator();
        PhoneBill bill01 = billGenerator.printBill();
        int overage = billGenerator.printOverage(bill01);
        bill01.genStatement();

        System.out.println("Overage is " + overage);

        billGenerator.scanner.close();
    }

    public PhoneBill printBill(){
        System.out.println("What is the bill ID?");
        int billId = scanner.nextInt();
        System.out.println("What is the base plan cost?");
        double baseCost = scanner.nextDouble();
        System.out.println("How many minutes are included in the plan?");
        int planMinutes = scanner.nextInt();
        System.out.println("How many minutes were used this month?");
        int minutesUsed = scanner.nextInt();
        System.out.println("What is the overage cost?");
        double overageCost = scanner.nextDouble();
        System.out.println("What is the tax rate?");
        double taxRate = scanner.nextDouble();

        return new PhoneBill(billId, baseCost, planMinutes, minutesUsed);
    }

    public PhoneBill getBill(){
        System.out.println("Please enter the Bill ID:");
        int billId = scanner.nextInt();
        System.out.println("Please enter the base plan cost:");
        double baseCost = scanner.nextDouble();
        System.out.println("Please enter the base minutes:");
        int baseMinutes = scanner.nextInt();
        System.out.println("Please enter the minutes used:");
        int usedMinutes = scanner.nextInt();

        return new PhoneBill(billId, baseCost, baseMinutes, usedMinutes);
    }

    public double getSubtotal(PhoneBill billName){
        return billName.calculateSubtotal(overageRate);
    }

    public PhoneBill getOverage(){
        System.out.println("How many minutes are included in the plan?");
        int planMinutes = scanner.nextInt();
        System.out.println("How many minutes were used this month?");
        int minutesUsed = scanner.nextInt();

        return new PhoneBill(planMinutes, minutesUsed);
    }

    public int printOverage(PhoneBill billName){
        return billName.calculateOverage();
    }

}
