/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author FuBa
 */
import Others.ModelBuku;
import Perpustakaan.Buku;
import java.util.Scanner;
public class ControllerBuku {
    
    // Inisial Object
    
    ModelBuku ini_buku = new ModelBuku();
    Scanner input = new Scanner(System.in);
    
    //Constructor
    
    public ControllerBuku(){
        
    }
    
    public void inputBuku(){
        System.out.println("Input Kode Buku :");
        String Kode_Buku =input.next();
        System.out.println("Input Judul Buku :");
        String judul_Buku = input.next();
        System.out.println("Input Pengarang Buku :");
        String Pengarang_Buku = input.next();
        System.out.println("Input Penerbit Buku :");
        String Penerbit_Buku = input.next();
        
        // Menambahkan Object Ke Class Buku
        ini_buku.insert(new Buku(Kode_Buku,judul_Buku,Pengarang_Buku,Penerbit_Buku));
        System.out.println("Data Telah Berhasil Di simpan");
        
    }
    
    public void ViewBuku (){
        
        if (ini_buku.getListBuku().isEmpty()) {
            System.out.println("Data Kosong");
        }else{
            int no=0;
            for (int i = 0; i < ini_buku.getListBuku().size(); i++) {
                no++;
                System.out.println("Buku"+ no);
                System.out.println("Kode Buku   :"+ ini_buku.getListBuku().get(i).getKodeBuku());
                System.out.println("Judul Buku  :"+ini_buku.getListBuku().get(i).getJudulBuku());
                System.out.println("Pengarang Buku  :"+ini_buku.getListBuku().get(i).getPengarang());
                System.out.println("Penerbit Buku   :"+ini_buku.getListBuku().get(i).getPenerbit());
                
            }
        }
        
    }
    
    public void EditBuku (){
        if (ini_buku.getListBuku().size()>0) {
            for (int i = 0; i < ini_buku.getListBuku().size(); i++) {
                System.out.println("["+i+"]"+ini_buku.getListBuku().get(i).getJudulBuku());
                
               
            }
             System.out.println("Pilih Index Buku :");
             int pilihIndex = input.nextInt();
            
            //Input User
            System.out.println("Input Kode Buku :");
            String Kode_Buku =input.next();
            System.out.println("Input Judul Buku :");
            String judul_Buku = input.next();
            System.out.println("Input Pengarang Buku :");
            String Pengarang_Buku = input.next();
            System.out.println("Input Penerbit Buku :");
            String Penerbit_Buku = input.next();

            ini_buku.update(pilihIndex,new Buku(Kode_Buku, judul_Buku, Pengarang_Buku, Penerbit_Buku));
        }
    }
    
    public void deleteBuku(){
        if (ini_buku.getListBuku().size()>0) {
            for (int i = 0; i < ini_buku.getListBuku().size(); i++) {
                System.out.println("["+i+"]"+ini_buku.getListBuku().get(i).getJudulBuku());
            }
            System.out.println("Pilih Index Buku yg Di hapus : ");
            int pilihIndex = input.nextInt();
            
            ini_buku.delete(pilihIndex);
            System.out.println("Data Berhasil Di Hapus !! \n");
            
        }else{
            System.out.println("Data Kosong !! \n");
        }
    }
    
    
}
