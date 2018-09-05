package designpatterns.structural.facade;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by ramanathan on 04/09/18.
 */
public class FacadeDesignPatternTest {
    static String tableName;

    @BeforeAll
    static void setUp() {
        tableName = "employee";
    }

    @DisplayName("Calling MySQLHelper Without Facade Helper")
    @Test()
    void testMySQLHelper() {
        Connection con = MySQLHelper.getMySQLConnection();
        MySQLHelper mySQLHelper = new MySQLHelper();
        mySQLHelper.generateHTMLReportForTable(tableName, con);
        assertTrue(Boolean.TRUE);
    }

    @DisplayName("Calling MongoDBHelper Without Facade Helper")
    @Test()
    void testMongoDBHelper() {
        Connection con = MongoDBHelper.getMySQLConnection();
        MongoDBHelper mongoDBHelper = new MongoDBHelper();
        mongoDBHelper.generateHTMLReportForTable(tableName, con);
        assertTrue(Boolean.TRUE);
    }

    @DisplayName("Calling MongoDBHelper Without Facade Helper")
    @Test()
    void testFacadeHelper() {
        DatabaseFacadeHelper.generateReport(tableName, DatabaseFacadeHelper.ReportType.HTML, DatabaseFacadeHelper.DBType.MySQL);
        DatabaseFacadeHelper.generateReport(tableName, DatabaseFacadeHelper.ReportType.PDF, DatabaseFacadeHelper.DBType.MongoDB);
        assertTrue(Boolean.TRUE);
    }
}
