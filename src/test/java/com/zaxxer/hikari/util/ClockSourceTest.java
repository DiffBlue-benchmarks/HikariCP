package com.zaxxer.hikari.util;

import com.zaxxer.hikari.util.ClockSource.Factory;
import com.zaxxer.hikari.util.ClockSource.MillisecondClockSource;
import com.zaxxer.hikari.util.ClockSource.NanosecondClockSource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;



public class ClockSourceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b4f79987975c7b06() {

    // Act, creating object to test constructor
    final Factory actual = new Factory();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999427182cddeb15bb3() {

    // Act, creating object to test constructor
    final MillisecondClockSource actual = new MillisecondClockSource();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void currentTime0OutputPositive999fe18f3c23a7e41b0() {
//
//    // Arrange
//    final MillisecondClockSource thisObj = new MillisecondClockSource();
//
//    // Act
//    final long actual = thisObj.currentTime0();
//
//    // Assert result
//    Assert.assertEquals(1_572_964_045_227L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void elapsedMillis0InputPositivePositiveOutputZero999ec6be2d5c91fb9db() {

    // Arrange
    final MillisecondClockSource thisObj = new MillisecondClockSource();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    final long actual = thisObj.elapsedMillis0(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void elapsedMillis0InputPositiveOutputPositive9993df0587b209ef323() {
//
//    // Arrange
//    final MillisecondClockSource thisObj = new MillisecondClockSource();
//    final long arg0 = 1L;
//
//    // Act
//    final long actual = thisObj.elapsedMillis0(arg0);
//
//    // Assert result
//    Assert.assertEquals(1_572_964_047_906L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void elapsedNanos0InputPositivePositiveOutputZero999efbfe154df0b4413() {

    // Arrange
    final MillisecondClockSource thisObj = new MillisecondClockSource();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    final long actual = thisObj.elapsedNanos0(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void elapsedNanos0InputPositiveOutputPositive99913f9fc4695abac6c() {
//
//    // Arrange
//    final MillisecondClockSource thisObj = new MillisecondClockSource();
//    final long arg0 = 1L;
//
//    // Act
//    final long actual = thisObj.elapsedNanos0(arg0);
//
//    // Assert result
//    Assert.assertEquals(1_572_964_048_889_000_000L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getSourceTimeUnit0OutputMilliseconds99986ff7ef1f0b22301() {

    // Arrange
    final MillisecondClockSource thisObj = new MillisecondClockSource();

    // Act
    final TimeUnit actual = thisObj.getSourceTimeUnit0();

    // Assert result
    Assert.assertEquals(TimeUnit.MILLISECONDS, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void plusMillis0InputPositivePositiveOutputPositive99968e2edd8a0e9ba8c() {

    // Arrange
    final MillisecondClockSource thisObj = new MillisecondClockSource();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    final long actual = thisObj.plusMillis0(arg0, arg1);

    // Assert result
    Assert.assertEquals(2L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toMillis0InputPositiveOutputPositive99937ca817bf230c4a4() {

    // Arrange
    final MillisecondClockSource thisObj = new MillisecondClockSource();
    final long arg0 = 1L;

    // Act
    final long actual = thisObj.toMillis0(arg0);

    // Assert result
    Assert.assertEquals(1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toNanos0InputPositiveOutputPositive999c9845dd1b432df71() {

    // Arrange
    final MillisecondClockSource thisObj = new MillisecondClockSource();
    final long arg0 = 1L;

    // Act
    final long actual = thisObj.toNanos0(arg0);

    // Assert result
    Assert.assertEquals(1_000_000L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d8c14315091b9be7() {

    // Act, creating object to test constructor
    final NanosecondClockSource actual = new NanosecondClockSource();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void currentTime0OutputPositive9990367e8dd4c1bce8c() {
//
//    // Arrange
//    final NanosecondClockSource thisObj = new NanosecondClockSource();
//
//    // Act
//    final long actual = thisObj.currentTime0();
//
//    // Assert result
//    Assert.assertEquals(18_098_954_969_100L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void elapsedMillis0InputPositivePositiveOutputZero999514aed1c29a877c2() {

    // Arrange
    final NanosecondClockSource thisObj = new NanosecondClockSource();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    final long actual = thisObj.elapsedMillis0(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void elapsedMillis0InputPositiveOutputPositive99996ab82520df746cb() {
//
//    // Arrange
//    final NanosecondClockSource thisObj = new NanosecondClockSource();
//    final long arg0 = 1L;
//
//    // Act
//    final long actual = thisObj.elapsedMillis0(arg0);
//
//    // Assert result
//    Assert.assertEquals(18_096_747L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void elapsedNanos0InputPositivePositiveOutputZero999cedeaab2c7c36f39() {

    // Arrange
    final NanosecondClockSource thisObj = new NanosecondClockSource();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    final long actual = thisObj.elapsedNanos0(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void elapsedNanos0InputPositiveOutputPositive999f323c42778fccb6e() {
//
//    // Arrange
//    final NanosecondClockSource thisObj = new NanosecondClockSource();
//    final long arg0 = 1L;
//
//    // Act
//    final long actual = thisObj.elapsedNanos0(arg0);
//
//    // Assert result
//    Assert.assertEquals(18_101_114_019_825L, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getSourceTimeUnit0OutputNanoseconds99911fa6aafacf9a4dc() {

    // Arrange
    final NanosecondClockSource thisObj = new NanosecondClockSource();

    // Act
    final TimeUnit actual = thisObj.getSourceTimeUnit0();

    // Assert result
    Assert.assertEquals(TimeUnit.NANOSECONDS, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void plusMillis0InputPositivePositiveOutputPositive999251698de03e45d14() {

    // Arrange
    final NanosecondClockSource thisObj = new NanosecondClockSource();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    final long actual = thisObj.plusMillis0(arg0, arg1);

    // Assert result
    Assert.assertEquals(1_000_001L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toMillis0InputPositiveOutputZero999cdaa5e58ffb19667() {

    // Arrange
    final NanosecondClockSource thisObj = new NanosecondClockSource();
    final long arg0 = 1L;

    // Act
    final long actual = thisObj.toMillis0(arg0);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toNanos0InputPositiveOutputPositive999149fa3425e838be9() {

    // Arrange
    final NanosecondClockSource thisObj = new NanosecondClockSource();
    final long arg0 = 1L;

    // Act
    final long actual = thisObj.toNanos0(arg0);

    // Assert result
    Assert.assertEquals(1L, actual);

  }
}
