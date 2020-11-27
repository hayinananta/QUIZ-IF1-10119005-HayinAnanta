/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119005.hayinananta;

import java.util.Date;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan program kasir dengan berbasis
 *                     Objek
 */
public class Customer extends CustomerInvoice{
    private String name, email;
    private boolean member;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isMember() {
        if(super.checkMemberStatus(member)) {
            
        }
        return false;
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String currentTime() {
         //  object tanggal
       Date date = new Date();
        
       // menampilkan waktu dan tanggal menggunakan toString()
       System.out.println(date.toString());
        return null;
    }
}