package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Calculos {
    String nombre;
    String edad;

    int meses;
    int dias;
    int horas;
    int años;
    
    /**
     * Método para pedir/recibir el nombre y la edad.
     * @param nombre Parámetro en el que agregamos el nombre.
     * @param edad Parámetro en el que agregamos la edad.
    */
    
    public void recibirNomEd(String nombre, String edad){
        nombre=JOptionPane.showInputDialog("Escriba su nombre: ");
        edad=JOptionPane.showInputDialog("Escriba su edad: ");
        años=Integer.parseInt(edad);
    }   
    
    /**
     * Método para calcular el tiempo vivido de una persona.
     * @param meses Parámetro en el que muestra los meses vividos.
     * @param dias Parámetro en el que muestra los dias vividos.
     * @param horas Parámetro en el que muestra las horas vividas.
     */
    public void calcularLoVivido(int meses, int dias, int horas){
        meses=(años * 12);
        dias=(años * 365);
        horas=(dias * 24);
        
        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
