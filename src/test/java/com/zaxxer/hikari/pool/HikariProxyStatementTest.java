package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.pool.HikariProxyCallableStatement;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.HikariProxyStatement;
import com.zaxxer.hikari.pool.PoolEntry;
import com.zaxxer.hikari.pool.ProxyCallableStatement;
import com.zaxxer.hikari.pool.ProxyLeakTask;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.Connection;
import java.sql.SQLException;



public class HikariProxyStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addBatchInputNotNullOutputNullPointerException9993141759b0099c69b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.addBatch(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void cancelOutputNullPointerException999d9988015fb9860ea() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.cancel();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearBatchOutputNullPointerException999e5706e61244ff61b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearWarningsOutputNullPointerException99955400a859fd8eb9a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOnCompletionOutputNullPointerException999fa1eadb524cd623e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.closeOnCompletion();

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull9994622e1f7cb4b99e6() {
//
//    // Arrange
//    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 11L, true, true);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
//    final HikariProxyConnection arg0 = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, hikariProxyConnection1, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry poolEntry2 = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask1 = new ProxyLeakTask(poolEntry2);
//    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry1, hikariProxyConnection3, null, proxyLeakTask1, 1L, true, true);
//    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(null, null);
//    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection2, hikariProxyCallableStatement2);
//    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(arg0, hikariProxyCallableStatement1);
//    final HikariProxyCallableStatement arg1 = new HikariProxyCallableStatement(hikariProxyConnection2, hikariProxyCallableStatement);
//
//    // Act, creating object to test constructor
//    final HikariProxyStatement actual = new HikariProxyStatement(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) actual.getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) actual.getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) actual.getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) actual.getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) actual.getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) actual.getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) actual.getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_100_871_216_525L, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) actual.getConnection()).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) actual.getConnection()).delegate, ((HikariProxyConnection) actual.getConnection()).getPoolEntry().connection);
//    Assert.assertEquals(18_100_874_278_173L, ((HikariProxyConnection) actual.getConnection()).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) actual.getConnection()).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) actual.getConnection()).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(actual.delegate);
//    Assert.assertNotNull(((ProxyCallableStatement) actual.delegate).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).getCatalogState());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry(), ((HikariProxyConnection) ((ProxyCallableStatement) actual.delegate).getConnection()).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyCallableStatement) actual.delegate).delegate);
//    Assert.assertEquals(actual.getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual.delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual.delegate).delegate).delegate);
//    Assert.assertEquals(((ProxyCallableStatement) actual.delegate).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual.delegate).delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual.delegate).delegate).delegate).delegate);
//    Assert.assertNull(((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual.delegate).delegate).delegate).delegate).getConnection());
//    Assert.assertNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual.delegate).delegate).delegate).delegate).delegate);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNull8OutputNullPointerException99975448489ce710426() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNull3OutputNullPointerException999d107ceb5a9ce1ca5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullPositiveOutputNullPointerException999e2115f32f125e346() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullOutputNullPointerException999217baf8529474a1f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeBatchOutputNullPointerException999f32c3cd330330496() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeBatchOutputNullPointerException999bbfb4e95bebb2b0a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNull8OutputNullPointerException9995702598d0185ff5c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNull3OutputNullPointerException999136fec9bb98d7b05() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNullPositiveOutputNullPointerException9993e64c8e22e7224bb() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNullOutputNullPointerException999c4a95ca9795b553a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeQueryInputNotNullOutputNullPointerException9991a0cd60c6e11a32c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeQuery(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNull8OutputNullPointerException999748dcdcc21ba26a3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNull3OutputNullPointerException99948f8a67318b3fc8b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNullPositiveOutputNullPointerException9998578ab5e72cf0ba0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNullOutputNullPointerException999d2d6a8602397d10f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getConnectionOutputNotNull999d2bccb831424ebdd() throws SQLException {
//
//    // Arrange
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
//    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
//    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
//    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
//
//    // Act
//    final Connection actual = thisObj.getConnection();
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
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_097_017_983_884L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry(), ((HikariProxyConnection) actual).getPoolEntry());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchDirectionOutputNullPointerException9997109bca876269491() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchDirection();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchSizeOutputNullPointerException99932d6981c045baee3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchSize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getGeneratedKeysOutputNullPointerException9990c67b0bc9d4531ba() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getGeneratedKeys();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLargeMaxRowsOutputNullPointerException99974648089fcc368c3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLargeMaxRows();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLargeUpdateCountOutputNullPointerException9998824dc6962129536() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLargeUpdateCount();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxFieldSizeOutputNullPointerException9998786ea7cf832bf71() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMaxFieldSize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxRowsOutputNullPointerException999a219770e78ff028f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMaxRows();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMoreResultsOutputNullPointerException9993e0a873b4ed908b7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMoreResults();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMoreResultsInputPositiveOutputNullPointerException999f04c3421b0e88fdd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMoreResults(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getQueryTimeoutOutputNullPointerException999a4fd4176d4257287() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getQueryTimeout();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetConcurrencyOutputNullPointerException9991b3eb8ca6af4e9cc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetConcurrency();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetHoldabilityOutputNullPointerException99922953c14409ebf55() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetHoldability();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetOutputNullPointerException999cb45f58c3d9492f9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSet();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetTypeOutputNullPointerException9995f2021e1c1c20906() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetType();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUpdateCountOutputNullPointerException999a2d91437692831fa() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getUpdateCount();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWarningsOutputNullPointerException999c693608b5cd941f9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isClosedOutputNullPointerException999bea6be85d04c599c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isClosed();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isCloseOnCompletionOutputNullPointerException999dd597f332530ee7f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isCloseOnCompletion();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isPoolableOutputNullPointerException9990467e838b88c6419() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isPoolable();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isWrapperForInputNullOutputNullPointerException99944c85a2145b6d36e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final Class arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isWrapperFor(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCursorNameInputNotNullOutputNullPointerException9997b2710263b66d6c2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCursorName(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setEscapeProcessingInputTrueOutputNullPointerException99954a1a8c155fe6dd8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setEscapeProcessing(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchDirectionInputPositiveOutputNullPointerException99958907b1a0973b174() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchDirection(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchSizeInputPositiveOutputNullPointerException999077d438e4fd673cc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLargeMaxRowsInputPositiveOutputNullPointerException9996f3aaab22fa92b45() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final long arg0 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setLargeMaxRows(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxFieldSizeInputPositiveOutputNullPointerException99941968bdee9260d61() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setMaxFieldSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxRowsInputPositiveOutputNullPointerException9997d8231e7862adec9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setMaxRows(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPoolableInputTrueOutputNullPointerException999049c0a6b96e2edf2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setPoolable(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setQueryTimeoutInputPositiveOutputNullPointerException999f333357cd36cf165() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyStatement thisObj = new HikariProxyStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setQueryTimeout(arg0);

    // The method is not expected to return due to exception thrown

  }
}
