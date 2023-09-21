package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class M_add {
   public void submitVehicalData(String vno,String vehical,int cost)
    {
        
        
        try{
            Statement st=MyDatabaseconnection.getMyConnection().createStatement();
            int rowcount=st.executeUpdate("insert into vehical values('"+ vno+"','"+vehical+"','"+cost+"')");
            if(rowcount>0)
            {
                JOptionPane.showMessageDialog(null,"successfully submitted");
            }
        }
            catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"Vehical already their");
        }
        
        
        
        
    }
}
