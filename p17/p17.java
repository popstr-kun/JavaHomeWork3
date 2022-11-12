package p17;

public class p17 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setNumGas(1234,145.3);

        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("調查樣品車時得知");
        System.out.println("車號是"+number+",汽油量是"+gasoline);
    }
}

class Car{
    int num;
    double gas;

    int getNum(){
        System.out.println("調查車號");
        return num;
    }
    double getGas(){
        System.out.println("調查油量");
        return gas;
    }
    void setNumGas(int n, double g){
        num = n;
        gas = g;
        System.out.println("將車號設定為"+num+",將汽油量設定為"+gas);
    }
}
