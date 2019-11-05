package com.zaxxer.hikari.hibernate;

import com.zaxxer.hikari.hibernate.HikariConfigurationUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class HikariConfigurationUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99933c8c4456a3a9852() {

    // Act, creating object to test constructor
    final HikariConfigurationUtil actual = new HikariConfigurationUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void loadConfigurationInputNotNullOutputStringIndexOutOfBoundsException9996139fe38d39b728f() {

    // Arrange
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("hibernate.hikari.", "hibernate.hikari.");

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    HikariConfigurationUtil.loadConfiguration(arg0);

    // The method is not expected to return due to exception thrown

  }
}
