/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 *
 * @author FuBa
 */
public class Pengembalian {
    private String no_pengembalian;
    private int indexPeminjaman;
    private Date tgl_pengembalian;
    
    public Pengembalian(String no_pengembalian,int indexPeminjaman,Date tgl_pengembalian){
        this.no_pengembalian = no_pengembalian;
        this.indexPeminjaman = indexPeminjaman;
        this.tgl_pengembalian = tgl_pengembalian;
    
}
    //Enkapsulasi
    
    public void setNo_pengembalian(String n_kembali){
        this.no_pengembalian = n_kembali;
    }
    public void setIndexPeminjaman(int i_pinjam){
        this.indexPeminjaman = i_pinjam;
    }
    public void setTgl_pengembalian(Date tgl_kembali){
        this.tgl_pengembalian = tgl_kembali;
    }
    public String getNo_pengembalian(){
        return  no_pengembalian;
    }
    public int getIndexPeminjaman(){
        return indexPeminjaman;
}
    public Date getTgl_pengembalian(){
        return tgl_pengembalian;
    }
}
    