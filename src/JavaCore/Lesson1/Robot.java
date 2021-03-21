package JavaCore.Lesson1;

public class Robot implements ICompetitor {

    private final String name;
    private final int maxJump;
    private final int maxRun;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public String getName() {
        return "Робот " + name;
    }

    @Override
    public void jumpTo(int height) {
        if (height < maxJump) {
            System.out.println("Робот " + name + " смог перепрыгнуть!");
        } else {
            System.out.println("Робот " + name + " не смог перепрыгнуть. Не хватило энергии.");
        }
    }

    @Override
    public int jump() {
        return maxJump;
    }

    @Override
    public void runTo(int length) {
        if (length < maxRun) {
            System.out.println("Робот " + name + " смог пробежать!");
        } else {
            System.out.println("Робот " + name + " не смог пробежать. Не хватило энергии. ");
        }
    }

    @Override
    public int run() {
        return maxRun;
    }
}
