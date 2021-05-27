package chapter6;

public class PhoneBill {

    // Fields
    private int billId;
    private double baseCost;
    private int planMinutes;
    private int minutesUsed;

    // Constructors
    public PhoneBill(){
        billId = 0;
        baseCost = 0;
        planMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int billId){
        setBillId(billId);
        System.out.println(billId);
    }

    public PhoneBill(int billId, double baseCost, int planMinutes, int minutesUsed){
        setBillId(billId);
        setBaseCost(baseCost);
        setPlanMinutes(planMinutes);
        setMinutesUsed(minutesUsed);
    }

    public PhoneBill(int planMinutes, int minutesUsed){
        setPlanMinutes(planMinutes);
        setMinutesUsed(minutesUsed);
    }

    // Getters and Setters for billId, baseCost, planMinutes, and minutesUsed
    public int getBillId() { return billId; }
    public void setBillId(int billId) { this.billId = billId; }

    public double getBaseCost() { return baseCost; }
    public void setBaseCost(double baseCost) { this.baseCost = baseCost; }

    public int getPlanMinutes() { return planMinutes; }
    public void setPlanMinutes(int planMinutes) { this.planMinutes = planMinutes; }

    public int getMinutesUsed() { return minutesUsed; }
    public void setMinutesUsed(int minutesUsed) { this.minutesUsed = minutesUsed; }

    // Things to do with the bill
    public int calculateOverage(){
        if (minutesUsed > planMinutes){
            System.out.println("Yes.");
            return minutesUsed - planMinutes;
        }
        else {
            System.out.println("No.");
            System.out.println(minutesUsed);
            return 0; }
    }

    public double calculateOverageCost(int overage, double overageRate){
        return overage * overageRate;
    }

    public double calculateSubtotal(double overageRate){
        return baseCost;
    }

    public void genStatement(){
        System.out.println("Billing Statement");
        System.out.println("Bill ID: " + billId);
        System.out.println("Plan Cost: $" + baseCost);
        System.out.println("Plan Minutes: " + planMinutes);
        System.out.println("Minutes Used: " + minutesUsed);
        System.out.println("Overage: " + calculateOverage());
    }

}
