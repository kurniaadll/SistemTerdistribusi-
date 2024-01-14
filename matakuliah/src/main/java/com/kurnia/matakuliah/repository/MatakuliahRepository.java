/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kurnia.matakuliah.repository;

import com.kurnia.matakuliah.entity.Matakuliah;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author H P
 */
@Repository
public interface MatakuliahRepository extends JpaRepository<Matakuliah, Long> {

    public Optional<Matakuliah> findMatakuliahByKode(String kode);
    
}
