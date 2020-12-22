package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.DAO.PropuestaDeMejoraDAO;
import Modelo.PropuestaDeMejora;
import Vista.VistaFormularioNuevaPropuestaDeMejora;
import Vista.VistaListaPropuestasDeMejora;
import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class ControladorVistaFormularioNuevaPropuestaDeMejora implements ActionListener{
    PropuestaDeMejoraDAO pDao = new PropuestaDeMejoraDAO();
    PropuestaDeMejora p = new PropuestaDeMejora();
    VistaFormularioNuevaPropuestaDeMejora vistaPropuesta = new VistaFormularioNuevaPropuestaDeMejora();

    public ControladorVistaFormularioNuevaPropuestaDeMejora(VistaFormularioNuevaPropuestaDeMejora v) {
        this.vistaPropuesta=v;
        this.vistaPropuesta.btnGuardar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()== vistaPropuesta.btnGuardar) {
            guardar();
            limpiar();
        }
    }

    //Metodo para guardar propuesta
    private void guardar() {
        String responsable = vistaPropuesta.txtResponsable.getText();
        String itemDeMejora = vistaPropuesta.txtItemMejora.getText();
        String propuesta = vistaPropuesta.txtAreaPropuesta.getText();
        String observaciones = vistaPropuesta.txtAreaObservaciones.getText();
        String fechaEmision = vistaPropuesta.txtFechaActual.getText();
        
        p.setResponsable(responsable);
        p.setItemDeMejora(itemDeMejora);
        p.setPropuesta(propuesta);
        p.setObservaciones(observaciones);
        p.setFechaEmision(fechaEmision);
        
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        String correoEnvia = "geo.atavales@gmail.com";
        String contrasena = "geo112358";
        String destinatario = "g.atavales@alumnos.duoc.cl";
        String asunto= "Propuesta de Mejora";
        String mensaje = "Se ha creado nueva Propuesta de Mejora";
        
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            
        } catch (AddressException ex) {
            Logger.getLogger(ControladorVistaFormularioNuevaPropuestaDeMejora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(ControladorVistaFormularioNuevaPropuestaDeMejora.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Se envia correo");
        int r = pDao.agregar(p);
        if (r==1) {
            JOptionPane.showMessageDialog(vistaPropuesta, "Propuesta de Mejora enviada con exito.");
        }else{
            JOptionPane.showMessageDialog(vistaPropuesta, "No es posible guardar Propuesta de Mejora");
        }
        
        
        
        VistaListaPropuestasDeMejora vlpm = new VistaListaPropuestasDeMejora();
        vlpm.setVisible(true);
        this.vistaPropuesta.setVisible(false);
    }

    // Metodo para limpiar campos
    private void limpiar() {
        vistaPropuesta.txtResponsable.setText("");
        vistaPropuesta.txtItemMejora.setText("");
        vistaPropuesta.txtAreaPropuesta.setText("");
        vistaPropuesta.txtAreaObservaciones.setText("");
    }
    
    
    
}
