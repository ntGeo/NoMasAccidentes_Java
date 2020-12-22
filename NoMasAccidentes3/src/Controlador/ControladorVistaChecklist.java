package Controlador;

import Vista.VistaActividades;
import Vista.VistaListaPropuestasDeMejora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaChecklist;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class ControladorVistaChecklist implements ActionListener{
    
    VistaChecklist vista = new VistaChecklist();

    public ControladorVistaChecklist(VistaChecklist v) {
        this.vista=v;
        this.vista.btnGuardarChecklist.addActionListener(this);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== vista.btnGuardarChecklist) {
            guardar();
        }
    }
    
    
    private void guardar(){
        
//        JOptionPane.showMessageDialog(vista, "Checklist Guardado correctamente");
//        VistaActividades vca = new VistaActividades();
//        vca.setVisible(true);
//        this.vista.setVisible(false);
        int yn=JOptionPane.showConfirmDialog(vista, "Checklist Guardado correctamente, ¿Desea crear propuesta de mejora?","Confirmación",JOptionPane.YES_NO_OPTION);
            
                if (yn== JOptionPane.YES_OPTION) {
                    VistaListaPropuestasDeMejora pm= new VistaListaPropuestasDeMejora();
                    pm.setVisible(true);
                    this.vista.setVisible(false);      
                }else{
                this.vista.setVisible(true);
                    VistaActividades vca = new VistaActividades();
                    vca.setVisible(true);
                    this.vista.setVisible(false);
                }
        
    }
    
}
