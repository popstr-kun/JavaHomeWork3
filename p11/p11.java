package p11;

public class p11 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 12.2;
        car1.show();

        car1.num = 1344;
        car1.gas = 134.7;
        car1.show();
    }
}

class Car{
    int num;
    double gas;

    void show(){
        System.out.println("車號是"+this.num);
        System.out.println("汽油是"+this.gas);
    }
}
