package com.zaxxer.hikari.pool;

import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for com.zaxxer.hikari.pool.ProxyFactory
 */

public class ProxyFactoryTest {

    @Test
    public void getProxyCallableStatement() {
        java.sql.CallableStatement result = ProxyFactory.getProxyCallableStatement(null, null);
        assertNull(result.getConnection());
    }
}
