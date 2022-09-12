
package test;
import beans.Traje;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesDB {
    public static void main(String[] args) {
        actualizarTraje(1, "OTRO TIPO DE TRAJE");
        listarTraje();
        
    }
     
     public static void actualizarTraje(int traje_id, String tipoTraje) {
        //se llama el nombre de la clase de DBConnection
        //se crea el objeto
        DBConnection con= new DBConnection();
        //NOMBRE DE LA CLASE MINUSCULA COMO SE TIENE EN EL HEYDI, O TODO LO QUE NOE STE RELACIONADO A LA 
        //SETENCIA SQL MINUSCULA
        String sql = "UPDATE traje SET tipoTraje ='" + tipoTraje + "'WHERE traje_id=" + traje_id;

				
    //En este try se hace le proceso de statement
        //statement
        try {
            //se conecta el Statement con el objeto de coneccion "con"
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            //para desconectarse
            con.desconectar();
        }
    }
     
     public static void listarTraje() {
        //se llama el nombre de la clase de DBConnection
        //se crea el objeto
        DBConnection con= new DBConnection();
        //NOMBRE DE LA CLASE MINUSCULA COMO SE TIENE EN EL HEYDI, O TODO LO QUE NOE STE RELACIONADO A LA 
        //SETENCIA SQL MINUSCULA
        String sql = "SELECT * FROM Traje" ;
        
        
        //En este try se hace le proceso de statement
        //statement
        try {
            //se conecta el Statement con el objeto de coneccion "con"
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                
                int traje_id = rs.getInt("traje_id");
                String nombreTraje = rs.getString("nombreTRaje");
                String tipoTraje = rs.getString("tipoTraje");
                String marcaTraje = rs.getString("marcaTraje");
                String tallaTraje = rs.getString("tallaTraje");
                int copiasTraje = rs.getInt("copiasTraje");
                String estadoTraje = rs.getString("estadoTraje");
                double precio_Dia = rs.getDouble("precio_Dia");
                boolean novedadTraje = rs.getBoolean("novedadTraje");
                
                
                //se crea el objeto de peliculas
                Traje trajes = new Traje(traje_id,nombreTraje,tipoTraje,marcaTraje,tallaTraje,copiasTraje,estadoTraje, precio_Dia, novedadTraje );
                System.out.println(trajes.toString());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            //para desconectarse
            con.desconectar();
        }
    }
}
