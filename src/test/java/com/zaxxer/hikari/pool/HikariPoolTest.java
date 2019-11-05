package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;
import com.zaxxer.hikari.pool.HikariPool;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HikariPoolTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputPoolInitializationException999464e2ad016092bbb() {

    // Arrange
    final HikariConfig arg0 = new HikariConfig();

    // Act, creating object to test constructor
    thrown.expect(HikariPool.PoolInitializationException.class);
    new HikariPool(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999a2e96f8a5f2d65f1() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final HikariPool.PoolInitializationException actual = new HikariPool.PoolInitializationException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("Failed to initialize pool: null", actual.getMessage());

  }
}
