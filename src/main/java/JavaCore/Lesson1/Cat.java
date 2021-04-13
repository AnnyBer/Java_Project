package JavaCore.Lesson1;

public class Cat implements ICompetitor {

    private final String name;
    private final int maxJump;
    private final int maxRun;

    public Cat (String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public String getName() {
        return "Кот " + name;
    }

    @Override
    public void jumpTo(int height) {
        if (height < maxJump) {
            System.out.println("Кот по кличке " + name + " смог перепрыгнуть!");
        } else {
            System.out.println("Кот по кличке " + name + " не смог перепрыгнуть.");
        }
    }

    @Override
    public int jump() {
       return maxJump;
    }

    @Override
    public void runTo(int length) {
        if (length < maxJump) {
            System.out.println("Кот по кличке " + name + " смог пробежать!");
        } else {
            System.out.println("Кот по кличке " + name + " не смог пробежать.");
        }
    }

    @Override
    public int run() {
        return maxRun;
    }
}
