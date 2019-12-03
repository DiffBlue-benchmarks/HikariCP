package com.zaxxer.hikari.metrics.prometheus;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTracker
 */

public class PrometheusMetricsTrackerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorCollectorRegistryIsNullAndPoolNameIsFoo() {
        // io/prometheus/client/Counter
        thrown.expect(NoClassDefFoundError.class);
        new PrometheusMetricsTracker("foo", null);
    }
}
