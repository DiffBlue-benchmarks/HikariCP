package com.zaxxer.hikari.util;

import com.zaxxer.hikari.util.DriverDataSource;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Properties;



public class DriverDataSourceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullNotNullNotNullOutputRuntimeException999a2d2d3330d5f0b41() {

    // Arrange
    final String arg0 = " claims to not accept jdbcUrl, ";
    final String arg1 = " claims to not accept jdbcUrl, ";
    final Properties arg2 = new Properties();
    arg2.put(" claims to not accept jdbcUrl, ", " claims to not accept jdbcUrl, ");
    final String arg3 = " claims to not accept jdbcUrl, ";
    final String arg4 = " claims to not accept jdbcUrl, ";

    // Act, creating object to test constructor
    thrown.expect(RuntimeException.class);
    new DriverDataSource(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }
}
