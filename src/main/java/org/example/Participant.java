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

    public String getName() {
        return name;
    }

    public boolean run(int distance) {
        if (distance <= runningLimit) {
            System.out.println(name + " успешно пробежал " + distance + " метров.");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= jumpingLimit) {
            System.out.println(name + " успешно перепрыгнул препятствие высотой " + height + " метров.");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие высотой " + height + " метров.");
            return false;
        }
    }
}