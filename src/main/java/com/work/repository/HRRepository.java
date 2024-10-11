package com.work.repository;

import com.work.entity.HumanResources;
import com.work.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HRRepository extends CrudRepository<HumanResources, Long> {
//    List<HumanResources> getAll();
//    Optional<HumanResources> findByEmail(String email);
//    Optional<HumanResources> findById(Long id);
}
