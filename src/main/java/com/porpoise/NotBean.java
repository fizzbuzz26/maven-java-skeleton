package com.porpoise;

public class NotBean {

    private final String name;
    private int          dave;

    public int getDave() {
        return dave;
    }

    public void setDave(final int dave) {
        this.dave = dave;
    }

    public NotBean(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
