
import java.sql.*;
import javax.swing.table.*;;


public class ModeloInforme3 extends DefaultTableModel {
    ResultSet datos;

    public ModeloInforme3(){
        this.addColumn("ID_Compra");
        this.addColumn("Constructora");
        this.addColumn("Banco_Vinculado");
        
        connectionBd();
    }

 
    public void connectionBd(){
        try {

            Connection c = DriverManager.getConnection(
                    "jdbc:sqlite://C:/Users/PC01A/OneDrive/Documentos/Mision Tic 2022/Ciclo 2/Unidad 3/Reto 3/ProyectosConstruccion.db");

            System.out.println("Conexión abierta con la base de datos");

            Statement stmt = c.createStatement();
            String consulta = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra INNER JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto where Ciudad = 'Salento' AND Proveedor = 'Homecenter';";
            
            datos = stmt.executeQuery(consulta);

            while(datos.next()){  
                Object [] fila = new Object[3];  
                for (int i = 0; i<3; i++){      
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