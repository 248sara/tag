
package com.cme.common;

import java.io.Serializable;

public class Name implements Serializable{
    private String firstName;
    private String lastName;

     private String menu;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
     
    
    public Name(String first, String last){
        firstName = first;
        lastName = last;
   
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String[] namelist;
    static{
        namelist = new String[10];
        namelist[0] = "Mustafa";
        namelist[1] = "Mohamed";
        namelist[2] = "Khalid";
        namelist[3] = "Hussam";
        namelist[4] = "Tilal";
        namelist[5] = "Zoheir";
        namelist[6] = "Khalid";
        namelist[7] = "Amro";
        namelist[8] = "Ahmed";
        namelist[9] = "Taha";
    }
    
public String[] getNamelist(){
        return namelist;
    }
    
}
