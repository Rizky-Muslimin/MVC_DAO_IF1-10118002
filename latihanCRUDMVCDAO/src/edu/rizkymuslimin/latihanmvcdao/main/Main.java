/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkymuslimin.latihanmvcdao.main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import edu.rizkymuslimin.latihanmvcdao.database.kingsbarbershopDatabase;
import edu.rizkymuslimin.latihanmvcdao.entity.pelanggan;
import edu.rizkymuslimin.latihanmvcdao.error.PelangganException;
import edu.rizkymuslimin.latihanmvcdao.service.PelangganDAO;
import edu.rizkymuslimin.latihanmvcdao.view.MainViewPelanggan;

/**
 * Nama :Rizky Muslimin
 * NIM : 10118002
 * Kelas : IF1 2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
       SwingUtilities.invokeLater(new Runnable() {

           @Override
           public void run() {       
               try{
                   MainViewPelanggan pelanggan = new MainViewPelanggan();
                   pelanggan.loadDatabase();
                   pelanggan.setVisible(true);
               }catch(SQLException e){
               
               
               }
             catch (PelangganException ex) {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
               }
       }
        
       });    
        
        
       }  
        
        
        
    }
    

