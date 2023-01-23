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
import Perpustakaan.Peminjaman;
import java.util.ArrayList;
public class ModelPeminjaman implements Perintah{
    
    private ArrayList<Peminjaman>pinjam;
    
    public ModelPeminjaman(){
        pinjam= new ArrayList<>();
    }

    @Override
    public void view() {
        
    }

    @Override
    public void insert(Object x) {
     pinjam.add((Peminjaman)x);
    }

    @Override
    public void update(int index, Object x) {
     pinjam.set(index,(Peminjaman)x);
    }

    @Override
    public void delete(int index) {
        pinjam.remove(index);
    }

    @Override
    public void get_where(int index) {
      pinjam.get(index);
    }
   
    
}
