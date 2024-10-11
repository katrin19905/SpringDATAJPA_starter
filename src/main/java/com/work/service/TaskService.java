package com.work.service;

import com.work.dto.TaskDTO;
import com.work.repository.TaskRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Getter
@Setter
@RequiredArgsConstructor
//@RequestMapping("/tasks")   // TODO delete "tasks" from mapping in methods
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<TaskDTO> getAllTasksByEmail(String email) {
        return repository.findAllBy(email).stream()
                .map(task -> new TaskDTO(task.getName(), task.getDescription(), task.getPriority(), task.getDateTask()))
                .collect(Collectors.toList());
    }

//    public void updateTask(Task task) {
//        repository.updateTask(task);
//    }

//    @DeleteMapping("/tasks/{taskId}")
//    public void deleteTask(Task task) {
//        repository.delete(task);
//    }


    public Optional<TaskDTO> findTaskById(String taskId) {
        return repository.findById(UUID.fromString(taskId))
                .map(task -> new TaskDTO(task.getName(), task.getDescription(), task.getPriority(), task.getDateTask()));
    }

//    public void saveNewTask(TaskDTO task) {
//        Task newTask = new Task();
//
//    }

}
