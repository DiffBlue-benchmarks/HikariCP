package com.zaxxer.hikari;

import com.zaxxer.hikari.HikariJNDIFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.Hashtable;
import javax.naming.CompositeName;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class HikariJNDIFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994dd20ef7b3082841() {

    // Act, creating object to test constructor
    final HikariJNDIFactory actual = new HikariJNDIFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInstanceInputNotNullNotNullNotNullNotNullOutputVoid99919d7a64042171b0c() throws Exception, NamingException {

    // Arrange
    final HikariJNDIFactory thisObj = new HikariJNDIFactory();
    final Object arg0 = "JNDI context does not found for dataSourceJNDI : ";
    final CompositeName arg1 = new CompositeName();
    final InitialContext arg2 = new InitialContext();
    final Hashtable<Object, Object> arg3 = new Hashtable<Object, Object>();
    arg3.put("JNDI context does not found for dataSourceJNDI : ", "JNDI context does not found for dataSourceJNDI : ");

    // Act
    final Object actual = thisObj.getObjectInstance(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }
}
