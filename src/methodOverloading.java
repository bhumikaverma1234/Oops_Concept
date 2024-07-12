//import java.util.*;
//import java.lang.*;
//import java.io.*;
//class methodoverloading{
//    public int sum(int a, int b) {
//        return a + b;
//        i   }
//
//    public int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public String sum(String x, String y){
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        methodoverloading s = new  methodoverloading();
//        System.out.println(s.sum(2, 3));
//        System.out.println(s.sum(2, 3, 4));
//        System.out.println(s.sum("bhumi","gaurav"));
//    }
//}




import java.util.*;
import java.lang.*;
import java.io.*;

class methodoverloading{
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String sum(String x, String y){
        return x + y;
    }

    public static void main(String[] args) {

        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum("bhumi","gaurav"));
    }
}





