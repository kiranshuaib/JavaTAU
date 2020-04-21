package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;

    public PhoneBill(){//default constructor
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id) {//constructor with an ID
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id,double baseCost,double allottedMinutes,double minutesUsed){ //constructor one that accepts all fields
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }
     public void setId(int id){
        this.id = id;
     }

    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost= baseCost;
    }

    public double getAllottedMinutes(){
        return allottedMinutes;
    }
    public void setAllottedMinutes(double allottedMinutes){
        this.allottedMinutes= allottedMinutes;
    }
    public double getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    //Method to calculete overage
    public double calculateOverage(){
        if(minutesUsed <= allottedMinutes) {
            return 0;
        }
        //And then you're going to charge 25 cents for every minute that they've gone over,

        double overageRate = 0.25;
            double overageMin = minutesUsed - minutesUsed;
            return overageMin* overageRate;

        }
    //Method to calculate tax
    public double calculateTax() {
        double tax = 0.25;
        return (baseCost + calculateOverage()) * tax;
    }

    //method to calculate total
    public double finalTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    //methodto print bill
    public void printItemizedBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan:$ " + String.format("%.2f", baseCost));
        System.out.println("Overage:$ " + String.format("%.2f",calculateOverage()));
        System.out.println("Tax:$ " + String.format("%.2f", calculateTax()));
        System.out.println("Total:$ " + String.format("%.2f", finalTotal()));
    }
}
