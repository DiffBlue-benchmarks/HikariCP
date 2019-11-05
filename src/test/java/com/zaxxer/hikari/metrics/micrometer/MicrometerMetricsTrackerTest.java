package com.zaxxer.hikari.metrics.micrometer;

import com.zaxxer.hikari.metrics.PoolStats;
import com.zaxxer.hikari.metrics.micrometer.MicrometerMetricsTracker;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MicrometerMetricsTrackerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNullNotNullOutputNotNull999d39ca9c7a9b8ed48() {

    // Arrange
    final String arg0 = "aaaaa";
    final PoolStats arg1 = null;
    final CompositeMeterRegistry arg2 = new CompositeMeterRegistry();

    // Act, creating object to test constructor
    final MicrometerMetricsTracker actual = new MicrometerMetricsTracker(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionAcquiredNanosInputPositiveOutputVoid999d815aaee3724ed0c() {

    // Arrange
    final CompositeMeterRegistry compositeMeterRegistry = new CompositeMeterRegistry();
    final MicrometerMetricsTracker thisObj = new MicrometerMetricsTracker("aaaaa", null, compositeMeterRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionAcquiredNanos(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionCreatedMillisInputPositiveOutputVoid99974e20bb16d571676() {

    // Arrange
    final CompositeMeterRegistry compositeMeterRegistry = new CompositeMeterRegistry();
    final MicrometerMetricsTracker thisObj = new MicrometerMetricsTracker("aaaaa", null, compositeMeterRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionCreatedMillis(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionTimeoutOutputVoid99974572b2822312bdc() {

    // Arrange
    final CompositeMeterRegistry compositeMeterRegistry = new CompositeMeterRegistry();
    final MicrometerMetricsTracker thisObj = new MicrometerMetricsTracker("aaaaa", null, compositeMeterRegistry);

    // Act
    thisObj.recordConnectionTimeout();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionUsageMillisInputPositiveOutputVoid99935a20efeb80dd7f0() {

    // Arrange
    final CompositeMeterRegistry compositeMeterRegistry = new CompositeMeterRegistry();
    final MicrometerMetricsTracker thisObj = new MicrometerMetricsTracker("aaaaa", null, compositeMeterRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionUsageMillis(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
