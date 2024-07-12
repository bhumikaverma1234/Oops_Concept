class Students{
    int id;
    int age;

    Students(int id, int age){
        this.id = id;
        this.age = age;
        System.out.println("parameterized constructor");
    }
    Students(int id, String name, int age){
        System.out.println("Parameterized constructor2");
    }
    Students(){
        System.out.println("default constructor");
    }
}
public class constructor {
    public static void main(String[] args) {
        Students std1 = new Students(1,87);
    }
}
