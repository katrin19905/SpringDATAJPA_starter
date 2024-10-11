package com.work.controller;

import com.work.dto.TaskDTO;
import com.work.service.TaskService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@RequiredArgsConstructor
@RestController
@SessionAttributes({"email"})
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<TaskDTO> findAllTasksByEmail(@RequestParam("email") String email, HttpServletRequest request) {
        request.getSession().setAttribute("email", "email");
        return taskService.getAllTasksByEmail(email);
    }

    @GetMapping("/tasks/task")
    public Optional<TaskDTO> findTaskById(@RequestParam("id") String taskId) {
        return taskService.findTaskById(taskId);
    }

}
