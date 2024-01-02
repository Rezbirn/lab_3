public abstract class Animal {
    private String name;
    public Animal(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
            return;
        }
        throw new IllegalArgumentException();

    }

    public abstract void voice();

    public abstract void eat();
}
