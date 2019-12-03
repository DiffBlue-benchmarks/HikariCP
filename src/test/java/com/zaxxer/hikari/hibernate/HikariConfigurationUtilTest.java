package com.zaxxer.hikari.hibernate;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.hibernate.HikariConfigurationUtil
 */

public class HikariConfigurationUtilTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void loadConfiguration1() {
        HashMap props = new HashMap();
        java.lang.reflect.Field[] value = new java.lang.reflect.Field[] { };
        props.put("foo", value);
        com.zaxxer.hikari.HikariConfig result = HikariConfigurationUtil.loadConfiguration(props);
        assertNull(result.getCatalog());
        assertNull(result.getConnectionInitSql());
        assertNull(result.getConnectionTestQuery());
        assertEquals(30_000L, result.getConnectionTimeout());
        assertNull(result.getDataSource());
        assertNull(result.getDataSourceClassName());
        assertNull(result.getDataSourceJNDI());
        assertTrue(result.getDataSourceProperties().isEmpty());
        assertNull(result.getDriverClassName());
        assertTrue(result.getHealthCheckProperties().isEmpty());
        assertNull(result.getHealthCheckRegistry());
        assertEquals(600_000L, result.getIdleTimeout());
        assertEquals(1L, result.getInitializationFailTimeout());
        assertNull(result.getJdbcUrl());
        assertEquals(0L, result.getLeakDetectionThreshold());
        assertEquals(1_800_000L, result.getMaxLifetime());
        assertEquals(-1, result.getMaximumPoolSize());
        assertNull(result.getMetricRegistry());
        assertNull(result.getMetricsTrackerFactory());
        assertEquals(-1, result.getMinimumIdle());
        assertNull(result.getPassword());
        assertNull(result.getPoolName());
        assertNull(result.getScheduledExecutor());
        assertNull(result.getSchema());
        assertNull(result.getThreadFactory());
        assertNull(result.getTransactionIsolation());
        assertNull(result.getUsername());
        assertEquals(5_000L, result.getValidationTimeout());
        assertFalse(result.isAllowPoolSuspension());
        assertTrue(result.isAutoCommit());
        assertFalse(result.isIsolateInternalQueries());
        assertFalse(result.isReadOnly());
        assertFalse(result.isRegisterMbeans());
    }

    @Test
    public void loadConfiguration2() {
        HashMap props = new HashMap();
        java.lang.reflect.Field[] value = new java.lang.reflect.Field[] { };
        props.put("hibernate.connection.autocommit", value);
        // class [Ljava.lang.reflect.Field; cannot be cast to class java.lang.String ([Ljava.lang.reflect.Field; and java.lang.String are in module java.base of loader 'bootstrap')
        thrown.expect(ClassCastException.class);
        HikariConfigurationUtil.loadConfiguration(props);
    }

    @Test
    public void loadConfiguration3() {
        HashMap props = new HashMap();
        java.lang.reflect.Field[] value = new java.lang.reflect.Field[] { };
        props.put("hibernate.hikari.", value);
        // class [Ljava.lang.reflect.Field; cannot be cast to class java.lang.String ([Ljava.lang.reflect.Field; and java.lang.String are in module java.base of loader 'bootstrap')
        thrown.expect(ClassCastException.class);
        HikariConfigurationUtil.loadConfiguration(props);
    }
}
