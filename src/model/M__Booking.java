package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class M__Booking 
{
    public void submitmorder(int rec_number, String nic, String name, String vtype, int duration,String date,int cost)
    {
        
        
        try{
            Statement st=MyDatabaseconnection.getMyConnection().createStatement();
            int rowcount=st.executeUpdate("insert into new_order values('"+rec_number+"','"+nic+"','"+name+"','"+vtype+"','"+duration+"','"+date+"','"+cost+"')");
            if(rowcount>0)
            {
                JOptionPane.showMessageDialog(null,"order successfull");
            }
        }
            catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"Connection Issue");
        }
    }
}
    

