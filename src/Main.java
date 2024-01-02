// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var dog = new Dog("Alex", 80);
        var bat = new Bat("NoNameBat", 1);
        var parrot = new Parrot("Ken", 200);
        dog.eat();
        dog.run();
        dog.voice();
        System.out.println("--------------");
        bat.eat();
        bat.fly();
        bat.run();
        bat.voice();
        System.out.println("--------------");
        parrot.eat();
        parrot.fly();
        parrot.voice();
    }
}