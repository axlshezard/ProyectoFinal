package screen;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


import models.Empleado;

public class VentanaEmpleados extends JFrame implements ActionListener{
    Empleado empleado;
private JLabel textLabel;
private JLabel numeroEmpleadoJLabel;
private JLabel nombreJLabel;
private JLabel domicilioJLabel;
private JLabel telefonoJLabel;
private JLabel emailJLabel;
private JLabel fechaJLabel;
private JLabel generoJLabel;
private JComboBox<Long> numeroEmpleadoJComboBox;
private JTextField nombreJTextField;
private JTextField domicilioJTextField;
private JTextField telefonoJTextField;
private JTextField emailJTextField;
private JDateChooser fehcaJDateChooser;
private JComboBox<String> generoJComboBox;
private JButton buscarJButton;
private JButton guardarJButton;
private JButton modificarJButton;
private JButton eliminarJButton;
private JButton limpiarJButton;
public VentanaEmpleados() {
}

}

}
