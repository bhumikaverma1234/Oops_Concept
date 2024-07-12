class Vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("price " + price);
        System.out.println("mileage " + mileage);
        System.out.println("color " + color);
    }
}

class Car extends Vehicle{
    String ftype;
    boolean sunroof;
}
public class inheritance {
    public static void main(String[] args) {
       Car car1 = new Car();
       car1.color = "red";
       car1.price = 230000;
       car1.sunroof = true;
       car1.mileage = 19.5;
       car1.ftype = "disele";
       car1.display();
        System.out.println(car1.sunroof);


    }
}
