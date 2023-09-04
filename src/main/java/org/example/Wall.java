package org.example;

class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void pass(Participant participant) {
        participant.jump(height);
    }
}
