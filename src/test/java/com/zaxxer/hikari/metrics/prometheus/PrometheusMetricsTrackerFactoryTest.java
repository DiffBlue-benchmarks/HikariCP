package com.zaxxer.hikari.metrics.prometheus;

import com.zaxxer.hikari.metrics.PoolStats;
import com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTrackerFactory;
import io.prometheus.client.CollectorRegistry;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PrometheusMetricsTrackerFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e8e6c9fc5d64f990() {

    // Act, creating object to test constructor
    final PrometheusMetricsTrackerFactory actual = new PrometheusMetricsTrackerFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999e5f69e245e3ed39c() {

    // Arrange
    final CollectorRegistry arg0 = new CollectorRegistry();

    // Act, creating object to test constructor
    final PrometheusMetricsTrackerFactory actual = new PrometheusMetricsTrackerFactory(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createInputNotNullNullOutputNullPointerException999184d236249f43e3d() {

    // Arrange
    final PrometheusMetricsTrackerFactory thisObj = new PrometheusMetricsTrackerFactory();
    final String arg0 = "aaaaa";
    final PoolStats arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.create(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
