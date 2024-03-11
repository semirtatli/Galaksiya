package com.Galaksiya.ws.service;


import com.Galaksiya.ws.model.Selling;
import com.Galaksiya.ws.repository.SellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class SellingService {
    @Autowired
    SellingRepository sellingRepository;

    public void save(Selling selling) {sellingRepository.save(selling);}
    public List<Selling> findAll(){
        return sellingRepository.findAll();
    }
    public Optional<Selling> findById(Long id) {
        return sellingRepository.findById(id);
    }

}
