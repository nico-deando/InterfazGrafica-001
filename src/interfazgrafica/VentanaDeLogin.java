package interfazgrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaDeLogin extends JFrame {

    JTextField textfield1;
    JTextField textfield2;
    JButton boton1;
    JPanel panel1;

    VentanaDeLogin() {
        crearVentana();
        agregarElementos();

    }

    private void crearVentana() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 240);
        setTitle("LoginAutentication");
        setResizable(false);
        panel1 = new JPanel();
        panel1.setLayout(null);
        add(panel1);
    }

    private void agregarElementos() {

        textfield1 = new JTextField();
        textfield2 = new JTextField();

        boton1 = new JButton("Login");

        boton1.setBounds(100, 130, 100, 20);
        textfield1.setBounds(50, 50, 200, 25);
        textfield1.setText("Ingrese Usuario");
        textfield2.setBounds(50, 80, 200, 25);
        textfield2.setText("Ingrese Contraseña");

        panel1.add(boton1);
        panel1.add(textfield1);
        panel1.add(textfield2);

    }

}
