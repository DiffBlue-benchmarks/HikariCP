package com.zaxxer.hikari;

import java.util.Hashtable;

import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for com.zaxxer.hikari.HikariJNDIFactory
 */

public class HikariJNDIFactoryTest {

    @Test
    public void getObjectInstanceEnvironmentIsEmptyAndNameCtxIsNullAndNameIsNullReturnsNull() throws Exception {
        HikariJNDIFactory hikariJNDIFactory = new HikariJNDIFactory();
        Object obj = new HikariConfig();
        Hashtable<Object, Object> environment = new Hashtable<Object, Object>();
        assertNull(hikariJNDIFactory.getObjectInstance(obj, null, null, environment));
    }
}
