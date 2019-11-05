package com.zaxxer.hikari.pool;

import com.codahale.metrics.InstrumentedScheduledExecutorService;
import com.codahale.metrics.MetricRegistry;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.PoolEntry;
import com.zaxxer.hikari.pool.ProxyLeakTask;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ProxyLeakTaskTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void cancelOutputNullPointerException999fc9a52420c836b7b() {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(0);
    poolEntry.setState(0);
    final ProxyLeakTask thisObj = new ProxyLeakTask(poolEntry);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.cancel();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99960a9afc5eb2fffff() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry arg0 = new PoolEntry(hikariProxyConnection, null, true, true);

    // Act, creating object to test constructor
    final ProxyLeakTask actual = new ProxyLeakTask(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid999bf3de9ccb027919e() {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(0);
    poolEntry.setState(0);
    final ProxyLeakTask thisObj = new ProxyLeakTask(poolEntry);

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void scheduleInputNotNullPositiveOutputNullPointerException9996406469b0d788430() {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(0);
    poolEntry.setState(0);
    final ProxyLeakTask thisObj = new ProxyLeakTask(poolEntry);
    final MetricRegistry metricRegistry = new MetricRegistry();
    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService1 = new InstrumentedScheduledExecutorService(null, metricRegistry);
    final MetricRegistry metricRegistry1 = new MetricRegistry();
    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService1, metricRegistry1);
    final MetricRegistry metricRegistry2 = new MetricRegistry();
    final InstrumentedScheduledExecutorService arg0 = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService, metricRegistry2);
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.schedule(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
