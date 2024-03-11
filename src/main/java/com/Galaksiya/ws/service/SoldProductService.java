package com.Galaksiya.ws.service;

import com.Galaksiya.ws.model.SoldProduct;
import com.Galaksiya.ws.repository.SoldProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class SoldProductService {
    @Autowired
    SoldProductRepository soldProductRepository;

    public void save(SoldProduct soldProduct) {soldProductRepository.save(soldProduct);}
    public List<SoldProduct> findAll(){
        return soldProductRepository.findAll();
    }
    public Optional<SoldProduct> findById(Long id) {
        return soldProductRepository.findById(id);
    }
    public void delete(SoldProduct soldProduct) {
        soldProductRepository.delete(soldProduct);
    }
    public List<SoldProduct> findByProductId(Long id) {return soldProductRepository.findByProductId(id);}

}