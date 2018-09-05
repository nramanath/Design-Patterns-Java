package designpatterns.structural.facade;

import java.sql.Connection;

/**
 * Created by ramanathan on 04/09/18.
 */
public class DatabaseFacadeHelper {

    public static void generateReport(String tableName, ReportType reportType, DBType dbType) {
        Connection connection = null;
        switch (dbType) {
            case MySQL:
                connection = MySQLHelper.getMySQLConnection();
                MySQLHelper mySQLHelper = new MySQLHelper();
                switch (reportType) {
                    case HTML:
                        mySQLHelper.generateHTMLReportForTable(tableName, connection);
                        break;
                    case PDF:
                        mySQLHelper.generatePDFReportForTable(tableName, connection);
                        break;
                }
                break;
            case MongoDB:
                connection = MongoDBHelper.getMySQLConnection();
                MongoDBHelper mongoDBHelper = new MongoDBHelper();
                switch (reportType) {
                    case HTML:
                        mongoDBHelper.generateHTMLReportForTable(tableName, connection);
                        break;
                    case PDF:
                        mongoDBHelper.generatePDFReportForTable(tableName, connection);
                        break;
                }
                break;
        }
    }

    public static enum ReportType {
        HTML, PDF;
    }

    public static enum DBType {
        MySQL, MongoDB;
    }
}
