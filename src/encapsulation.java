
class bacche{
    private String name;
    private int age;
    private int roll_no;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRoll_no(){
        return roll_no;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }
}
public class encapsulation {
    public static void main(String[] args) {
       bacche std1 = new bacche();
      std1.setName("bhumika");
      std1.setAge(21);
      std1.setRoll_no(11);

        System.out.println(std1.getName());
        System.out.println(std1.getAge());
        System.out.println(std1.getRoll_no());
    }
}
