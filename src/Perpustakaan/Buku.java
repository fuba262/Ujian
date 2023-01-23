package Perpustakaan;


import java.util.Scanner;

/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author FuBa
 */
public class Buku extends Anggota {
    private String kodeBuku;
    private String judulBuku;
    private String pengarang;
    private String Penerbit;
    
    public String getKodeBuku(){
        return  this.kodeBuku;
    }
    public void setKodeBuku(String kb){
        this.kodeBuku = kb;   
    }
        public String getJudulBuku(){
        return  this.judulBuku;
    }
    public void setJudulBuku(String jb){
        this.judulBuku = jb;   
    }
        public String getPengarang(){
        return  this.pengarang;
    }
    public void setPenagarang(String p){
        this.pengarang = p;   
    }
        public String getPenerbit(){
        return  this.kodeBuku;
    }
    public void setPenerbit(String pb){
        this.Penerbit = pb;   
    }
    
}