package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class RetrieveJokeNotNullTest {

    @Test
    public void retrieveJoke_ResultsNotEmptyOrNull() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.test = true;
        new EndpointAsyncTask().execute(fragment);
        Thread.sleep(5000);

        assertNotNull(fragment.jokeReturned);
    }
}
