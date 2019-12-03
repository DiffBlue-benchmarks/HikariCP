package com.zaxxer.hikari.util;

import org.junit.Test;

/**
 * Unit tests for com.zaxxer.hikari.util.JavassistProxyFactory
 */

public class JavassistProxyFactoryTest {

    @Test
    public void mainArgsIsEmpty() {
        JavassistProxyFactory.main();
    }

    @Test
    public void mainArgsIsFoo() {
        JavassistProxyFactory.main("foo");
    }
}
