package com.zaxxer.hikari;

import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.HikariConfig
 */

public class HikariConfigTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addDataSourcePropertyPropertyNameIsFooAndValueIsEmpty() {
        HikariConfig hikariConfig = new HikariConfig();
        java.lang.reflect.Field[] value = new java.lang.reflect.Field[] { };
        hikariConfig.addDataSourceProperty("foo", value);
        assertFalse(hikariConfig.getDataSourceProperties().isEmpty());
    }

    @Test
    public void addHealthCheckPropertyKeyIsFooAndValueIsFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.addHealthCheckProperty("foo", "foo");
        assertFalse(hikariConfig.getHealthCheckProperties().isEmpty());
    }

    @Test
    public void constructor() {
        HikariConfig hikariConfig = new HikariConfig();
        assertNull(hikariConfig.getCatalog());
        assertNull(hikariConfig.getConnectionInitSql());
        assertNull(hikariConfig.getConnectionTestQuery());
        assertEquals(30_000L, hikariConfig.getConnectionTimeout());
        assertNull(hikariConfig.getDataSource());
        assertNull(hikariConfig.getDataSourceClassName());
        assertNull(hikariConfig.getDataSourceJNDI());
        assertTrue(hikariConfig.getDataSourceProperties().isEmpty());
        assertNull(hikariConfig.getDriverClassName());
        assertTrue(hikariConfig.getHealthCheckProperties().isEmpty());
        assertNull(hikariConfig.getHealthCheckRegistry());
        assertEquals(600_000L, hikariConfig.getIdleTimeout());
        assertEquals(1L, hikariConfig.getInitializationFailTimeout());
        assertNull(hikariConfig.getJdbcUrl());
        assertEquals(0L, hikariConfig.getLeakDetectionThreshold());
        assertEquals(1_800_000L, hikariConfig.getMaxLifetime());
        assertEquals(-1, hikariConfig.getMaximumPoolSize());
        assertNull(hikariConfig.getMetricRegistry());
        assertNull(hikariConfig.getMetricsTrackerFactory());
        assertEquals(-1, hikariConfig.getMinimumIdle());
        assertNull(hikariConfig.getPassword());
        assertNull(hikariConfig.getPoolName());
        assertNull(hikariConfig.getScheduledExecutor());
        assertNull(hikariConfig.getSchema());
        assertNull(hikariConfig.getThreadFactory());
        assertNull(hikariConfig.getTransactionIsolation());
        assertNull(hikariConfig.getUsername());
        assertEquals(5_000L, hikariConfig.getValidationTimeout());
        assertFalse(hikariConfig.isAllowPoolSuspension());
        assertTrue(hikariConfig.isAutoCommit());
        assertFalse(hikariConfig.isIsolateInternalQueries());
        assertFalse(hikariConfig.isReadOnly());
        assertFalse(hikariConfig.isRegisterMbeans());
    }

    @Test
    public void constructorPropertiesIsEmpty() {
        Properties properties = new Properties();
        HikariConfig hikariConfig = new HikariConfig(properties);
        assertNull(hikariConfig.getCatalog());
        assertNull(hikariConfig.getConnectionInitSql());
        assertNull(hikariConfig.getConnectionTestQuery());
        assertEquals(30_000L, hikariConfig.getConnectionTimeout());
        assertNull(hikariConfig.getDataSource());
        assertNull(hikariConfig.getDataSourceClassName());
        assertNull(hikariConfig.getDataSourceJNDI());
        assertTrue(hikariConfig.getDataSourceProperties().isEmpty());
        assertNull(hikariConfig.getDriverClassName());
        assertTrue(hikariConfig.getHealthCheckProperties().isEmpty());
        assertNull(hikariConfig.getHealthCheckRegistry());
        assertEquals(600_000L, hikariConfig.getIdleTimeout());
        assertEquals(1L, hikariConfig.getInitializationFailTimeout());
        assertNull(hikariConfig.getJdbcUrl());
        assertEquals(0L, hikariConfig.getLeakDetectionThreshold());
        assertEquals(1_800_000L, hikariConfig.getMaxLifetime());
        assertEquals(-1, hikariConfig.getMaximumPoolSize());
        assertNull(hikariConfig.getMetricRegistry());
        assertNull(hikariConfig.getMetricsTrackerFactory());
        assertEquals(-1, hikariConfig.getMinimumIdle());
        assertNull(hikariConfig.getPassword());
        assertNull(hikariConfig.getPoolName());
        assertNull(hikariConfig.getScheduledExecutor());
        assertNull(hikariConfig.getSchema());
        assertNull(hikariConfig.getThreadFactory());
        assertNull(hikariConfig.getTransactionIsolation());
        assertNull(hikariConfig.getUsername());
        assertEquals(5_000L, hikariConfig.getValidationTimeout());
        assertFalse(hikariConfig.isAllowPoolSuspension());
        assertTrue(hikariConfig.isAutoCommit());
        assertFalse(hikariConfig.isIsolateInternalQueries());
        assertFalse(hikariConfig.isReadOnly());
        assertFalse(hikariConfig.isRegisterMbeans());
    }

    @Test
    public void copyStateTo() {
        HikariConfig hikariConfig = new HikariConfig();
        HikariConfig other = new HikariConfig();
        hikariConfig.copyStateTo(other);
    }

    @Test
    public void seal() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.seal();
    }

    @Test
    public void setAllowPoolSuspensionToTrue() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setAllowPoolSuspension(true);
        assertTrue(hikariConfig.isAllowPoolSuspension());
    }

    @Test
    public void setAutoCommitToTrue() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setAutoCommit(true);
    }

    @Test
    public void setCatalogToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setCatalog("foo");
        assertEquals("foo", hikariConfig.getCatalog());
    }

    @Test
    public void setConnectionInitSqlToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setConnectionInitSql("foo");
        assertEquals("foo", hikariConfig.getConnectionInitSql());
    }

    @Test
    public void setConnectionTestQueryToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setConnectionTestQuery("foo");
        assertEquals("foo", hikariConfig.getConnectionTestQuery());
    }

    @Test
    public void setConnectionTimeout() {
        Properties properties = new Properties();
        HikariConfig hikariConfig = new HikariConfig(properties);
        hikariConfig.setConnectionTimeout(250L);
        assertEquals(250L, hikariConfig.getConnectionTimeout());
    }

    @Test
    public void setConnectionTimeoutToZero() {
        Properties properties = new Properties();
        HikariConfig hikariConfig = new HikariConfig(properties);
        hikariConfig.setConnectionTimeout(0L);
        assertEquals(2_147_483_647L, hikariConfig.getConnectionTimeout());
    }

    @Test
    public void setDataSourceClassNameToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDataSourceClassName("foo");
        assertEquals("foo", hikariConfig.getDataSourceClassName());
    }

    @Test
    public void setDataSourceJNDIToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDataSourceJNDI("foo");
        assertEquals("foo", hikariConfig.getDataSourceJNDI());
    }

    @Test
    public void setDataSourcePropertiesToEmpty() {
        HikariConfig hikariConfig = new HikariConfig();
        Properties dsProperties = new Properties();
        hikariConfig.setDataSourceProperties(dsProperties);
    }

    @Test
    public void setDataSourceToNull() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDataSource(null);
    }

    @Test
    public void setHealthCheckPropertiesToEmpty() {
        HikariConfig hikariConfig = new HikariConfig();
        Properties healthCheckProperties = new Properties();
        hikariConfig.setHealthCheckProperties(healthCheckProperties);
    }

    @Test
    public void setHealthCheckRegistryToNull() {
        Properties properties = new Properties();
        HikariConfig hikariConfig = new HikariConfig(properties);
        hikariConfig.setHealthCheckRegistry(null);
    }

    @Test
    public void setIdleTimeoutToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setIdleTimeout(1L);
        assertEquals(1L, hikariConfig.getIdleTimeout());
    }

    @Test
    public void setInitializationFailTimeoutToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setInitializationFailTimeout(1L);
    }

    @Test
    public void setIsolateInternalQueriesToTrue() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setIsolateInternalQueries(true);
        assertTrue(hikariConfig.isIsolateInternalQueries());
    }

    @Test
    public void setJdbcUrlToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("foo");
        assertEquals("foo", hikariConfig.getJdbcUrl());
    }

    @Test
    public void setLeakDetectionThresholdToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setLeakDetectionThreshold(1L);
        assertEquals(1L, hikariConfig.getLeakDetectionThreshold());
    }

    @Test
    public void setMaximumPoolSizeToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setMaximumPoolSize(1);
        assertEquals(1, hikariConfig.getMaximumPoolSize());
    }

    @Test
    public void setMaxLifetimeToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setMaxLifetime(1L);
        assertEquals(1L, hikariConfig.getMaxLifetime());
    }

    @Test
    public void setMetricsTrackerFactoryToNull() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setMetricsTrackerFactory(null);
    }

    @Test
    public void setMinimumIdleToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setMinimumIdle(1);
        assertEquals(1, hikariConfig.getMinimumIdle());
    }

    @Test
    public void setPasswordToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setPassword("foo");
        assertEquals("foo", hikariConfig.getPassword());
    }

    @Test
    public void setPoolNameToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setPoolName("foo");
        assertEquals("foo", hikariConfig.getPoolName());
    }

    @Test
    public void setReadOnlyToTrue() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setReadOnly(true);
        assertTrue(hikariConfig.isReadOnly());
    }

    @Test
    public void setRegisterMbeansToTrue() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setRegisterMbeans(true);
        assertTrue(hikariConfig.isRegisterMbeans());
    }

    @Test
    public void setScheduledExecutorToNull() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setScheduledExecutor(null);
    }

    @Test
    public void setSchemaToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setSchema("foo");
        assertEquals("foo", hikariConfig.getSchema());
    }

    @Test
    public void setThreadFactoryToNull() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setThreadFactory(null);
    }

    @Test
    public void setTransactionIsolationToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setTransactionIsolation("foo");
        assertEquals("foo", hikariConfig.getTransactionIsolation());
    }

    @Test
    public void setUsernameToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setUsername("foo");
        assertEquals("foo", hikariConfig.getUsername());
    }

    @Test
    public void constructorPropertyFileNameIsFoo() {
        // Cannot find property file: foo
        thrown.expect(IllegalArgumentException.class);
        new HikariConfig("foo");
    }

    @Test
    public void copyStateToOtherIsNullThrows() {
        Properties properties = new Properties();
        HikariConfig hikariConfig = new HikariConfig(properties);
        // Failed to copy HikariConfig state: null
        thrown.expect(RuntimeException.class);
        hikariConfig.copyStateTo(null);
    }

    @Test
    public void setConnectionTimeoutToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        // connectionTimeout cannot be less than 250ms
        thrown.expect(IllegalArgumentException.class);
        hikariConfig.setConnectionTimeout(1L);
    }

    @Test
    public void setDriverClassNameToFoo() {
        HikariConfig hikariConfig = new HikariConfig();
        // Failed to load driver class foo in either of HikariConfig class loader or Thread context classloader
        thrown.expect(RuntimeException.class);
        hikariConfig.setDriverClassName("foo");
    }

    @Test
    public void setHealthCheckRegistryToEmpty() {
        HikariConfig hikariConfig = new HikariConfig();
        java.lang.reflect.Field[] healthCheckRegistry = new java.lang.reflect.Field[] { };
        // com/codahale/metrics/health/HealthCheckRegistry
        thrown.expect(NoClassDefFoundError.class);
        hikariConfig.setHealthCheckRegistry(healthCheckRegistry);
    }

    @Test
    public void setIdleTimeoutToMinusOne() {
        Properties properties = new Properties();
        HikariConfig hikariConfig = new HikariConfig(properties);
        // idleTimeout cannot be negative
        thrown.expect(IllegalArgumentException.class);
        hikariConfig.setIdleTimeout(-1L);
    }

    @Test
    public void setMetricRegistryToEmpty() {
        HikariConfig hikariConfig = new HikariConfig();
        java.lang.reflect.Field[] metricRegistry = new java.lang.reflect.Field[] { };
        // Class must be instance of com.codahale.metrics.MetricRegistry or io.micrometer.core.instrument.MeterRegistry
        thrown.expect(IllegalArgumentException.class);
        hikariConfig.setMetricRegistry(metricRegistry);
    }

    @Test
    public void setValidationTimeoutToOne() {
        HikariConfig hikariConfig = new HikariConfig();
        // validationTimeout cannot be less than 250ms
        thrown.expect(IllegalArgumentException.class);
        hikariConfig.setValidationTimeout(1L);
    }

    @Test
    public void validateThrows() {
        HikariConfig hikariConfig = new HikariConfig();
        // dataSource or dataSourceClassName or jdbcUrl is required.
        thrown.expect(IllegalArgumentException.class);
        hikariConfig.validate();
    }
}
