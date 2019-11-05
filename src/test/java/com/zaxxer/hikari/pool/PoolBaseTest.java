package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.metrics.MetricsTracker;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.PoolBase.ConnectionSetupException;
import com.zaxxer.hikari.pool.PoolBase.MetricsTrackerDelegate;
import com.zaxxer.hikari.pool.PoolBase.NopMetricsTrackerDelegate;
import com.zaxxer.hikari.pool.PoolEntry;
import com.zaxxer.hikari.pool.ProxyLeakTask;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PoolBaseTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999f6bb7d5a477580c5() {

    // Arrange
    final Throwable arg0 = new Throwable();

    // Act, creating object to test constructor
    final ConnectionSetupException actual = new ConnectionSetupException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid999ca8ca7ef714faa2f() {

    // Arrange
    final MetricsTracker metricsTracker = new MetricsTracker();
    final MetricsTrackerDelegate thisObj = new MetricsTrackerDelegate(metricsTracker);

    // Act
    thisObj.close();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9991e508f185e139c89() {

    // Arrange
    final MetricsTracker arg0 = new MetricsTracker();

    // Act, creating object to test constructor
    final MetricsTrackerDelegate actual = new MetricsTrackerDelegate(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.tracker);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void recordBorrowStatsInputNotNullPositiveOutputVoid999dc03a3ea937cfb46() {
//
//    // Arrange
//    final MetricsTracker metricsTracker = new MetricsTracker();
//    final MetricsTrackerDelegate thisObj = new MetricsTrackerDelegate(metricsTracker);
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry arg0 = new PoolEntry(hikariProxyConnection, null, true, true);
//    final long arg1 = 1L;
//
//    // Act
//    thisObj.recordBorrowStats(arg0, arg1);
//
//    // Assert side effects
//    Assert.assertNotNull(arg0);
//    Assert.assertNotNull(arg0.connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) arg0.connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) arg0.connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) arg0.connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) arg0.connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) arg0.connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) arg0.connection).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) arg0.connection).delegate);
//    Assert.assertNotNull(((HikariProxyConnection) arg0.connection).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) arg0.connection).getPoolEntry().connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) arg0.connection).getPoolEntry().connection).getPoolEntry());
//    Assert.assertEquals(18_097_356_840_842L, ((HikariProxyConnection) arg0.connection).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) arg0.connection).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) arg0.connection).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(18_097_364_584_865L, arg0.lastAccessed);
//    Assert.assertFalse(arg0.isMarkedEvicted());
//    Assert.assertEquals(18_097_366_035_199L, arg0.lastBorrowed);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void recordBorrowTimeoutStatsInputPositiveOutputVoid9999a2c0a4f9398fe19() {

    // Arrange
    final MetricsTracker metricsTracker = new MetricsTracker();
    final MetricsTrackerDelegate thisObj = new MetricsTrackerDelegate(metricsTracker);
    final long arg0 = 1L;

    // Act
    thisObj.recordBorrowTimeoutStats(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionCreatedInputPositiveOutputVoid999fb14e650756b4671() {

    // Arrange
    final MetricsTracker metricsTracker = new MetricsTracker();
    final MetricsTrackerDelegate thisObj = new MetricsTrackerDelegate(metricsTracker);
    final long arg0 = 1L;

    // Act
    thisObj.recordConnectionCreated(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionTimeoutOutputVoid9996224bf350369639a() {

    // Arrange
    final MetricsTracker metricsTracker = new MetricsTracker();
    final MetricsTrackerDelegate thisObj = new MetricsTrackerDelegate(metricsTracker);

    // Act
    thisObj.recordConnectionTimeout();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void recordConnectionUsageInputNotNullOutputVoid999e397ec77647a6d2d() {

    // Arrange
    final MetricsTracker metricsTracker = new MetricsTracker();
    final MetricsTrackerDelegate thisObj = new MetricsTrackerDelegate(metricsTracker);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry arg0 = new PoolEntry(hikariProxyConnection, null, true, true);

    // Act
    thisObj.recordConnectionUsage(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999eb851dc6ce572724() {

    // Act, creating object to test constructor
    final NopMetricsTrackerDelegate actual = new NopMetricsTrackerDelegate();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
