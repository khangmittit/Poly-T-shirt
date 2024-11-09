package BackEnd.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSqlConnection {

    private final String user = "sa";
    private final String pass = "123";
    private final String database = "poly1";

    public DBSqlConnection() {
    }

    public Connection getConnect() {
    try {
        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=" + database + ";"
                + "user=" + user + ";"
                + "password=" + pass + ";"
                + "encrypt=true;trustServerCertificate=true;loginTimeout=30;";
        Connection connection = DriverManager.getConnection(url);
        System.out.println("Kết nối thành công tới cơ sở dữ liệu: " + database);
        return connection;
    } catch (SQLException e) {
        System.err.println("LỖI KẾT NỐI: " + e.getMessage());
        e.printStackTrace(System.out);
        return null;
    }
}


    public static void main(String[] args) {
        DBSqlConnection dbConnection = new DBSqlConnection();
        Connection conn = dbConnection.getConnect();
        
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Kết nối đã được đóng thành công!");
            } catch (SQLException ex) {
                System.err.println("KHÔNG ĐÓNG ĐƯỢC KẾT NỐI: " + ex.getMessage());
                ex.printStackTrace(System.out);
            }
        }
    }
}
