interface a{
    public void run();
}
interface b{
    public void run();;
}
class c implements a,b{
    public void run(){
        System.out.println("C class run method");
    }
}
public class mInterface {
    public static void main(String[] args) {
        c obj = new c();
        obj.run();
    }
}
