package edu.nyu.cs.assignment7;

public class Character extends OrderedThing{
    
    private char character;

    public Character(char character, int position) {
        super(position);
        this.character = character;
    }

    @Override
    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Character otherCharacter = (Character) obj;
        return this.character == otherCharacter.character;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
