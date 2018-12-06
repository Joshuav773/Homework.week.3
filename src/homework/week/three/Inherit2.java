package homework.week.three;

public class Inherit2 extends Overloading implements Planning{

    @Override
    public void howToGreet(){
        System.out.println("Always say hi.");
    }

    @Override
    public void sayHello(){
        System.out.println("Always say hello to elders.");
    }

    @Override
    public void alwaysSayBye(){
        System.out.println("always say bye when you leave.");
    }

}
