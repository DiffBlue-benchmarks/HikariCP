package com.zaxxer.hikari.pool;

import org.junit.Test;

/**
 * Unit tests for com.zaxxer.hikari.pool.ProxyLeakTaskFactory
 */

public class ProxyLeakTaskFactoryTest {

    @Test
    public void constructorExecutorServiceIsNullAndLeakDetectionThresholdIsOne() {
        ProxyLeakTaskFactory proxyLeakTaskFactory = new ProxyLeakTaskFactory(1L, null);
        // pojo ProxyLeakTaskFactory
    }

    @Test
    public void updateLeakDetectionThresholdLeakDetectionThresholdIsOne() {
        ProxyLeakTaskFactory proxyLeakTaskFactory = new ProxyLeakTaskFactory(1L, null);
        proxyLeakTaskFactory.updateLeakDetectionThreshold(1L);
    }
}
