/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import Connection.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.PacienteModel;

public class PacienteDAO {
    
    Connection con = null;
    PreparedStatement pstm = null;


    public void cadastrarPaciente(PacienteModel pm) {
        String sql = "INSERT INTO Paciente ( Nome_Completo, Idade, Celular, Email, Sexo, Dores_no_Corpo, Alergias, Medicamentos_em_Uso, CEP, Sintomas_de_Febre) VALUES ( ?, ?, ?, ?, ?, ?, ?,? ,? ,? )";

        try (Connection connection = conexao.Conexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

          
            ps.setString(1, pm.getNome_Completo());
            ps.setString(2, pm.getIdade());
            ps.setString(3, pm.getCelular());
            ps.setString(4, pm.getEmail());
            ps.setString(5, pm.getSexo());
            ps.setString(6, pm.getDores_no_Corpo());
            ps.setString(7, pm.getAlergias());
            ps.setString(8, pm.getMedicamento_em_Uso());
            ps.setString(9, pm.getCEP());
            ps.setString(10, pm.getSintomas_de_Febre());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Triagem registrada com sucesso");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public List<PacienteModel> mostrarPacientes() {
        
        String sql = "SELECT * FROM Paciente";

        List<PacienteModel> pacientes = new ArrayList<>();

        try (Connection connection = conexao.Conexao(); PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                PacienteModel pm = new PacienteModel();

                pm.setId_Paciente(resultSet.getInt("Id_Paciente"));
                pm.setNome_Completo(resultSet.getString("Nome_Completo"));
                pm.setIdade(resultSet.getString("Idade"));
                pm.setCelular(resultSet.getString("Celular"));
                pm.setEmail(resultSet.getString("Email"));
                pm.setSexo(resultSet.getString("Sexo"));
                pm.setDores_no_Corpo(resultSet.getString("Dores_no_Corpo"));
                pm.setAlergias(resultSet.getString("Alergias"));
                pm.setMedicamento_em_Uso(resultSet.getString("Medicamento_em_Uso"));
                pm.setCEP(resultSet.getString("CEP"));
                pm.setSintomas_de_Febre(resultSet.getString("Sintomas_de_Febre"));

                pacientes.add(pm);
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return pacientes;
    }
}
