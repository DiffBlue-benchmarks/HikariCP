package com.zaxxer.hikari.metrics.micrometer;

import org.junit.Test;

/**
 * Unit tests for com.zaxxer.hikari.metrics.micrometer.MicrometerMetricsTrackerFactory
 */

public class MicrometerMetricsTrackerFactoryTest {

    @Test
    public void constructorRegistryIsNull() {
        MicrometerMetricsTrackerFactory micrometerMetricsTrackerFactory = new MicrometerMetricsTrackerFactory(null);
        // pojo MicrometerMetricsTrackerFactory
    }
}
