package com.zaxxer.hikari.util;

import com.zaxxer.hikari.util.SuspendResumeLock;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLException;



public class SuspendResumeLockTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acquireOutputVoid999f1960fafb4f1dfad() throws SQLException {

    // Arrange
    final SuspendResumeLock thisObj = new SuspendResumeLock();

    // Act
    thisObj.acquire();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99945ebc9956fbadaa6() {

    // Act, creating object to test constructor
    final SuspendResumeLock actual = new SuspendResumeLock();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void releaseOutputVoid99926155fb2d70e953a() {

    // Arrange
    final SuspendResumeLock thisObj = new SuspendResumeLock();

    // Act
    thisObj.release();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void resumeOutputVoid99915bf3d87857d4838() {

    // Arrange
    final SuspendResumeLock thisObj = new SuspendResumeLock();

    // Act
    thisObj.resume();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void suspendOutputVoid999362c4a6feafd3037() {

    // Arrange
    final SuspendResumeLock thisObj = new SuspendResumeLock();

    // Act
    thisObj.suspend();

    // The method returns void, testing that no exception is thrown

  }
}
