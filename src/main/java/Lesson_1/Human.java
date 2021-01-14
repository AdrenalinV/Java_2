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
        System.out.printf("Спортсмен %s пробежал %d метров!\n", name, distance);
        return t.getWay() < distance;
    }

    public boolean jump(Wall w) {
        System.out.printf("Робот %s прыгнул в высоту %d сантиметров!\n", name, jamp_height);
        return w.getHeight() < jamp_height;
    }
}
