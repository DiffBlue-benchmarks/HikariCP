package com.zaxxer.hikari.util;

import java.util.Properties;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.util.PropertyElf
 */

public class PropertyElfTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void copyProperties() {
        Properties props = new Properties();
        props.setProperty("foo", "foo");
        Properties result = PropertyElf.copyProperties(props);
        assertFalse(result.isEmpty());
    }

    @Test
    public void copyPropertiesPropsIsEmptyReturnsEmpty() {
        Properties props = new Properties();
        Properties result = PropertyElf.copyProperties(props);
        assertTrue(result.isEmpty());
    }

    @Test
    public void getPropertyNamesTargetClassIsClassReturnsEmpty() {
        java.util.Set<String> result = PropertyElf.getPropertyNames(java.lang.Object.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void getPropertyPropNameIsFooAndTargetIsEmptyReturnsNull() {
        java.lang.reflect.Method[] target = new java.lang.reflect.Method[] { };
        assertNull(PropertyElf.getProperty("foo", target));
    }

    @Test
    public void setTargetFromProperties2() {
        Object target = new com.zaxxer.hikari.HikariConfig();
        Properties properties = new Properties();
        properties.setProperty("dataSource.", "foo");
        PropertyElf.setTargetFromProperties(target, properties);
    }

    @Test
    public void setTargetFromPropertiesPropertiesIsEmptyAndTargetIsEmpty() {
        java.lang.reflect.Method[] target = new java.lang.reflect.Method[] { };
        Properties properties = new Properties();
        PropertyElf.setTargetFromProperties(target, properties);
    }

    @Test
    public void setTargetFromPropertiesPropertiesIsEmptyAndTargetIsNull() {
        Properties properties = new Properties();
        PropertyElf.setTargetFromProperties(null, properties);
    }

    @Test
    public void setTargetFromPropertiesPropertiesIsNullAndTargetIsEmpty() {
        java.lang.reflect.Method[] target = new java.lang.reflect.Method[] { };
        PropertyElf.setTargetFromProperties(target, null);
    }

    @Test
    public void setTargetFromProperties1() {
        Properties properties1 = new Properties();
        properties1.setProperty("bar", "foo");
        // Property bar does not exist on target class com.zaxxer.hikari.HikariConfig
        thrown.expect(RuntimeException.class);
        new com.zaxxer.hikari.HikariConfig(properties1);
    }

    @Test
    public void setTargetFromPropertiesTargetIsEmptyThrows() {
        java.lang.reflect.Method[] target = new java.lang.reflect.Method[] { };
        Properties properties = new Properties();
        properties.setProperty("bar", "foo");
        // Property bar does not exist on target class [Ljava.lang.reflect.Method;
        thrown.expect(RuntimeException.class);
        PropertyElf.setTargetFromProperties(target, properties);
    }
}
