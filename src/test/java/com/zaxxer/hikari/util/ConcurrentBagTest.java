package com.zaxxer.hikari.util;

import com.diffblue.deeptestutils.Reflector;
import com.zaxxer.hikari.util.ConcurrentBag.IBagStateListener;
import com.zaxxer.hikari.util.ConcurrentBag.IConcurrentBagEntry;
import com.zaxxer.hikari.util.ConcurrentBag;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class ConcurrentBagTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addInputNullOutputVoid99964ea35d39514d5f6() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final ConcurrentBag.IConcurrentBagEntry arg0 = null;

    // Act
    thisObj.add(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void borrowInputPositiveNanosecondsOutputNullPointerException9996564162b0bbefcc4() throws InterruptedException {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final long arg0 = 10_000L;
    final TimeUnit arg1 = TimeUnit.NANOSECONDS;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.borrow(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid99941167a454cca089e() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);

    // Act
    thisObj.close();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull99919388ce9031daff0() {

    // Arrange
    final ConcurrentBag.IBagStateListener arg0 = null;

    // Act, creating object to test constructor
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> actual = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void dumpStateOutputVoid9995e31ac394d5c75a6() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);

    // Act
    thisObj.dumpState();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCountInputNegativeOutputZero9990584e3c2bc7cee30() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final int arg0 = -2;

    // Act
    final int actual = thisObj.getCount(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStateCountsOutput6999033e27a7784861c5() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);

    // Act
    final int[] actual = thisObj.getStateCounts();

    // Assert result
    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getWaitingThreadCountOutputZero999abd60fe41a08ce01() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);

    // Act
    final int actual = thisObj.getWaitingThreadCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputNullOutputNullPointerException9998dfab6ad2cc7b5f0() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final ConcurrentBag.IConcurrentBagEntry arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.remove(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void requiteInputNullOutputNullPointerException9993f3c937757b62a60() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final ConcurrentBag.IConcurrentBagEntry arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.requite(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reserveInputNullOutputNullPointerException999831ad8eea47d3361() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final ConcurrentBag.IConcurrentBagEntry arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.reserve(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sizeOutputZero999594c939d5fe32931() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);

    // Act
    final int actual = thisObj.size();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void unreserveInputNullOutputNullPointerException99980a5ac3dcd899d99() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final ConcurrentBag.IConcurrentBagEntry arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.unreserve(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void valuesOutputNotNull999082dc561a0398dc6() {
//
//    // Arrange
//    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
//
//    // Act
//    final List<ConcurrentBag.IConcurrentBagEntry> actual = thisObj.values();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void valuesInputNegativeOutput0999fbab16cdccb54f45() {

    // Arrange
    final ConcurrentBag<ConcurrentBag.IConcurrentBagEntry> thisObj = new ConcurrentBag<ConcurrentBag.IConcurrentBagEntry>(null);
    final int arg0 = -2;

    // Act
    final List<ConcurrentBag.IConcurrentBagEntry> actual = thisObj.values(arg0);

    // Assert result
    final ArrayList<ConcurrentBag.IConcurrentBagEntry> arrayList = new ArrayList<ConcurrentBag.IConcurrentBagEntry>();
    Assert.assertEquals(arrayList, actual);

  }
}
