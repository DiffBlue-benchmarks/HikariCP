package com.zaxxer.hikari;

import com.codahale.metrics.InstrumentedScheduledExecutorService;
import com.codahale.metrics.MetricRegistry;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.metrics.MetricsTrackerFactory;
import com.zaxxer.hikari.metrics.dropwizard.CodahaleMetricsTrackerFactory;
import com.zaxxer.hikari.util.UtilityElf.DefaultThreadFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Properties;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import javax.sql.DataSource;



public class HikariConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addDataSourcePropertyInputNotNullNotNullOutputVoid99970b43006e5b61e03() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";
    final Object arg1 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.addDataSourceProperty(arg0, arg1);

    // Assert side effects
    final Properties properties = new Properties();
    properties.setProperty(" in either of HikariConfig class loader or Thread context classloader", " in either of HikariConfig class loader or Thread context classloader");
    Assert.assertEquals(properties, thisObj.getDataSourceProperties());

  }

  // Test written by Diffblue Cover
  @Test
  public void addHealthCheckPropertyInputNotNullNotNullOutputVoid999d44e53e74e37e873() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";
    final String arg1 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.addHealthCheckProperty(arg0, arg1);

    // Assert side effects
    final Properties properties = new Properties();
    properties.setProperty(" in either of HikariConfig class loader or Thread context classloader", " in either of HikariConfig class loader or Thread context classloader");
    Assert.assertEquals(properties, thisObj.getHealthCheckProperties());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999c3bb9bf1174cb55() {

    // Act, creating object to test constructor
    final HikariConfig actual = new HikariConfig();

    // Assert result
    Assert.assertNotNull(actual);
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

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputIllegalArgumentException99987663a1c70a85fd6() {

    // Arrange
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    new HikariConfig(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputRuntimeException999f966c2e4f863d6af() {

    // Arrange
    final Properties arg0 = new Properties();
    arg0.put(" in either of HikariConfig class loader or Thread context classloader", " in either of HikariConfig class loader or Thread context classloader");

    // Act, creating object to test constructor
    thrown.expect(RuntimeException.class);
    new HikariConfig(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void copyStateToInputNotNullOutputVoid9995b156cc23394a35c() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final HikariConfig arg0 = new HikariConfig();

    // Act
    thisObj.copyStateTo(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCatalogOutputVoid9994d1877e61811ed16() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getCatalog();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionInitSqlOutputVoid9997e039fe5dfc85828() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getConnectionInitSql();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionTestQueryOutputVoid99956d220f10de92e4f() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getConnectionTestQuery();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionTimeoutOutputPositive99979004fbf3158c8cf() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final long actual = thisObj.getConnectionTimeout();

    // Assert result
    Assert.assertEquals(30_000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataSourceClassNameOutputVoid999a02f9e26919d443a() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getDataSourceClassName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataSourceJNDIOutputVoid999dea0091d1ba9c12c() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getDataSourceJNDI();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataSourcePropertiesOutput0999a22390f8d97f20b8() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final Properties actual = thisObj.getDataSourceProperties();

    // Assert result
    final Properties properties = new Properties();
    Assert.assertEquals(properties, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDataSourceOutputVoid999a2c69a8fafdaca3f() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final DataSource actual = thisObj.getDataSource();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDriverClassNameOutputVoid99921001ffd3275bb01() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getDriverClassName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHealthCheckPropertiesOutput09992bf48371db8726d9() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final Properties actual = thisObj.getHealthCheckProperties();

    // Assert result
    final Properties properties = new Properties();
    Assert.assertEquals(properties, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHealthCheckRegistryOutputVoid999b43289cd8c2dc176() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final Object actual = thisObj.getHealthCheckRegistry();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdleTimeoutOutputPositive9997b2f4df51e51fc85() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final long actual = thisObj.getIdleTimeout();

    // Assert result
    Assert.assertEquals(600_000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInitializationFailTimeoutOutputPositive99983e2ef39c48382fb() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final long actual = thisObj.getInitializationFailTimeout();

    // Assert result
    Assert.assertEquals(1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getJdbcUrlOutputVoid9995e9fd6d11f15a75a() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getJdbcUrl();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLeakDetectionThresholdOutputZero999299e7494007e64bf() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final long actual = thisObj.getLeakDetectionThreshold();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaximumPoolSizeOutputNegative999f91bc0b44220a885() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final int actual = thisObj.getMaximumPoolSize();

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxLifetimeOutputPositive99955d9ca9c9aba28d4() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final long actual = thisObj.getMaxLifetime();

    // Assert result
    Assert.assertEquals(1_800_000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetricRegistryOutputVoid99902eced502815a362() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final Object actual = thisObj.getMetricRegistry();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetricsTrackerFactoryOutputVoid99986d7518a626c791e() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final MetricsTrackerFactory actual = thisObj.getMetricsTrackerFactory();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMinimumIdleOutputNegative99980755ddfd61a7eb8() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final int actual = thisObj.getMinimumIdle();

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPasswordOutputVoid999340312e32b3e171f() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getPassword();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPoolNameOutputVoid999197fab4ca7669e75() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getPoolName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getScheduledExecutorOutputVoid999dc4e7099601b0b92() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final ScheduledExecutorService actual = thisObj.getScheduledExecutor();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchemaOutputVoid99924757d09f972cbb5() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getSchema();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getThreadFactoryOutputVoid999fbbac8d409fa6432() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final ThreadFactory actual = thisObj.getThreadFactory();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTransactionIsolationOutputVoid999ca1abbc7e32c43d4() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getTransactionIsolation();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUsernameOutputVoid9992853e1d4eb02bc14() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final String actual = thisObj.getUsername();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getValidationTimeoutOutputPositive9993cb4004e816cb5f7() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final long actual = thisObj.getValidationTimeout();

    // Assert result
    Assert.assertEquals(5000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isAllowPoolSuspensionOutputFalse999eead3d447baa226c() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final boolean actual = thisObj.isAllowPoolSuspension();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isAutoCommitOutputTrue999861857d81ef87187() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final boolean actual = thisObj.isAutoCommit();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isIsolateInternalQueriesOutputFalse999931cf6a73faac9a1() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final boolean actual = thisObj.isIsolateInternalQueries();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isReadOnlyOutputFalse9990f49834e87a8660d() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final boolean actual = thisObj.isReadOnly();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isRegisterMbeansOutputFalse9997909fcc3d8f7fd09() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    final boolean actual = thisObj.isRegisterMbeans();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sealOutputVoid9996b70f6d12cef84d2() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();

    // Act
    thisObj.seal();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAllowPoolSuspensionInputTrueOutputVoid9997f3f495415054c53() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final boolean arg0 = true;

    // Act
    thisObj.setAllowPoolSuspension(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isAllowPoolSuspension());

  }

  // Test written by Diffblue Cover
  @Test
  public void setAutoCommitInputTrueOutputVoid999079f4a7f9f9a8ec7() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final boolean arg0 = true;

    // Act
    thisObj.setAutoCommit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCatalogInputNotNullOutputVoid999067da47f7bf3f1e9() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setCatalog(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getCatalog());

  }

  // Test written by Diffblue Cover
  @Test
  public void setConnectionInitSqlInputNotNullOutputVoid999122733335d9bcfd0() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setConnectionInitSql(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getConnectionInitSql());

  }

  // Test written by Diffblue Cover
  @Test
  public void setConnectionTestQueryInputNotNullOutputVoid9995427fd96f7fca447() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setConnectionTestQuery(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getConnectionTestQuery());

  }

  // Test written by Diffblue Cover
  @Test
  public void setConnectionTimeoutInputZeroOutputVoid9992cd1fe0b61f4bb3e() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final long arg0 = 0L;

    // Act
    thisObj.setConnectionTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(2_147_483_647L, thisObj.getConnectionTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataSourceClassNameInputNotNullOutputVoid999ff3f9abcdd8c830a() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setDataSourceClassName(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getDataSourceClassName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataSourceJNDIInputNotNullOutputVoid99912895a8de91706dc() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setDataSourceJNDI(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getDataSourceJNDI());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataSourcePropertiesInputNotNullOutputVoid9991669905b4369feb2() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final Properties arg0 = new Properties();
    arg0.put(" in either of HikariConfig class loader or Thread context classloader", " in either of HikariConfig class loader or Thread context classloader");

    // Act
    thisObj.setDataSourceProperties(arg0);

    // Assert side effects
    final Properties properties = new Properties();
    properties.setProperty(" in either of HikariConfig class loader or Thread context classloader", " in either of HikariConfig class loader or Thread context classloader");
    Assert.assertEquals(properties, thisObj.getDataSourceProperties());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDataSourceInputNotNullOutputVoid99922213ad017317f5f() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final HikariDataSource arg0 = new HikariDataSource();

    // Act
    thisObj.setDataSource(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDataSource());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getHikariPoolMXBean());
    Assert.assertFalse(((HikariDataSource) thisObj.getDataSource()).isIsolateInternalQueries());
    Assert.assertFalse(((HikariDataSource) thisObj.getDataSource()).isAllowPoolSuspension());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getHealthCheckRegistry());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getDataSource());
    Assert.assertTrue(((HikariDataSource) thisObj.getDataSource()).isAutoCommit());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getTransactionIsolation());
    Assert.assertEquals(1L, ((HikariDataSource) thisObj.getDataSource()).getInitializationFailTimeout());
    Assert.assertEquals(600_000L, ((HikariDataSource) thisObj.getDataSource()).getIdleTimeout());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getPassword());
    final Properties properties = new Properties();
    Assert.assertEquals(properties, ((HikariDataSource) thisObj.getDataSource()).getHealthCheckProperties());
    final Properties properties1 = new Properties();
    Assert.assertEquals(properties1, ((HikariDataSource) thisObj.getDataSource()).getDataSourceProperties());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getCatalog());
    Assert.assertEquals(-1, ((HikariDataSource) thisObj.getDataSource()).getMaximumPoolSize());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getDataSourceJNDI());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getConnectionInitSql());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getDriverClassName());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getConnectionTestQuery());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getScheduledExecutor());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getDataSourceClassName());
    Assert.assertEquals(30_000L, ((HikariDataSource) thisObj.getDataSource()).getConnectionTimeout());
    Assert.assertFalse(((HikariDataSource) thisObj.getDataSource()).isReadOnly());
    Assert.assertFalse(((HikariDataSource) thisObj.getDataSource()).isRegisterMbeans());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getJdbcUrl());
    Assert.assertEquals(-1, ((HikariDataSource) thisObj.getDataSource()).getMinimumIdle());
    Assert.assertEquals(0L, ((HikariDataSource) thisObj.getDataSource()).getLeakDetectionThreshold());
    Assert.assertEquals(1_800_000L, ((HikariDataSource) thisObj.getDataSource()).getMaxLifetime());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getMetricRegistry());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getMetricsTrackerFactory());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getPoolName());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getSchema());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getThreadFactory());
    Assert.assertNull(((HikariDataSource) thisObj.getDataSource()).getUsername());
    Assert.assertEquals(5000L, ((HikariDataSource) thisObj.getDataSource()).getValidationTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDriverClassNameInputNotNullOutputRuntimeException9996ec215c0afba590e() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.setDriverClassName(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHealthCheckPropertiesInputNotNullOutputVoid999e907355a9711fbb8() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final Properties arg0 = new Properties();
    arg0.put(" in either of HikariConfig class loader or Thread context classloader", " in either of HikariConfig class loader or Thread context classloader");

    // Act
    thisObj.setHealthCheckProperties(arg0);

    // Assert side effects
    final Properties properties = new Properties();
    properties.setProperty(" in either of HikariConfig class loader or Thread context classloader", " in either of HikariConfig class loader or Thread context classloader");
    Assert.assertEquals(properties, thisObj.getHealthCheckProperties());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHealthCheckRegistryInputNotNullOutputIllegalArgumentException9992536791bf8c1b026() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final Object arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setHealthCheckRegistry(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setIdleTimeoutInputZeroOutputVoid999a6770ce12c68a706() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final long arg0 = 0L;

    // Act
    thisObj.setIdleTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(0L, thisObj.getIdleTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setInitializationFailTimeoutInputZeroOutputVoid9995e991439526938a7() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final long arg0 = 0L;

    // Act
    thisObj.setInitializationFailTimeout(arg0);

    // Assert side effects
    Assert.assertEquals(0L, thisObj.getInitializationFailTimeout());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIsolateInternalQueriesInputTrueOutputVoid999a3c2b9a8feaee647() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final boolean arg0 = true;

    // Act
    thisObj.setIsolateInternalQueries(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isIsolateInternalQueries());

  }

  // Test written by Diffblue Cover
  @Test
  public void setJdbcUrlInputNotNullOutputVoid999a73838fb4a59fe08() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setJdbcUrl(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getJdbcUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void setLeakDetectionThresholdInputZeroOutputVoid9999431e1e007d3b0a1() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final long arg0 = 0L;

    // Act
    thisObj.setLeakDetectionThreshold(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaximumPoolSizeInputNegativeOutputIllegalArgumentException9991c3abcdc2f1600f5() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final int arg0 = -1;

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setMaximumPoolSize(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMaxLifetimeInputZeroOutputVoid9998cef6ca41e2fba25() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final long arg0 = 0L;

    // Act
    thisObj.setMaxLifetime(arg0);

    // Assert side effects
    Assert.assertEquals(0L, thisObj.getMaxLifetime());

  }

  // Test written by Diffblue Cover
  @Test
  public void setMetricRegistryInputNotNullOutputIllegalArgumentException99963a40fcf9cda0db7() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final Object arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setMetricRegistry(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMetricsTrackerFactoryInputNotNullOutputVoid9996ce3bacaac264ec3() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
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
  public void setMinimumIdleInputNegativeOutputIllegalArgumentException999a859a9efc77319da() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final int arg0 = -1;

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setMinimumIdle(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPasswordInputNotNullOutputVoid999a3509615438c08c6() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setPassword(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getPassword());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPoolNameInputNotNullOutputVoid9990a7433913bc0abac() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setPoolName(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getPoolName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setReadOnlyInputTrueOutputVoid999a2eb773d0777d0e4() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final boolean arg0 = true;

    // Act
    thisObj.setReadOnly(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isReadOnly());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRegisterMbeansInputTrueOutputVoid999ef948212e9adc86e() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final boolean arg0 = true;

    // Act
    thisObj.setRegisterMbeans(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isRegisterMbeans());

  }

  // Test written by Diffblue Cover
  @Test
  public void setScheduledExecutorInputNotNullOutputVoid999bb25420ae91cb82e() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final MetricRegistry metricRegistry = new MetricRegistry();
    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService1 = new InstrumentedScheduledExecutorService(null, metricRegistry);
    final MetricRegistry metricRegistry1 = new MetricRegistry();
    final InstrumentedScheduledExecutorService instrumentedScheduledExecutorService = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService1, metricRegistry1);
    final MetricRegistry metricRegistry2 = new MetricRegistry();
    final InstrumentedScheduledExecutorService arg0 = new InstrumentedScheduledExecutorService(instrumentedScheduledExecutorService, metricRegistry2);

    // Act
    thisObj.setScheduledExecutor(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getScheduledExecutor());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchemaInputNotNullOutputVoid999b3fb039982c5c38b() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setSchema(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getSchema());

  }

  // Test written by Diffblue Cover
  @Test
  public void setThreadFactoryInputNotNullOutputVoid999a01497f83f6e3a6c() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final DefaultThreadFactory arg0 = new DefaultThreadFactory(" in either of HikariConfig class loader or Thread context classloader", true);

    // Act
    thisObj.setThreadFactory(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getThreadFactory());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTransactionIsolationInputNotNullOutputVoid999bf1a19a11baebd48() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setTransactionIsolation(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getTransactionIsolation());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUsernameInputNotNullOutputVoid99987e4c02820c499cf() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final String arg0 = " in either of HikariConfig class loader or Thread context classloader";

    // Act
    thisObj.setUsername(arg0);

    // Assert side effects
    Assert.assertEquals(" in either of HikariConfig class loader or Thread context classloader", thisObj.getUsername());

  }

  // Test written by Diffblue Cover
  @Test
  public void setValidationTimeoutInputZeroOutputIllegalArgumentException99972f8d3446edb98c3() {

    // Arrange
    final HikariConfig thisObj = new HikariConfig();
    final long arg0 = 0L;

    // Act
    thrown.expect(IllegalArgumentException.class);
    thisObj.setValidationTimeout(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void validateOutputIllegalArgumentException999eef0d353e32c0c30() {
//
//    // Arrange
//    final HikariConfig thisObj = new HikariConfig();
//    try {
//
//      // Act
//      thrown.expect(IllegalArgumentException.class);
//      thisObj.validate();
//    } catch (IllegalArgumentException ex) {
//
//      // Assert side effects
//      Assert.assertEquals("HikariPool-4", thisObj.getPoolName());
//      throw ex;
//    }
//
//  }
}
