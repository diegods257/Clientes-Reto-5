import javax.swing.*;
import java.awt.*;



public class TablaInforme2 extends JPanel{
    ModeloInforme2 modelo = new ModeloInforme2();

    public TablaInforme2(){
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