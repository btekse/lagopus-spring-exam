/**
 * Created by gy0p4k on 4/19/2017.
 */
public class Dog extends Animal {


    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public String say(){
        return "woof";
    }

}
