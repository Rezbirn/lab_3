public class Bat extends Mammal implements AnimalFly {
    public Bat(String name, int maxRunningSpeed) {
        super(name, maxRunningSpeed);
    }

    @Override
    public void voice() {
        System.out.println(getName() + ": ribbit.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + ": i eat a blood.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + ": i fly in the night sky");
    }

    @Override
    public void run() {
        System.out.println(getName() +  ": i run, bt my speed is so small.");
    }
}
