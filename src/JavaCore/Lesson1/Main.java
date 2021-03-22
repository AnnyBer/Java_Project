package JavaCore.Lesson1;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Баська", 11, 60);
        Man man = new Man("Вася", 6, 100);
        Robot robot = new Robot("Железный Спортсмен", 2, 99);
        Wall wall = new Wall(4);
        Racetrack racetrack = new Racetrack(50);

        ICompetitor[] competitors = {man, cat, robot};
        IObstacle[] obstacleRoad = {wall, racetrack};

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < obstacleRoad.length; j++) {
                if (!obstacleRoad[j].check(competitors[i])) {
                    System.out.println(competitors[i].getName() + " не смог " + obstacleRoad[j].getWhatDo() + "!");
                    break;
                }
                System.out.println(competitors[i].getName() + " смог " + obstacleRoad[j].getWhatDo() + "!");
            }
        }
    }
}
