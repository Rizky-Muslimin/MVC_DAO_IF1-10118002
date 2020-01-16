/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkymuslimin.latihanmvcdao.service;

import java.util.List;
import edu.rizkymuslimin.latihanmvcdao.entity.pelanggan;
import edu.rizkymuslimin.latihanmvcdao.error.PelangganException;

/**
 * Nama :Rizky Muslimin
 * NIM : 10118002
 * Kelas : IF1 2018
 */
public interface PelangganDAO {
    
    public void insertPelanggan(pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer id) throws PelangganException;
    public pelanggan getPelanggan(Integer id) throws PelangganException;
    public pelanggan getPelanggan(String email) throws PelangganException;
    public List<pelanggan> selectAllPelanggan() throws PelangganException;
    
}
