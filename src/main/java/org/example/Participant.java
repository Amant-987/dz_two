package org.example;

abstract class Participant {
    private String name;
    private int runningLimit;
    private int jumpingLimit;

    public Participant(String name, int runningLimit, int jumpingLimit) {
        this.name = name;
        this.runningLimit = runningLimit;
        this.jumpingLimit = jumpingLimit;
    }

    public void run(int distance) {
        if (distance <= runningLimit) {
            System.out.println(name + " успешно пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
        }
    }

    public void jump(int height) {
        if (height <= jumpingLimit) {
            System.out.println(name + " успешно перепрыгнул препятствие высотой " + height + " метров.");
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие высотой " + height + " метров.");
        }
    }
}