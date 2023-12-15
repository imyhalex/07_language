package edu.nyu.cs.assignment7;

import java.util.ArrayList;

public class Sentence implements SequentiallyOrdered{
    
    private ArrayList<Word> words;

    public Sentence(String sentence) {
        this.words = new ArrayList<>();
        String[] wordArray = sentence.split("[^\\w']+");
        for (int i = 0; i < wordArray.length; i++) {
            words.add(new Word(wordArray[i], i));
        }
    }

    @Override
    public OrderedThing getFirst() {
        return words.isEmpty() ? null : words.get(0);
    }

    @Override
    public OrderedThing getLast() {
        return words.isEmpty() ? null : words.get(words.size() - 1);
    }

    @Override
    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> sequence = new ArrayList<>();
        sequence.addAll(words);
        return sequence;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sentence sentence = (Sentence) obj;
        return words.equals(sentence.words);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word w : words) {
            sb.append(w.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}
