package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.pool.HikariProxyCallableStatement;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.HikariProxyResultSet;
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



public class HikariProxyResultSetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void absoluteInputPositiveOutputNullPointerException999b50568e12887b9dc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.absolute(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void afterLastOutputNullPointerException999f264ed14258b4fd2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.afterLast();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void beforeFirstOutputNullPointerException999e6edf8ee187fe536() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.beforeFirst();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void cancelRowUpdatesOutputNullPointerException9992a46914d4c645208() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.cancelRowUpdates();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void clearWarningsOutputNullPointerException9990360df39ad22b3f3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.clearWarnings();

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void closeOutputNullPointerException9992152b480d3abafef() throws SQLException {
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
//    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
//    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
//    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
//    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
//
//    // Act
//    thrown.expect(NullPointerException.class);
//    thisObj.close();
//
//    // The method is not expected to return due to exception thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullNotNullOutputNotNull999e1683397aa499710() {
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
//    final HikariProxyResultSet arg2 = new HikariProxyResultSet(arg0, arg1, null);
//
//    // Act, creating object to test constructor
//    final HikariProxyResultSet actual = new HikariProxyResultSet(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.delegate);
//    Assert.assertNull(((HikariProxyResultSet) actual.delegate).delegate);
//    Assert.assertNotNull(((HikariProxyResultSet) actual.delegate).connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_098_120_120_091L, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate, ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getPoolEntry().connection);
//    Assert.assertEquals(18_098_124_897_534L, ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyResultSet) actual.delegate).getStatement());
//    Assert.assertNotNull(((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).getCatalogState());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) actual.delegate).connection).delegate).getPoolEntry(), ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection()).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).delegate);
//    Assert.assertEquals(((HikariProxyResultSet) actual.delegate).connection, ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).delegate).delegate);
//    Assert.assertEquals(((ProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).delegate).delegate).delegate);
//    Assert.assertNull(((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).delegate).delegate).delegate).getConnection());
//    Assert.assertNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) actual.delegate).getStatement()).delegate).delegate).delegate).delegate);
//    Assert.assertEquals(((HikariProxyResultSet) actual.delegate).connection, actual.connection);
//    Assert.assertEquals(((HikariProxyResultSet) actual.delegate).getStatement(), actual.getStatement());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void deleteRowOutputNullPointerException9994af7d35ef90f3ff5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.deleteRow();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void findColumnInputNotNullOutputNullPointerException999088069404288b393() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.findColumn(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void firstOutputNullPointerException999767cdddd6282c3a7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.first();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getArrayInputNotNullOutputNullPointerException99901de9d9aa7fc7d0c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getArray(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getArrayInputPositiveOutputNullPointerException999d06010502e0ba8df() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getArray(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getAsciiStreamInputNotNullOutputNullPointerException999cdc484da2f407723() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getAsciiStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getAsciiStreamInputPositiveOutputNullPointerException9990463182a28ab16ed() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getAsciiStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBigDecimalInputNotNullPositiveOutputNullPointerException9991ddca29091ffb68f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBigDecimalInputNotNullOutputNullPointerException999ffbe8e82684a9dbf() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBigDecimal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBigDecimalInputPositivePositiveOutputNullPointerException9997f36b8740d20d381() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBigDecimalInputPositiveOutputNullPointerException9992b8718092c0e1a33() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBigDecimal(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBinaryStreamInputNotNullOutputNullPointerException999ddff80b730dde611() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBinaryStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBinaryStreamInputPositiveOutputNullPointerException999bfcacdc8059a4ea9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBinaryStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBlobInputNotNullOutputNullPointerException999d01543abf10d9ec3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBlob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBlobInputPositiveOutputNullPointerException9992ec15ffe1122f3fb() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBlob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBooleanInputNotNullOutputNullPointerException999416f5f78eb7188b1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBoolean(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBooleanInputPositiveOutputNullPointerException9992e999582ff0141bc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBoolean(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getByteInputNotNullOutputNullPointerException99946b91b067732c007() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getByte(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getByteInputPositiveOutputNullPointerException999740435246f7d1a05() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getByte(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBytesInputNotNullOutputNullPointerException999cf6ede7aa14997c7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBytes(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBytesInputPositiveOutputNullPointerException99960de4a43973f1604() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getBytes(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharacterStreamInputNotNullOutputNullPointerException99964d872d8ef04ed82() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharacterStreamInputPositiveOutputNullPointerException9994d2c8b58db7508bf() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getClobInputNotNullOutputNullPointerException9999a0c2adabbabd7ce() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getClob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getClobInputPositiveOutputNullPointerException9997765d76dfb5ccd4a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getClob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConcurrencyOutputNullPointerException9992593c743492f7220() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getConcurrency();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCursorNameOutputNullPointerException999ec855c9dcad0a22f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCursorName();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputNotNullNotNullOutputNullPointerException999636a9a94681ebf71() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final GregorianCalendar arg1 = new GregorianCalendar(655_361, 1, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputNotNullOutputNullPointerException9995d6561674ae59d09() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputPositiveNotNullOutputNullPointerException9999a5b9f69479eafc2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final GregorianCalendar arg1 = new GregorianCalendar(1, 2561, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDateInputPositiveOutputNullPointerException999e3530d1a1ab07ef7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDate(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDoubleInputNotNullOutputNullPointerException999da6c526b177b55b1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDouble(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDoubleInputPositiveOutputNullPointerException99941a01bab2d8a2ac2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getDouble(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchDirectionOutputNullPointerException999a7dec559888445c8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchDirection();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFetchSizeOutputNullPointerException9997c8a12c4159a1f88() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFetchSize();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFloatInputNotNullOutputNullPointerException999ab3fb4bc6c3dcbcf() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFloat(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFloatInputPositiveOutputNullPointerException999acbe637388a404a8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getFloat(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHoldabilityOutputNullPointerException9995ca9100d2ea4b718() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getHoldability();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntInputNotNullOutputNullPointerException999fb9b00e70d230c92() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getInt(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntInputPositiveOutputNullPointerException9997113093a0025acf3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getInt(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLongInputNotNullOutputNullPointerException999471cd9597d5939fb() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLong(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLongInputPositiveOutputNullPointerException99977288fa1b26e230d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getLong(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetaDataOutputNullPointerException99918f71ca72edb3630() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMetaData();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNCharacterStreamInputNotNullOutputNullPointerException999f4c35d6a7669b845() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNCharacterStreamInputPositiveOutputNullPointerException99952ef533410b872dd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNCharacterStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNClobInputNotNullOutputNullPointerException999f00b87d558c139d2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNClob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNClobInputPositiveOutputNullPointerException999fd4a85f431fab1f4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNClob(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNStringInputNotNullOutputNullPointerException999d897c6099e6a4d60() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getNStringInputPositiveOutputNullPointerException999e98af6fcf274ae54() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getNString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputNotNullNullOutputNullPointerException999d63fa780bd890a58() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Class arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputNotNullNotNullOutputNullPointerException9992f4308b99105db52() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final HashMap<Object, Object> arg1 = new HashMap<Object, Object>();
    arg1.put("aaaaaaaaaaaaaaa", "aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputNotNullOutputNullPointerException999fa1fbb104e542caf() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputPositiveNullOutputNullPointerException9994c2c691077180522() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Class arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputPositiveNotNullOutputNullPointerException999012fe0ad1fb62e9c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final HashMap<Object, Object> arg1 = new HashMap<Object, Object>();
    arg1.put("aakaa", "aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputPositiveOutputNullPointerException9992c6a71c3cbb43eb1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getObject(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRefInputNotNullOutputNullPointerException99932b1d95fe2fe248a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRef(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRefInputPositiveOutputNullPointerException999afb27c4a23eb54eb() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRef(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowIdInputNotNullOutputNullPointerException9990b8b1e5b48e7bf84() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRowId(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowIdInputPositiveOutputNullPointerException999739237cefbaf0068() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRowId(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRowOutputNullPointerException99905835acb6ff4863f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getRow();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getShortInputNotNullOutputNullPointerException999f69f50bb29119fd6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getShort(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getShortInputPositiveOutputNullPointerException999449bef55684121e2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getShort(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSQLXMLInputNotNullOutputNullPointerException9992eea7e6d79dad362() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getSQLXML(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSQLXMLInputPositiveOutputNullPointerException999a081081b7580c30c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getSQLXML(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStringInputNotNullOutputNullPointerException999e372e8fbabd88c12() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStringInputPositiveOutputNullPointerException99985ce82e9f33196ec() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getString(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputNotNullNotNullOutputNullPointerException999582dea73c23c77a1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final GregorianCalendar arg1 = new GregorianCalendar(655_361, 1, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputNotNullOutputNullPointerException999ff6dbaa90f54ea63() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputPositiveNotNullOutputNullPointerException999a28652c2fd05d616() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final GregorianCalendar arg1 = new GregorianCalendar(1, 2561, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeInputPositiveOutputNullPointerException9996ddbc195eb668fb0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTime(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputNotNullNotNullOutputNullPointerException999685578e036e19993() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final GregorianCalendar arg1 = new GregorianCalendar(655_361, 1, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputNotNullOutputNullPointerException99914255d61f15d236f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputPositiveNotNullOutputNullPointerException999b27bbf2bdcf9b786() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final GregorianCalendar arg1 = new GregorianCalendar(1, 2561, 1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimestampInputPositiveOutputNullPointerException9998168bf6e72bcb877() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getTimestamp(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputNullPointerException999da0f46c073a51a9c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getType();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnicodeStreamInputNotNullOutputNullPointerException999c0b33a869bd88a5e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getUnicodeStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUnicodeStreamInputPositiveOutputNullPointerException9996dbd68b0a525bec9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getUnicodeStream(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getURLInputNotNullOutputNullPointerException999adc1369203e9bd5e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getURL(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getURLInputPositiveOutputNullPointerException9994ab83d8051422fdf() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getURL(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getWarningsOutputNullPointerException999da985a51d2f15549() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getWarnings();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void insertRowOutputNullPointerException999ac248d877d950dcc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.insertRow();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isAfterLastOutputNullPointerException9998891d9e5a129d1f0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isAfterLast();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isBeforeFirstOutputNullPointerException999af25bd2c6fd06573() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isBeforeFirst();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isClosedOutputNullPointerException999310671a674efb105() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isClosed();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isFirstOutputNullPointerException9991d3c9da91b7c3b32() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isFirst();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isLastOutputNullPointerException99972ee741cac3d7776() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isLast();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isWrapperForInputNullOutputNullPointerException999dcd1b78c5bc35ee3() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final Class arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isWrapperFor(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void lastOutputNullPointerException9995b5a48fffeb25357() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.last();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void moveToCurrentRowOutputNullPointerException9997a7d93a569810c6e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.moveToCurrentRow();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void moveToInsertRowOutputNullPointerException999c5796f1082edf57d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.moveToInsertRow();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void nextOutputNullPointerException9991b4dc82eb41783ca() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.next();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void previousOutputNullPointerException99999596b0a93cf7398() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.previous();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void refreshRowOutputNullPointerException9997a9b463329d4c58f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.refreshRow();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void relativeInputPositiveOutputNullPointerException999a9e6caff675e8bd7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.relative(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowDeletedOutputNullPointerException999461e93e9d139c726() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowDeleted();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowInsertedOutputNullPointerException99995fd805a6436f620() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowInserted();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rowUpdatedOutputNullPointerException9992a8689a3d18b5f13() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.rowUpdated();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchDirectionInputPositiveOutputNullPointerException9999773d9f4fe2e97d6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchDirection(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFetchSizeInputPositiveOutputNullPointerException9994e6ac3b8a0e4b095() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setFetchSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateArrayInputNotNullNullOutputNullPointerException99911eb5d00aa6d10e9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final java.sql.Array arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateArray(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateArrayInputPositiveNullOutputNullPointerException99984282b7523dcc298() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final java.sql.Array arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateArray(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAsciiStreamInputNotNullNotNullPositiveOutputNullPointerException999a3db417b712ac377() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAsciiStreamInputNotNullNotNullPositiveOutputNullPointerException99979e684b54196634a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAsciiStreamInputNotNullNotNullOutputNullPointerException999c540eea761a879f6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAsciiStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAsciiStreamInputPositiveNotNullPositiveOutputNullPointerException99919cc4a83f71c666b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAsciiStreamInputPositiveNotNullPositiveOutputNullPointerException999f1fbf1416fbed868() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAsciiStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAsciiStreamInputPositiveNotNullOutputNullPointerException999fa817413b639c426() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAsciiStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBigDecimalInputNotNullNotNullOutputNullPointerException99912b23a88f623a3a6() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final BigDecimal arg1 = new BigDecimal(1.0);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBigDecimalInputPositiveNotNullOutputNullPointerException999b46ac13b90e09b48() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final BigDecimal arg1 = new BigDecimal(1.0);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBigDecimal(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBinaryStreamInputNotNullNotNullPositiveOutputNullPointerException99946ba77b6116f8d45() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBinaryStreamInputNotNullNotNullPositiveOutputNullPointerException999b80c1e74211243f5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBinaryStreamInputNotNullNotNullOutputNullPointerException999e21ccb88559ec1a8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBinaryStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBinaryStreamInputPositiveNotNullPositiveOutputNullPointerException999872d5e0809247463() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBinaryStreamInputPositiveNotNullPositiveOutputNullPointerException9994b27b87d5bfc8d3d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBinaryStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBinaryStreamInputPositiveNotNullOutputNullPointerException999248682175665d68e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBinaryStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBlobInputNotNullNotNullPositiveOutputNullPointerException999112aeada186f43b1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBlob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBlobInputNotNullNotNullOutputNullPointerException9990a1b66d537f4bc60() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBlobInputNotNullNotNullOutputNullPointerException999d3f0cbd7080ed41e() throws SerialException, SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final SerialBlob arg1 = new SerialBlob(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBlobInputPositiveNotNullPositiveOutputNullPointerException999c669db4d040e9c6c() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBlob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBlobInputPositiveNotNullOutputNullPointerException999a5fb598c03be55f0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBlobInputPositiveNotNullOutputNullPointerException999a0279a1efa5f9338() throws SerialException, SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final SerialBlob arg1 = new SerialBlob(myByteArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBlob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBooleanInputNotNullTrueOutputNullPointerException99970d91be4160ccbce() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBoolean(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBooleanInputPositiveTrueOutputNullPointerException99997092192f36bb314() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBoolean(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateByteInputNotNullZeroOutputNullPointerException999b5910873a28bfdc2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte arg1 = (short) 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateByte(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateByteInputPositiveZeroOutputNullPointerException9997460cd7fdb616639() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte arg1 = (short) 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateByte(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBytesInputNotNull24OutputNullPointerException999174d050cf7f6140a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final byte[] arg1 = { (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBytes(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBytesInputPositive24OutputNullPointerException9992bf80ca08b9ed17e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final byte[] arg1 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateBytes(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateCharacterStreamInputNotNullNotNullPositiveOutputNullPointerException999b3f09b3319416d08() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final int arg2 = 11;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateCharacterStreamInputNotNullNotNullPositiveOutputNullPointerException999fe963e95e836b3c5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 11L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateCharacterStreamInputNotNullNotNullOutputNullPointerException999b86700e05fb92c45() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException999455607fde4d919c8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException999f6a6246ac8b1395a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateCharacterStreamInputPositiveNotNullOutputNullPointerException999653adc37dff1bffe() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateClobInputNotNullNotNullPositiveOutputNullPointerException999d88ccdaafd725586() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 11L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateClobInputNotNullNotNullOutputNullPointerException9990b1150673c8b1691() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateClobInputNotNullNotNullOutputNullPointerException9999407ca2b121060a7() throws SerialException, SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c' };
    final SerialClob arg1 = new SerialClob(myCharArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateClobInputPositiveNotNullPositiveOutputNullPointerException99994e7093c2aa6d29b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateClobInputPositiveNotNullOutputNullPointerException9992fbfe713212a5175() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateClobInputPositiveNotNullOutputNullPointerException999345b6e2d212ccd2f() throws SQLException, SerialException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final char[] myCharArray = { 'c', 'c', 'm', 'c', 'c', 'c', 'c', 'c' };
    final SerialClob arg1 = new SerialClob(myCharArray);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateDateInputNotNullNotNullOutputNullPointerException999506edba6986df0a1() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Date arg1 = new Date(167_772_161L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateDateInputPositiveNotNullOutputNullPointerException9994bff66316fe10676() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Date arg1 = new Date(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateDate(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateDoubleInputNotNullPositiveOutputNullPointerException9996eb3d93b160583c4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final double arg1 = 1.0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateDouble(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateDoubleInputPositivePositiveOutputNullPointerException999a5063a57a524fc8a() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final double arg1 = 1.0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateDouble(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateFloatInputNotNullPositiveOutputNullPointerException999a3e70e1d28369849() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final float arg1 = 1.0f;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateFloat(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateFloatInputPositivePositiveOutputNullPointerException99947b5edb1a57eed40() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final float arg1 = 1.0f;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateFloat(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateIntInputNotNullPositiveOutputNullPointerException99909cc7dc95ac7145b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateInt(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateIntInputPositivePositiveOutputNullPointerException9997d52d8d850717b02() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateInt(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateLongInputNotNullPositiveOutputNullPointerException9990831f79523d7de8e() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateLong(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateLongInputPositivePositiveOutputNullPointerException9994d0db8957836b97b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateLong(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNCharacterStreamInputNotNullNotNullPositiveOutputNullPointerException9999257759aeede5b7d() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 11L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNCharacterStreamInputNotNullNotNullOutputNullPointerException999dd16ae079195ab84() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNCharacterStreamInputPositiveNotNullPositiveOutputNullPointerException999b0f069734ce32218() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNCharacterStream(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNCharacterStreamInputPositiveNotNullOutputNullPointerException99960798125ac36a620() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNCharacterStream(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNClobInputNotNullNotNullPositiveOutputNullPointerException9990c81c5af1c1f70e9() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");
    final long arg2 = 11L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNClobInputNotNullNotNullOutputNullPointerException9991d1ccfbb79c54453() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final StringReader arg1 = new StringReader("aaaaa");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNClobInputNotNullNullOutputNullPointerException999dabef81998738675() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final NClob arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNClobInputPositiveNotNullPositiveOutputNullPointerException9995446b5175d5d1ae8() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");
    final long arg2 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNClob(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNClobInputPositiveNotNullOutputNullPointerException99926b55044be1bf3ff() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final StringReader arg1 = new StringReader("aaaka");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNClobInputPositiveNullOutputNullPointerException99992f1e3394ab98c69() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final NClob arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNClob(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNStringInputNotNullNotNullOutputNullPointerException999a37a9d8e1405e156() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final String arg1 = "aaaak";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNStringInputPositiveNotNullOutputNullPointerException99969328c4b336aaa70() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNullInputNotNullOutputNullPointerException9995ce049ffb28642e2() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNull(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateNullInputPositiveOutputNullPointerException999be8f98420a725869() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateNull(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputNotNullNotNullPositiveOutputNullPointerException9990ca39f409fa91d9b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaka";
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputNotNullNotNullNullPositiveOutputNullPointerException9999b687e2a85d099fa() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaka";
    final SQLType arg2 = null;
    final int arg3 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputNotNullNotNullNullOutputNullPointerException99978156f88532dcd0f() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaka";
    final SQLType arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputNotNullNotNullOutputNullPointerException999d707f50b25aad38b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaka";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputPositiveNotNullPositiveOutputNullPointerException999a988444dab318014() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";
    final int arg2 = 2561;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputPositiveNotNullNullPositiveOutputNullPointerException999906dcc742d1a24d7() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";
    final SQLType arg2 = null;
    final int arg3 = 11;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputPositiveNotNullNullOutputNullPointerException999ac024b76c030d891() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";
    final SQLType arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateObjectInputPositiveNotNullOutputNullPointerException99949e97a46a8d1c01b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Object arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateObject(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateRefInputNotNullNullOutputNullPointerException99964adef69f3681789() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Ref arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateRef(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateRefInputPositiveNullOutputNullPointerException9994851a34e5f1cb4ff() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Ref arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateRef(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateRowIdInputNotNullNullOutputNullPointerException99999889430f5e44395() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final RowId arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateRowId(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateRowIdInputPositiveNullOutputNullPointerException99937544d4044710fbc() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final RowId arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateRowId(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateRowOutputNullPointerException999c699ed174e34ec68() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateRow();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateShortInputNotNullPositiveOutputNullPointerException9991d9920247d15adb0() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final short arg1 = (short) 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateShort(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateShortInputPositivePositiveOutputNullPointerException999b3b3116d162d4644() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final short arg1 = (short) 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateShort(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateSQLXMLInputNotNullNotNullOutputNullPointerException999e3c29e1e4b547580() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final PgSQLXML arg1 = new PgSQLXML(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateSQLXML(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateSQLXMLInputPositiveNotNullOutputNullPointerException999046ec27b9a2e9d10() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final PgSQLXML arg1 = new PgSQLXML(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateSQLXML(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateStringInputNotNullNotNullOutputNullPointerException99977ecc7c3049d6842() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final String arg1 = "aaaak";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateStringInputPositiveNotNullOutputNullPointerException999f9d1bc0d8b84f8c5() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateString(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateTimeInputNotNullNotNullOutputNullPointerException999e3607bb050dada5b() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Time arg1 = new Time(167_772_161L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateTimeInputPositiveNotNullOutputNullPointerException9996c72a4b741d361dd() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Time arg1 = new Time(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateTimestampInputNotNullNotNullOutputNullPointerException9991b766d9050cf8714() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final String arg0 = "aaaaa";
    final Timestamp arg1 = new Timestamp(167_772_161L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateTimestampInputPositiveNotNullOutputNullPointerException9991ee700f64c03b4a4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);
    final int arg0 = 1;
    final Timestamp arg1 = new Timestamp(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateTimestamp(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void wasNullOutputNullPointerException999ed6ef2d1e0615ed4() throws SQLException {

    // Arrange
    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
    final HikariProxyConnection hikariProxyConnection2 = new HikariProxyConnection(poolEntry, hikariProxyConnection1, null, null, 1L, true, true);
    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, hikariProxyConnection2, null, proxyLeakTask, 1L, true, true);
    final HikariProxyConnection hikariProxyConnection3 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
    final HikariProxyCallableStatement hikariProxyCallableStatement1 = new HikariProxyCallableStatement(hikariProxyConnection3, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement = new HikariProxyCallableStatement(hikariProxyConnection, hikariProxyCallableStatement1);
    final HikariProxyCallableStatement hikariProxyCallableStatement3 = new HikariProxyCallableStatement(null, null);
    final HikariProxyCallableStatement hikariProxyCallableStatement2 = new HikariProxyCallableStatement(hikariProxyConnection3, hikariProxyCallableStatement3);
    final HikariProxyResultSet hikariProxyResultSet = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement2, null);
    final HikariProxyResultSet thisObj = new HikariProxyResultSet(hikariProxyConnection, hikariProxyCallableStatement, hikariProxyResultSet);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.wasNull();

    // The method is not expected to return due to exception thrown

  }
}
