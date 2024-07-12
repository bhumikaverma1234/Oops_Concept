class X{
    public void print(){
        System.out.println("Class X method");
    }
}

class Y extends X{
    public void printA(){
        System.out.println("Class Y method");
    }
}


class Z extends X{
    public void printB(){
        System.out.println("Class Z method");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Y obj = new Y();
        Z obj1 = new Z();
        obj.print();
        obj1.print();
    }
}
