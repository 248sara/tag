/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.bean;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.validation.constraints.Max;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author hp
 */
@ManagedBean
@SessionScoped
public class Customer {
    private String name;
    private String email;
    private int yearOfBirth;
    private String[] languague;
    private enum langs {ARABIC,ENGLISH,FRENCH,SPANISH};
    private langs skillLanguage;
    private String status;
    private Service[] myService;
    @Min(2)@Max(4000)
    private Double amount;
    @Min(1)@Max(200)
    private Double usd;

//    private Map[]<String,Service> listService;
//    private static Map[]<String,Service> listService;
//    static{
//        listService = new  Map[3]<String, Service>;
//        listService.put("17301",new Service("Kwal Sudania","أقوال سودانية"));
//        listService.put("17302",new Service("Kwal Alamia","أقوال عالمية"));
//        listService.put("17303",new Service("MyChild","طفلي"));
//    }
//    
//    public Map[]<String,Service> getListService(){
//        return listService;
//    }
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double uSDAmount) {
        this.usd = uSDAmount;
    }
    
    
    
    private static Service[] listService;
    static{
        listService = new Service[4];
        listService[0] = new Service("KwalSudania","أقوال سودانية");
        listService[1] = new Service("KwalINTERNATIONAL","أقوال عالمية");
        listService[2] = new Service("mYCHILD","طفلي");
        listService[3] = new Service("TECHNEWS","تكنلوجيا");
    }
    
    public Service[] getListService(){
        return listService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String[] getLanguague() {
        return languague;
    }

    public void setLanguague(String[] languague) {
        this.languague = languague;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Service[] getMyService() {
        return myService;
    }

    public void setMyService(Service myService[]) {
        this.myService = myService;
    }
    
    
    private static String[] listStatus;
    static{
        listStatus = new String[2];
        listStatus[0] = "Active";
        listStatus[1] = "Not Active";
    }
    
    public String[] getListStatus(){
        return listStatus;
    }
    
    private static SelectItem[] listYears;
    static {
        listYears = new SelectItem[35];
        for(int i=1960; i<= 1994;i++){
            listYears[i - 1960] = new SelectItem(i,"Year of "+i);
        }
    }
    
    private static langs[] listLangs;
    static {
        listLangs = new langs[4];
        listLangs[0] = langs.ARABIC;
        listLangs[1] = langs.ENGLISH;
        listLangs[2] = langs.FRENCH;
        listLangs[3] = langs.SPANISH;
    }
    
    public langs[] getSkillLangs(){
        return listLangs;
    }
    
    public SelectItem[] getListYears(){
        return listYears;
    }
    
    public String getLanguageConcatenate(){
        String result = "";
        for(int i=0;i<languague.length;i++)
            result = result + " - "+languague[i];
        
        return result;
    }
    
    public static class Service {
        public String serviceNameEnglish;
        public String serviceNameArabic;
        
        public Service(String serviceNameEn, String serviceNameAr){
            serviceNameEnglish = serviceNameEn;
            serviceNameArabic = serviceNameAr;
        }

        public String getServiceNameEnglish() {
            return serviceNameEnglish;
        }

        public void setServiceNameEnglish(String serviceNameEnglish) {
            this.serviceNameEnglish = serviceNameEnglish;
        }

        public String getServiceNameArabic() {
            return serviceNameArabic;
        }

        public void setServiceNameArabic(String serviceNameArabic) {
            this.serviceNameArabic = serviceNameArabic;
        }
        
        
    }
    
    

    /**
     * Creates a new instance of Customer
     */
    public Customer() {
    }
    
}
