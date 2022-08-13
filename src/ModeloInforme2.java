
import java.sql.*;
import javax.swing.table.*;;


public class ModeloInforme2 extends DefaultTableModel {
    ResultSet datos;

    public ModeloInforme2(){
        this.addColumn("ID_Proyecto");
        this.addColumn("Constructora");
        this.addColumn("Numero_Habitaciones");
        this.addColumn("Ciudad");
        connectionBd();
    }

 
    public void connectionBd(){
        try {

            Connection c = DriverManager.getConnection(
                    "jdbc:sqlite://C:/Users/PC01A/OneDrive/Documentos/Mision Tic 2022/Ciclo 2/Unidad 3/Reto 3/ProyectosConstruccion.db");

            System.out.println("Conexión abierta con la base de datos");

            Statement stmt = c.createStatement();
            String consulta = "SELECT ID_Proyecto, Constructora,Numero_Habitaciones, Ciudad FROM Proyecto WHERE Ciudad IN ('Santa Marta','Cartagena', 'Barranquilla') AND Clasificacion = 'Casa Campestre'";
            
            datos = stmt.executeQuery(consulta);

            while(datos.next()){  
                Object [] fila = new Object[4];  
                for (int i = 0; i<4; i++){      
                    fila[i] = datos.getObject(i+1); 
                }
                this.addRow(fila); 
            }

            stmt.close();
            c.close();
            System.out.println("La consulta se realizo con exito!");
            
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
           
        }
        
    }
    
}