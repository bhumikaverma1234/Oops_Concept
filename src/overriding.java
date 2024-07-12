class Parent{
    void fun(){
        System.out.println("base fun's ");
    }
}
class Derived extends Parent{
    @Override
    void fun(){
        System.out.println("Derives fun's");
    }
}
public class overriding {
    public static void main(String[] args) {
        Parent p = new Derived();
        p.fun();
    }
}
