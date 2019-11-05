package com.zaxxer.hikari.hibernate;

import com.zaxxer.hikari.hibernate.HikariConnectionProvider;
import org.hibernate.HibernateException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;



public class HikariConnectionProviderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void closeConnectionInputNullOutputNullPointerException9996d8a10ce654a3a5b() throws SQLException {

    // Arrange
    final HikariConnectionProvider thisObj = new HikariConnectionProvider();
    final Connection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.closeConnection(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void configureInputNotNullOutputHibernateException999cd8dda794b5c7461() throws HibernateException {

    // Arrange
    final HikariConnectionProvider thisObj = new HikariConnectionProvider();
    final HashMap<Object, Object> arg0 = new HashMap<Object, Object>();
    arg0.put("4.3.6", "4.3.6");

    // Act
    thrown.expect(HibernateException.class);
    thisObj.configure(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99948b60690af7a170d() {

    // Act, creating object to test constructor
    final HikariConnectionProvider actual = new HikariConnectionProvider();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getConnectionOutputVoid99910bd9a53bdffe308() throws SQLException {

    // Arrange
    final HikariConnectionProvider thisObj = new HikariConnectionProvider();

    // Act
    final Connection actual = thisObj.getConnection();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isUnwrappableAsInputNullOutputNullPointerException99907ec3ed0153ec27a() {

    // Arrange
    final HikariConnectionProvider thisObj = new HikariConnectionProvider();
    final Class arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.isUnwrappableAs(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void stopOutputNullPointerException999ac0f69a467123a73() {

    // Arrange
    final HikariConnectionProvider thisObj = new HikariConnectionProvider();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.stop();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void supportsAggressiveReleaseOutputFalse999e6bf5f1df17c3594() {

    // Arrange
    final HikariConnectionProvider thisObj = new HikariConnectionProvider();

    // Act
    final boolean actual = thisObj.supportsAggressiveRelease();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void unwrapInputNullOutputNullPointerException9995e442534b8baa7e5() {

    // Arrange
    final HikariConnectionProvider thisObj = new HikariConnectionProvider();
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.unwrap(arg0);

    // The method is not expected to return due to exception thrown

  }
}
