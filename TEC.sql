create database medconnect;
use medconnect;
 
create table Paciente (
 Id_paciente INT AUTO_INCREMENT PRIMARY KEY,
  Nome_Completo VARCHAR(150)not null,
    Idade varchar (2) not null,
    Celular VARCHAR(19)not null,
    Email VARCHAR(150)not null,
    Sexo varchar (15) not null,
    Dores_no_Corpo varchar (1500) not null,
    Alergias VARCHAR(255)not null,
    Medicamentos_em_Uso varchar (100)  not null,
    CEP varchar (10) not null,
    Sintomas_de_Febre VARCHAR(4)not null
    );
    
    create table Usuario(
    Id_Usuario  INT AUTO_INCREMENT PRIMARY KEY,
    Nome varchar (30) not null,
    Sobrenome varchar (70) not null,
    CPF varchar (20)not null,
    Celular varchar (19) not null,
    Nascimento varchar (20) not null,
    Sexo varchar (15) not null,
    Email varchar (150) not null,
    Senha varchar (15) not null,
    Confirma_Senha varchar (15) not null
    );
    
   
