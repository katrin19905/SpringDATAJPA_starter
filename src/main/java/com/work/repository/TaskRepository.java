package com.work.repository;

import com.work.entity.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;



public interface TaskRepository extends CrudRepository<Task, UUID> {
    List<Task> findAllBy(String email);
//    void updateTask(Task task);
//    void delete(Task task);
    Optional<Task> findById(UUID id);
//    Object save(Task task);
}
