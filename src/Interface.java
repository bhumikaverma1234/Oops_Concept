interface car{
    public void start();
}
class ElectricCar implements car{
    public void start(){
        System.out.println("Electric Car Start");
    }
}
class DieselCar implements car{
    public void start(){
        System.out.println("Diesel Car Start");
    }
}
public class Interface {
    public static void main(String[] args) {
        car Tesla = new ElectricCar();
        car XCV700 = new DieselCar();
        Tesla.start();
        XCV700.start();
    }
}