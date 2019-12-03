package com.zaxxer.hikari.pool;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.pool.HikariProxyPreparedStatement
 */

public class HikariProxyPreparedStatementTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        assertNull(hikariProxyPreparedStatement.getConnection());
    }

    @Test
    public void addBatch1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.addBatch();
    }

    @Test
    public void addBatch2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.addBatch("foo");
    }

    @Test
    public void cancelThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.cancel();
    }

    @Test
    public void clearBatchThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.clearBatch();
    }

    @Test
    public void clearParametersThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.clearParameters();
    }

    @Test
    public void clearWarningsThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.clearWarnings();
    }

    @Test
    public void closeOnCompletionThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.closeOnCompletion();
    }

    @Test
    public void enquoteIdentifierThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.enquoteIdentifier("foo", true);
    }

    @Test
    public void enquoteLiteralThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.enquoteLiteral("foo");
    }

    @Test
    public void enquoteNCharLiteralThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.enquoteNCharLiteral("foo");
    }

    @Test
    public void execute1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.execute();
    }

    @Test
    public void execute2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.execute("foo");
    }

    @Test
    public void execute3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.execute("foo", 1);
    }

    @Test
    public void execute4() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        int[] x20 = new int[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.execute("foo", x20);
    }

    @Test
    public void execute5() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        String[] x23 = new String[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.execute("foo", x23);
    }

    @Test
    public void executeBatchThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeBatch();
    }

    @Test
    public void executeLargeBatchThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeLargeBatch();
    }

    @Test
    public void executeLargeUpdate1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeLargeUpdate();
    }

    @Test
    public void executeLargeUpdate2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeLargeUpdate("foo");
    }

    @Test
    public void executeLargeUpdate3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeLargeUpdate("foo", 1);
    }

    @Test
    public void executeLargeUpdate4() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        int[] x40 = new int[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeLargeUpdate("foo", x40);
    }

    @Test
    public void executeLargeUpdate5() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        String[] x43 = new String[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeLargeUpdate("foo", x43);
    }

    @Test
    public void executeQuery1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeQuery();
    }

    @Test
    public void executeQuery2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeQuery("foo");
    }

    @Test
    public void executeUpdate1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeUpdate();
    }

    @Test
    public void executeUpdate2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeUpdate("foo");
    }

    @Test
    public void executeUpdate3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeUpdate("foo", 1);
    }

    @Test
    public void executeUpdate4() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        int[] x61 = new int[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeUpdate("foo", x61);
    }

    @Test
    public void executeUpdate5() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        String[] x64 = new String[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.executeUpdate("foo", x64);
    }

    @Test
    public void getMoreResultsThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.getMoreResults(1);
    }

    @Test
    public void isSimpleIdentifierThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.isSimpleIdentifier("foo");
    }

    @Test
    public void isWrapperForThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.isWrapperFor(java.lang.String.class);
    }

    @Test
    public void setArrayThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setArray(1, null);
    }

    @Test
    public void setAsciiStream1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x101 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setAsciiStream(1, x101);
    }

    @Test
    public void setAsciiStream2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x104 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setAsciiStream(1, x104, 1);
    }

    @Test
    public void setAsciiStream3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x108 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setAsciiStream(1, x108, 1L);
    }

    @Test
    public void setBigDecimalThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBigDecimal(1, null);
    }

    @Test
    public void setBinaryStream1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x114 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBinaryStream(1, x114);
    }

    @Test
    public void setBinaryStream2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x117 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBinaryStream(1, x117, 1);
    }

    @Test
    public void setBinaryStream3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x121 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBinaryStream(1, x121, 1L);
    }

    @Test
    public void setBlob1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x125 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBlob(1, x125);
    }

    @Test
    public void setBlob2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x128 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBlob(1, x128, 1L);
    }

    @Test
    public void setBlob3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBlob(1, (java.sql.Blob)null);
    }

    @Test
    public void setBooleanThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBoolean(1, true);
    }

    @Test
    public void setBytesThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        byte[] x138 = new byte[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setBytes(1, x138);
    }

    @Test
    public void setByteThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setByte(1, (byte)1);
    }

    @Test
    public void setCharacterStream1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x140 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setCharacterStream(1, x140);
    }

    @Test
    public void setCharacterStream2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x143 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setCharacterStream(1, x143, 1);
    }

    @Test
    public void setCharacterStream3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x147 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setCharacterStream(1, x147, 1L);
    }

    @Test
    public void setClob1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x151 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setClob(1, x151);
    }

    @Test
    public void setClob2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x154 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setClob(1, x154, 1L);
    }

    @Test
    public void setClob3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setClob(1, (java.sql.Clob)null);
    }

    @Test
    public void setCursorNameToFoo() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setCursorName("foo");
    }

    @Test
    public void setDate1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.sql.Date x161 = new java.sql.Date(1L);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setDate(1, x161);
    }

    @Test
    public void setDate2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.sql.Date x167 = new java.sql.Date(1L);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setDate(1, x167, null);
    }

    @Test
    public void setDoubleThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setDouble(1, 1.0);
    }

    @Test
    public void setEscapeProcessingToTrue() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setEscapeProcessing(true);
    }

    @Test
    public void setFetchDirectionToOne() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setFetchDirection(1);
    }

    @Test
    public void setFetchSizeToOne() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setFetchSize(1);
    }

    @Test
    public void setFloatThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setFloat(1, 1.0f);
    }

    @Test
    public void setIntThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setInt(1, 1);
    }

    @Test
    public void setLargeMaxRowsToOne() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setLargeMaxRows(1L);
    }

    @Test
    public void setLongThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setLong(1, 1L);
    }

    @Test
    public void setMaxFieldSizeToOne() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setMaxFieldSize(1);
    }

    @Test
    public void setMaxRowsToOne() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setMaxRows(1);
    }

    @Test
    public void setNCharacterStream1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x188 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNCharacterStream(1, x188);
    }

    @Test
    public void setNCharacterStream2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x191 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNCharacterStream(1, x191, 1L);
    }

    @Test
    public void setNClob1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x195 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNClob(1, x195);
    }

    @Test
    public void setNClob2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringReader x198 = new java.io.StringReader("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNClob(1, x198, 1L);
    }

    @Test
    public void setNClob3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNClob(1, (java.sql.NClob)null);
    }

    @Test
    public void setNStringThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNString(1, "foo");
    }

    @Test
    public void setNull1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNull(1, 1);
    }

    @Test
    public void setNull2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setNull(1, 1, "foo");
    }

    @Test
    public void setObject1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        byte[] x211 = new byte[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setObject(1, x211);
    }

    @Test
    public void setObject2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        byte[] x217 = new byte[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setObject(1, x217, 1);
    }

    @Test
    public void setObject3() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        byte[] x224 = new byte[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setObject(1, x224, 1, 1);
    }

    @Test
    public void setObject4() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        byte[] x232 = new byte[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setObject(1, x232, (java.sql.SQLType)null);
    }

    @Test
    public void setObject5() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        byte[] x239 = new byte[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setObject(1, x239, (java.sql.SQLType)null, 1);
    }

    @Test
    public void setPoolableToTrue() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setPoolable(true);
    }

    @Test
    public void setQueryTimeoutToOne() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setQueryTimeout(1);
    }

    @Test
    public void setRefThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setRef(1, null);
    }

    @Test
    public void setRowIdThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setRowId(1, null);
    }

    @Test
    public void setShortThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setShort(1, (short)1);
    }

    @Test
    public void setSQLXMLThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setSQLXML(1, null);
    }

    @Test
    public void setStringThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setString(1, "foo");
    }

    @Test
    public void setTime1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.sql.Time x259 = new java.sql.Time(1L);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setTime(1, x259);
    }

    @Test
    public void setTime2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.sql.Time x265 = new java.sql.Time(1L);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setTime(1, x265, null);
    }

    @Test
    public void setTimestamp1() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.sql.Timestamp x272 = new java.sql.Timestamp(1L);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setTimestamp(1, x272);
    }

    @Test
    public void setTimestamp2() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.sql.Timestamp x282 = new java.sql.Timestamp(1L);
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setTimestamp(1, x282, null);
    }

    @Test
    public void setUnicodeStreamThrows() throws java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.io.StringBufferInputStream x296 = new java.io.StringBufferInputStream("foo");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setUnicodeStream(1, x296, 1);
    }

    @Test
    public void setURLThrows() throws java.net.MalformedURLException, java.sql.SQLException {
        HikariProxyPreparedStatement hikariProxyPreparedStatement = new HikariProxyPreparedStatement(null, null);
        java.net.URL x293 = new java.net.URL("http://www.test.com/");
        thrown.expect(NullPointerException.class);
        hikariProxyPreparedStatement.setURL(1, x293);
    }
}
