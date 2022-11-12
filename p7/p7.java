package p7;

public class p7 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 12.2;

        Car car2 = new Car();
        car2.num = 654;
        car2.gas = 9.5;

        System.out.println("car1車號是"+car1.num);
        System.out.println("car1汽油是"+car1.gas);

        System.out.println("car2車號是"+car2.num);
        System.out.println("car2汽油是"+car2.gas);
    }
}

class Car{
    int num;
    double gas;
}