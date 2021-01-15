package Lesson_1;

class Human implements Actions {
    private String name;
    private int jamp_height;
    private int distance;

    public Human(String name, int jamp_height, int distance1) {
        this.name = name;
        this.jamp_height = jamp_height;
        this.distance = distance1;
    }


    public boolean run(Treadmill t) {
        if (t.getWay() <= distance) {
            System.out.printf("Спортсмен %s успешно пробежал дистанцию %d метров!\n", name, (int) t.getWay());
            return true;
        }
        System.out.printf("Спортсмен %s не пробежал дистанцию %d метров!\n", name, (int) t.getWay());
        return false;
    }

    public boolean jump(Wall w) {
        if (w.getHeight() <= jamp_height){
            System.out.printf("Спортсмен %s успешно прыгнул в высоту %d сантиметров!\n", name, (int)w.getHeight());
            return true;
        }
        System.out.printf("Спортсмен %s не смог прыгнуть в высоту %d сантиметров!\n", name, (int)w.getHeight());
        return false;
    }
}
