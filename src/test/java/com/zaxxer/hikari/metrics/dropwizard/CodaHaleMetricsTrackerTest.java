package com.zaxxer.hikari.metrics.dropwizard;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.zaxxer.hikari.metrics.PoolStats;
import com.zaxxer.hikari.metrics.dropwizard.CodaHaleMetricsTracker;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CodaHaleMetricsTrackerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid9991556798c6060bd5c() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);

    // Act
    thisObj.close();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNullNotNullOutputNotNull999d2b74e19cfeb017e() {

    // Arrange
    final String arg0 = "ActiveConnections";
    final PoolStats arg1 = null;
    final MetricRegistry arg2 = new MetricRegistry();

    // Act, creating object to test constructor
    final CodaHaleMetricsTracker actual = new CodaHaleMetricsTracker(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getConnectionCreationHistogram());
    Assert.assertNotNull(actual.getConnectionAcquisitionTimer());
    Assert.assertNotNull(actual.getConnectionDurationHistogram());

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionAcquisitionTimerOutputNotNull99979142672d83b1923() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);

    // Act
    final Timer actual = thisObj.getConnectionAcquisitionTimer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionCreationHistogramOutputNotNull99997bfd689a39926b5() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);

    // Act
    final Histogram actual = thisObj.getConnectionCreationHistogram();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionDurationHistogramOutputNotNull9994a995efb05d861c4() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);

    // Act
    final Histogram actual = thisObj.getConnectionDurationHistogram();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionAcquiredNanosInputPositiveOutputVoid999b61a69d1867dc3ab() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionAcquiredNanos(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionCreatedMillisInputPositiveOutputVoid999c5b4838e3aaf0a3e() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionCreatedMillis(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionTimeoutOutputVoid9991eff08d99237e12d() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);

    // Act
    thisObj.recordConnectionTimeout();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionUsageMillisInputPositiveOutputVoid999be445d910bd55164() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodaHaleMetricsTracker thisObj = new CodaHaleMetricsTracker("ActiveConnections", null, metricRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionUsageMillis(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
