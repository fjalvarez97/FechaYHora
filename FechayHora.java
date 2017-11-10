
/**
 * Write a description of class FechayHora here.
 *
 * @Fran Alvarez (your name)
 * @version (a version number or a date)
 */
public class FechayHora
{
    // instance variables - replace the example below with your own
    private CalendarioBasico fecha;
    private ClockDisplay hora;

    /**
     * Constructor for objects of class FechayHora
     */
    public FechayHora()
    {
        fecha = new CalendarioBasico ();
        hora = new ClockDisplay();
    }
    
    public String getFechayHora()
    {
        String devolverf = fecha.obtenerFecha();
        String devolverh = hora.getTime();
        
        return devolverf + " " + devolverh;
        
    }
}
