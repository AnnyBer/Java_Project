package Lesson5;

public class Bird extends Animal{
    public Bird(String name, float maxRun, float maxJump, float maxSwim) {
        super("Птичка", name, maxRun, maxJump, maxSwim);
    }
    @Override
    protected int swim(float distance) {
        return Animal.swimNothing;
    }
}
