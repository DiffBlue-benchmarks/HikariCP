package com.zaxxer.hikari.util;

import com.zaxxer.hikari.util.FastList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FastListTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullZeroOutputNullPointerException999b287e26aca24bee3() {

    // Arrange
    final Class<Object> arg0 = null;
    final int arg1 = 0;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new FastList<Object>(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNullPointerException9998921a41ee4e8028e() {

    // Arrange
    final Class<Object> arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new FastList<Object>(arg0);

    // The method is not expected to return due to exception thrown

  }
}
