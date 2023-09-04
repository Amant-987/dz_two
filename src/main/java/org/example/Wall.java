package org.example;

class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(Participant participant) {
        if (participant.jump(height)) {
            return true;
        } else {
            return false;
        }
    }
}
