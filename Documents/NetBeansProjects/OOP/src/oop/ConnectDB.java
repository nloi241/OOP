package oop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectDB {
    public static Connection getConnectDB()throws SQLException{
        final String url = "jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false";
        final String user = "root";
        final String password = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     public static void main(String[] args) throws SQLException {
        Connection connection = getConnectDB();
        
        if (connection != null) {
            System.out.println("Data connection successful");
        } else {
            System.out.println("Data connection failed");
        }
    }
    
    
}
