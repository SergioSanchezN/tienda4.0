
package tienda;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;


public class observador implements Observer{
    @SuppressWarnings("unchecked")
    
    InventarioProducto inprodu;
    
    
    @Override
    public void update(Observable observable, Object args){
        if (args instanceof InventarioProducto) {
            inprodu = (InventarioProducto) args;
            JOptionPane.showMessageDialog(null, "El inventario del producto "
            +inprodu.getNombre()+" se ha actualizado. Ahora hay "
                    +String.valueOf(inprodu.getCantidad())+" unidades"); 
        }
    }


}
