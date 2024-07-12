class A{
    void methodA(){
        System.out.println("Method of A class");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method of B class");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method of C class");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
