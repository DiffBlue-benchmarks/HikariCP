package com.zaxxer.hikari.pool;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.pool.HikariPool
 */

public class HikariPoolTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor() {
        com.zaxxer.hikari.HikariConfig config = new com.zaxxer.hikari.HikariConfig();
        // Failed to initialize pool: null
        thrown.expect(HikariPool.PoolInitializationException.class);
        new HikariPool(config);
    }
}
