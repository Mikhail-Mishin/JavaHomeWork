package JavaHomeWork.Core.Lesson1HW;

// 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
// соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал,
// не смог пробежать и т.д.).
//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//*4. У препятствий есть длина (для дорожкки) или высота (для стены), а участников ограничение на бег и прыжки.
//Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.


public class Main {
    public static void main (String[] args) {

        String action;
        String result;


        Human human1 = new Human("Kolya", 15,3);
        Human human2 = new Human("Vasya", 20, 2);
        Cat cat1 = new Cat("Barsik", 5, 2);
        Cat cat2 = new Cat("Murzik", 7, 3);
        Robot robot1 = new Robot("R2D2", 10, 0);
        Robot robot2 = new Robot("T1000", 1000, 20);

        Racetrack racetrack1 = new Racetrack("First racetrack", 5, 0);
        Racetrack racetrack2 = new Racetrack("Second racetrack", 7, 0);
        Wall wall1 = new Wall("First Wall", 0, 2);
        Wall wall2 = new Wall("Second Wall", 0, 3);

        Members[] members = {human1, human2, cat1, cat2, robot1, robot2};

        Barrier[] barriers = {racetrack1, racetrack2, wall1, wall2};

        for (int i = 0; i < members.length; i++) {
            for ( int j = 0; j < barriers.length; j++) {
                action = (members[i].getName() + " бежит по " + barriers[j].getBarrierName() + " на " + barriers[j].getDistance() + " км.");
                eventResult(action);
            }

        }

    }
    private static void eventResult(String action) {
        System.out.println(action);
    }

}
