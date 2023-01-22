/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FuBa
 */
public class Mahasiswa {
    
    protected String nama;
    protected String nim;
    protected String programStudi;
    protected String kelas;
    protected String jurusa;
    
    
    public String getNama(){
        return this.nama;
    }
    public void setNama(String n){
        this.nama=n;
        
    }
    public String getNim(){
        return this.nim;
    }
    public void setNim(String nm){
        this.nim =nm;
    }
    public String getProgramstudi(){
        return this.programStudi;
    }
    public void setProgramstudi(String ps){
        this.programStudi = ps;
    }
    public String getKelas(){
        return this.kelas;
    }
    public void setKelas(String k){
        this.kelas=k;
    }
    public String getJuarusan(){
        return this.jurusa;
    }
    public void setJurusan(String j){
        this.jurusa = j;
    }
     
    
}
