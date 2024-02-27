package vipPerson;

public class VipPersonMain {
    public static void main(String[] args) {
        VipPerson vipPerson1 = new VipPerson();
        System.out.println(vipPerson1.getName());
        System.out.println(vipPerson1.getEmailAddress());
        System.out.println(vipPerson1.getCreditCardLimit());

        VipPerson vipPerson2 = new VipPerson("Java", 12345);
        System.out.println(vipPerson2.getName());
        System.out.println(vipPerson2.getEmailAddress());
        System.out.println(vipPerson2.getCreditCardLimit());

        VipPerson vipPerson3 = new VipPerson("Java", 12345);
        System.out.println(vipPerson3.getName());
        System.out.println(vipPerson3.getEmailAddress());
        System.out.println(vipPerson3.getCreditCardLimit());

    }
}
