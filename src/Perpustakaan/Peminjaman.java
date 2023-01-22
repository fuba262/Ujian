


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FuBa
 */
public class Peminjaman {
     private String no_pinjam;
     private int indexBuku,indexAnggota,jumlahBuku;
     private Date tgl_pinjam;
     
     public  Peminjaman (String no_pinjam,int indexBuku,int indexAnggota,int jumlahBuku,Date tgl_pinjam){
         this.no_pinjam = no_pinjam;
         this.indexBuku = indexBuku;
         this.indexAnggota = indexAnggota;
         this.jumlahBuku = jumlahBuku;
         this.tgl_pinjam = tgl_pinjam;
         
     }
     
     public void setNo_pinjam(String np){
         this.no_pinjam =np;
     }
     public void setIndexBuku(int ib){
         this.indexBuku = ib;
     }
     public void setIndexAnggota(int ia){
         this.indexAnggota =ia;
     }
     public void setTgl_pinjam(Date tgl){
         this.tgl_pinjam = tgl;
     }
     public void setJmlhBuku( int j_buku){
         this.jumlahBuku = j_buku;
     }
     
     public String getNo_pinjam(){
         return no_pinjam;
     }
     public int getIndexBuku(){
         return indexBuku;
     }
     public int getIndexAnggota(){
         return indexAnggota;
     }
     public Date getTgl_pinjam(){
         return tgl_pinjam;
     }
     public int getJmlhBuku(){
         return jumlahBuku;
     }
    
}
