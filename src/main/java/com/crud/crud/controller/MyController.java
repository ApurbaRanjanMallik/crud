package com.crud.crud.controller;

import com.crud.crud.model.MyEntity;
import com.crud.crud.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    ServiceImpl service;
    @PostMapping("/add")
    public ResponseEntity<MyEntity> add(@RequestBody MyEntity myEntity){
        service.add(myEntity);
        return ResponseEntity.ok(myEntity);
    }
    @GetMapping("/delete")
    public ResponseEntity<String> delete(@PathVariable Long id){
        service.deletr(id);
        return ResponseEntity.ok(id.toString()+" Deleted");
    }
    @GetMapping("/all")
    public ResponseEntity<List<MyEntity>> show(){
        return ResponseEntity.ok(service.showAll());
    }
}
