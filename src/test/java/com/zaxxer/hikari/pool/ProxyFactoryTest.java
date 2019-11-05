package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.pool.HikariProxyCallableStatement;
import com.zaxxer.hikari.pool.HikariProxyConnection;
import com.zaxxer.hikari.pool.HikariProxyPreparedStatement;
import com.zaxxer.hikari.pool.HikariProxyResultSet;
import com.zaxxer.hikari.pool.HikariProxyStatement;
import com.zaxxer.hikari.pool.PoolEntry;
import com.zaxxer.hikari.pool.ProxyCallableStatement;
import com.zaxxer.hikari.pool.ProxyConnection;
import com.zaxxer.hikari.pool.ProxyFactory;
import com.zaxxer.hikari.pool.ProxyLeakTask;
import com.zaxxer.hikari.pool.ProxyPreparedStatement;
import com.zaxxer.hikari.pool.ProxyStatement;
import com.zaxxer.hikari.util.FastList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class ProxyFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getProxyCallableStatementInputNotNullNotNullOutputNotNull9997bce0127d1833f19() {
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
//    // Act
//    final CallableStatement actual = ProxyFactory.getProxyCallableStatement(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(((ProxyCallableStatement) actual).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_104_665_319_689L, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate, ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getPoolEntry().connection);
//    Assert.assertEquals(18_104_668_486_071L, ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyCallableStatement) actual).delegate);
//    Assert.assertNotNull(((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).getCatalogState());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) actual).getConnection()).delegate).getPoolEntry(), ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).getConnection()).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).delegate);
//    Assert.assertEquals(((ProxyCallableStatement) actual).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).delegate).getConnection());
//    Assert.assertNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) actual).delegate).delegate).delegate);
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getProxyConnectionInputNotNullNotNullNullNotNullPositiveTrueTrueOutputNotNull99926a2ec2890e2e74a() {
//
//    // Arrange
//    final HikariProxyConnection hikariProxyConnection1 = new HikariProxyConnection(null, null, null, null, 1L, true, true);
//    final PoolEntry poolEntry = new PoolEntry(hikariProxyConnection1, null, true, true);
//    final ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
//    final HikariProxyConnection hikariProxyConnection = new HikariProxyConnection(poolEntry, null, null, proxyLeakTask, 1L, true, true);
//    final PoolEntry arg0 = new PoolEntry(hikariProxyConnection, null, true, true);
//    final HikariProxyConnection arg1 = new HikariProxyConnection(arg0, hikariProxyConnection, null, proxyLeakTask, 1L, true, true);
//    final FastList<Statement> arg2 = null;
//    final ProxyLeakTask arg3 = proxyLeakTask;
//    final long arg4 = 1L;
//    final boolean arg5 = true;
//    final boolean arg6 = true;
//
//    // Act
//    final ProxyConnection actual = ProxyFactory.getProxyConnection(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
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
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().connection).getPoolEntry());
//    Assert.assertEquals(18_104_360_188_775L, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_104_361_659_967L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) actual).delegate).getPoolEntry(), ((HikariProxyConnection) actual).getPoolEntry());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getProxyPreparedStatementInputNotNullNotNullOutputNotNull9999d47c6b5533124c8() {
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
//    // Act
//    final PreparedStatement actual = ProxyFactory.getProxyPreparedStatement(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(((ProxyPreparedStatement) actual).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_100_919_440_462L, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate, ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getPoolEntry().connection);
//    Assert.assertEquals(18_100_921_729_396L, ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyPreparedStatement) actual).delegate);
//    Assert.assertNotNull(((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).getCatalogState());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyPreparedStatement) actual).getConnection()).delegate).getPoolEntry(), ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection()).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).delegate);
//    Assert.assertEquals(((ProxyPreparedStatement) actual).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).delegate).delegate);
//    Assert.assertEquals(((ProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).delegate).delegate).delegate);
//    Assert.assertNull(((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).delegate).delegate).delegate).getConnection());
//    Assert.assertNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyPreparedStatement) actual).delegate).delegate).delegate).delegate).delegate);
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getProxyResultSetInputNotNullNotNullNotNullOutputNotNull9995b950663ec993785() {
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
//    // Act
//    final ResultSet actual = ProxyFactory.getProxyResultSet(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(((HikariProxyResultSet) actual).delegate);
//    Assert.assertNull(((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).delegate);
//    Assert.assertNotNull(((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_093_334_259_463L, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate, ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getPoolEntry().connection);
//    Assert.assertEquals(18_093_338_762_472L, ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement());
//    Assert.assertNotNull(((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).getCatalogState());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection).delegate).getPoolEntry(), ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection()).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).delegate);
//    Assert.assertEquals(((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection, ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).delegate).delegate);
//    Assert.assertEquals(((ProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).delegate).delegate).delegate);
//    Assert.assertNull(((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).delegate).delegate).delegate).getConnection());
//    Assert.assertNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement()).delegate).delegate).delegate).delegate);
//    Assert.assertEquals(((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).connection, ((HikariProxyResultSet) actual).connection);
//    Assert.assertEquals(((HikariProxyResultSet) ((HikariProxyResultSet) actual).delegate).getStatement(), ((HikariProxyResultSet) actual).getStatement());
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getProxyStatementInputNotNullNotNullOutputNotNull999c2bd00128067b502() {
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
//    // Act
//    final Statement actual = ProxyFactory.getProxyStatement(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(((ProxyStatement) actual).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).getCatalogState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getPoolEntry());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getPoolEntry().connection);
//    Assert.assertEquals(18_095_696_300_216L, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate, ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getPoolEntry().connection);
//    Assert.assertEquals(18_095_722_916_354L, ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getPoolEntry().lastAccessed);
//    Assert.assertFalse(((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getPoolEntry().isMarkedEvicted());
//    Assert.assertEquals(0L, ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).getPoolEntry().lastBorrowed);
//    Assert.assertNotNull(((HikariProxyStatement) actual).delegate);
//    Assert.assertNotNull(((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).getCatalogState());
//    Assert.assertNotNull(((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate);
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).getNetworkTimeoutState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).getReadOnlyState());
//    Assert.assertTrue(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).getAutoCommitState());
//    Assert.assertEquals(0, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).getTransactionIsolationState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).getSchemaState());
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).getCatalogState());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).delegate, ((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).delegate);
//    Assert.assertNull(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).delegate).getPoolEntry());
//    Assert.assertEquals(((HikariProxyConnection) ((HikariProxyConnection) ((ProxyStatement) actual).getConnection()).delegate).getPoolEntry(), ((HikariProxyConnection) ((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection()).getPoolEntry());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyStatement) actual).delegate).delegate);
//    Assert.assertEquals(((ProxyStatement) actual).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyStatement) actual).delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyStatement) actual).delegate).delegate).delegate);
//    Assert.assertEquals(((ProxyCallableStatement) ((HikariProxyStatement) actual).delegate).getConnection(), ((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyStatement) actual).delegate).delegate).delegate).getConnection());
//    Assert.assertNotNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyStatement) actual).delegate).delegate).delegate).delegate);
//    Assert.assertNull(((ProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyStatement) actual).delegate).delegate).delegate).delegate).getConnection());
//    Assert.assertNull(((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyCallableStatement) ((HikariProxyStatement) actual).delegate).delegate).delegate).delegate).delegate);
//
//  }
}
