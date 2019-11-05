package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.pool.HikariProxyCallableStatement;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.HikariProxyPreparedStatement;
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
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;



public class HikariProxyPreparedStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addBatchOutputNullPointerException999eb9233fcc7c954f2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.addBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addBatchInputNotNullOutputNullPointerException99970cd0cc78f378b15() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.addBatch(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void cancelOutputNullPointerException999af7e6724d28040e4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.cancel();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearBatchOutputNullPointerException999975fc2f177646981() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearParametersOutputNullPointerException99980bd3d4571421cbb() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearParameters();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearWarningsOutputNullPointerException999c3670243f1771b13() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOnCompletionOutputNullPointerException999b5859b76eebd902e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.closeOnCompletion();

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull9999832aa24411d3b7e() {
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
//    final HikariProxyPreparedStatement actual = new HikariProxyPreparedStatement(arg0, arg1);
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
//    Assert.assertEquals(18_097_172_823_151L, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual.getConnection()).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) actual.getConnection()).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) actual.getConnection()).delegate, ((HikariProxyConnection) actual.getConnection()).getPoolEntry().connection);
//    Assert.assertEquals(18_097_193_342_409L, ((HikariProxyConnection) actual.getConnection()).getPoolEntry().lastAccessed);
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
  public void executeOutputNullPointerException999ab7250896d0de413() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNull8OutputNullPointerException999dfe32c9dc3627faa() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNull3OutputNullPointerException99920d851c0aa10d5c6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullPositiveOutputNullPointerException9997a7d5df8b2fbb85f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNotNullOutputNullPointerException99929b4128526f9ab21() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.execute(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeBatchOutputNullPointerException99930ccf227c817c6df() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeBatchOutputNullPointerException999dfda1f5e6d4f2a8f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeBatch();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateOutputNullPointerException999311a23efcc32dbb7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNull8OutputNullPointerException999a02f8cf34eeeadd8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNull3OutputNullPointerException9996ad47d6976df02b8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNullPositiveOutputNullPointerException999177e912b6bef7f60() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeLargeUpdateInputNotNullOutputNullPointerException999211c1e79a903f2bd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeLargeUpdate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeQueryOutputNullPointerException999b277c5ce39072c87() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeQuery();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeQueryInputNotNullOutputNullPointerException999a6ff926c37a73bd4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeQuery(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateOutputNullPointerException9993539473df82f5185() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNull8OutputNullPointerException999b2bdf4431da49168() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int[] arg1 = { 1, 1, 655_361, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNull3OutputNullPointerException99996bf0d7d852cc9e5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final String[] arg1 = { "aaaaa", "akaaa", "aaaaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNullPositiveOutputNullPointerException999332a3712d1ab3406() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void executeUpdateInputNotNullOutputNullPointerException9994ff6c2247630b7c7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.executeUpdate(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getConnectionOutputNotNull99966c88b80ee2335ae() throws SQLException {
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
//    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
//    Assert.assertEquals(18_097_630_448_166L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry(), ((HikariProxyConnection) actual).getPoolEntry());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchDirectionOutputNullPointerException99917625ea29485e193() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchDirection();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchSizeOutputNullPointerException999ed2a63cf5dd89428() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchSize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getGeneratedKeysOutputNullPointerException9994121b1e8d1404c26() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getGeneratedKeys();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLargeMaxRowsOutputNullPointerException99929d4f53f3eb361db() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLargeMaxRows();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLargeUpdateCountOutputNullPointerException999cda4b57234b78dc0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLargeUpdateCount();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxFieldSizeOutputNullPointerException999a4867bf8c9693c10() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMaxFieldSize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxRowsOutputNullPointerException9990e3284d3d85d2261() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMaxRows();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetaDataOutputNullPointerException99955f94d54203b43d1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMetaData();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMoreResultsOutputNullPointerException9993e81d5bde1bfa010() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMoreResults();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMoreResultsInputPositiveOutputNullPointerException9991d1c9ca35d5cf495() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMoreResults(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getParameterMetaDataOutputNullPointerException9993c6bef2e36a61f8d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getParameterMetaData();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getQueryTimeoutOutputNullPointerException99927d38df0b9df76c7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getQueryTimeout();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetConcurrencyOutputNullPointerException999a693267e8002e6e3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetConcurrency();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetHoldabilityOutputNullPointerException999659c0882638f17d4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetHoldability();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetOutputNullPointerException9992df9e58b4ff10571() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSet();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultSetTypeOutputNullPointerException999f99698fc47dbdb66() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getResultSetType();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUpdateCountOutputNullPointerException999f482c456b44dec85() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getUpdateCount();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWarningsOutputNullPointerException999b24a209e7fed2827() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isClosedOutputNullPointerException99949c7a46989d5c94e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isClosed();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isCloseOnCompletionOutputNullPointerException999dd9bedc01db894ba() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isCloseOnCompletion();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isPoolableOutputNullPointerException999950507d9e47d0c9e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isPoolable();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isWrapperForInputNullOutputNullPointerException9998fe282b712bb4fde() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final Class arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isWrapperFor(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setArrayInputPositiveNullOutputNullPointerException999568bb3b7f7301896() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final java.sql.Array arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setArray(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAsciiStreamInputPositiveNotNullPositiveOutputNullPointerException99932ab375c37a334d4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setAsciiStreamInputPositiveNotNullPositiveOutputNullPointerException9993a455d6019e0fe75() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setAsciiStreamInputPositiveNotNullOutputNullPointerException9991d919f8f9bc958e7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setBigDecimalInputPositiveNotNullOutputNullPointerException9998df3650463b81c57() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final BigDecimal arg1 = new BigDecimal(1.0);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBinaryStreamInputPositiveNotNullPositiveOutputNullPointerException99957332cd5dcccd2b6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setBinaryStreamInputPositiveNotNullPositiveOutputNullPointerException99972a050835d140dd9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setBinaryStreamInputPositiveNotNullOutputNullPointerException999a9d2a274813391fe() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setBlobInputPositiveNotNullPositiveOutputNullPointerException999ac3831b7c1d0bd43() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setBlobInputPositiveNotNullOutputNullPointerException999fe20aaada8625867() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setBlobInputPositiveNotNullOutputNullPointerException9990107492632e65ead() throws SQLException, SerialException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setBooleanInputPositiveTrueOutputNullPointerException999675a1cb328da4b93() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBoolean(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBytesInputPositive24OutputNullPointerException999db12d7bd0941d079() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte[] arg1 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setBytes(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setByteInputPositiveZeroOutputNullPointerException99907ab268fb1ec703a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final byte arg1 = (short) 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setByte(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException99921f71452a6c5e184() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException999887b6658c3a80f31() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setCharacterStreamInputPositiveNotNullOutputNullPointerException99992c4366e5081e3cd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputPositiveNotNullPositiveOutputNullPointerException9993f62c7aeef2c6b36() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setClobInputPositiveNotNullOutputNullPointerException999fa8157056fa64589() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setClobInputPositiveNotNullOutputNullPointerException9991a10ff3a892cb7fd() throws SerialException, SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setCursorNameInputNotNullOutputNullPointerException999c64205af74a04703() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setCursorName(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDateInputPositiveNotNullNotNullOutputNullPointerException999934650a6a42845b3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setDateInputPositiveNotNullOutputNullPointerException999f837e409af39ed0b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Date arg1 = new Date(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDoubleInputPositivePositiveOutputNullPointerException999df4dfaf0d0c30200() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final double arg1 = 1.0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setDouble(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setEscapeProcessingInputTrueOutputNullPointerException999136c2367d5056d7e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setEscapeProcessing(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchDirectionInputPositiveOutputNullPointerException999c0ca865445b0efd9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchDirection(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchSizeInputPositiveOutputNullPointerException99926126c7e9381549c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFloatInputPositivePositiveOutputNullPointerException99932d8d1d4e56517c5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final float arg1 = 1.0f;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFloat(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setIntInputPositivePositiveOutputNullPointerException999135ac117fbde8353() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setInt(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLargeMaxRowsInputPositiveOutputNullPointerException999a62844706510aaa7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final long arg0 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setLargeMaxRows(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLongInputPositivePositiveOutputNullPointerException999c5bc27ef5aea6d6d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setLong(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxFieldSizeInputPositiveOutputNullPointerException999c478764ff99c40f1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setMaxFieldSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxRowsInputPositiveOutputNullPointerException9999b7ad818097f0977() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setMaxRows(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException999fbf3ac48a19a0363() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setNCharacterStreamInputPositiveNotNullOutputNullPointerException999d77cbb4e2bf4889b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputPositiveNotNullPositiveOutputNullPointerException99979e02b6027dbfeb8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setNClobInputPositiveNotNullOutputNullPointerException999e6c9c9017bc402ee() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNClobInputPositiveNullOutputNullPointerException999d308fbaf59bbf070() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final NClob arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNStringInputPositiveNotNullOutputNullPointerException999170dc1cecfe6fc9f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNullInputPositivePositiveNotNullOutputNullPointerException9992a01967648c1a2c2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setNullInputPositivePositiveOutputNullPointerException9998d06d034ec3e3e2e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setNull(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setObjectInputPositiveNotNullPositivePositiveOutputNullPointerException9996a0aa22d1c697b9e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setObjectInputPositiveNotNullPositiveOutputNullPointerException999ba7da7b40de11110() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setObjectInputPositiveNotNullNullPositiveOutputNullPointerException999812cbc7c40a48d9d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setObjectInputPositiveNotNullNullOutputNullPointerException99980a82ed1d66a8bb1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setObjectInputPositiveNotNullOutputNullPointerException9992ec04d090b2ceef5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPoolableInputTrueOutputNullPointerException99965237e742eeb5105() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final boolean arg0 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setPoolable(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setQueryTimeoutInputPositiveOutputNullPointerException999a932e4fe323f03f3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setQueryTimeout(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRefInputPositiveNullOutputNullPointerException99964a32f78377302a1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Ref arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setRef(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRowIdInputPositiveNullOutputNullPointerException9996cc5509090a17461() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final RowId arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setRowId(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setShortInputPositivePositiveOutputNullPointerException9998220cc9c3114b70b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final short arg1 = (short) 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setShort(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setSQLXMLInputPositiveNotNullOutputNullPointerException999dd1f5710b85461b7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final PgSQLXML arg1 = new PgSQLXML(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setSQLXML(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setStringInputPositiveNotNullOutputNullPointerException999af072eb614925c72() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimeInputPositiveNotNullNotNullOutputNullPointerException999ddec47670b473e18() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setTimeInputPositiveNotNullOutputNullPointerException999b5dc37f7b34b9bf2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Time arg1 = new Time(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimestampInputPositiveNotNullNotNullOutputNullPointerException999acfb05e2e4d969ce() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setTimestampInputPositiveNotNullOutputNullPointerException9991cb166c44a7bfba4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final Timestamp arg1 = new Timestamp(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setUnicodeStreamInputPositiveNotNullPositiveOutputNullPointerException999758e995d646675e8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
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
  public void setURLInputPositiveNullOutputNullPointerException9991431b2204ac585c9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyPreparedStatement thisObj = new HikariProxyPreparedStatement(hikariProxyConnection, hikariProxyCallableStatement);
    final int arg0 = 1;
    final URL arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setURL(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
