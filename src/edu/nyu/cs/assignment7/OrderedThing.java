package edu.nyu.cs.assignment7;

public abstract class OrderedThing {
    protected int position;

    public OrderedThing(int position) {
        this.position = position;
    }

    public abstract int getPosition();

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        OrderedThing other = (OrderedThing) obj;
        return this.position == other.position;
    }
} 