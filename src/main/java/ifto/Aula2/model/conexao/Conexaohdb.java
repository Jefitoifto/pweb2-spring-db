package ifto.Aula2.model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexaohdb implements ConexaoJDBC{

    public static void main(String[] args) {
        System.out.println (new Conexaohdb ().criarConexao ());
    }
    @Override
    public Connection criarConexao() {
        try {
            //carregar o driver de conexão
            Class.forName("org.h2.Driver");
            //parâmetros
            String url = "jdbc:h2:mem:bdpweb";
            String usuario = "sa";
            String senha = "123";
            //retorna a conexão com o banco de dados
            return DriverManager.getConnection(url, usuario, senha);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexaohdb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    }
