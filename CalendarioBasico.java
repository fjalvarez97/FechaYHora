/**
 * This is a basic calendar.
 * @Fran Ã?lvarez DAM1
 * @1/11/2017 
 */
public class CalendarioBasico
{
    // Day in the calendar
    private int day;
    // Month in the calendar
    private int month;
    // Year in the calendar
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // Create an object of class CalendarioBasico
        day = 01;
        month = 01;
        year = 01;
    }
    
    /**
     * Set a date in the calendar 
     */
    public void fijarFecha(int setDay, int setMonth, int setYear)
    {
        day = setDay;
        month = setMonth;
        year = setYear;
    }
    
    /**
     * Advances one day in the calendar
     */
    public void avanzarFecha()
    {
        if (day == 30)
        {
            if (month == 12)
            {
                // if month is 12, month gets 01 and +1 year
                day = 01;
                month = 01;
                year += 1;
            }
            else
            {
                // if day is 30 but month isnt 12 day = 01 and month +1
                day = 01;
                month += 1;
            }
        }
        else
        {
            day += 1;
        }
    }
    
    public String obtenerFecha()
    // Returns the date
    {
        String dayStng;
        String monthStng;
        String yearStng;
        String zero;
        zero = "0";
        dayStng = String.valueOf(day);
        monthStng = String.valueOf(month);
        yearStng = String.valueOf(year);
        if (yearStng.length() > 2 )
        {
            yearStng = yearStng.substring(2,4);
        }
        if (dayStng.length() < 2)
        {
               dayStng = zero + dayStng;
        }
        if (monthStng.length() < 2)
        {
               monthStng = "0" + monthStng;
        }
        if (yearStng.length() < 2)
        {
               yearStng = zero + yearStng;
        }
        return dayStng + "-" + monthStng + "-" + yearStng;
    }
    
}
