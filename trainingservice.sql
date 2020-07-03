CREATE SCHEMA qcforce_training;

CREATE TABLE qcforce_training.batch (
	id						varchar NOT NULL PRIMARY KEY,
	batch_name				varchar NOT NULL,
	start_date				date NOT NULL,
	end_date 				date NOT NULL,
	skill					varchar NOT NULL,
	batch_location 			varchar NOT NULL,
	batch_type				varchar NOT NULL,
	good_grade				int,
	passing_grade			int,
	current_week			int
);

CREATE TABLE qcforce_training.associate (
	id						serial PRIMARY KEY,
	training_status			varchar,
	email					varchar NOT NULL,
	salesforce_id			varchar,
	first_name				varchar NOT NULL,
	last_name				varchar NOT NULL,
	flag					varchar,
	start_date				date,
	end_date				date,
	active					boolean,
	batch_id				varchar NOT NULL
);

CREATE TABLE qcforce_training.employee (
	employee_id				serial PRIMARY KEY,
	employee_email			varchar NOT NULL,
	employee_first_name		varchar NOT NULL,
	employee_last_name		varchar NOT NULL
);

CREATE TABLE qcforce_training.employee_batch (
	employee_id				int NOT NULL,
	batch_name				varchar NOT NULL,
	employee_role			varchar,
	deleted_at				date,
	PRIMARY KEY(employee_id, batch_name)
);

alter table qcforce_training.employee_batch add constraint FK_employee_batch_employee_id
	foreign key (employee_id) references qcforce_training.employee (employee_id) on delete cascade on update cascade;

alter table qcforce_training.employee_batch add constraint FK_employee_batch_batch_name
	foreign key (batch_name) references qcforce_training.batch (batch_name) on delete cascade on update cascade;

alter table qcforce_training.associate add constraint FK_associate_batch_name
	foreign key (batch_name) references qcforce_training.batch (batch_name) on delete cascade on update cascade;