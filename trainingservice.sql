CREATE SCHEMA qcforce_training;

DROP TABLE IF EXISTS qcforce_training.associate CASCADE;
DROP TABLE IF EXISTS qcforce_training.batch CASCADE;
DROP TABLE IF EXISTS qcforce_training.employee CASCADE;
DROP TABLE IF EXISTS qcforce_training.employee_batch CASCADE;

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
	current_week			varchar
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
	id				serial PRIMARY KEY,
	email			varchar NOT NULL,
	first_name		varchar NOT NULL,
	last_name		varchar NOT NULL
);

CREATE TABLE qcforce_training.employee_batch (
	employee_id				int NOT NULL,
	batch_id				varchar NOT NULL,
	employee_role			varchar,
	deleted_at				varchar,
	PRIMARY KEY(employee_id, batch_id)
);

ALTER TABLE qcforce_training.employee_batch ADD CONSTRAINT FK_employee_batch_employee_id
	FOREIGN KEY (employee_id) REFERENCES qcforce_training.employee (id) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE qcforce_training.employee_batch ADD CONSTRAINT FK_employee_batch_batch_id
	FOREIGN KEY (batch_id) REFERENCES qcforce_training.batch (id) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE qcforce_training.associate ADD CONSTRAINT FK_associate_batch_id
	FOREIGN KEY (batch_id) REFERENCES qcforce_training.batch (id) ON DELETE CASCADE ON UPDATE CASCADE;