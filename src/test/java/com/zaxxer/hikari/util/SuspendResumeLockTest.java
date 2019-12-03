package com.zaxxer.hikari.util;

import org.junit.Test;

/**
 * Unit tests for com.zaxxer.hikari.util.SuspendResumeLock
 */

public class SuspendResumeLockTest {

    @Test
    public void acquire() throws java.sql.SQLException {
        SuspendResumeLock suspendResumeLock = new SuspendResumeLock();
        suspendResumeLock.acquire();
    }

    @Test
    public void constructor() {
        SuspendResumeLock suspendResumeLock = new SuspendResumeLock();
        // pojo SuspendResumeLock
    }

    @Test
    public void release() {
        SuspendResumeLock suspendResumeLock = new SuspendResumeLock();
        suspendResumeLock.release();
    }

    @Test
    public void resume() {
        SuspendResumeLock suspendResumeLock = new SuspendResumeLock();
        suspendResumeLock.resume();
    }

    @Test
    public void suspend() {
        SuspendResumeLock suspendResumeLock = new SuspendResumeLock();
        suspendResumeLock.suspend();
    }
}
