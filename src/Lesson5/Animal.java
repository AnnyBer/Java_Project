package Lesson5;

import java.util.Random;

public class Animal {
    
    static final int swimGood = 1;
    static final int swimBad = 0;
    static final int swimNothing = -1;
    
    private final String type;
    private final String name;
    private final float maxRun;
    private final float maxJump;
    private final float maxSwim;
    private final Random random  = new Random();

    public Animal(String type, String name, float maxRun, float maxJump, float maxSwim) {

        float changeRun = random.nextFloat() + maxRun / 2;
        float changeJump = random.nextFloat() + maxJump / 2;
        float changeSwim = random.nextFloat() + maxSwim / 2;

        this.type = type;
        this.name = name;
        this.maxRun = maxRun + changeRun;
        this.maxJump = maxJump + changeJump;
        this.maxSwim = maxSwim + changeSwim;
    }

    String getType() {
        return this.type;
    }

    String getName() {
        return this.name;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxJump() {
        return this.maxJump;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }
    protected boolean jump(float height) {
        return (height <= maxJump);
    }
    protected int swim(float distance) {
        return  (distance <= maxSwim) ? swimGood : swimBad;
    }
}
