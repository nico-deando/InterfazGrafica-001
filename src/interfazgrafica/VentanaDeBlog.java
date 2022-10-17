package interfazgrafica;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Nico
 */
public class VentanaDeBlog extends JFrame {

    JPanel panel1;

    VentanaDeBlog() {

        crearVentana();
        crearPanelPrincipal();
        crearTextField(30, "Nombres Empleado", panel1);
        crearTextField(60, "Cargo Empleado", panel1);
        crearTextField(90, "Departamento", panel1);
        crearTextField(120, "Jefe Asignado", panel1);
        agregarBoton(10, 125, "Ingresar Datos", panel1);
        agregarBoton(140, 125, "Modificar Datos", panel1);
        agregarBoton(274, 120, "Elimiar Datos", panel1);
        agregarBoton(400, 80, "Limpiar", panel1);
        agregarTextArea();

    }

    private void crearVentana() {
        setSize(500, 550);
        setTitle("Ventana De Blog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        panel1 = new JPanel();
        panel1.setLayout(null);
        add(panel1);
    }

    private void crearPanelPrincipal() {

        JLabel titulo = new JLabel("Mantenimiento de datos de empleado");
        Font myfont = new Font("Helvetica", Font.BOLD, 19);
        titulo.setFont(myfont);
        titulo.setBounds(65, 30, 350, 50);
        panel1.add(titulo);

        JLabel texto = new JLabel("Codigo Empleado");
        texto.setBounds(65, 90, 120, 14);
        panel1.add(texto);

        JTextField field = new JTextField();
        field.setBounds(190, 90, 90, 20);
        panel1.add(field);

    }

    private void crearTextField(int y, String txt, JPanel panel) {

        JLabel texto = new JLabel();
        texto.setText(txt);
        texto.setBounds(65, 90 + y, 120, 14);
        panel.add(texto);

        JTextField field = new JTextField();
        field.setBounds(190, 90 + y, 250, 20);
        panel.add(field);

    }

    private void agregarBoton(int x, int heigth, String txt, JPanel panel) {
        JButton boton = new JButton();
        boton.setBounds(x, 250, heigth, 20);
        boton.setText(txt);
        panel.add(boton);

    }

    private void agregarTextArea() {
        JTextArea textarea = new JTextArea();
        textarea.setBounds(18, 290, 450, 170);
        panel1.add(textarea);

        JButton boton = new JButton();
        boton.setBounds(400, 480, 80, 20);
        boton.setText("Cerrar");
        panel1.add(boton);

    }

}
