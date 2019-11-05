package com.zaxxer.hikari.metrics.dropwizard;

import com.codahale.metrics.health.HealthCheckRegistry;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.metrics.dropwizard.CodahaleHealthChecker;
import com.zaxxer.hikari.pool.HikariPool;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CodahaleHealthCheckerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void registerHealthChecksInputNullNotNullNotNullOutputVoid999c4d3078e6d795eca() {

    // Arrange
    final HikariPool arg0 = null;
    final HikariConfig arg1 = new HikariConfig();
    final HealthCheckRegistry arg2 = new HealthCheckRegistry();

    // Act
    CodahaleHealthChecker.registerHealthChecks(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }
}
