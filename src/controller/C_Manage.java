package controller;

import model.M_Manage;

public class C_Manage {
    public void manageVehical(String vno, String vehical, int cost)
    {
        M_Manage mmreg=new M_Manage();
        mmreg.manageVehicalData(vno,vehical,cost);
    }
}
