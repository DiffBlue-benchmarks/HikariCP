package com.zaxxer.hikari.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.util.UtilityElf
 */

public class UtilityElfTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createInstanceClassNameIsNullReturnsNull() {
        assertNull(UtilityElf.<java.lang.String>createInstance(null, java.lang.String.class));
    }

    @Test
    public void getNullIfEmptyTextIsFooReturnsFoo() {
        assertEquals("foo", UtilityElf.getNullIfEmpty("foo"));
    }

    @Test
    public void quietlySleepMillisIsOne() {
        UtilityElf.quietlySleep(1L);
    }

    @Test
    public void safeIsAssignableFromClassNameIsFooAndObjIsEmptyReturnsFalse() {
        Class[] obj = new Class[] { };
        assertFalse(UtilityElf.safeIsAssignableFrom(obj, "foo"));
    }

    @Test
    public void createInstanceClassNameIsFooThrows() {
        // java.lang.ClassNotFoundException: foo
        thrown.expect(RuntimeException.class);
        UtilityElf.<java.lang.String>createInstance("foo", java.lang.String.class);
    }

    @Test
    public void createThreadPoolExecutorQueueIsNull() {
        thrown.expect(NullPointerException.class);
        UtilityElf.createThreadPoolExecutor((java.util.concurrent.BlockingQueue<Runnable>)null, "foo", (java.util.concurrent.ThreadFactory)null, (java.util.concurrent.RejectedExecutionHandler)null);
    }

    @Test
    public void createThreadPoolExecutorQueueSizeIsOne() {
        thrown.expect(NullPointerException.class);
        UtilityElf.createThreadPoolExecutor(1, "foo", (java.util.concurrent.ThreadFactory)null, (java.util.concurrent.RejectedExecutionHandler)null);
    }

    @Test
    public void getTransactionIsolationTransactionIsolationNameIsFooThrows() {
        // Invalid transaction isolation value: foo
        thrown.expect(IllegalArgumentException.class);
        UtilityElf.getTransactionIsolation("foo");
    }
}
