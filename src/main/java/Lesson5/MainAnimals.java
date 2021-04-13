package Lesson5;

public class MainAnimals {

    public static void main(String[] arg) {

        String winMarathon = " и чудо! Получилось!";
        String looserMarathon = " и не хватило сил! Увы и ах! :(";
        String expectedResult;
        String actualResult;

        Dog dog = new Dog("Шарик", 500, 0.5f, 10);
        Cat cat = new Cat("Мурзик", 200, 2f,0);
        Horse horse = new Horse("Рыжик", 1500, 3f, 100);
        Bird bird = new Bird("Синичка", 5, 0.2f, 0 );


        Animal arr [] = {dog, cat, horse,bird};

        float runLength = 200;
        float jumpHeight = 2.5f;
        float swimLength =50;

        for (int i = 0; i < arr.length; i++ ) {
            String startMarathon = arr[i].getType() + " " + arr[i].getName() + " в силах ";

            expectedResult = " пробежать " + arr[i].getMaxRun() + " м. Пытается пробежать на ";
            actualResult = arr[i].run(runLength) ? winMarathon : looserMarathon;
            result(startMarathon, expectedResult, runLength, actualResult);

            expectedResult = "прыгнуть на " + arr[i].getMaxJump() + " м. Пытается прыгнуть на ";
            actualResult = arr[i].jump(jumpHeight) ? winMarathon : looserMarathon;
            result(startMarathon, expectedResult, jumpHeight, actualResult);

            expectedResult = "проплыть " + arr[i].getMaxSwim() + " м. Пытается проплыть ";
            actualResult = (arr[i].swim(swimLength) == Animal.swimGood) ? winMarathon : looserMarathon;
            if (arr[i].swim(swimLength) == Animal.swimNothing)
                actualResult = " м, но не удалось. Плавать не умеет.";
            result(startMarathon, expectedResult, swimLength, actualResult);
        }
    }

    private static void result(String startMarathon, String expectedResult, float eventLength, String actualResult) {
        System.out.println(startMarathon + expectedResult + eventLength + actualResult);
    }
}
