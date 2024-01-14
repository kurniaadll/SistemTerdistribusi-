package com.kurnia.nilai.repository;

import com.kurnia.nilai.entity.Nilai;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author H P
 */
public interface NilaiRepository {

    public List<Nilai> findAll();

    public void save(Nilai nilai);

    public Object findById(Long nilaiId);

    public boolean existsById(long id);

    public void deleteById(Long id);

    public List<Nilai> findByIdMahasiswa(Long id);
    
}
