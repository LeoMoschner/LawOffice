package com.solvd.lawOffice.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Menu {

    private final static Logger LOGGER = LogManager.getLogger(Menu.class);
    private final String statement;
    private final int options;
    private int selection;

    public Menu (String statement, int options){
        this.statement = statement;
        this.options = options;
    }

    public int getSelection() {
        return this.selection;
    }

    @Override
    public String toString() {
        return this.statement;
    }

    public void displayMenu() {
        LOGGER.info(this.toString());
        String userInput = userInput();
        this.selection = Integer.parseInt(checkSelections(userInput));
    }

    private String userInput(){
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            String scannerSelection = input.nextLine();
            return scannerSelection;
        }
        input.close();
        return null;
    }

    private String checkSelections(String inputSelection) {

        if(inputSelection.isEmpty()) {
            throw new RuntimeException();   //null
        }else {
            if(inputSelection.matches("[+-]?\\d*")){

                if (Integer.parseInt(inputSelection) > 0 && Integer.parseInt(inputSelection) <= this.options){
                    return inputSelection;
                }else {
                    throw new RuntimeException(); // number out of range
                }
            }else {
                throw new RuntimeException(); // not a number
            }
        }
    }
}
