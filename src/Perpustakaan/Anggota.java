/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FuBa
 */
import java.util.Scanner;

//inhiretance
public class Anggota extends Mahasiswa{
    private String idAnggota;
    private String alamatKTP;
    private String alamatDomisili;
    
    Scanner input = new Scanner(System.in);
    
    // enkpsulasi
    public String getIdanggota(){
        return this.idAnggota;
    }
    public void setIdanggota(String id){
        this.idAnggota =id;
    }
    public String getAlamatKTP(){
        return this.alamatKTP;
    }
    public void setAlamatKTP(String ak){
        this.alamatKTP = ak;
    }
    public String getAlamatDomisili(){
        return this.alamatDomisili;
    }
    public void setAlamatDomisili(String ad){
        this.alamatDomisili=ad;
    }
    

    
    public void inputAnggota(){
        
        System.out.println("========== SELAMAT DATANG DI PERPUSTAKAAN DR.SOETOMO =========");
        System.out.println("=============== Silahkan Isi Form Terlebih dahulu==============");
        System.out.print("Masukan Nama :");
        nama= input.next();
        System.out.print("Masukan NIM :");
        nim = input.next();
        System.out.print("Masukan ID Anggota :");
        idAnggota = input.next();
        System.out.print("Masukan Alamat KTP:");
        alamatKTP = input.next();
        System.out.print("Masukan Alamat Domisili:");
        alamatDomisili = input.next();
        
        
        
        System.out.println("===============================================================");
    
        
    }

  
}

