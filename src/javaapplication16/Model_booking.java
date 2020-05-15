/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HELMI
 */
final class Model_booking {
    private DefaultTableModel tabel = new DefaultTableModel();
        
        public Model_booking(){

            getTabel().addColumn("Kode");
            getTabel().addColumn("Tanggal");
            getTabel().addColumn("Waktu");
            getTabel().addColumn("sewa");
            getTabel().addColumn("Nama");
            getTabel().addColumn("Team");
            getTabel().addColumn("No HP");
            getTabel().addColumn("email");
            
       
    }
//        Metode gettabel
    public DefaultTableModel getTabel() {
        return tabel;
    }
    
//    metode set tabel
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }

    void removeRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
