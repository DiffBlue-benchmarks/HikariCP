package com.zaxxer.hikari.metrics.dropwizard;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.metrics.dropwizard.CodahaleMetricsTrackerFactory
 */

public class CodahaleMetricsTrackerFactoryTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorRegistryIsNull() {
        // com/codahale/metrics/MetricRegistry
        thrown.expect(NoClassDefFoundError.class);
        new CodahaleMetricsTrackerFactory(null);
    }

    @Test
    public void createTimeoutMsIsOne() {
        CodahaleMetricsTrackerFactory codahaleMetricsTrackerFactory = new CodahaleMetricsTrackerFactory(null);
        // com.zaxxer.hikari.metrics.PoolStats
        thrown.expect(InstantiationException.class);
        new com.zaxxer.hikari.metrics.PoolStats(1L);
    }
}
