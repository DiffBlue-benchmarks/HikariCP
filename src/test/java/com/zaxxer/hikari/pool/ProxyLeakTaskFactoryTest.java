//package com.zaxxer.hikari.pool;
//
//import com.codahale.metrics.InstrumentedScheduledExecutorService;
//import com.codahale.metrics.MetricRegistry;
//import com.zaxxer.hikari.pool.HikariProxyConnection;
//import com.zaxxer.hikari.pool.PoolEntry;
//import com.zaxxer.hikari.pool.ProxyLeakTask.;
//import com.zaxxer.hikari.pool.ProxyLeakTask;
//import com.zaxxer.hikari.pool.ProxyLeakTaskFactory;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class ProxyLeakTaskFactoryTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputZeroNotNullOutputNotNull9999492d465c40b46dc() {
//
//    // Arrange
//    final long arg0 = 0L;
//    final MetricRegistry metricRegistry = new MetricRegistry();
//    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService1 = new InstrumentedScheduledExecutorService(null, metricRegistry);
//    final MetricRegistry metricRegistry1 = new MetricRegistry();
//    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService1, metricRegistry1);
//    final MetricRegistry metricRegistry2 = new MetricRegistry();
//    final InstrumentedScheduledExecutorService arg1 = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService, metricRegistry2);
//
//    // Act, creating object to test constructor
//    final ProxyLeakTaskFactory actual = new ProxyLeakTaskFactory(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void scheduleInputNotNullOutputNotNull9993afc320e4f00d431() {
//
//    // Arrange
//    final MetricRegistry metricRegistry = new MetricRegistry();
//    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService1 = new InstrumentedScheduledExecutorService(null, metricRegistry);
//    final MetricRegistry metricRegistry1 = new MetricRegistry();
//    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService1, metricRegistry1);
//    final ProxyLeakTaskFactory thisObj = new ProxyLeakTaskFactory(0L, instrumentedScheduledExecutorService);
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 0L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 0L, true, true);
//    final PoolEntry arg0 = new PoolEntry(hikariProxyConnection, null, true, true);
//
//    // Act
//    final ProxyLeakTask actual = thisObj.schedule(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void updateLeakDetectionThresholdInputZeroOutputVoid999a6c1062d454faf7d() {
//
//    // Arrange
//    final MetricRegistry metricRegistry = new MetricRegistry();
//    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService1 = new InstrumentedScheduledExecutorService(null, metricRegistry);
//    final MetricRegistry metricRegistry1 = new MetricRegistry();
//    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService1, metricRegistry1);
//    final ProxyLeakTaskFactory thisObj = new ProxyLeakTaskFactory(0L, instrumentedScheduledExecutorService);
//    final long arg0 = 0L;
//
//    // Act
//    thisObj.updateLeakDetectionThreshold(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//