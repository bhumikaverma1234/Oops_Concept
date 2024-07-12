import java.util.*;
import java.io.*;
import java.lang.*;

//the main method in class named as "methodOverriding"

class  Bank{
    public void RateOfInterest(){
        System.out.println("Generally Rate Of Interest is 5%");
    }
}
class SBI extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate Of Interest for SBI is 6%");
    }
}
class HDFS extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate Of Interest for HDFS is 9%");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        SBI obj1 = new SBI();
        HDFS obj2 = new HDFS();
        Bank obj3 = new Bank();

        obj1.RateOfInterest();
        obj2.RateOfInterest();
        obj3.RateOfInterest();
    }
}
