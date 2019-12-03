package com.zaxxer.hikari;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.HikariDataSource
 */

public class HikariDataSourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void close() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.close();
        assertTrue(hikariDataSource.isClosed());
    }

    @Test
    public void constructor1() throws java.sql.SQLException {
        HikariDataSource hikariDataSource = new HikariDataSource();
        assertSame(hikariDataSource, (HikariDataSource)hikariDataSource.getHikariConfigMXBean());
        assertNull(hikariDataSource.getHikariPoolMXBean());
        assertNull(hikariDataSource.getLogWriter());
        assertEquals(0, hikariDataSource.getLoginTimeout());
        assertFalse(hikariDataSource.isClosed());
        assertFalse(hikariDataSource.isRunning());
        assertNull(hikariDataSource.getCatalog());
        assertNull(hikariDataSource.getConnectionInitSql());
        assertNull(hikariDataSource.getConnectionTestQuery());
        assertEquals(30_000L, hikariDataSource.getConnectionTimeout());
        assertNull(hikariDataSource.getDataSource());
        assertNull(hikariDataSource.getDataSourceClassName());
        assertNull(hikariDataSource.getDataSourceJNDI());
        assertTrue(hikariDataSource.getDataSourceProperties().isEmpty());
        assertNull(hikariDataSource.getDriverClassName());
        assertTrue(hikariDataSource.getHealthCheckProperties().isEmpty());
        assertNull(hikariDataSource.getHealthCheckRegistry());
        assertEquals(600_000L, hikariDataSource.getIdleTimeout());
        assertEquals(1L, hikariDataSource.getInitializationFailTimeout());
        assertNull(hikariDataSource.getJdbcUrl());
        assertEquals(0L, hikariDataSource.getLeakDetectionThreshold());
        assertEquals(1_800_000L, hikariDataSource.getMaxLifetime());
        assertEquals(-1, hikariDataSource.getMaximumPoolSize());
        assertNull(hikariDataSource.getMetricRegistry());
        assertNull(hikariDataSource.getMetricsTrackerFactory());
        assertEquals(-1, hikariDataSource.getMinimumIdle());
        assertNull(hikariDataSource.getPassword());
        assertEquals("HikariPool-1", hikariDataSource.getPoolName());
        assertNull(hikariDataSource.getScheduledExecutor());
        assertNull(hikariDataSource.getSchema());
        assertNull(hikariDataSource.getThreadFactory());
        assertNull(hikariDataSource.getTransactionIsolation());
        assertNull(hikariDataSource.getUsername());
        assertEquals(5_000L, hikariDataSource.getValidationTimeout());
        assertFalse(hikariDataSource.isAllowPoolSuspension());
        assertTrue(hikariDataSource.isAutoCommit());
        assertFalse(hikariDataSource.isIsolateInternalQueries());
        assertFalse(hikariDataSource.isReadOnly());
        assertFalse(hikariDataSource.isRegisterMbeans());
    }

    @Test
    public void evictConnectionConnectionIsNull() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.evictConnection(null);
    }

    @Test
    public void isWrapperForIfaceIsClassReturnsTrue() throws java.sql.SQLException {
        HikariDataSource hikariDataSource = new HikariDataSource();
        assertTrue(hikariDataSource.isWrapperFor(java.lang.Object.class));
    }

    @Test
    public void setDataSourceClassNameToFoo() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDataSourceClassName("foo");
        assertEquals("foo", hikariDataSource.getDataSourceClassName());
        assertEquals(10, hikariDataSource.getMaximumPoolSize());
        assertEquals(10, hikariDataSource.getMinimumIdle());
    }

    @Test
    public void setDataSourceJNDIToFoo() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDataSourceJNDI("foo");
        assertEquals("foo", hikariDataSource.getDataSourceJNDI());
        assertEquals(10, hikariDataSource.getMaximumPoolSize());
        assertEquals(10, hikariDataSource.getMinimumIdle());
    }

    @Test
    public void setHealthCheckRegistryToNull() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setHealthCheckRegistry(null);
    }

    @Test
    public void setLoginTimeoutToOne() throws java.sql.SQLException {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setLoginTimeout(1);
    }

    @Test
    public void setLogWriterToNull() throws java.sql.SQLException {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setLogWriter(null);
    }

    @Test
    public void setMetricRegistryToNull() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setMetricRegistry(null);
    }

    @Test
    public void setMetricsTrackerFactoryToNull() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setMetricsTrackerFactory(null);
    }

    @Test
    public void constructor2() {
        HikariConfig configuration = new HikariConfig();
        // dataSource or dataSourceClassName or jdbcUrl is required.
        thrown.expect(IllegalArgumentException.class);
        new HikariDataSource(configuration);
    }

    @Test
    public void getConnectionPasswordIsFooAndUsernameIsBarThrows() throws java.sql.SQLException {
        HikariDataSource hikariDataSource = new HikariDataSource();
        thrown.expect(java.sql.SQLFeatureNotSupportedException.class);
        hikariDataSource.getConnection("bar", "foo");
    }

    @Test
    public void setHealthCheckRegistryThrows() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        Object healthCheckRegistry = new HikariConfig();
        // com/codahale/metrics/health/HealthCheckRegistry
        thrown.expect(NoClassDefFoundError.class);
        hikariDataSource.setHealthCheckRegistry(healthCheckRegistry);
    }

    @Test
    public void setMetricRegistryThrows() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        Object metricRegistry = new HikariConfig();
        // Class must be instance of com.codahale.metrics.MetricRegistry or io.micrometer.core.instrument.MeterRegistry
        thrown.expect(IllegalArgumentException.class);
        hikariDataSource.setMetricRegistry(metricRegistry);
    }

    @Test
    public void unwrapIfaceIsClassThrows() throws java.sql.SQLException {
        HikariDataSource hikariDataSource = new HikariDataSource();
        // Wrapped DataSource is not an instance of class java.lang.String
        thrown.expect(java.sql.SQLException.class);
        hikariDataSource.<java.lang.String>unwrap(java.lang.String.class);
    }
}
