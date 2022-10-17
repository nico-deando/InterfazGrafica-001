package interfazgrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaDeEdad extends JFrame {

    JPanel panel1;

    VentanaDeEdad() {

        crearVentana();
        agregarPanel(15, 20, "Fecha Inicial", panel1);
        agregarPanel(250, 20, "Fecha Final", panel1);
        agregarElementos();

    }

    private void crearVentana() {
        setTitle("Calcular Edad");
        setSize(420, 260);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel1 = new JPanel();
        panel1.setLayout(null);
        add(panel1);

    }

    private void agregarPanel(int x, int y, String txt, JPanel panel) {
        JLabel text1;
        text1 = new JLabel();
        text1.setText(txt);
        text1.setBounds(x, y, 70, 10);
        panel.add(text1);

        JLabel text2;
        text2 = new JLabel("DD    MM    AAAA");
        text2.setBounds(x, y + 20, 100, 10);
        panel.add(text2);

        JTextField textfield1;
        textfield1 = new JTextField();
        textfield1.setBounds(x, y + 40, 20, 20);
        panel.add(textfield1);

        JTextField textfield2;
        textfield2 = new JTextField();
        textfield2.setBounds(x + 30, y + 40, 20, 20);
        panel.add(textfield2);

        JTextField textfield3;
        textfield3 = new JTextField();
        textfield3.setBounds(x + 60, y + 40, 40, 20);
        panel.add(textfield3);

    }

    private void agregarElementos() {

        JButton boton1 = new JButton();
        boton1.setBounds(15, 130, 150, 30);
        boton1.setText("Calcular Edad");
        panel1.add(boton1);

        JLabel texto = new JLabel();
        texto.setText("Edad: la edad de la persona es : 10 año(s)");
        texto.setBounds(15, 200, 300, 20);
        panel1.add(texto);

    }
}
