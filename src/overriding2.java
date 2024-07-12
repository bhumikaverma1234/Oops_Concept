class base {
    void fun() {
        System.out.println("base class");
    }
}
class Child extends base{
    void fun(){
        System.out.println("childs fun");
    }
}
class GrandChild extends Child{
    void fun(){
        System.out.println("GrandChild fun");
    }
}
public class overriding2 {
    public static void main(String[] args) {
        base b1 = new Child();
        base b2 = new GrandChild();
        b1.fun();
        b2.fun();
    }
}
