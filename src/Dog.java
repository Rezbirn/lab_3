import java.util.Random;

public class Dog extends Mammal{
    private static Random random = new Random();
    public Dog(String name, int maxRunningSpeed){
        super(name, maxRunningSpeed);
    }

    @Override
    public void voice(){
        System.out.println(getName() + ": woof.");
    }

    @Override
    public void run(){
        System.out.println(getName() + ": i run to my small home.\nMy speed: " + (random.nextInt(getMaxRunningSpeed())+1) + " km/h.");
    }
    @Override
    public void eat() {
        System.out.println(getName() + ": i eat a bone.");
    }
}
