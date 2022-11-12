package p6;

public class p6 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.num = 1234;
        car1.gas = 123.23;

        System.out.println("車號是"+car1.num);
        System.out.println("汽油是"+car1.gas);
    }
}

class Car{
    int num;
    double gas;
}
