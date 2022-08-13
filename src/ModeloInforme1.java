
import java.sql.*;
import javax.swing.table.*;;


public class ModeloInforme1 extends DefaultTableModel {
    ResultSet datos;

    public ModeloInforme1(){
        this.addColumn("ID_Lider");
        this.addColumn("Nombre");
        this.addColumn("Primer_Apellido");
        this.addColumn("Ciudad_Residencia");
        connectionBd();
    }

 
    public void connectionBd(){
        try {

            Connection c = DriverManager.getConnection(
                    "jdbc:sqlite://C:/Users/PC01A/OneDrive/Documentos/Mision Tic 2022/Ciclo 2/Unidad 3/Reto 3/ProyectosConstruccion.db");

            System.out.println("Conexión abierta con la base de datos");

            Statement stmt = c.createStatement();
            String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
            
            datos = stmt.executeQuery(consulta);

            while(datos.next()){  //por cada registro se agrega un nuevo arreglo de 7 filas
                Object [] fila = new Object[4];  //creo el array
                for (int i = 0; i<4; i++){      //rellenar los datos de las filas
                    fila[i] = datos.getObject(i+1);  // a la fila se le asigna el valor de la columna  
                }
                this.addRow(fila); //se agrega al modelo cada nueva fila
            }

            stmt.close();
            c.close();
            System.out.println("La consulta se realizo con exito!");
            
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
           
        }
        
    }
    
}
