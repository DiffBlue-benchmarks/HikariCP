package com.zaxxer.hikari.pool;

import com.codahale.metrics.InstrumentedExecutorService;
import com.codahale.metrics.MetricRegistry;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.PoolEntry;
import com.zaxxer.hikari.pool.ProxyLeakTask;
import com.zaxxer.hikari.util.FastList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.ScheduledThreadPoolExecutor;



public class HikariProxyConnectionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void abortInputNotNullOutputNullPointerException999d0277031784c61d5() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
    final MetricRegistry metricRegistry = new MetricRegistry();
    final InstrumentedExecutorService arg0 = new InstrumentedExecutorService(scheduledThreadPoolExecutor, metricRegistry);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.abort(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearWarningsOutputNullPointerException999c3f6f47f0df57973() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void commitOutputNullPointerException9995b09662c9a6d5215() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.commit();

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullNullNotNullPositiveTrueTrueOutputNotNull99920e5abff6af3eacc() {
//
//    // Arrange
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry arg0 = new PoolEntry(hikariProxyConnection, null, true, true);
//    final HikariProxyConnection arg1 = new HikariProxyConnection(arg0, hikariProxyConnection, null, proxyLeakTask, 1L, true, true);
//    final FastList arg2 = null;
//    final ProxyLeakTask arg3 = proxyLeakTask;
//    final long arg4 = 1L;
//    final boolean arg5 = true;
//    final boolean arg6 = true;
//
//    // Act, creating object to test constructor
//    final HikariProxyConnection actual = new HikariProxyConnection(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, actual.getNetworkTimeoutState());
//    Assert.assertTrue(actual.getReadOnlyState());
//    Assert.assertTrue(actual.getAutoCommitState());
//    Assert.assertEquals(0, actual.getTransactionIsolationState());
//    Assert.assertNull(actual.getSchemaState());
//    Assert.assertNull(actual.getCatalogState());
//    Assert.assertNotNull(actual.delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) actual.delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) actual.delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) actual.delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) actual.delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) actual.delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) actual.delegate).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) actual.delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).delegate);
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().connection).getPoolEntry());
//    Assert.assertEquals(18_102_056_208_662L, ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual.delegate).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) actual.delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) actual.delegate).delegate, ((HikariProxyConnection) actual.delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_102_062_734_377L, ((HikariProxyConnection) actual.delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) actual.delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) actual.delegate).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(((HikariProxyConnection) actual.delegate).getPoolEntry(), actual.getPoolEntry());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void createArrayOfInputNotNull3OutputNullPointerException999aecb040519c1c926() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final Object[] arg1 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createArrayOf(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createBlobOutputNullPointerException9994b1a05ef337af8c8() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createBlob();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createClobOutputNullPointerException99978e4af640b1cd5f4() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createClob();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createNClobOutputNullPointerException999f7f52baf99611442() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createNClob();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createSQLXMLOutputNullPointerException9991b4b8899cbb87bcd() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createSQLXML();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createStatementOutputNullPointerException99957b3a31daea8a255() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createStatement();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createStatementInputPositivePositivePositiveOutputNullPointerException999cca060e408dd4493() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final int arg0 = 1;
    final int arg1 = 2561;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createStatement(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createStatementInputPositivePositiveOutputNullPointerException999e4583febae4c4066() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final int arg0 = 1;
    final int arg1 = 2561;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createStatement(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void createStructInputNotNull3OutputNullPointerException999f0a949644d3c36c6() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final Object[] arg1 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createStruct(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getAutoCommitOutputNullPointerException9995e804c2cc8a7f324() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getAutoCommit();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCatalogOutputNullPointerException999726ca4edd7875a38() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCatalog();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getClientInfoOutputNullPointerException999b5c1a82391010e4e() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getClientInfo();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getClientInfoInputNotNullOutputNullPointerException999265d5a9bdc232e69() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getClientInfo(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHoldabilityOutputNullPointerException999c9109e503b0ce428() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getHoldability();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetaDataOutputNullPointerException9993c4309aec98fca21() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMetaData();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNetworkTimeoutOutputNullPointerException999021feb793ad950d7() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNetworkTimeout();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemaOutputNullPointerException999e506aa8cd6883bb1() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getSchema();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTransactionIsolationOutputNullPointerException999654ac6a5aca7a66e() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTransactionIsolation();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeMapOutputNullPointerException999c27af203c642a6f7() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTypeMap();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWarningsOutputNullPointerException999bbfb46a760645a5c() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isClosedOutputFalse9996c6b10f1eb14f7ea() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    final boolean actual = thisObj.isClosed();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isReadOnlyOutputNullPointerException999587ebf49502c7796() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isReadOnly();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidInputPositiveOutputNullPointerException9998ebd1da3bf605da0() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isValid(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void nativeSQLInputNotNullOutputNullPointerException999c8f6498afc8cf5da() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.nativeSQL(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareCallInputNotNullPositivePositivePositiveOutputNullPointerException99981361e35b249b999() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final int arg1 = 1;
    final int arg2 = 1;
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareCall(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareCallInputNotNullPositivePositiveOutputNullPointerException9994513421224c0dc61() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final int arg1 = 1;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareCall(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareCallInputNotNullOutputNullPointerException999cc7e3b7b5180e7a7() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareCall(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareStatementInputNotNull8OutputNullPointerException9996d0871f756219ea0() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final int[] arg1 = { 1, 1, 1, 1, 1, 1, 1, 11 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareStatement(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareStatementInputNotNull3OutputNullPointerException999d1b60adef2eb5e85() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final String[] arg1 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareStatement(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareStatementInputNotNullPositivePositivePositiveOutputNullPointerException999037931e5db82a44b() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final int arg1 = 1;
    final int arg2 = 1;
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareStatement(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareStatementInputNotNullPositivePositiveOutputNullPointerException999f3dbaafb2c46e84a() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final int arg1 = 1;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareStatement(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareStatementInputNotNullPositiveOutputNullPointerException9990555964c733eefc9() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareStatement(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void prepareStatementInputNotNullOutputNullPointerException99963f2ce107dcac0e2() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.prepareStatement(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void releaseSavepointInputNullOutputNullPointerException99925a0aee724c4074f() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final Savepoint arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.releaseSavepoint(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rollbackOutputNullPointerException99991f046b3c2697a7f() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rollback();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rollbackInputNullOutputNullPointerException999b5235f2f05302500() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final Savepoint arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rollback(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoCommitInputTrueOutputNullPointerException999d4b3c0d1b045a53b() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setAutoCommit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCatalogInputNotNullOutputNullPointerException9998f53e08d0a0d6272() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCatalog(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClientInfoInputNotNullNotNullOutputNullPointerException9991bf04ba6cffa4581() throws SQLClientInfoException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClientInfo(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClientInfoInputNotNullOutputNullPointerException99943861bd6a932fd5a() throws SQLClientInfoException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final Properties arg0 = new Properties();
    arg0.put("aaaaaaaaaaaaaaa", "aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClientInfo(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHoldabilityInputPositiveOutputNullPointerException999f56476d320a0b119() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setHoldability(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNetworkTimeoutInputNotNullPositiveOutputNullPointerException99986b8d0c954ca5899() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
    final MetricRegistry metricRegistry = new MetricRegistry();
    final InstrumentedExecutorService arg0 = new InstrumentedExecutorService(scheduledThreadPoolExecutor, metricRegistry);
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNetworkTimeout(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setReadOnlyInputTrueOutputNullPointerException999d86f17821536e5cd() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setReadOnly(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSavepointOutputNullPointerException999e8608d17c8e3d749() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setSavepoint();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSavepointInputNotNullOutputNullPointerException9998e9950f0d81c7144() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setSavepoint(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemaInputNotNullOutputNullPointerException999c31bc1131892cf7d() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final String arg0 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setSchema(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTransactionIsolationInputPositiveOutputNullPointerException99966f8902d76cc8548() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTransactionIsolation(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTypeMapInputNotNullOutputNullPointerException999bb37699554683102() throws SQLException {

    // Arrange
    final PoolEntry poolEntry1 = new PoolEntry(null, null, true, true);
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 2561L, true, true);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry1, hikariProxyConnection1, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection, null, true, true);
    poolEntry.setState(1);
    poolEntry.setState(1);
    final HikariProxyConnection thisObj = new HikariProxyConnection(poolEntry, hikariProxyConnection, null, null, 1L, true, true);
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put(null, "aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTypeMap(arg0);

    // The method is not expected to return due to exception thrown

  }
}
