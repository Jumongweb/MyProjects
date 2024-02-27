package generics;

public class Main {
    public static void main(String[] args) {
        MyGeneric<Integer> myGeneric1 = new MyGeneric<>(23);
        MyGeneric<String> myGeneric2 = new MyGeneric<>("Jumong");
        MyGeneric<Double> myGeneric3 = new MyGeneric<>(23.44);

        myGeneric1.print();
        myGeneric2.print();
        myGeneric3.print();
    }
}
