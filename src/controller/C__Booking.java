package controller;
import model.M__Booking;

public class C__Booking 
{
    public void submitcorder(int rec_number, String nic, String name, String vtype, int duration,String date,int cost)
    {
        M__Booking mcstreg = new M__Booking();
        mcstreg.submitmorder(rec_number,nic,name,vtype,duration,date,cost);
    }
    
}
