package edu.nyu.cs.assignment7;

import java.util.ArrayList;

public class Word extends OrderedThing implements SequentiallyOrdered{
    
    private ArrayList<Character> characters;
    private int position;

    public Word(String word, int position) {
        this.characters = new ArrayList<>();
        this.position = position;
        for (int i = 0; i < word.length(); i++) {
            characters.add(new Character(word.charAt(i), i));
        }
    }

    @Override
    public OrderedThing getFirst() {
        return characters.get(0);
    }

    @Override
    public OrderedThing getLast() {
        return characters.get(characters.size() - 1);
    }

    @Override
    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> sequence = new ArrayList<>();
        sequence.addAll(this.characters);
        return sequence;
    }

    @Override
    public int getPosition() {
        return this.position;
    }
}
