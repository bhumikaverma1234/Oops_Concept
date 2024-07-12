class Dog{
    String name;
    int id;

    public void eat(){
        System.out.println(name+" eats!");
    }
}
public class method {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bruno";
        dog1.eat();
    }
}
