package javafx.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private final Connection conn;

    private static Connector _instance;

    private Connector() throws ClassNotFoundException, SQLException {
        String host = "jdbc:mysql://localhost:3306/list";
        String user = "root";
        String pwd = "root";
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(host,user,pwd);
    }

    public static Connector getInstance() throws SQLException, ClassNotFoundException {
        if(_instance == null){
            _instance = new Connector();
        }
        return _instance;
    }

    public Connection getConn() {
        return _instance.conn;
    }
}