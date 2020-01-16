/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkymuslimin.latihanmvcdao.event;

import edu.rizkymuslimin.latihanmvcdao.entity.pelanggan;
import edu.rizkymuslimin.latihanmvcdao.model.PelangganModel;

/**
 * Nama :Rizky Muslimin
 * NIM : 10118002
 * Kelas : IF1 2018
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(pelanggan pelanggan);

    
    
}
