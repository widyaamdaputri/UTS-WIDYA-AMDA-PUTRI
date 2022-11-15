/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.widya.peminjaman.repository;

import com.widya.peminjaman.VO.ResponseTemplateVO;
import com.widya.peminjaman.entity.Peminjaman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ASUS
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long>{
    public Peminjaman findByPeminjamanId(Long peminjamanId);
  
}  