/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

/**
 *
 * @author FuBa
 */
import Perpustakaan.Buku;
import java.util.ArrayList;
public class ModelBuku implements Perintah{
    
    private ArrayList<Buku>ListBuku;
    
    public ModelBuku(){
        ListBuku = new ArrayList<>();
    }
           

    @Override
    public void view() {
        for (Buku list : ListBuku) {
            
            System.out.println("\nKode Buku :"+ list.getKodeBuku());
            System.out.println("\nJudul Buku :"+list.getJudulBuku());
            System.out.println("\nPengarang Buku :"+ list.getPengarang());
            System.out.println("\nPenerbit Buku :"+list.getPenerbit());
            
            
        }
        System.out.println("==============================================");
    }

    @Override
    public void insert(Object x) {
        ListBuku.add((Buku)x);
    }

    @Override
    public void update(int index, Object x) {
        ListBuku.set(index,(Buku)x);
        
    }

    @Override
    public void delete(int index) {
        ListBuku.remove(index);
    }

    @Override
    public void get_where(int index) {
        ListBuku.get(index);
    }
    
}
