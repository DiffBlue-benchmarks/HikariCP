package com.zaxxer.hikari.metrics.micrometer;

import com.zaxxer.hikari.metrics.IMetricsTracker;
import com.zaxxer.hikari.metrics.PoolStats;
import com.zaxxer.hikari.metrics.micrometer.MicrometerMetricsTracker;
import com.zaxxer.hikari.metrics.micrometer.MicrometerMetricsTrackerFactory;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MicrometerMetricsTrackerFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999b032c8e1a98044b0() {

    // Arrange
    final CompositeMeterRegistry arg0 = new CompositeMeterRegistry();

    // Act, creating object to test constructor
    final MicrometerMetricsTrackerFactory actual = new MicrometerMetricsTrackerFactory(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createInputNotNullNullOutputNotNull999df8ff16f96d1a9b4() {

    // Arrange
    final CompositeMeterRegistry compositeMeterRegistry = new CompositeMeterRegistry();
    final MicrometerMetricsTrackerFactory thisObj = new MicrometerMetricsTrackerFactory(compositeMeterRegistry);
    final String arg0 = "aaaaa";
    final PoolStats arg1 = null;

    // Act
    final IMetricsTracker actual = thisObj.create(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
