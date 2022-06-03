package com.solvd.lawOffice;


import com.solvd.lawOffice.services.ClientService;
import com.solvd.lawOffice.services.myBatisImpl.ClientServiceImpl;
import com.solvd.lawOffice.utils.MenuService;


public class Main {

    public static void main (String[] args) {



        ClientService cltServ = new ClientServiceImpl();
        cltServ.getClient(1);




        MenuService menServ = new MenuService();
        menServ.menuManagement();

    }
}
