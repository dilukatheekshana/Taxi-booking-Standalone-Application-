package controller;
import model.M_add;
public class C_add {
    public void submitVehical(String vno, String vehical, int cost)
    {
        M_add mvreg=new M_add();
        mvreg.submitVehicalData(vno,vehical,cost);
    }
}
