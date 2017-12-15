/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        Calculos obxVivido=new Calculos();
        obxVivido.recibirNomEd(obxVivido.nombre, obxVivido.edad);
        obxVivido.calcularLoVivido(obxVivido.meses, obxVivido.dias, obxVivido.horas);
        
    }
}
