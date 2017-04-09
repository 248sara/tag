/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.bean;

import com.cme.common.Name;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author hp
 */
@ManagedBean
@SessionScoped
public class TableData implements Serializable{
    private ArrayList<Name> names;
//    private Name[] names;
//    private DataModel<Name> model = new ArrayDataModel<Name>(names);
//    public DataModel<Name> getNames() { return model; }
    
    /**
     * Creates a new instance of TableData
     */
    public TableData() {
        names = new ArrayList<Name>(Arrays.asList(
        new Name("Mustafa","Ahmed"),
        new Name("Mohamed","Ali"),
        new Name("Khalid","Hassan"),
        new Name("Hussam","Ali"),
        new Name("Tilal","Ali"),
        new Name("Zoheir","Khalid"),
        new Name("Khalid","Mustafa"),
        new Name("Amro","Mustafa"),
        new Name("Ahmed","Osama"),
        new Name("Taha","Mohammed")));}
        
//        names = new Name[10];
//        names[0] = new Name("Mustafa","Ahmed");
//        names[1] = new Name("Mohamed","Ali");
//        names[2] = new Name("Khalid","Hassan");
//        names[3] = new Name("Hussam","Ali");
//        names[4] = new Name("Tilal","Ali");
//        names[5] = new Name("Zoheir","Khalid");
//        names[6] = new Name("Khalid","Mustafa");
//        names[7] = new Name("Amro","Mustafa");
//        names[8] = new Name("Ahmed","Osama");
//        names[9] = new Name("Taha","Mohammed");
//        
//    }
//    public Name[] getNames() {
//        return names;
//    }
    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }
    

//    public void setNames(Name[] names) {
//        this.names = names;
//    }

   public String deleteRow(Name name){
       boolean removed = names.remove(name);
       System.out.println("Removed: "+removed);
       return null;
   }
    
   
    
}
