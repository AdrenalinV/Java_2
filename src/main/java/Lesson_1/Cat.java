package Lesson_1;

public class Cat implements Actions {
    private String name;
    private int jamp_height;
    private int distance;

    public Cat(String name, int jamp_height, int distance) {
        this.name = name;
        this.jamp_height = jamp_height;
        this.distance = distance;
    }


    public boolean run(Treadmill t) {
        if (t.getWay() <= distance) {
            System.out.printf("Кот %s успешно пробежал дистанцию %d метров!\n", name, (int) t.getWay());
            return true;
        }
        System.out.printf("Кот %s не смог пробежать дистанцию %d метров!\n", name, (int) t.getWay());
        return false;
    }

    public boolean jump(Wall w) {
        if (w.getHeight() <= jamp_height) {
            System.out.printf("Кот %s успешно прыгнул в высоту %d сантиметров!\n", name, (int) w.getHeight());
            return true;
        }
        System.out.printf("Кот %s не смог прыгнуть в высоту %d сантиметров!\n", name, (int) w.getHeight());
        return false;
    }

}
