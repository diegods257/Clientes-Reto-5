import javax.swing.*;
import java.awt.*;



public class TablaInforme1 extends JPanel{
    ModeloInforme1 modelo = new ModeloInforme1();

    public TablaInforme1(){
        setLayout(new BorderLayout());
        
        JTable tablaDatos = new JTable(modelo);  //para crear una nueva tabla se debe pasar como parametro de entrada el modelo  

        JScrollPane panelTabla = new JScrollPane(tablaDatos); //al panel tablaCliente se le agrega el JScrollPane con los datos de los clientes
        add(panelTabla, BorderLayout.CENTER);
        tablaDatos.getTableHeader().setFont(new Font("Font type", Font.BOLD, 16));
        tablaDatos.getTableHeader().setForeground(Color.BLUE);

        tablaDatos.setBackground(new Color(196, 185, 182));
        tablaDatos.setGridColor(Color.BLUE);
        tablaDatos.setForeground(Color.DARK_GRAY);
    }

}
