//static member are not overriden
class Father{
       static void fun(){
        System.out.println("Parents fun");
    }
}
class Children extends Father{
    static void fun(){
        System.out.println("Children fun");
    }
}
public record staticNotOverriden() {
    public static void main(String[] args) {
       Father f = new Children();
       f.fun();
    }
}
