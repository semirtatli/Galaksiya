package com.Galaksiya.ws.repository;

import com.Galaksiya.ws.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String username);

    List<Users> findAll();

    Optional<Users> findById(Long id);

    void delete(Users user);

}
