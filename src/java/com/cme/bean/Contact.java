/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.bean;

import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author hp
 */
@ManagedBean
@RequestScoped
public class Contact {
    private String name;
    private String password;
    private String language;
    private String favorite;
    private String detail;
    private String[] Lan =  {"ENGLISH", "ARABIC"};
    private String[] cols = {"Red","White","Blue"};
    private String[] frut = {"Apple","Banana","Watermelon"};
    private String[] favResult;
    
    
    public String[] getLan(){
        return Lan;
    }
    
    public String[] getFavoriteResult(){
        return favResult;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    
    
    

    /**
     * Creates a new instance of Contact
     */
    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    public void setLocal(ValueChangeEvent event){
        Locale l;
        String selectedValue = event.getNewValue().toString(); 
        if (selectedValue.equals("ENGLISH"))
            l = Locale.ENGLISH;
        else
            l = Locale.FRANCE;
        
        FacesContext.getCurrentInstance().getViewRoot().setLocale(l);
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public void displayDetail(ValueChangeEvent event){
        String selectedFav = event.getNewValue().toString();
        
        if(selectedFav.equals("colors"))
            favResult = cols;
        else
            favResult = frut;
        
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    
}
