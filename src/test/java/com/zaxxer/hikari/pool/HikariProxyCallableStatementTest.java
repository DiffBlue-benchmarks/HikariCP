package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.pool.HikariProxyCallableStatement;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.PoolEntry;
import com.zaxxer.hikari.pool.ProxyCallableStatement;
import com.zaxxer.hikari.pool.ProxyLeakTask;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.postgresql.jdbc.PgSQLXML;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.util.HashMap;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;



public class HikariProxyCallableStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addBatchOutputNullPointerException999ee28ac01ef53e959() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.addBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addBatchInputNotNullOutputNullPointerException999bd9e4fea02642b5b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.addBatch(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void cancelOutputNullPointerException9999775b43eb1c2dafb() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.cancel();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearBatchOutputNullPointerException999f75f0ee53a91ed1b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearParametersOutputNullPointerException9999913761066d08476() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearParameters();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearWarningsOutputNullPointerException9998fdd3391b92f6f9d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOnCompletionOutputNullPointerException999fac63371b6c5c292() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.closeOnCompletion();

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull999b55b4c5c436a2dbb() {
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
//    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(arg0, null);
//    final HikariProxyCallableStatement arg1 = new HikariProxyCallableStatement(hikariProxyConnection2, hikariProxyCallableStatement);
//
//    // Act, creating object to test constructor
//    final HikariProxyCallableStatement actual = new HikariProxyCallableStatement(arg0, arg1);
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
//    Assert.assertEquals(18_101_265_743_736L, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) actual.getConnection()).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) actual.getConnection()).delegate, ((HikariProxyConnection) actual.getConnection()).getPoolEntry().connection);
//    Assert.assertEquals(18_101_267_637_017L, ((HikariProxyConnection) actual.getConnection()).getPoolEntry().lastAccessed);
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
//    Assert.assertNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual.delegate).delegate).delegate);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void executeOutputNullPointerException999c715f9b82ba9dbee() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNull8OutputNullPointerException999119dadab30b201dc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNull3OutputNullPointerException999638d3d37b4b6eb28() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullPositiveOutputNullPointerException999b61d4e8d5be9990c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullOutputNullPointerException999145bef913a69befd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeBatchOutputNullPointerException9991dca695db1f9bd35() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeBatchOutputNullPointerException9992a31f6f240045ba7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateOutputNullPointerException9996f2db626156967b2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNull8OutputNullPointerException999f548ae4e3e687cf2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNull3OutputNullPointerException999c0757278807bcdac() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNullPositiveOutputNullPointerException99989fd5736ec6bfa22() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNullOutputNullPointerException9998fc43c348067b707() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeQueryOutputNullPointerException9990e1232f4f3242fa0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeQuery();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeQueryInputNotNullOutputNullPointerException999ef08edc8f2805710() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeQuery(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateOutputNullPointerException9991bf18c3c94f387f9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNull8OutputNullPointerException9998c30703396766f93() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNull3OutputNullPointerException9999a59f8d8600f75ff() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNullPositiveOutputNullPointerException999a374c957d1aaddbb() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNullOutputNullPointerException9990235d37d156b4054() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getArrayInputNotNullOutputNullPointerException99935adb8ca965122f1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getArray(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getArrayInputPositiveOutputNullPointerException9994a4cea5b92d4bb75() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getArray(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBigDecimalInputNotNullOutputNullPointerException999d147746d590f9b1a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBigDecimal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBigDecimalInputPositivePositiveOutputNullPointerException9994667c6625e88ff4f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBigDecimalInputPositiveOutputNullPointerException9996869d132720f99ca() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBigDecimal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBlobInputNotNullOutputNullPointerException9991f451e9191fe1f22() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBlob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBlobInputPositiveOutputNullPointerException99928ff07be33308a96() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBlob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBooleanInputNotNullOutputNullPointerException999d66ace3641620973() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBoolean(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBooleanInputPositiveOutputNullPointerException9992610540e167297b6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBoolean(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getByteInputNotNullOutputNullPointerException999230605709079e5db() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getByte(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getByteInputPositiveOutputNullPointerException999faff8f653f2f9313() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getByte(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBytesInputNotNullOutputNullPointerException99916e97956d053d4cc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBytes(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBytesInputPositiveOutputNullPointerException9991340920db6d06eb0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBytes(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharacterStreamInputNotNullOutputNullPointerException9996c9c8e797c74bbaf() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharacterStreamInputPositiveOutputNullPointerException999735569671fd86da8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getClobInputNotNullOutputNullPointerException999784ecb4f89389e1c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getClob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getClobInputPositiveOutputNullPointerException999611cad4a7665d981() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getClob(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getConnectionOutputNotNull9993722c6cd5064f91d() throws SQLException {
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
//    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
//    Assert.assertEquals(18_094_503_919_753L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry(), ((HikariProxyConnection) actual).getPoolEntry());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputNotNullNotNullOutputNullPointerException999d4b6c0b8d7cadd64() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final GregorianCalendar arg1 = new GregorianCalendar(1, 1, 2561);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputNotNullOutputNullPointerException9998bc841cf7cecf181() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputPositiveNotNullOutputNullPointerException999e8f293ec5a5322a2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final GregorianCalendar arg1 = new GregorianCalendar(1, 1, 1);
    arg1.setFirstDayOfWeek(1);
    arg1.setFirstDayOfWeek(1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputPositiveOutputNullPointerException9994da034ea5b03e5ae() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDoubleInputNotNullOutputNullPointerException99947d3419e9138e46c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDouble(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDoubleInputPositiveOutputNullPointerException999e6f4a7e0a28a5923() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDouble(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchDirectionOutputNullPointerException9994fc4a073266ddf1a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchDirection();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchSizeOutputNullPointerException99938e2a93bcf114ba9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchSize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFloatInputNotNullOutputNullPointerException999de5c138da391a59c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFloat(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFloatInputPositiveOutputNullPointerException9991540e4768dc6d27f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFloat(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getGeneratedKeysOutputNullPointerException999e87a06a370711baf() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getGeneratedKeys();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntInputNotNullOutputNullPointerException999c4367a300c793348() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getInt(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntInputPositiveOutputNullPointerException9994d960b9fba6871bd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getInt(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLargeMaxRowsOutputNullPointerException9998a070b8b3848af2a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLargeMaxRows();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLargeUpdateCountOutputNullPointerException99972957e38a6839917() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLargeUpdateCount();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLongInputNotNullOutputNullPointerException9993db39567f6e401f7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLong(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLongInputPositiveOutputNullPointerException999d16af16d834764b2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLong(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxFieldSizeOutputNullPointerException9998ec9b0bdbed14b39() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMaxFieldSize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxRowsOutputNullPointerException9998ee8f7402056dd03() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMaxRows();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetaDataOutputNullPointerException999a6fad04d90ed8cc3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMetaData();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMoreResultsOutputNullPointerException99935eb281c15aa27a6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMoreResults();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMoreResultsInputPositiveOutputNullPointerException999f733847376362368() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMoreResults(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNCharacterStreamInputNotNullOutputNullPointerException999c189bc5c5d77a7ce() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNCharacterStreamInputPositiveOutputNullPointerException999706802f966892992() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNClobInputNotNullOutputNullPointerException999a26c81241eb540a8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNClob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNClobInputPositiveOutputNullPointerException999719fdf32fb0b6006() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNClob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNStringInputNotNullOutputNullPointerException99985215c491a8bb2b8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNStringInputPositiveOutputNullPointerException999f4218a73bbaf0cf9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputNotNullNullOutputNullPointerException999bed446bffd296b49() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Class arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputNotNullNotNullOutputNullPointerException9997a4eed4eed664fd3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final HashMap<Object, Object> arg1 = new HashMap<Object, Object>();
    arg1.put("aaaaa", null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputNotNullOutputNullPointerException999f1d624908b2adc4c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputPositiveNullOutputNullPointerException9995f94868fd6daf4d2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Class arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputPositiveNotNullOutputNullPointerException999e3c6302b103c8ed7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final HashMap<Object, Object> arg1 = new HashMap<Object, Object>();
    arg1.put("aaaaa", "akaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputPositiveOutputNullPointerException999652f2e85eea9f720() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getParameterMetaDataOutputNullPointerException999d0247ce4e84574b6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getParameterMetaData();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getQueryTimeoutOutputNullPointerException99929613a6837d71470() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getQueryTimeout();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRefInputNotNullOutputNullPointerException99928ac267c1ca96a88() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRef(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRefInputPositiveOutputNullPointerException999ae372d97abb54c2a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRef(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetConcurrencyOutputNullPointerException999fe87a9c55dc03016() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetConcurrency();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetHoldabilityOutputNullPointerException9994a418a3d4774b2b4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetHoldability();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetOutputNullPointerException999066bbe54182b0c3c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSet();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetTypeOutputNullPointerException9999e5875807711b290() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetType();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowIdInputNotNullOutputNullPointerException999712e15c5e9d2f788() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRowId(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowIdInputPositiveOutputNullPointerException9995ee18ba65d7d0ab5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRowId(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getShortInputNotNullOutputNullPointerException999ad1ddfb1c0d4fe5d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getShort(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getShortInputPositiveOutputNullPointerException9998f8ef540cfea142e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getShort(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSQLXMLInputNotNullOutputNullPointerException9996881ae963afb0682() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getSQLXML(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSQLXMLInputPositiveOutputNullPointerException999c32ffe86ee0c6b3c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getSQLXML(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStringInputNotNullOutputNullPointerException999c90809c7ae5784da() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStringInputPositiveOutputNullPointerException999da4a833dc60ddd2a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputNotNullNotNullOutputNullPointerException999b7b420a912045b24() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final GregorianCalendar arg1 = new GregorianCalendar(1, 1, 2561);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputNotNullOutputNullPointerException9994f2b8ebc701b1807() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputPositiveNotNullOutputNullPointerException9993aa628f69996a785() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final GregorianCalendar arg1 = new GregorianCalendar(1, 1, 1);
    arg1.setFirstDayOfWeek(1);
    arg1.setFirstDayOfWeek(1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputPositiveOutputNullPointerException999bd788a8f20905af8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputNotNullNotNullOutputNullPointerException999c68da404748f33c5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final GregorianCalendar arg1 = new GregorianCalendar(1, 1, 2561);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputNotNullOutputNullPointerException999b55bd23b5ff618e4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputPositiveNotNullOutputNullPointerException999804bbfa0dc0cbb2b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final GregorianCalendar arg1 = new GregorianCalendar(1, 1, 1);
    arg1.setFirstDayOfWeek(1);
    arg1.setFirstDayOfWeek(1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputPositiveOutputNullPointerException999015f9b6d75b218ba() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUpdateCountOutputNullPointerException999aed0326bf5abd49c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getUpdateCount();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getURLInputNotNullOutputNullPointerException9994c59bb97bf2392d5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getURL(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getURLInputPositiveOutputNullPointerException99906023f7c7e561fa3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getURL(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWarningsOutputNullPointerException999c3c5073d937f5ab1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isClosedOutputNullPointerException999057bff695f032bb6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isClosed();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isCloseOnCompletionOutputNullPointerException9997ee4b64138df3987() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isCloseOnCompletion();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isPoolableOutputNullPointerException999fd638a4ba07ba75c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isPoolable();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isWrapperForInputNullOutputNullPointerException999c421ded23c560b94() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final Class arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isWrapperFor(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputNotNullPositiveNotNullOutputNullPointerException999f4a2114474c9a547() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputPositiveNullPositiveOutputNullPointerException9992f5b102bc4f65a84() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final SQLType arg1 = null;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputPositiveNullOutputNullPointerException999d306cee183db0b47() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final SQLType arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputNotNullPositivePositiveOutputNullPointerException999d3af38fbd6f674e6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputNotNullPositiveOutputNullPointerException999f51e4843a59f918e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputNotNullNullNotNullOutputNullPointerException999396caba2265e292f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final SQLType arg1 = null;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputNotNullNullPositiveOutputNullPointerException9999e7a9b0c61701f01() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final SQLType arg1 = null;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputNotNullNullOutputNullPointerException999c2d5df3cff7feb91() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final SQLType arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputPositivePositiveNotNullOutputNullPointerException9998b7501aa52358d99() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputPositivePositivePositiveOutputNullPointerException9991f0a6951ea8f84f5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputPositivePositiveOutputNullPointerException9997e410031791f9408() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registerOutParameterInputPositiveNullNotNullOutputNullPointerException9990d1b02d067e27c32() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final SQLType arg1 = null;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registerOutParameter(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setArrayInputPositiveNullOutputNullPointerException9996796def7dfed812a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final java.sql.Array arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setArray(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAsciiStreamInputNotNullNotNullPositiveOutputNullPointerException999e7b1b81d6496c9b2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAsciiStreamInputNotNullNotNullPositiveOutputNullPointerException999ae6f843fd46b2839() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAsciiStreamInputNotNullNotNullOutputNullPointerException9996e0512730c8c31ec() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setAsciiStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAsciiStreamInputPositiveNotNullPositiveOutputNullPointerException9998c0abd1e262959f1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAsciiStreamInputPositiveNotNullPositiveOutputNullPointerException99909b27aa4cae40c9a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAsciiStreamInputPositiveNotNullOutputNullPointerException999dda90696d5fbc38d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setAsciiStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBigDecimalInputNotNullNotNullOutputNullPointerException9997358335832638b25() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final BigDecimal arg1 = new BigDecimal(1.0);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBigDecimalInputPositiveNotNullOutputNullPointerException999f355d2886931c1cd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final BigDecimal arg1 = new BigDecimal(1.0);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBinaryStreamInputNotNullNotNullPositiveOutputNullPointerException99954081d5660db4174() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBinaryStreamInputNotNullNotNullPositiveOutputNullPointerException999ef92b8e8398d002f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBinaryStreamInputNotNullNotNullOutputNullPointerException999f96a310a7c2eaac7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBinaryStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBinaryStreamInputPositiveNotNullPositiveOutputNullPointerException999cbf6ac69fceb3a1e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBinaryStreamInputPositiveNotNullPositiveOutputNullPointerException999e64fffd4670cbdf2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBinaryStreamInputPositiveNotNullOutputNullPointerException999c019fffcd364022f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBinaryStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBlobInputNotNullNotNullPositiveOutputNullPointerException9996ebf10a3dd923a98() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBlob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBlobInputNotNullNotNullOutputNullPointerException9998201157b8189147a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBlobInputNotNullNotNullOutputNullPointerException999b58cd9d7c1e181d8() throws SerialException, SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final SerialBlob arg1 = new SerialBlob(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBlobInputPositiveNotNullPositiveOutputNullPointerException99981c85f879cb6af80() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBlob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBlobInputPositiveNotNullOutputNullPointerException9998afc3407a7db4952() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBlobInputPositiveNotNullOutputNullPointerException999095951b9b7d2bc9f() throws SQLException, SerialException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final SerialBlob arg1 = new SerialBlob(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBooleanInputNotNullTrueOutputNullPointerException9998a534df250a1005a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBoolean(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBooleanInputPositiveTrueOutputNullPointerException9991badcb3a069217b1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBoolean(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setByteInputNotNullZeroOutputNullPointerException9993c193aaae762e949() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte arg1 = (short) 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setByte(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setByteInputPositiveZeroOutputNullPointerException999a1c216ac634a0f64() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte arg1 = (short) 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setByte(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBytesInputNotNull24OutputNullPointerException9994269609992e830db() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final byte[] arg1 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBytes(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBytesInputPositive24OutputNullPointerException999bbeb935ab7e00d1e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] arg1 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBytes(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharacterStreamInputNotNullNotNullPositiveOutputNullPointerException999f0ac82f4c6933470() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final int arg2 = 2561;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharacterStreamInputNotNullNotNullPositiveOutputNullPointerException9997e16d7228a1d9544() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 2561L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharacterStreamInputNotNullNotNullOutputNullPointerException999b744204b52ed3275() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException99958a795355d568286() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException999872901ea00c7a0c1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharacterStreamInputPositiveNotNullOutputNullPointerException999190afd4966d6e382() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputNotNullNotNullPositiveOutputNullPointerException999a41b200a65c61044() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 2561L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputNotNullNotNullOutputNullPointerException99906bcf9ece3cf94bc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputNotNullNotNullOutputNullPointerException9994596ec48f4060255() throws SQLException, SerialException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'm', 'c' };
    final SerialClob arg1 = new SerialClob(myCharArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputPositiveNotNullPositiveOutputNullPointerException99905e52f8cee07bb67() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputPositiveNotNullOutputNullPointerException999ec11d5cebdf7c7ac() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputPositiveNotNullOutputNullPointerException9994321559a8ce7bc75() throws SerialException, SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final SerialClob arg1 = new SerialClob(myCharArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCursorNameInputNotNullOutputNullPointerException9995d54b5a06da81308() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCursorName(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDateInputNotNullNotNullNotNullOutputNullPointerException999b9e02e401fc8f6c2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Date arg1 = new Date(1L);
    final GregorianCalendar arg2 = new GregorianCalendar(2561, 1, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDate(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDateInputNotNullNotNullOutputNullPointerException9997fc1db7a2f3af854() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Date arg1 = new Date(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDateInputPositiveNotNullNotNullOutputNullPointerException99908bddc4c462c5115() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Date arg1 = new Date(1L);
    final GregorianCalendar arg2 = new GregorianCalendar(1, 11, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDate(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDateInputPositiveNotNullOutputNullPointerException99984e99f19a5145111() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Date arg1 = new Date(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDoubleInputNotNullPositiveOutputNullPointerException999ed0dd7fedf1ca8ef() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final double arg1 = 1.0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDouble(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDoubleInputPositivePositiveOutputNullPointerException9995c78840ecc2da9c3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final double arg1 = 1.0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDouble(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setEscapeProcessingInputTrueOutputNullPointerException9997113a95551bab63f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setEscapeProcessing(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchDirectionInputPositiveOutputNullPointerException99925323a3f234b85e1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchDirection(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchSizeInputPositiveOutputNullPointerException9990df3a8e3ff9f57bd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFloatInputNotNullPositiveOutputNullPointerException9998f5da72ec6a4c15a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final float arg1 = 1.0f;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFloat(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFloatInputPositivePositiveOutputNullPointerException9997a7bf8670e9a3119() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final float arg1 = 1.0f;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFloat(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setIntInputNotNullPositiveOutputNullPointerException999bc1ac7fa8097935e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setInt(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setIntInputPositivePositiveOutputNullPointerException99969ef4c7aa12bc467() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setInt(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLargeMaxRowsInputPositiveOutputNullPointerException999496961531206103d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final long arg0 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setLargeMaxRows(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLongInputNotNullPositiveOutputNullPointerException99971b90b4c261939ff() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setLong(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLongInputPositivePositiveOutputNullPointerException9999e64debaf643fdad() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setLong(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxFieldSizeInputPositiveOutputNullPointerException999b17219230ac14746() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setMaxFieldSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxRowsInputPositiveOutputNullPointerException9998263b63697ae055d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setMaxRows(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNCharacterStreamInputNotNullNotNullPositiveOutputNullPointerException9994c07acc67d650c53() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 2561L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNCharacterStreamInputNotNullNotNullOutputNullPointerException999c69ed2276a8e0929() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException99901c07a7768fe6f47() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNCharacterStreamInputPositiveNotNullOutputNullPointerException9998210122ea6ef4446() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputNotNullNotNullPositiveOutputNullPointerException99968538a7289c04425() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 2561L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputNotNullNotNullOutputNullPointerException999e0e05b66d542c8e8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputNotNullNullOutputNullPointerException999f2070de450b0d3f2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final NClob arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputPositiveNotNullPositiveOutputNullPointerException9996434c2727b664922() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputPositiveNotNullOutputNullPointerException999cd6100fb813a0ca8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputPositiveNullOutputNullPointerException9998c5091303d841902() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final NClob arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNStringInputNotNullNotNullOutputNullPointerException999d5fa52a7a8697d22() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNStringInputPositiveNotNullOutputNullPointerException9997f436cbf3c0d3156() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNullInputNotNullPositiveNotNullOutputNullPointerException9998988c27b70f598f3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNull(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNullInputNotNullPositiveOutputNullPointerException999f9a8d1fb3a59bcdc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNull(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNullInputPositivePositiveNotNullOutputNullPointerException999928d235af5921922() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNull(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNullInputPositivePositiveOutputNullPointerException999098a4478498ac473() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNull(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputNotNullNotNullPositivePositiveOutputNullPointerException999ce4f6a0825cc43be() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaaa";
    final int arg2 = 1;
    final int arg3 = 2561;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputNotNullNotNullPositiveOutputNullPointerException999ac59522ecddde13b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaaa";
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputNotNullNotNullNullPositiveOutputNullPointerException9992c1ae27ff4a29b0a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaaa";
    final SQLType arg2 = null;
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputNotNullNotNullNullOutputNullPointerException999891fdc7909774e57() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaaa";
    final SQLType arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputNotNullNotNullOutputNullPointerException999c9fff1ffdff1864a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputPositiveNotNullPositivePositiveOutputNullPointerException999dc1b6181c4f9d2e9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";
    final int arg2 = 1;
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputPositiveNotNullPositiveOutputNullPointerException9999081c370bf5e8528() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputPositiveNotNullNullPositiveOutputNullPointerException999db7fd15a8c4ea19b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";
    final SQLType arg2 = null;
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputPositiveNotNullNullOutputNullPointerException9999be19b0e981748d4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";
    final SQLType arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputPositiveNotNullOutputNullPointerException9994d8e9a46c3662478() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPoolableInputTrueOutputNullPointerException9993364342010361704() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setPoolable(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setQueryTimeoutInputPositiveOutputNullPointerException999498e4db354b731b0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setQueryTimeout(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRefInputPositiveNullOutputNullPointerException999e1e889f6e42f4c69() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Ref arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setRef(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRowIdInputNotNullNullOutputNullPointerException99913d37f116c2bed9c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final RowId arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setRowId(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRowIdInputPositiveNullOutputNullPointerException999490aff248ffaeb0c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final RowId arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setRowId(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setShortInputNotNullPositiveOutputNullPointerException9993ddb6b66b039ed13() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final short arg1 = (short) 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setShort(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setShortInputPositivePositiveOutputNullPointerException9998faaa34493272963() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final short arg1 = (short) 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setShort(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSQLXMLInputNotNullNotNullOutputNullPointerException999494d643d46814f31() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final PgSQLXML arg1 = new PgSQLXML(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setSQLXML(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSQLXMLInputPositiveNotNullOutputNullPointerException99988367af5326ba576() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final PgSQLXML arg1 = new PgSQLXML(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setSQLXML(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setStringInputNotNullNotNullOutputNullPointerException9998faa07ebf33aaba1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setStringInputPositiveNotNullOutputNullPointerException999b600e40e5d415972() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimeInputNotNullNotNullNotNullOutputNullPointerException999ed694d5591b5d319() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Time arg1 = new Time(1L);
    final GregorianCalendar arg2 = new GregorianCalendar(2561, 1, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTime(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimeInputNotNullNotNullOutputNullPointerException9997737e488ca76933f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Time arg1 = new Time(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimeInputPositiveNotNullNotNullOutputNullPointerException999bd2375ffea82a97c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Time arg1 = new Time(1L);
    final GregorianCalendar arg2 = new GregorianCalendar(1, 11, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTime(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimeInputPositiveNotNullOutputNullPointerException999513fdc431e4393d5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Time arg1 = new Time(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimestampInputNotNullNotNullNotNullOutputNullPointerException999e3000780e8eeb9e0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Timestamp arg1 = new Timestamp(1L);
    final GregorianCalendar arg2 = new GregorianCalendar(2561, 1, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTimestamp(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimestampInputNotNullNotNullOutputNullPointerException999abaf0ee212560d15() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final Timestamp arg1 = new Timestamp(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimestampInputPositiveNotNullNotNullOutputNullPointerException9995c0a3ab19325468a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Timestamp arg1 = new Timestamp(1L);
    final GregorianCalendar arg2 = new GregorianCalendar(1, 11, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTimestamp(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimestampInputPositiveNotNullOutputNullPointerException9993bffe1e1358192c3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Timestamp arg1 = new Timestamp(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setUnicodeStreamInputPositiveNotNullPositiveOutputNullPointerException999a0c1328149320209() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setUnicodeStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setURLInputNotNullNullOutputNullPointerException999f95b78ec4f6e37e9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final URL arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setURL(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setURLInputPositiveNullOutputNullPointerException999d5b88ac18192a668() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final URL arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setURL(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void wasNullOutputNullPointerException9993ffd597fd560126c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement thisObj = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.wasNull();

    // The method is not expected to return due to exception thrown

  }
}
