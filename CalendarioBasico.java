/**
 * This is a basic calendar.
 * @Fran Ã?lvarez DAM1
 * @1/11/2017 
 */
public class CalendarioBasico
{
    // Day in the calendar
    private DisplayDosCaracteres day;
    // Month in the calendar
    private DisplayDosCaracteres month;
    // Year in the calendar
    private DisplayDosCaracteres year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // Create an object of class CalendarioBasico
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13) ;
        year = new DisplayDosCaracteres(100);

    }
    
    /**
     * Set a date in the calendar 
     */
    public void fijarFecha(int setDay, int setMonth, int setYear)
    {
        day.setValorAlmacenado(setDay);
        month.setValorAlmacenado(setMonth);
        year.setValorAlmacenado(setYear);
    }
    
    /**
     * Advances one day in the calendar
     */
    public void avanzarFecha()
    {
       if(day.getValorAlmacenado() == 30)
       {
           month.incrementaValorAlmacenado();
       }
       
       if(month.getValorAlmacenado()== 01)
       {
           year.incrementaValorAlmacenado();
       }
       day.incrementaValorAlmacenado();
    }
    
    public String obtenerFecha()
    // Returns the date
    {
        String dayStng;
        String monthStng;
        String yearStng;
        
        dayStng = day.getTextoDelDisplay();
        monthStng = month.getTextoDelDisplay();
        yearStng = year.getTextoDelDisplay();
       
        return dayStng + "-" + monthStng + "-" + yearStng;
    }
    
}
