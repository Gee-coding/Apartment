/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment.Apartment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gink
 */
public class MyConnect {
    public static Connection getConnection() {
        try {
            //Class.forName(com.mysql.jdbc.Driver.class.getName());
        return DriverManager.getConnection("jdbc:mysql://db-cluster-do-user-8234643-0.b.db.ondigitalocean.com:25060/prism", "bon", "PZg6vVE6MsSlckJj");
        } catch (SQLException e) {
            e.printStackTrace();
        }return null;
    }
}
