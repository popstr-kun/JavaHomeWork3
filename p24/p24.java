package p24;

public class p24 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setCar(123,4.5);
        car1.show();

        car1.setCar(2345);
        car1.show();

        car1.setCar(30.5);
        car1.show();
    }
}

class Car{
    private int num;
    private double gas;

    public void setCar(int n){
        num = n;
        System.out.println("將車號設為"+num);
    }
    public void setCar(double g){
        gas = g;
        System.out.println("將汽油量設為"+gas);
    }
    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("將車號設定為"+num+",將汽油量設定為"+gas);
    }
    public void show(){
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);
    }
}
