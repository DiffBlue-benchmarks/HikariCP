package com.zaxxer.hikari.metrics.prometheus;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTrackerFactory
 */

public class PrometheusMetricsTrackerFactoryTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorCollectorRegistryIsNull() {
        PrometheusMetricsTrackerFactory prometheusMetricsTrackerFactory = new PrometheusMetricsTrackerFactory(null);
        // pojo PrometheusMetricsTrackerFactory
    }

    @Test
    public void constructor() {
        // io/prometheus/client/CollectorRegistry
        thrown.expect(NoClassDefFoundError.class);
        new PrometheusMetricsTrackerFactory();
    }
}
