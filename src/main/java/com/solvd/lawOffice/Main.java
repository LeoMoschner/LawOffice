package com.solvd.lawOffice;

import com.solvd.lawOffice.utils.MenuService;

public class Main {

    public static void main(String[] args) {
        MenuService menServ = new MenuService();
        while (menServ.menuManagement()) {
        }
    }
}
