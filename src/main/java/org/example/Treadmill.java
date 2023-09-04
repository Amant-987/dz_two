package org.example;

class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean pass(Participant participant) {
        if (participant.run(length)) {
            return true;
        } else {
            return false;
        }
    }
}