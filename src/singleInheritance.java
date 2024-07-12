class employee{
    void salary(){
        System.out.println("Salary = 700000" );
    }
}
class hr extends employee{
    void bonus(){
        System.out.println("Bonus = 2000");
    }
}
public class singleInheritance {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.salary();
        System.out.println();
        obj.bonus();
    }
}
