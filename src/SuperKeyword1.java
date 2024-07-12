//To Invoke Parent Class Variable
class Animal{
    String color = "black";
}
class Cat extends Animal{
    String color = "white";

    public void printColor(){
        System.out.println(color);         //print color of Cat
        System.out.println(super.color);   //print color of Animal
    }
}


public class SuperKeyword1 {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.printColor();
    }
}
