package com.zaxxer.hikari.metrics.prometheus;

import com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTracker;
import io.prometheus.client.CollectorRegistry;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PrometheusMetricsTrackerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9992f995aa88837a2f5() {

    // Arrange
    final String arg0 = "Connection acquired time (ns)";
    final CollectorRegistry arg1 = new CollectorRegistry();

    // Act, creating object to test constructor
    final PrometheusMetricsTracker actual = new PrometheusMetricsTracker(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionAcquiredNanosInputPositiveOutputVoid99975362e1dac43f76d() {

    // Arrange
    final CollectorRegistry collectorRegistry = new CollectorRegistry();
    final PrometheusMetricsTracker thisObj = new PrometheusMetricsTracker("Connection acquired time (ns)", collectorRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionAcquiredNanos(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionCreatedMillisInputPositiveOutputVoid99976cd991487250811() {

    // Arrange
    final CollectorRegistry collectorRegistry = new CollectorRegistry();
    final PrometheusMetricsTracker thisObj = new PrometheusMetricsTracker("Connection acquired time (ns)", collectorRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionCreatedMillis(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionTimeoutOutputVoid99914ec07d9edc2c7b7() {

    // Arrange
    final CollectorRegistry collectorRegistry = new CollectorRegistry();
    final PrometheusMetricsTracker thisObj = new PrometheusMetricsTracker("Connection acquired time (ns)", collectorRegistry);

    // Act
    thisObj.recordConnectionTimeout();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionUsageMillisInputPositiveOutputVoid9996a2e024923dea6c9() {

    // Arrange
    final CollectorRegistry collectorRegistry = new CollectorRegistry();
    final PrometheusMetricsTracker thisObj = new PrometheusMetricsTracker("Connection acquired time (ns)", collectorRegistry);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionUsageMillis(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
