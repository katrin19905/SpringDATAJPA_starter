package com.work.dto;

import com.work.entity.Priority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskDTO {

    private String name;
    private String description;
    private Priority priority;
    private LocalDate dateTask;

}
