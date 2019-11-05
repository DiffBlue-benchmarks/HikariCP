package com.zaxxer.hikari.metrics.dropwizard;

import com.codahale.metrics.MetricRegistry;
import com.zaxxer.hikari.metrics.IMetricsTracker;
import com.zaxxer.hikari.metrics.PoolStats;
import com.zaxxer.hikari.metrics.dropwizard.CodaHaleMetricsTracker;
import com.zaxxer.hikari.metrics.dropwizard.CodahaleMetricsTrackerFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CodahaleMetricsTrackerFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99936a85b1f3b01b492() {

    // Arrange
    final MetricRegistry arg0 = new MetricRegistry();

    // Act, creating object to test constructor
    final CodahaleMetricsTrackerFactory actual = new CodahaleMetricsTrackerFactory(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getRegistry());

  }

  // Test written by Diffblue Cover
  @Test
  public void createInputNotNullNullOutputNotNull9994bac36eb4ce6997f() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodahaleMetricsTrackerFactory thisObj = new CodahaleMetricsTrackerFactory(metricRegistry);
    final String arg0 = "aaaaa";
    final PoolStats arg1 = null;

    // Act
    final IMetricsTracker actual = thisObj.create(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(((CodaHaleMetricsTracker) actual).getConnectionCreationHistogram());
    Assert.assertNotNull(((CodaHaleMetricsTracker) actual).getConnectionAcquisitionTimer());
    Assert.assertNotNull(((CodaHaleMetricsTracker) actual).getConnectionDurationHistogram());

  }

  // Test written by Diffblue Cover
  @Test
  public void getRegistryOutputNotNull99943c2fa45b73aea7d() {

    // Arrange
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodahaleMetricsTrackerFactory thisObj = new CodahaleMetricsTrackerFactory(metricRegistry);

    // Act
    final MetricRegistry actual = thisObj.getRegistry();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
