/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SI_Perpustakaan;

/**
 *
 * @author FuBa
 */
import Controller.*;
import java.util.Scanner;
public class Main {
    
    ControllerBuku buku = new ControllerBuku();
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       Main app = new Main();
       app.menu_awal();
    }
    public void menu_awal(){
         int pilih;
         do {
             System.out.println("========= MENU NAVIGATION =========");
             System.out.println("1.Tambah Buku");
             System.out.println("2.Lihat Buku");
             System.out.println("3.Ubah Buku");
             System.out.println("4.Hapus buku");
             System.out.println("5.Keluar");
             pilih = input.nextInt();
             
             switch(pilih){
                 case 1:
                     buku.inputBuku();
                     break;
                 case 2:
                     buku.ViewBuku();
                     break;
                 case 3:
                     buku.EditBuku();
                     break;
                 case 4:
                     buku.deleteBuku();
                     break;
             }
            
        } while (pilih!=0);
        
    }
}
