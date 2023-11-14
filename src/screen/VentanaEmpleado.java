package screen;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;

import com.toedter.calendar.JDateChooser;

import models.Empleado;

public class VentanaEmpleado extends JFrame implements ActionListener{
    Empleado empleado;
private JLabel textJLabel;
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


public VentanaEmpleado(String titulo) {
    super(titulo);
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridBagLayout());
    crearComponentes();

}

private void crearComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        textJLabel = new JLabel("Empleados");
        textJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(textJLabel, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        nombreJLabel = new JLabel("usuario");
        this.add(nombreJLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        nombreJTextField = new JTextField(100);

}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}
}


//@Override
//public void actionPerformed(ActionEvent e) {
//    // TODO Auto-generated method stub
    
    
 //   }
 //   private void VentanaEmpleados(){
 //       //TO DO
 //   }
 //   
 //   private void recuperarEmpleado(){
 //       //TO DO
 //   }
 //   private void guardarEmpleado(){
 //       //TO DO
 //   }
 //   private void modificarEmpleado(){
 //       //TO DO
 //   }
 //   private void eliminarEmpleado(){
 //       //TO DO
 //   }
 //   private void limpiarCampos(){
 //       //TO DO
    //}
  //  private Empleado dameEmpleado(){
//        //TO DO
//    }
//    private void actualizaPantalla(){
//        //TO DO
//    }
//    private void llenarConboBox(){
//        //TO DO
//    }

    //private boolean validarVacio(){
        //TO DO
    //}
    //private void mensajeVacio(){
        //TO DO
  //  }
  //  private void mensajeSelecion(){
        //TO DO
   // }
   // private boolean mensajeConfirmacion(String mensaje,String accion){
        //TO DO
    //}
  //  private void mensajeEmailErro(){
        //TO DO
//    }





