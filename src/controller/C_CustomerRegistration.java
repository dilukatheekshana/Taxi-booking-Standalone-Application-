package controller;
import model.M_CustomerRegistration;
public class C_CustomerRegistration {
    public void submitcustomer(String cname, String nic, int contact, String address, String gender)
    {
        M_CustomerRegistration mcstreg=new M_CustomerRegistration();
        mcstreg.submitCustomerData(cname,nic,contact,address,gender);
    }
    
}
