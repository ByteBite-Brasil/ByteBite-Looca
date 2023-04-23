/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jar.bytebite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author ViniciusJesus
 */
public class Conexao {
//    descomentar para testar conexao com outro banco
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/bytebite", "root", "#Gf39335998818");
//        } catch (ClassNotFoundException ex) {
//            System.out.println("---->Driver do bando de dados não localizado<----");
//        } catch (SQLException ex) {
//            System.out.println("Ocorreu um erro ao acessar o banco : " + ex.getMessage());
//        }
//    }
    private JdbcTemplate connection;
    
    public Conexao() {
        
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        dataSource​.setUrl("jdbc:sqlserver://server-bytebite.database.windows.net:1433;database=bd-bytebite;encryp\n" +
"t=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");


        dataSource​.setUsername("admin-bytebite");

        dataSource​.setPassword("#Gfgrupo9");

        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }
}
