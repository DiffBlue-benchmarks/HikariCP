package com.zaxxer.hikari.util;

import com.zaxxer.hikari.util.JavassistProxyFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class JavassistProxyFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991bcf74d6e8f79c59() {

    // Act, creating object to test constructor
    final JavassistProxyFactory actual = new JavassistProxyFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99972a155d3acf5eb33() {

    // Arrange
    final String[] arg0 = { "", "", "" };

    // Act
    JavassistProxyFactory.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
