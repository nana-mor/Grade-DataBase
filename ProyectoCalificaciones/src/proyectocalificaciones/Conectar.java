
package proyectocalificaciones;

import com.mysql.jdbc.Connection; //Para SQL
import java.sql.*;

public class Conectar {
    
    private static String driver="com.mysql.jdbc.Driver";
    private static String user="dana";
    private static String pass="98988585";
    private static String url="jdbc:mysql://localhost:3306/PROYECTO"; 
    static Connection con;
    
    public static Connection Conect(){
        
        con=null;
        try{ //Se usa un try-catch y se ejecuta la conexión
            Class.forName(driver);
            // Nos conectamos a la bd
            //Comando que crea la conexión con los parámetros declarados arriba
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                System. out. println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            //jLabel1.setText("Error de conexion " + e);
            System. out. println("Error de conexion "); //Imprime en consola si no se logró conectar
        } 
        return con;
    }

    
}
