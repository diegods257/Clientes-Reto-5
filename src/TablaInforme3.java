import javax.swing.*;
import java.awt.*;



public class TablaInforme3 extends JPanel{
    ModeloInforme3 modelo = new ModeloInforme3();

    public TablaInforme3(){
        setLayout(new BorderLayout());
        
        JTable tablaDatos = new JTable(modelo);  

        JScrollPane panelTabla = new JScrollPane(tablaDatos); 
        add(panelTabla, BorderLayout.CENTER);

        tablaDatos.getTableHeader().setFont(new Font("Font type", Font.BOLD, 16));
        tablaDatos.getTableHeader().setForeground(Color.BLUE);

        tablaDatos.setBackground(new Color(196, 185, 182));
        tablaDatos.setGridColor(Color.BLUE);
        tablaDatos.setForeground(Color.DARK_GRAY);

    }

}