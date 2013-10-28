package com.example.activity;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class DeckardActivityTest {

  @org.junit.Test
  public void testSomething() throws Exception {
    ActionBarActivity activity = Robolectric.buildActivity(DeckardActivity.class).create().get();
    assertTrue(activity != null);
    ActionBar actionBar = activity.getSupportActionBar();
    assertTrue(actionBar != null);
    assertTrue(actionBar.getTitle() == "Hello, world");
  }
}
