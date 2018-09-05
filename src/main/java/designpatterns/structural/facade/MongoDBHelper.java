package designpatterns.structural.facade;

import java.sql.Connection;

/**
 * Created by ramanathan on 04/09/18.
 */
public class MongoDBHelper {

    public static Connection getMySQLConnection() {
        // this function will create the MongoDB Connection and return it
        return null;
    }

    public void generateHTMLReportForTable(String collctionName, Connection connection) {
        // this function will fetch all the information from the collection and generate the HTML report
    }

    public void generatePDFReportForTable(String collectionName, Connection connection) {
        // this function will fetch all the information from the collection and generate the PDF report
    }

}
