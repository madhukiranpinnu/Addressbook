package com.mphasis.main;

import com.mphasis.Controller.Controller;

import java.util.Scanner;
/*@Author:p.madhukiran
 * @Date:26-10-2020
 * @project:address book project*/

public class Main {
    /*Functionality:mainmenu used to
     *     implement mainmenu of addressbook*/
    public static void mainmenu(){
        System.out.println("welcome to main of addressbook choose an option :");
        System.out.println(" Case1:Create a new addressbook " +
                ", Case2:Open an existing addressbook ,"
                + "Case3:Save an addressbook , " +
                "Case4:Save an addressbook as ," +
                " Case5:Close adddressbook" +
                ", case 6:Quit");
        System.out.println("choose a case");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        switch (input){
            case 1:
                Controller.create();
                break;
            case 2:
                Controller.Openaddressbook();
                break;
            case 3:
                Controller.save();
                break;
            case 4:
                Controller.saveAS();
                break;
            case 5:
                Controller.close();
                break;
            case 6:
                Controller.quit();
                break;
        }
    }
    /*Functionality:main method of Main class*/
    public static void main(String[] args) { ;
        Main.mainmenu();
    }
}