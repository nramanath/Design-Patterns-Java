package designpatterns.structural.facade;

import java.sql.Connection;

/**
 * Created by ramanathan on 04/09/18.
 */
public class MySQLHelper {
    public static Connection getMySQLConnection() {
        // this function will create the MySQL Connection and return it
        return null;
    }

    public void generateHTMLReportForTable(String tableName, Connection connection) {
        // this function will fetch all the information from the table and generate the HTML report
    }

    public void generatePDFReportForTable(String tableName, Connection connection) {
        // this function will fetch all the information from the table and generate the PDF report
    }
}
