package com.shoot;

public enum State {
    RUNNING(0),
    PAUSE(1),
    GAMEOVER(2),
    READY(3);

    private int number;
    State(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
