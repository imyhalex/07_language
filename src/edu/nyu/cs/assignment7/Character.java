package edu.nyu.cs.assignment7;

public class Character extends OrderedThing{
    
    private char character;
    private int position;

    public Character(char character, int position) {
        this.character = character;
        this.position = position;
    }

    @Override
    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Character) {
            Character other = (Character) obj;
            return this.character == other.character;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
