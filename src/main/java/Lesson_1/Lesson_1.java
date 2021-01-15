package Lesson_1;

/*
 * Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии
 * в консоль).
 * Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
 * Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
 * этот набор препятствий.
 * * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
 *  на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
 *  препятствий не идет.*/
public class Lesson_1 {
    public static void main(String[] args) {
        Object[] member = new Object[]{
                new Robot("T800", 500, 50000),
                new Human("Sara", 150, 10000),
                new Robot("T1000", 600, 70000),
                new Human("Konor", 140, 8000),
                new Cat("Barsic", 100, 1000)
        };
        Object[] barrier = new Object[]{
                new Treadmill(1000),
                new Treadmill(8000),
                new Wall(100),
                new Wall(145),
                new Treadmill(15000)
        };
        Actions act;
        for (Object x : member) {
            for (Object b : barrier) {
                if (b instanceof Treadmill) {
                    if (!((Actions) x).run((Treadmill) b)) {
                        break;
                    }
                } else if (b instanceof Wall) {
                    if (!((Actions) x).jump((Wall) b)) {
                        break;
                    }
                }
            }
            System.out.println("");
        }


    }
}
