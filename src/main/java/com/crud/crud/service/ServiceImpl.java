package com.crud.crud.service;

import com.crud.crud.model.MyEntity;
import com.crud.crud.repo.MyRepoI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ServiceI{
    @Autowired
    MyRepoI repo;
    @Override
    public void add(MyEntity myEntity) {
        repo.save(myEntity);
    }

    @Override
    public List<MyEntity> showAll() {
        return repo.findAll();
    }

    @Override
    public void deletr(Long id) {
        repo.deleteById(id);
    }
}
