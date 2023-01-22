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
public interface Perintah {
    public void view();
    public void insert(Object x);
    public void update(int index, Object x);
    public void delete(int index);
    public void get_where(int index);
    
}
