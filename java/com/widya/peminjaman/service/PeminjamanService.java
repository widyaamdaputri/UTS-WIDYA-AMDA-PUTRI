/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.widya.peminjaman.service;

import com.widya.peminjaman.VO.Nasabah;
import com.widya.peminjaman.VO.ResponseTemplateVO;
import com.widya.peminjaman.entity.Peminjaman;
import com.widya.peminjaman.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ASUS
 */
public class PeminjamanService {

   @Autowired
    private PeminjamanRepository peminjamanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Peminjaman savePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    
    public ResponseTemplateVO getPeminjaman(Long peminjamanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Peminjaman peminjaman = peminjamanRepository.findByPeminjamanId(peminjamanId);
        Nasabah nasabah = restTemplate.getForObject("http://localhost:8066/nasabah/" 
              + peminjaman.getNasabahId(), Nasabah.class);
        vo.setPeminjaman(peminjaman);
        vo.setNasabah(nasabah);
        return vo;
    }
}
