import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.security.InvalidParameterException;

public class DescuentoBlackFriday {

    // Parámetros: precioOriginal es el precio de un producto marcado
    //             en la etiqueta
    // porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
    // Devuelve: el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
    // un descuento de porcentajeDescuento
    // Eleva la excepción InvalidParameter si precioOriginal es negativo

    public double PrecioFinal(double precioOriginal, double porcentajeDbescuento)
           throws InvalidParameter{
        
        if(precioOriginal < 0 || porcentajeDbescuento < 0 ||
           porcentajeDbescuento > 100){
                throw new InvalidParameterException("Invalid Parameter");
        }
        
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Date date = calendar.getTime();
        int day = calendar.get(Calendar.DATE);
        //Note: +1 the month for current month
        int month = calendar.get(Calendar.MONTH) + 1;
        if (day == 29 && month == 11){
            return precioOrginal * (1 - porcentajeDbescuento/100);
        }else{
            return precioOriginal;
        }
    
    }
}
