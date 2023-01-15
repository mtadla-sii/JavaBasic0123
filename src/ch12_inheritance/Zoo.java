package ch12_inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Burek", 30);
        Bird bird = new Bird("maja", 20, true);

        dog.eat();
        dog.bark();
        dog.introduce();

        bird.eat();
        bird.fly();
        bird.introduce();
    }
}
