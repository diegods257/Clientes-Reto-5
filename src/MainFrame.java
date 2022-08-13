import java.awt.*;

import javax.swing.*;


public class MainFrame extends JFrame {
    

    public void inicializar() {


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        setLayout(new BorderLayout());
      

        TablaInforme1 tabla = new TablaInforme1(); 
        TablaInforme2 tabla2 = new TablaInforme2();

        TablaInforme3 tabla3 = new TablaInforme3();
        
       JTabbedPane pestanas = new JTabbedPane();

        pestanas.addTab("Informe 1", tabla); 
        pestanas.addTab("Informe 2", tabla2);
        pestanas.addTab("Informe 3", tabla3);
        //add(pestanas, BorderLayout.NORTH);
        pestanas.setBackgroundAt(1,Color.LIGHT_GRAY);
        pestanas.setBackgroundAt(2,Color.GREEN);
        pestanas.setBackground(new Color(120, 140, 100));
        pestanas.setForeground(Color.BLACK);
           
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 2));
        JLabel ejemplo = new JLabel("ejemplo");


        JLabel jLabelImagen = new JLabel();
        jLabelImagen.setIcon(new ImageIcon("C:/Users/PC01A/OneDrive/Imágenes/Captinfo.JPG"));
        panelBotones.add(jLabelImagen, BorderLayout.NORTH);
        panelBotones.add(pestanas, BorderLayout.SOUTH);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
       // panelPrincipal.add(jLabelImagen, BorderLayout.SOUTH);

        add(panelPrincipal);

        setTitle("Bienvenido, por favor seleccionar el informe deseado");
        setSize(1500, 800);
        setMinimumSize(new Dimension(400, 400));
        setMaximumSize(new Dimension(600, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
   

    }


    public static void main(String[] args) throws Exception {
        MainFrame ventana = new MainFrame();
        ventana.inicializar();

    }

}
