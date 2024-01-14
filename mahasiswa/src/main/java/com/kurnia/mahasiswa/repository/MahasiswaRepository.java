/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kurnia.mahasiswa.repository;


import com.kurnia.mahasiswa.entity.Mahasiswa;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author H P
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {

    public List<Mahasiswa> findMahasiswasByEmail(String email);

    public Optional<Mahasiswa> findMahasiswaByEmail(String email);
}