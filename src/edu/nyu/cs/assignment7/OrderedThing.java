package edu.nyu.cs.assignment7;

public abstract class OrderedThing {
    protected int position;

    public OrderedThing(int position) {
        this.position = position;
    }

    public abstract int getPosition();

    public abstract boolean equals(Object obj);
} 