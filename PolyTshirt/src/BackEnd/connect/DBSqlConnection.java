/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBSqlConnection {

    private final String user = "sa";

    private final String pass = "123456";

    private final String database = "watch_store2";

    public DBSqlConnection() {
    }

    public Connection getConnect() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;database=" + database
                    + ";user=" + user
                    + ";password=" + pass
                    + ";encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;";
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("LỖI KẾT NỐI: " + e.getMessage());
            e.printStackTrace(System.out);
            return null;
        }
    }

//    public static void main(String[] args) {
//        try {
//            Connection conn = new DBSqlConnection().getConnect();
//            conn.close();
//        } catch (SQLException ex) {
//            System.err.println("KHÔNG ĐÓNG ĐƯỢC KẾT NỐI :" + ex.getMessage());
//            ex.printStackTrace();
//        }
//    }

}
