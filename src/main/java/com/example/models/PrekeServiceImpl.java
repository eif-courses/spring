package com.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Marius on 2/12/2017.
 */
@Service
public class PrekeServiceImpl implements PrekeService{

    private PrekeRepository prekeRepository;

    @Autowired
    public void setPrekeRepository(PrekeRepository prekeRepository) {
        this.prekeRepository = prekeRepository;
    }
    @Override
    public Iterable<Preke> atvaizduotiPrekes() {
        return prekeRepository.findAll();
    }

    @Override
    public Preke prekePagalId(Integer id) {
        return prekeRepository.findOne(id);
    }


}
