package com.Galaksiya.ws.repository;


import com.Galaksiya.ws.model.Selling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SellingRepository extends JpaRepository<Selling, Long> {

    List<Selling> findAll();

    Optional<Selling> findById(Long id);

}
