package vipPerson;

public class VipPerson {
    private String name;
    private double creditCardLimit;
    private String emailAddress;

    public VipPerson(){
        this("default name", 2000, "419@yahoo.com");
    }

    public VipPerson(String name, double creditCardLimit){
        this(name, creditCardLimit, "Unknown@gmail.com");
    }
    public VipPerson(String name, double creditCardLimit, String emailAddress) {
        this.name = name;
        this.creditCardLimit = creditCardLimit;
        this.emailAddress = emailAddress;
    }
    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

   public String getName() {
        return name;
    }
}
