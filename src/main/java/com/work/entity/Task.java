package com.work.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "tb_task")
public class Task {
    /*
    -	email_author – подставляется фио из tb_hr (поиск емэйла в табл hr и выдача фио) (фио прилетает в ПУТ
    метод) не отображается
    но сохраняется только при создании новой задачи
-	name – NotWhitespace, NotEmpty вводит пользователь отображается при редактировании
-	description - NotWhitespace, NotEmpty вводит пользователь отображается при редактировании
-	priority – енам отображается при редактировании
-	email_executor - подставляется логин (прилетает в ПУТ метод) не отображается но сохраняется только при
создании новой задачи
-	date_task  - ДД.ММ.ГГГГ, не должна быть меньше, чем текущая дата. отображается при редактировании
-	time_create  - ДД.ММ.ГГГГ ЧЧ:ММ:СС, ставится автоматически, текущая дата. Сохранять только при создании
новой записи . не отображается
     -	id – uuid автогенерируемое, прилетает в ДЕЛЕТ метод не отображается
-	state – енам дефолт нью (в прогрессе, сделано) не изменяется и не отображается
-	time_update datetime текущее время, записывается при создании и изменении не отображается

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private State state;

    @Column(name = "time_update")
    private LocalDateTime timeUpdate;

    private String fio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Column(nullable = false, name = "email_executor")
    private String emailExecutor;

    @Column(name = "date_task")
    private LocalDate dateTask;

    @Column(name = "time_create")
    private LocalDateTime timeCreate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hr_id")
    private HumanResources hr;
}
