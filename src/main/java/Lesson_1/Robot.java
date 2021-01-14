package Lesson_1;

public class Robot implements Actions {
    private String model;
    private int jamp_height;
    private int distance;

    public Robot(String model, int jamp_height, int distance) {
        this.model = model;
        this.jamp_height = jamp_height;
        this.distance = distance;
    }


    public boolean run(Treadmill t) {
        System.out.printf("Робот %s пробежал %d метров!\n", model, distance);
        return t.getWay() < distance;
    }

    public boolean jump(Wall w) {
        System.out.printf("Робот %s прыгнул в высоту %d сантиметров!\n", model, jamp_height);
        return w.getHeight() < jamp_height;
    }
}
