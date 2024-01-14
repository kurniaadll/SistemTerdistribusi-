/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kurnia.matakuliah.service;

import com.kurnia.matakuliah.entity.Matakuliah;
import com.kurnia.matakuliah.repository.MatakuliahRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author H P
 */
@Service
public class MatakuliahService {
    
    @Autowired
    private MatakuliahRepository matakuliahRepository;
    
    public List<Matakuliah> getAll(){
        return matakuliahRepository.findAll();
    }
    
    public Matakuliah getMatakuliah(Long id){
        Optional<Matakuliah> matakuliahOptional = matakuliahRepository.findById(id);
        return matakuliahOptional.get();
    }
    
    public void insert(Matakuliah matakuliah){
        Optional<Matakuliah> matakuliahOptional
                = matakuliahRepository.findMatakuliahByKode(matakuliah.getKode());
        if (matakuliahOptional.isPresent()) {
            throw new IllegalStateException("Kode sudah ada");
        }
        matakuliahRepository.save(matakuliah);
    }
}
