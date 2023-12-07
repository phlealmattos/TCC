/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aluno
 */
public class PacienteModel {
    
    private int Id_Paciente;
    private String Nome_Completo;
    private String Idade;
    private String Celular;
    private String Email;
    private String Sexo;
    private String Dores_no_Corpo;
    private String Alergias;
    private String Medicamento_em_Uso;
    private String CEP;
    private String Sintomas_de_Febre;
    
     public PacienteModel() {
    }

    public PacienteModel(int Id_Paciente, String Nome_Completo, String Idade, String Celular, String Email, String Sexo,
            String Dores_do_Corpo, String Alergias, String Medicamento_em_Uso,
            String CEP, String Sintomas_de_Febre) {
        
        this.Id_Paciente = Id_Paciente;
        this.Nome_Completo = Nome_Completo;
        this.Idade = Idade;
        this.Celular = Celular;
        this.Email = Email;
        this.Sexo = Sexo;
        this.Dores_no_Corpo = Dores_no_Corpo;
        this.Alergias = Alergias;
        this.Medicamento_em_Uso = Medicamento_em_Uso;
        this.CEP = CEP;
        this.Sintomas_de_Febre = Sintomas_de_Febre;
    }
    
     public PacienteModel( String Nome_Completo, String Idade, String Celular, String Email, String Sexo,
            String Dores_do_Corpo, String Alergias, String Medicamento_em_Uso,
            String CEP, String Sintomas_de_Febre) {
         
        this.Nome_Completo = Nome_Completo;
        this.Idade = Idade;
        this.Celular = Celular;
        this.Email = Email;
        this.Sexo = Sexo;
        this.Dores_no_Corpo = Dores_no_Corpo;
        this.Alergias = Alergias;
        this.Medicamento_em_Uso = Medicamento_em_Uso;
        this.CEP = CEP;
        this.Sintomas_de_Febre = Sintomas_de_Febre;
    }
   

    public int getId_Paciente() {
        return Id_Paciente;
    }

    public void setId_Paciente(int Id_Paciente) {
        this.Id_Paciente = Id_Paciente;
    }

    public String getNome_Completo() {
        return Nome_Completo;
    }

    public void setNome_Completo(String Nome_Completo) {
        this.Nome_Completo = Nome_Completo;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDores_no_Corpo() {
        return Dores_no_Corpo;
    }

    public void setDores_no_Corpo(String Dores_no_Corpo) {
        this.Dores_no_Corpo = Dores_no_Corpo;
    }

   
    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }


    public String getMedicamento_em_Uso() {
        return Medicamento_em_Uso;
    }

    public void setMedicamento_em_Uso(String Medicamento_em_Uso) {
        this.Medicamento_em_Uso = Medicamento_em_Uso;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }


    public String getSintomas_de_Febre() {
        return Sintomas_de_Febre;
    }

    public void setSintomas_de_Febre(String Sintomas_de_Febre) {
        this.Sintomas_de_Febre = Sintomas_de_Febre;
    }

}

