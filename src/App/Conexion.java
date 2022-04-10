package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
    //Variables
    
    public String usuario = "sa";
    public String pass = "1234";
    public String url = "jdbc:sqlserver://Localhost:1433;databaseName=Crud;";
    public Connection cn = null;
    public  Statement st = null;
    
    
    //Metodo de conexion con Statement
    public Statement conectar()
    {
        
        //exención de errores
        try{
            
            Connection cn = DriverManager.getConnection(url, usuario, pass);
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return st;  
    }
    
    
    //Metodo de conexion con Connection

    public static Connection getConexion()
    {
        //Variables
        String url = "jdbc:sqlserver://Localhost:1433;databaseName=Crud;"
                + "database=Crud;"
                + "User=sa;"
                + "Password=1234;";
        
        //exención de errores
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
                    
        } catch (SQLException e) {
            
          JOptionPane.showMessageDialog(null, e);
          return null;

        }
                 
    }
    
    
    
}
