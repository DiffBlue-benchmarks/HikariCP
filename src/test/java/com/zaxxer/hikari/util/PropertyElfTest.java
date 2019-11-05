package com.zaxxer.hikari.util;

import com.zaxxer.hikari.util.PropertyElf;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Properties;



public class PropertyElfTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c8dc0354a9e9d95c() {

    // Act, creating object to test constructor
    final PropertyElf actual = new PropertyElf();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void copyPropertiesInputNotNullOutput199905905fbb4eaf9b04() {

    // Arrange
    final Properties arg0 = new Properties();
    arg0.put("", "");

    // Act
    final Properties actual = PropertyElf.copyProperties(arg0);

    // Assert result
    final Properties properties = new Properties();
    properties.setProperty("", "");
    Assert.assertEquals(properties, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPropertyNamesInputNullOutputNullPointerException9992292d0399450d606() {

    // Arrange
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    PropertyElf.getPropertyNames(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPropertyInputNotNullNotNullOutputVoid9998c23254cd3333a42() {

    // Arrange
    final String arg0 = "";
    final Object arg1 = "";

    // Act
    final Object actual = PropertyElf.getProperty(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTargetFromPropertiesInputNotNullNotNullOutputStringIndexOutOfBoundsException99940af326c9c6427b7() {

    // Arrange
    final Object arg0 = "";
    final Properties arg1 = new Properties();
    arg1.put("", "");

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    PropertyElf.setTargetFromProperties(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
