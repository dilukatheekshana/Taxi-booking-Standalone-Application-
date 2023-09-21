package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class M_CustomerRegistration {
    public void submitCustomerData(String cname,String nic,int contact,String address,String gender)
    {
        
        
        try{
            Statement st=MyDatabaseconnection.getMyConnection().createStatement();
            int rowcount=st.executeUpdate("insert into customer values('"+ cname+"','"+nic+"','"+contact+"','"+address+"','"+gender+"')");
            if(rowcount>0)
            {
                JOptionPane.showMessageDialog(null,"successfully submitted");
            }
        }
            catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"User already exsist");
        }
        
        
        
        
    }
    
}
