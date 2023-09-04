package org.example;

class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void pass(Participant participant) {
        participant.run(length);
    }
}
