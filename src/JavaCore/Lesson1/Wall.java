package JavaCore.Lesson1;

public class Wall implements IObstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String getWhatDo () {
        return "перепрыгнуть";
    }

    @Override
    public boolean check(ICompetitor competitor){
       return competitor.jump() > height;
    }
}
