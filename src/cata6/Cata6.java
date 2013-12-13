/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cata6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author usuario
 */
public class Cata6 {
    private static final String URL= "";
    private static final String USER= "";
    private static final String PASSWORD= "";
    public static void main(String[] args) throws SQLException {
       DriverManager.registerDriver(new OracleDriver());
       Connection connection;
        connection = DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
