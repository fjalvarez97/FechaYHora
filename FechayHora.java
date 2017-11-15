
/**
 * Write a description of class FechayHora here.
 *
 * @Fran Alvarez (your name)
 * @version (a version number or a date)
 */
public class FechayHora
{
    // instance variables
    private CalendarioBasico fecha;
    // Fecha en formato 8 caracteres
    private ClockDisplay hora;
    // Hora en formato 00:00
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;
    /**
     * Constructor for objects of class FechayHora
     */
    public FechayHora()
    {
        // Se crea un objeto con valores 01-01-01 para fecha y 00:00 para hora
        fecha = new CalendarioBasico ();
        hora = new ClockDisplay();
    }
    
    public String getFechayHora()
    {
        //Devuelve la fecha y la hora
        String devolverf = fecha.obtenerFecha();
        String devolverh = hora.getTime();
        
        return devolverf + " " + devolverh;
        
    }
    
    public void avanzar()
    {
        fecha.avanzarFecha();
        hora.timeTick();
    }
    
    public void fijarFechaYHora(int daay, int moonth, int yeaar, int miin, int houur)
    {
        fecha.fijarFecha(daay,moonth,yeaar);
        hora.setTime(miin,houur);
      
    }
    
    
}
