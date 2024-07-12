//To Invoke Parent Class method
class Wield{
    void eat(){
        System.out.println("eating.......");
    }
}
class Lion extends Wield{
    void eat(){
        System.out.println("eating chicken");
    }
    void bark(){
        System.out.println("barking");
    }
    void work(){
        super.eat();
        bark();

    }
}


public class SuperKeyword2 {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.work();
    }
}
