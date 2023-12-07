/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Date;
/**
 *
 * @author aluno
 */
public class UsuarioModel {

     private int Id_Usuario;
    private String Nome;
    private String Sobrenome;
    private String CPF;
    private String Celular;
    private String Nascimento;
    private String Sexo;
    private String Email;
    private String Senha;
    private String Confirma_Senha;
    
    public UsuarioModel() {
    }


public UsuarioModel(int Id_Usuario, String Nome, String Sobrenome, String CPF, String Celular, String Nascimento, String Sexo, String Email, String Senha, String Confirma_Senha) {
        this.Id_Usuario = Id_Usuario;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.CPF = CPF;
        this.Celular = Celular;
        this.Nascimento = Nascimento;
        this.Sexo = Sexo;
        this.Email = Email;
        this.Senha = Senha;
        this.Confirma_Senha = Confirma_Senha;
    }

public UsuarioModel(String Email, String Senha) {
       
        this.Email = Email;
        this.Senha = Senha;
    }

 public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
}
    
     public String getNome() {
        return  Nome;
    }

    public void setNome(String  Nome) {
        this.Nome =  Nome;
    }
    
    public String getSobrenome() {
        return  Sobrenome;
    }

    public void setSobrenome(String  Sobrenome) {
        this.Sobrenome =  Sobrenome;
    }
    
    public String getCPF() {
        return  CPF;
    }

    public void setCPF(String  CPF) {
        this.CPF =  CPF;
    }
    
    public String getCelular() {
        return  Celular;
    }

    public void setCelular(String  Celular) {
        this.Celular =  Celular;
    }
    
     public String getNascimento() {
        return  Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento =  Nascimento;
    }
    
     public String getSexo() {
        return  Sexo;
    }

    public void setSexo(String  Sexo) {
        this.Sexo =  Sexo;
    }
    
     public String getEmail() {
        return  Email;
    }

    public void setEmail(String  Email) {
        this.Email =  Email;
    }
    
     public String getSenha() {
        return  Senha;
    }

    public void setSenha(String  Senha) {
        this.Senha =  Senha;
    }
    
     public String getConfirma_Senha() {
        return  Confirma_Senha;
    }

    public void setConfirma_Senha(String  Confirma_Senha) {
        this.Confirma_Senha =  Confirma_Senha;
    }
  
}
    

