class Base{
    private int x=10;
    public int getX(){
        return x;
    }
}
    class child extends Base{
        int y=20;
        void print(){
            System.out.println(getX());
            System.out.println(y);
        }
    }

public class accessPrivateMembers {
    public static void main(String[] args) {
        child d = new child();
        d.print();
    }
}
