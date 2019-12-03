package com.zaxxer.hikari.util;

import java.util.Properties;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.util.DriverDataSource
 */

public class DriverDataSourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor() {
        Properties properties = new Properties();
        properties.setProperty("foo", "foo");
        // Failed to get driver instance for jdbcUrl=$1<masked>$2
        thrown.expect(RuntimeException.class);
        new DriverDataSource("$1<masked>$2", "foo", properties, "foo", "foo");
    }

    @Test
    public void constructorDriverClassNameIsBar() {
        Properties properties = new Properties();
        // Failed to get driver instance for jdbcUrl=$1<masked>$2
        thrown.expect(RuntimeException.class);
        new DriverDataSource("$1<masked>$2", "bar", properties, "foo", "foo");
    }

    @Test
    public void constructorDriverClassNameIsNull() {
        Properties properties = new Properties();
        // Failed to get driver instance for jdbcUrl=$1<masked>$2
        thrown.expect(RuntimeException.class);
        new DriverDataSource("$1<masked>$2", null, properties, "foo", "foo");
    }

    @Test
    public void constructorPasswordIsNull() {
        Properties properties = new Properties();
        // Failed to get driver instance for jdbcUrl=$1<masked>$2
        thrown.expect(RuntimeException.class);
        new DriverDataSource("$1<masked>$2", "foo", properties, "foo", null);
    }

    @Test
    public void constructorUsernameIsNull() {
        Properties properties = new Properties();
        // Failed to get driver instance for jdbcUrl=$1<masked>$2
        thrown.expect(RuntimeException.class);
        new DriverDataSource("$1<masked>$2", "foo", properties, null, "foo");
    }
}
