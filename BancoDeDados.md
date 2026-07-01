CREATE DATABASE db_gestao_escolar;

USE db_gestao_escolar;

CREATE TABLE login (
id_login INT AUTO_INCREMENT PRIMARY KEY,
usuario VARCHAR(100) NOT NULL UNIQUE,
senha VARCHAR(100) NOT NULL,
cargo VARCHAR (100) NOT NULL
);

CREATE TABLE turma (
id_turma INT AUTO_INCREMENT PRIMARY KEY,
nome_turma VARCHAR (100) NOT NULL
);

CREATE TABLE aluno (
id_aluno INT AUTO_INCREMENT PRIMARY KEY,
id_turma INT NOT NULL,
nome_aluno VARCHAR (100) NOT NULL,
cpf VARCHAR (14) NOT NULL,
FOREIGN KEY (id_turma) REFERENCES turma(id_turma)
);

CREATE TABLE nota (
id_nota INT AUTO_INCREMENT PRIMARY KEY,
id_aluno INT NOT NULL,
nota DECIMAL (4,2) NOT NULL,
FOREIGN KEY (id_aluno) REFERENCES aluno(id_aluno)
);

INSERT INTO login (usuario, senha, cargo) 
VALUES ("admin", "1234", "Diretor")
