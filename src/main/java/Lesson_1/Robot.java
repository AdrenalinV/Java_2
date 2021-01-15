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
        if (t.getWay() <= distance){
            System.out.printf("Робот %s Успешно пробежал дистанцию %d метров!\n", model, (int)t.getWay());
            return true;
        }
        System.out.printf("Робот %s не пробежал дистанцию %d метров!\n", model, (int)t.getWay());
        return false;
    }

    public boolean jump(Wall w) {
        if(w.getHeight() <= jamp_height){
            System.out.printf("Робот %s успешно прыгнул в высоту %d сантиметров!\n", model, (int)w.getHeight());
            return true;
        }
        System.out.printf("Робот %s не смог прыгнуть в высоту %d сантиметров!\n", model, (int)w.getHeight());
        return false;
    }
}
