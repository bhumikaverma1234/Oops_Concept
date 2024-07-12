//To Invoke Parent Class Constructor

class Janwar{
    Janwar(){     //Constructor of Janwar class
        System.out.println("Janwar is created");
    }
}
class Cow extends Janwar{
    Cow(){        //CConstructor of Cow class
        super();
//        System.out.println("Cow is eating");
    }
}
public class SuperKeyword3 {
    public static void main(String[] args) {
        Cow c = new Cow();
    }
}
