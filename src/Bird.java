public abstract class Bird extends Animal implements AnimalFly {

    //meters
    private int maxFlightHeight;
    public Bird(String name, int maxFlightHeight) {
        super(name);
        setMaxFlightHeight(maxFlightHeight);
    }

    public void setMaxFlightHeight(int maxFlightHeight) {
        if(maxFlightHeight>=0) {
            this.maxFlightHeight = maxFlightHeight;
            return;
        }
        throw new IllegalArgumentException();
    }
    public int getMaxFlightHeight(){
        return maxFlightHeight;
    }
}
