package com.zaxxer.hikari.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.util.ConcurrentBag
 */

public class ConcurrentBagTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addBagEntryIsFoo() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        concurrentBag.add("foo");
    }

    @Test
    public void addBagEntryIsNull() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        concurrentBag.add(null);
    }

    @Test
    public void close() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        concurrentBag.close();
    }

    @Test
    public void constructorListenerIsNull() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0 }, concurrentBag.getStateCounts());
        assertEquals(0, concurrentBag.getWaitingThreadCount());
    }

    @Test
    public void dumpState() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        concurrentBag.dumpState();
    }

    @Test
    public void getCountStateIsOneReturnsZero() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        assertEquals(0, concurrentBag.getCount(1));
    }

    @Test
    public void sizeReturnsZero() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        assertEquals(0, concurrentBag.size());
    }

    @Test
    public void values() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        java.util.List<String> result = concurrentBag.values();
        assertTrue(result.isEmpty());
    }

    @Test
    public void valuesStateIsOne() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        java.util.List<String> result = concurrentBag.values(1);
        assertTrue(result.isEmpty());
    }

    @Test
    public void borrowTimeUnitIsNANOSECONDSAndTimeoutIsOneThrows() throws InterruptedException {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        thrown.expect(NullPointerException.class);
        concurrentBag.borrow(1L, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    @Test
    public void removeBagEntryIsFooThrows() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        // Class java.lang.String does not implement the requested interface com.zaxxer.hikari.util.ConcurrentBag$IConcurrentBagEntry
        thrown.expect(IncompatibleClassChangeError.class);
        concurrentBag.remove("foo");
    }

    @Test
    public void requiteBagEntryIsFooThrows() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        // Class java.lang.String does not implement the requested interface com.zaxxer.hikari.util.ConcurrentBag$IConcurrentBagEntry
        thrown.expect(IncompatibleClassChangeError.class);
        concurrentBag.requite("foo");
    }

    @Test
    public void reserveBagEntryIsFooThrows() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        // Class java.lang.String does not implement the requested interface com.zaxxer.hikari.util.ConcurrentBag$IConcurrentBagEntry
        thrown.expect(IncompatibleClassChangeError.class);
        concurrentBag.reserve("foo");
    }

    @Test
    public void unreserveBagEntryIsFooThrows() {
        ConcurrentBag<String> concurrentBag = new ConcurrentBag<String>(null);
        // Class java.lang.String does not implement the requested interface com.zaxxer.hikari.util.ConcurrentBag$IConcurrentBagEntry
        thrown.expect(IncompatibleClassChangeError.class);
        concurrentBag.unreserve("foo");
    }
}
