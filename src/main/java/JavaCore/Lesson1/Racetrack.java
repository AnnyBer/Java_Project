package JavaCore.Lesson1;

public class Racetrack implements IObstacle {

    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public String getWhatDo () {
        return "пробежать";
    }

    @Override
    public boolean check(ICompetitor competitor) {
        return competitor.run() > length;
    }
}
