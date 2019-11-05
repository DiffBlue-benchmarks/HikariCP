package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.PoolBase;
import com.zaxxer.hikari.pool.PoolEntry;
import com.zaxxer.hikari.pool.ProxyLeakTask;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.Connection;
import java.sql.SQLException;



public class PoolEntryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void closeOutputNotNull999e6e10448782320ef() {
//
//    // Arrange
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
//
//    // Act
//    final Connection actual = thisObj.close();
//
//    // Assert side effects
//    Assert.assertNull(thisObj.connection);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, ((HikariProxyConnection) actual).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) actual).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) actual).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) actual).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) actual).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) actual).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) actual).delegate);
//    Assert.assertNotNull(((HikariProxyConnection) actual).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) actual).getPoolEntry().connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual).getPoolEntry().connection).getPoolEntry());
//    Assert.assertEquals(18_101_688_782_313L, ((HikariProxyConnection) actual).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) actual).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) actual).getPoolEntry().lastBorrowed);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void compareAndSetInputZeroZeroOutputTrue999a63076016e447ebd() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    final boolean actual = thisObj.compareAndSet(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNullTrueTrueOutputNotNull999c2f8494e1474cfb4() {
//
//    // Arrange
//    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, null, null, null, 11L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
//    final PoolEntry poolEntry2 = new PoolEntry(null, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(poolEntry2, null, null, proxyLeakTask, 1L, true, true);
//    final HikariProxyConnection arg0 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
//    final PoolBase arg1 = null;
//    final boolean arg2 = true;
//    final boolean arg3 = true;
//
//    // Act, creating object to test constructor
//    final PoolEntry actual = new PoolEntry(arg0, arg1, arg2, arg3);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) actual.connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) actual.connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) actual.connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) actual.connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) actual.connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) actual.connection).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) actual.connection).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).delegate);
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_104_537_755_278L, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) actual.connection).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) actual.connection).getPoolEntry().connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).delegate);
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getPoolEntry().connection);
//    Assert.assertEquals(18_104_495_606_524L, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual.connection).getPoolEntry().connection).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(18_104_537_365_472L, ((HikariProxyConnection) actual.connection).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) actual.connection).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) actual.connection).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(18_104_541_031_484L, actual.lastAccessed);
//    Assert.assertFalse(actual.isMarkedEvicted());
//    Assert.assertEquals(0L, actual.lastBorrowed);
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void createProxyConnectionInputNotNullPositiveOutputNotNull9996fafcac9970cd8d9() {
//
//    // Arrange
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
//    final ProxyLeakTask arg0 = new ProxyLeakTask(thisObj);
//    final long arg1 = 1L;
//
//    // Act
//    final Connection actual = thisObj.createProxyConnection(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, ((HikariProxyConnection) actual).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) actual).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) actual).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) actual).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) actual).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) actual).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) actual).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate);
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection).getPoolEntry());
//    Assert.assertEquals(18_099_795_323_298L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) actual).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) actual).delegate, ((HikariProxyConnection) actual).getPoolEntry().connection);
//    Assert.assertEquals(18_099_798_599_757L, ((HikariProxyConnection) actual).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) actual).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) actual).getPoolEntry().lastBorrowed);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void evictInputNotNullOutputNullPointerException999241958c10dc00ca5() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
    final String arg0 = "state";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.evict(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getMillisSinceBorrowedOutputPositive9998f7d39ad89c69139() {
//
//    // Arrange
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
//
//    // Act
//    final long actual = thisObj.getMillisSinceBorrowed();
//
//    // Assert result
//    Assert.assertEquals(18_097_687L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getPoolNameOutputNullPointerException999c1c53d5936c2949d() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getPoolName();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStateOutputZero999b3492fee018042e7() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);

    // Act
    final int actual = thisObj.getState();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isMarkedEvictedOutputFalse9992fb0331b30333553() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);

    // Act
    final boolean actual = thisObj.isMarkedEvicted();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void markEvictedOutputVoid9997970f926ea5a9b1b() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);

    // Act
    thisObj.markEvicted();

    // Assert side effects
    Assert.assertTrue(thisObj.isMarkedEvicted());

  }

  // Test written by Diffblue Cover
  @Test
  public void recycleInputPositiveOutputNullPointerException9995dc57c1fd5ab5054() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
    final long arg0 = 1L;
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.recycle(arg0);
    } catch (NullPointerException ex) {

      // Assert side effects
      Assert.assertEquals(1L, thisObj.lastAccessed);
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void resetConnectionStateInputNotNullZeroOutputNullPointerException999ba86e6ecff67241f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
    final HikariProxyConnection arg0 = new HikariProxyConnection(thisObj, hikariProxyConnection, null, proxyLeakTask, 1L, true, true);
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.resetConnectionState(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setStateInputZeroOutputVoid99903984dd581f36e54() {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
    final int arg0 = 0;

    // Act
    thisObj.setState(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void toStringOutputNotNull9992ed769a8ab9c93a2() {
//
//    // Arrange
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry thisObj = new PoolEntry(hikariProxyConnection, null, true, true);
//
//    // Act
//    final String actual = thisObj.toString();
//
//    // Assert result
//    Assert.assertEquals("HikariProxyConnection@1005096324 wrapping null, accessed 4ms315\u00b5s294ns ago, NOT_IN_USE", actual);
//
//  }
}
