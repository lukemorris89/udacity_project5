package com.example.jokelib;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {

    private ArrayList<String> mJokes;

    public Jokes() {
        mJokes = new ArrayList<>();
        mJokes.add("Joke 1");
        mJokes.add("Joke 2");
        mJokes.add("Joke 3");
        mJokes.add("Joke 4");
        mJokes.add("Joke 5");
    }

    public String getJoke() {
        Random random = new Random();
        int jokeIndex = random.nextInt(mJokes.size());
        return mJokes.get(jokeIndex);
    }

    public ArrayList<String> getAllJokes() {
        return mJokes;
    }
}