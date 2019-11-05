package com.zaxxer.hikari.metrics.prometheus;

import com.zaxxer.hikari.metrics.PoolStats;
import com.zaxxer.hikari.metrics.prometheus.HikariCPCollector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HikariCPCollectorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullNullOutputNullPointerException9995c2d6c465b301697() {

    // Arrange
    final HikariCPCollector thisObj = new HikariCPCollector();
    final String arg0 = "pool";
    final PoolStats arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.add(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999663f8881c8ff3131() {

    // Act, creating object to test constructor
    final HikariCPCollector actual = new HikariCPCollector();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
