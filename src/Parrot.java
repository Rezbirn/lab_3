import java.util.Random;

public class Parrot extends Bird {

    private static Random random = new Random();
    public Parrot(String name, int maxFlightHeight) {
        super(name, maxFlightHeight);
    }

    @Override
    public void voice() {
        System.out.println(getName() + ": squawk.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + ": i eat seeds.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "i fly in sky.\nMy flight altitude is " + (random.nextInt(getMaxFlightHeight()-100)+100) + " m.");
    }
}
