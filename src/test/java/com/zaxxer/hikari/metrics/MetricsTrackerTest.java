package com.zaxxer.hikari.metrics;

import com.zaxxer.hikari.metrics.MetricsTracker;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MetricsTrackerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bdb9146aaae88e19() {

    // Act, creating object to test constructor
    final MetricsTracker actual = new MetricsTracker();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
