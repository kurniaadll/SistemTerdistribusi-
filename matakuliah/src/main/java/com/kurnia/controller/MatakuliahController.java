/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kurnia.matakuliah.controller;

import com.kurnia.matakuliah.entity.Matakuliah;
import com.kurnia.matakuliah.service.MatakuliahService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author H P
 */
@RestController
@RequestMapping("api/v1/matakuliah")
public class MatakuliahController {
    
    @Autowired
    private MatakuliahService matakuliahService;
    
    @GetMapping
    public List<Matakuliah> getAll(){
        return matakuliahService.getAll();
    }
    
    @GetMapping(path = "{id}")
    public Matakuliah getMatakuliah(@PathVariable("id") Long id){
        return matakuliahService.getMatakuliah(id); 
    }
    
    public void insert(@RequestBody Matakuliah matakuliah){
        matakuliahService.insert(matakuliah); 
    }
}

