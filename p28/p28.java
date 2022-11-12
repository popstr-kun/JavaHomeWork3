package p28;

public class p28 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(1234,5.3);
        car2.show();
    }
}

class Car{
    private int num;
    private double gas;

    public Car(){
        num = 0;
        gas = 0;
        System.out.println("生產了車子");
    }
    public Car(int n,double g){
        this();
        num = n;
        gas = g;
        System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
    }
    public void show(){
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}
