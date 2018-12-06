package homework.week.three;

public abstract class Abstraction {

    private int num = 12;
    private String name = "your name";
    private int address = 2250;

    public abstract void hello();

    public void manners(){
        System.out.println("Always say hello first when arriving.");
    }


}
