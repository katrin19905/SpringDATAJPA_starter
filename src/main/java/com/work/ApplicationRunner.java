package com.work;

import com.work.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ApplicationRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(ApplicationRunner.class, args);
        System.out.println("-".repeat(20));
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        TaskService taskService = (TaskService) context.getBean("taskService");
        taskService.getAllTasksByEmail("test").forEach(System.out::println);
        System.out.println("-".repeat(20));
        System.out.println("One task: ");
        System.out.println(taskService.findTaskById("0051dc38-916a-4cdf-9fd0-33f6786d5e27"));
    }
}
