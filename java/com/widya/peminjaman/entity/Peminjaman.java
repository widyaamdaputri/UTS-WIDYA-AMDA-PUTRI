/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.widya.peminjaman.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ASUS
 */
public class Peminjaman {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long peminjamanId;
    private Long nasabahId;
    private Long jumlahPinjaman;
    private Long lamaPinjaman;
    private Long bungaPinjaman;
    private Long angsuranpokok;
    private Long angsuranbln;
    private Long totalutang;

    public String getNasabahId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
