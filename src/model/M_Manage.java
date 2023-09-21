
package model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class M_Manage {
    public void manageVehicalData(String vno,String vehical,int cost)
    {
        
        
        try{
            Statement st=MyDatabaseconnection.getMyConnection().createStatement();
            int rowCount = st.executeUpdate("UPDATE vehical SET Vehical_Name = '" + vehical + "', Cost_per_Day = '" + cost + "' WHERE Vehical_Code = '" + vno + "'");

            if(rowCount>0)
            {
                JOptionPane.showMessageDialog(null,"successfully updated");
            }
        }
            catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        
        
        
    }
}
