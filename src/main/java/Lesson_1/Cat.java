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
        System.out.printf("Кот %s пробежал %d метров!\n", name, distance);
        return t.getWay()<distance;
    }

    public boolean jump(Wall w) {
        System.out.printf("Кот %s прыгнул в высоту %d сантиметров!\n", name, jamp_height);
        return w.getHeight()<jamp_height;
    }

}
