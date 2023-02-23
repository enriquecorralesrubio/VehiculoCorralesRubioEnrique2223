
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoCorralesRubioEnrique2223 miVehiculoCorralesRubioEnrique2223;
        int stockActual;
        
        miVehiculoCorralesRubioEnrique2223 = new VehiculoCorralesRubioEnrique2223("Seat",18000,100);
        operativaVehiculosCorralesRubioEnrique2223(miVehiculoCorralesRubioEnrique2223, 50); 
    }

    private static void operativaVehiculosCorralesRubioEnrique2223(VehiculoCorralesRubioEnrique2223 miVehiculoCorralesRubioEnrique2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoCorralesRubioEnrique2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoCorralesRubioEnrique2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoCorralesRubioEnrique2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
