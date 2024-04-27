import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarYear {
    private ArrayList<BitSet> Months;
    private int Year;

    public CalendarYear(int Year){
        Months = new ArrayList<>();
        Calendar cd;
        for(int x = 0; x < 12; x++){
           cd = new GregorianCalendar(Year,x,1);
           int days = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
           BitSet MonthBitSet = new BitSet(days);
           Months.add(MonthBitSet);
        }
    }

    // Handle Error when Day is out of bounds
    public CalendarYear flipMonthDay(int Month, int Day){
        Months.get(Month).flip(Day);
    }

}
