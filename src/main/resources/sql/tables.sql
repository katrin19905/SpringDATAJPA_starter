
select *
from pg_extension;

CREATE TABLE tb_task
(
    id             uuid UNIQUE PRIMARY KEY DEFAULT uuid_generate_v4(),
    state          varchar(128)            default 'NEW',
    time_update    TIMESTAMP               DEFAULT current_timestamp,
    fio            varchar(200),
    name           VARCHAR(500)  NOT NULL,
    description    VARCHAR(1000) NOT NULL,
    priority       varchar(128)            default 'LOW',
    email_executor VARCHAR(128)  NOT NULL,
    date_task      DATE,
    time_create    timestamp
);


ALTER TABLE tb_task
    ADD CONSTRAINT fio_uniq UNIQUE (fio);

alter table tb_task
    add constraint tb_task_tb_hr_fio_hr_fk
        foreign key (hr_id) references tb_hr;