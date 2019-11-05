package com.zaxxer.hikari;

import com.codahale.metrics.MetricRegistry;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariConfigMXBean;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariPoolMXBean;
import com.zaxxer.hikari.metrics.dropwizard.CodahaleMetricsTrackerFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;



public class HikariDataSourceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid9994f364da4b6d26eb6() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    thisObj.close();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b1b41a708cc1c6fb() {

    // Act, creating object to test constructor
    final HikariDataSource actual = new HikariDataSource();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHikariPoolMXBean());
    Assert.assertFalse(actual.isIsolateInternalQueries());
    Assert.assertFalse(actual.isAllowPoolSuspension());
    Assert.assertNull(actual.getHealthCheckRegistry());
    Assert.assertNull(actual.getDataSource());
    Assert.assertTrue(actual.isAutoCommit());
    Assert.assertNull(actual.getTransactionIsolation());
    Assert.assertEquals(1L, actual.getInitializationFailTimeout());
    Assert.assertEquals(600_000L, actual.getIdleTimeout());
    Assert.assertNull(actual.getPassword());
    final Properties properties = new Properties();
    Assert.assertEquals(properties, actual.getHealthCheckProperties());
    final Properties properties1 = new Properties();
    Assert.assertEquals(properties1, actual.getDataSourceProperties());
    Assert.assertNull(actual.getCatalog());
    Assert.assertEquals(-1, actual.getMaximumPoolSize());
    Assert.assertNull(actual.getDataSourceJNDI());
    Assert.assertNull(actual.getConnectionInitSql());
    Assert.assertNull(actual.getDriverClassName());
    Assert.assertNull(actual.getConnectionTestQuery());
    Assert.assertNull(actual.getScheduledExecutor());
    Assert.assertNull(actual.getDataSourceClassName());
    Assert.assertEquals(30_000L, actual.getConnectionTimeout());
    Assert.assertFalse(actual.isReadOnly());
    Assert.assertFalse(actual.isRegisterMbeans());
    Assert.assertNull(actual.getJdbcUrl());
    Assert.assertEquals(-1, actual.getMinimumIdle());
    Assert.assertEquals(0L, actual.getLeakDetectionThreshold());
    Assert.assertEquals(1_800_000L, actual.getMaxLifetime());
    Assert.assertNull(actual.getMetricRegistry());
    Assert.assertNull(actual.getMetricsTrackerFactory());
    Assert.assertNull(actual.getPoolName());
    Assert.assertNull(actual.getSchema());
    Assert.assertNull(actual.getThreadFactory());
    Assert.assertNull(actual.getUsername());
    Assert.assertEquals(5000L, actual.getValidationTimeout());

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputIllegalArgumentException9990d1a1dcd95e3f359() {
//
//    // Arrange
//    final HikariConfig arg0 = new HikariConfig();
//    try {
//
//      // Act, creating object to test constructor
//      thrown.expect(IllegalArgumentException.class);
//      new HikariDataSource(arg0);
//    } catch (IllegalArgumentException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertFalse(arg0.isIsolateInternalQueries());
//      Assert.assertFalse(arg0.isAllowPoolSuspension());
//      Assert.assertNull(arg0.getHealthCheckRegistry());
//      Assert.assertNull(arg0.getDataSource());
//      Assert.assertTrue(arg0.isAutoCommit());
//      Assert.assertNull(arg0.getTransactionIsolation());
//      Assert.assertEquals(1L, arg0.getInitializationFailTimeout());
//      Assert.assertEquals(600_000L, arg0.getIdleTimeout());
//      Assert.assertNull(arg0.getPassword());
//      final Properties properties = new Properties();
//      Assert.assertEquals(properties, arg0.getHealthCheckProperties());
//      final Properties properties1 = new Properties();
//      Assert.assertEquals(properties1, arg0.getDataSourceProperties());
//      Assert.assertNull(arg0.getCatalog());
//      Assert.assertEquals(-1, arg0.getMaximumPoolSize());
//      Assert.assertNull(arg0.getDataSourceJNDI());
//      Assert.assertNull(arg0.getConnectionInitSql());
//      Assert.assertNull(arg0.getDriverClassName());
//      Assert.assertNull(arg0.getConnectionTestQuery());
//      Assert.assertNull(arg0.getScheduledExecutor());
//      Assert.assertNull(arg0.getDataSourceClassName());
//      Assert.assertEquals(30_000L, arg0.getConnectionTimeout());
//      Assert.assertFalse(arg0.isReadOnly());
//      Assert.assertFalse(arg0.isRegisterMbeans());
//      Assert.assertNull(arg0.getJdbcUrl());
//      Assert.assertEquals(-1, arg0.getMinimumIdle());
//      Assert.assertEquals(0L, arg0.getLeakDetectionThreshold());
//      Assert.assertEquals(1_800_000L, arg0.getMaxLifetime());
//      Assert.assertNull(arg0.getMetricRegistry());
//      Assert.assertNull(arg0.getMetricsTrackerFactory());
//      Assert.assertEquals("HikariPool-2", arg0.getPoolName());
//      Assert.assertNull(arg0.getSchema());
//      Assert.assertNull(arg0.getThreadFactory());
//      Assert.assertNull(arg0.getUsername());
//      Assert.assertEquals(5000L, arg0.getValidationTimeout());
//      throw ex;
//    }
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void evictConnectionInputNullOutputVoid9992e9f7a397243c38f() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final Connection arg0 = null;

    // Act
    thisObj.evictConnection(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getConnectionOutputIllegalArgumentException9996618e8b25c5c68b3() throws SQLException {
//
//    // Arrange
//    final HikariDataSource thisObj = new HikariDataSource();
//    try {
//
//      // Act
//      thrown.expect(IllegalArgumentException.class);
//      thisObj.getConnection();
//    } catch (IllegalArgumentException ex) {
//
//      // Assert side effects
//      Assert.assertEquals("HikariPool-3", thisObj.getPoolName());
//      throw ex;
//    }
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionInputNotNullNotNullOutputSQLFeatureNotSupportedException999f57fb17c20a4839f() throws SQLException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final String arg0 = " has been closed.";
    final String arg1 = " has been closed.";

    // Act
    thrown.expect(SQLFeatureNotSupportedException.class);
    thisObj.getConnection(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHikariConfigMXBeanOutputNotNull99984864ee2a777d96d() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    final HikariConfigMXBean actual = thisObj.getHikariConfigMXBean();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(((HikariDataSource) actual).getHikariPoolMXBean());
    Assert.assertFalse(((HikariDataSource) actual).isIsolateInternalQueries());
    Assert.assertFalse(((HikariDataSource) actual).isAllowPoolSuspension());
    Assert.assertNull(((HikariDataSource) actual).getHealthCheckRegistry());
    Assert.assertNull(((HikariDataSource) actual).getDataSource());
    Assert.assertTrue(((HikariDataSource) actual).isAutoCommit());
    Assert.assertNull(((HikariDataSource) actual).getTransactionIsolation());
    Assert.assertEquals(1L, ((HikariDataSource) actual).getInitializationFailTimeout());
    Assert.assertEquals(600_000L, ((HikariDataSource) actual).getIdleTimeout());
    Assert.assertNull(((HikariDataSource) actual).getPassword());
    final Properties properties = new Properties();
    Assert.assertEquals(properties, ((HikariDataSource) actual).getHealthCheckProperties());
    final Properties properties1 = new Properties();
    Assert.assertEquals(properties1, ((HikariDataSource) actual).getDataSourceProperties());
    Assert.assertNull(((HikariDataSource) actual).getCatalog());
    Assert.assertEquals(-1, ((HikariDataSource) actual).getMaximumPoolSize());
    Assert.assertNull(((HikariDataSource) actual).getDataSourceJNDI());
    Assert.assertNull(((HikariDataSource) actual).getConnectionInitSql());
    Assert.assertNull(((HikariDataSource) actual).getDriverClassName());
    Assert.assertNull(((HikariDataSource) actual).getConnectionTestQuery());
    Assert.assertNull(((HikariDataSource) actual).getScheduledExecutor());
    Assert.assertNull(((HikariDataSource) actual).getDataSourceClassName());
    Assert.assertEquals(30_000L, ((HikariDataSource) actual).getConnectionTimeout());
    Assert.assertFalse(((HikariDataSource) actual).isReadOnly());
    Assert.assertFalse(((HikariDataSource) actual).isRegisterMbeans());
    Assert.assertNull(((HikariDataSource) actual).getJdbcUrl());
    Assert.assertEquals(-1, ((HikariDataSource) actual).getMinimumIdle());
    Assert.assertEquals(0L, ((HikariDataSource) actual).getLeakDetectionThreshold());
    Assert.assertEquals(1_800_000L, ((HikariDataSource) actual).getMaxLifetime());
    Assert.assertNull(((HikariDataSource) actual).getMetricRegistry());
    Assert.assertNull(((HikariDataSource) actual).getMetricsTrackerFactory());
    Assert.assertNull(((HikariDataSource) actual).getPoolName());
    Assert.assertNull(((HikariDataSource) actual).getSchema());
    Assert.assertNull(((HikariDataSource) actual).getThreadFactory());
    Assert.assertNull(((HikariDataSource) actual).getUsername());
    Assert.assertEquals(5000L, ((HikariDataSource) actual).getValidationTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHikariPoolMXBeanOutputVoid999d61328c0133a1323() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    final HikariPoolMXBean actual = thisObj.getHikariPoolMXBean();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLoginTimeoutOutputZero9994e029cea68d771f0() throws SQLException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    final int actual = thisObj.getLoginTimeout();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLogWriterOutputVoid9995813023ac0363db6() throws SQLException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    final PrintWriter actual = thisObj.getLogWriter();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getParentLoggerOutputSQLFeatureNotSupportedException999100f980c3f304a4f() throws SQLFeatureNotSupportedException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    thrown.expect(SQLFeatureNotSupportedException.class);
    thisObj.getParentLogger();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isClosedOutputFalse999e9c8cf4ca2cb94bd() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    final boolean actual = thisObj.isClosed();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isRunningOutputFalse999541515b07a1c707d() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    final boolean actual = thisObj.isRunning();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isWrapperForInputNullOutputNullPointerException999c52240b7269d0b5d() throws SQLException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isWrapperFor(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHealthCheckRegistryInputNotNullOutputIllegalArgumentException9999c0260a8e71bd801() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final Object arg0 = " has been closed.";

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setHealthCheckRegistry(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLoginTimeoutInputPositiveOutputVoid999ac8058f17f76ec6b() throws SQLException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final int arg0 = 1;

    // Act
    thisObj.setLoginTimeout(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setLogWriterInputNotNullOutputVoid999a9e76e4992762371() throws SQLException, FileNotFoundException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final File file = new File(" has been closed.");
    final PrintWriter arg0 = new PrintWriter(file);

    // Act
    thisObj.setLogWriter(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMetricRegistryInputNotNullOutputIllegalArgumentException9991acd3401ec79ce14() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final Object arg0 = " has been closed.";

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setMetricRegistry(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMetricsTrackerFactoryInputNotNullOutputVoid9991fb17912e437344b() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final MetricRegistry metricRegistry = new MetricRegistry();
    final CodahaleMetricsTrackerFactory arg0 = new CodahaleMetricsTrackerFactory(metricRegistry);

    // Act
    thisObj.setMetricsTrackerFactory(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getMetricsTrackerFactory());
    Assert.assertNotNull(((CodahaleMetricsTrackerFactory) thisObj.getMetricsTrackerFactory()).getRegistry());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999d5be65fa224d4030() {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("HikariDataSource (null)", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void unwrapInputNullOutputNullPointerException9999dbd8c1784a47e3b() throws SQLException {

    // Arrange
    final HikariDataSource thisObj = new HikariDataSource();
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.unwrap(arg0);

    // The method is not expected to return due to exception thrown

  }
}
