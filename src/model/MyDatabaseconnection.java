package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class MyDatabaseconnection {
    static Connection con;
    public static Connection getMyConnection()
    {
        try{
            String dbpath="jdbc:mysql://localhost/taxi";
            con=DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return con;
    }
}
