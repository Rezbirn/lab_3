public abstract class Mammal extends Animal implements AnimalRun {
    //km/h
    private int maxRunningSpeed;
    public Mammal(String name, int maxRunningSpeed){
        super(name);
        setMaxRunningSpeed(maxRunningSpeed);
    }

    public void setMaxRunningSpeed(int maxRunningSpeed) {
        if(maxRunningSpeed>=0){
            this.maxRunningSpeed = maxRunningSpeed;
            return;
        }
        throw new IllegalArgumentException();
    }
    public int getMaxRunningSpeed(){
        return maxRunningSpeed;
    }
}
