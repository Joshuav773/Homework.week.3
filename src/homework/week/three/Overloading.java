package homework.week.three;

import java.sql.SQLOutput;

public class Overloading {

    public void sayHello(String a){
        System.out.println("always" + a);
    }

    public void sayHello(String a, String b){
        System.out.println("always" + a + " and " + b);
    }

    public void sayHello(String a, String b, String c){
        System.out.println("Always" + a + b + c);
    }
}
