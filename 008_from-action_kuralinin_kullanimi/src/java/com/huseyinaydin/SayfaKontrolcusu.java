/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class SayfaKontrolcusu implements Serializable{

    /**
     * Creates a new instance of SayfaKontrolcusu
     */
    private static final long serialVersionUID = 1L;
    
    public String gitSayfa1(){
        return "basarili";
    }
    
    public String gitSayfa2(){
        return "basarili";
    }
    
    public String gitSayfa3(){
        return "olumlu";
    }
    public SayfaKontrolcusu() {
    }
    
}
