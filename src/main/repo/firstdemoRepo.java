package com.example.firstdemo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firstdemo.Entity.firstdemoEntity;

@Repository
public interface firstdemoRepo extends JpaRepository<firstdemoEntity, Integer> {
}
