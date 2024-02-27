package generics;

public class MyGeneric <T> {
    T thingToPrint;

    public MyGeneric(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
