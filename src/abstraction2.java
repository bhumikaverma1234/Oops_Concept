abstract class Shape{
    int color;
    int getColor(){
        return color;
    }
    Shape(int c){
        color = c;
    }
    abstract double getArea(); //does not provide body in abstract class
}
class Square extends Shape{
    double side;
    Square(int c, double s){
        super(c);
        side = s;
    }
    double getArea(){ //``body of abstract method
        return side*side;
    }
}
public class abstraction2 {
    public static void main(String[] args) {
        Square s = new Square(5,10.0);
        System.out.println(s.getArea());
    }
}
