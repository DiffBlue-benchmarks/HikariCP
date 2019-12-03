package com.zaxxer.hikari.pool;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for com.zaxxer.hikari.pool.HikariProxyStatement
 */

public class HikariProxyStatementTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        assertNull(hikariProxyStatement.getConnection());
    }

    @Test
    public void addBatchThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.addBatch("foo");
    }

    @Test
    public void cancelThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.cancel();
    }

    @Test
    public void clearBatchThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.clearBatch();
    }

    @Test
    public void clearWarningsThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.clearWarnings();
    }

    @Test
    public void closeOnCompletionThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.closeOnCompletion();
    }

    @Test
    public void enquoteIdentifierThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.enquoteIdentifier("foo", true);
    }

    @Test
    public void enquoteLiteralThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.enquoteLiteral("foo");
    }

    @Test
    public void enquoteNCharLiteralThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.enquoteNCharLiteral("foo");
    }

    @Test
    public void execute1() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.execute("foo");
    }

    @Test
    public void execute2() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.execute("foo", 1);
    }

    @Test
    public void execute3() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        int[] x19 = new int[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.execute("foo", x19);
    }

    @Test
    public void execute4() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        String[] x22 = new String[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.execute("foo", x22);
    }

    @Test
    public void executeBatchThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeBatch();
    }

    @Test
    public void executeLargeBatchThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeLargeBatch();
    }

    @Test
    public void executeLargeUpdate1() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeLargeUpdate("foo");
    }

    @Test
    public void executeLargeUpdate2() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeLargeUpdate("foo", 1);
    }

    @Test
    public void executeLargeUpdate3() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        int[] x38 = new int[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeLargeUpdate("foo", x38);
    }

    @Test
    public void executeLargeUpdate4() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        String[] x41 = new String[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeLargeUpdate("foo", x41);
    }

    @Test
    public void executeQueryThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeQuery("foo");
    }

    @Test
    public void executeUpdate1() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeUpdate("foo");
    }

    @Test
    public void executeUpdate2() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeUpdate("foo", 1);
    }

    @Test
    public void executeUpdate3() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        int[] x57 = new int[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeUpdate("foo", x57);
    }

    @Test
    public void executeUpdate4() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        String[] x60 = new String[] { };
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.executeUpdate("foo", x60);
    }

    @Test
    public void getMoreResultsThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.getMoreResults(1);
    }

    @Test
    public void isSimpleIdentifierThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.isSimpleIdentifier("foo");
    }

    @Test
    public void isWrapperForThrows() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.isWrapperFor(java.lang.String.class);
    }

    @Test
    public void setCursorNameToFoo() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setCursorName("foo");
    }

    @Test
    public void setEscapeProcessingToTrue() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setEscapeProcessing(true);
    }

    @Test
    public void setFetchDirectionToOne() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setFetchDirection(1);
    }

    @Test
    public void setFetchSizeToOne() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setFetchSize(1);
    }

    @Test
    public void setLargeMaxRowsToOne() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setLargeMaxRows(1L);
    }

    @Test
    public void setMaxFieldSizeToOne() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setMaxFieldSize(1);
    }

    @Test
    public void setMaxRowsToOne() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setMaxRows(1);
    }

    @Test
    public void setPoolableToTrue() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setPoolable(true);
    }

    @Test
    public void setQueryTimeoutToOne() throws java.sql.SQLException {
        HikariProxyStatement hikariProxyStatement = new HikariProxyStatement(null, null);
        thrown.expect(NullPointerException.class);
        hikariProxyStatement.setQueryTimeout(1);
    }
}
