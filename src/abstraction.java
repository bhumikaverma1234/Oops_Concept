abstract class bike{
    abstract void color();//in abstract does not provide body
    public void fueltype(){
        System.out.println("petrol");
    }

}
class hero extends bike{
    public void color(){
        System.out.println("black color");
    } //abstraction class body
}
public class abstraction {
    public static void main(String[] args) {
     hero hr = new hero();
     hr.color();
     hr.fueltype();
    }
}
