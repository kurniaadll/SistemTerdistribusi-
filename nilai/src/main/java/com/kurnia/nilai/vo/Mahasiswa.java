/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kurnia.nilai.vo;

/**
 *
 * @author H P
 */
import java.time.LocalDate;


/**
 *
 * @author Fauzi
 */


public class Mahasiswa {
 
    private long id;
    private String nama;
    private String email;
    private LocalDate tglLahir;

    public Mahasiswa() {
    }

    public Mahasiswa(long id, String nama, String email, LocalDate tglLahir) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.tglLahir = tglLahir;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + ", email=" + email + ", tglLahir=" + tglLahir + '}';
    }
}

   
           