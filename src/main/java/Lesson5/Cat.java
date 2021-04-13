package Lesson5;

public class Cat extends Animal {
    public Cat(String name, float maxRun, float maxJump, float maxSwim) {
        super("Катяра", name, maxRun, maxJump, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return Animal.swimNothing;
    }
}
