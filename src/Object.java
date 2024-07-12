public class Object {
    String name;
    int roll_no;

    public void printData(){
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        Object std1 = new Object();
        std1.name = "bhumi";
        std1.roll_no = 15;
        std1.printData();

        Object std2 = new Object();
        std2.name = "gaurav";
        std2.roll_no = 16;
        std2.printData();
    }
}
