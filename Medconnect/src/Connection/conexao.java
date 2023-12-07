/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class conexao {
    private static final String DATABASEURL = "jdbc:mysql://localhost:3306/medconnect";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static  Connection Conexao() throws Exception {

        Connection connection = DriverManager.getConnection(DATABASEURL, USER, PASSWORD);

        return connection;

    }

    public static void main(String[] args) throws Exception {

        Connection connection = Conexao();

        if (connection != null) {

            JOptionPane.showMessageDialog(null, "Conectado com sucesso");

            connection.close();

        }

    }
}