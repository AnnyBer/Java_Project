package JavaCore.Lesson1;

public class Man implements ICompetitor{

    private final String name;
    private final int maxJump;
    private final int maxRun;

    public Man(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }
    @Override
    public String getName() {
        return "Человек " + name;
    }

    @Override
    public void jumpTo(int height) {
        if (height < maxJump) {
            System.out.println("Человек " + name + " смог перепрыгнуть!");
        } else {
            System.out.println("Человек " + name + " не смог перепрыгнуть.");
        }
    }

    @Override
    public int jump() {
        return maxJump;
    }

    @Override
    public void runTo(int length) {
        if (length < maxRun) {
            System.out.println("Человек " + name + " смог пробежать!");
        } else {
            System.out.println("Человек " + name + " не смог пробежать.");
        }
    }

    @Override
    public int run() {
        return maxRun;
    }
}
