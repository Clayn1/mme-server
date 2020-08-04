package com.clayn.mmeserver.service;

import com.clayn.mmeserver.model.ModPage;
import com.clayn.mmeserver.repository.ModPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class ModPageService implements IModPageService{
    @Autowired
    private ModPageRepository modPageRepository;
    @Autowired
    private EntityManager entityManager;
    @Override
    public ModPage insertModPage(ModPage modPage) {
        return modPageRepository.save(modPage);
    }

    @Override
    public ModPage updateModPage(ModPage modPage) {
        return modPageRepository.save(modPage);
    }

    @Override
    public void deleteModPage(Integer id) {
        modPageRepository.deleteById(id);
    }

    @Override
    public ModPage getModPage(Integer id) {
        return modPageRepository.findById(id).get();
    }
}
