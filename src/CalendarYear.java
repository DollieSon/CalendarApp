import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarYear {
    private ArrayList<BitSet> Months;
    private int Year;
    private ArrayList<Integer> AverageMonths;

    public CalendarYear(int Year){
        Months = new ArrayList<>();
        Calendar cd;
        for(int x = 0; x < 12; x++){
           cd = new GregorianCalendar(Year,x,1);
           int days = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
           BitSet MonthBitSet = new BitSet(days);
           Months.add(MonthBitSet);
        }
        AverageMonths = new ArrayList<Integer>(31);
        for(int i=0;i<31;i++){
            AverageMonths.add(0);
        }
    }

    // Handle Error when Day is out of bounds
    public CalendarYear setMonthDay(int Month, int Day){
        Months.get(Month).set(Day);
        Integer AvgDay = AverageMonths.get(Day);
        AvgDay+=1;
        AverageMonths.set(Day,AvgDay);
        return this;
    }
    public CalendarYear unsetMonthDay(int Month, int Day){
        Months.get(Month).clear(Day);
        Integer AvgDay = AverageMonths.get(Day);
        AvgDay+=1;
        AverageMonths.set(Day,AvgDay);
        return this;
    }

    public ArrayList<Integer> getAverageMonths(){
        return AverageMonths;
    }

    public ArrayList<Integer> getMonth(int Month){
        BitSet bsMonth = Months.get(Month);
        ArrayList<Integer> intMonth = new ArrayList<>();
        long compMonth = bsMonth.toLongArray()[0];
        int isSet = 0;
        int position = 0;
        while(compMonth > 0){
           position +=1;
           isSet = Math.toIntExact(compMonth % 2);
           if(isSet != 0){
              intMonth.add(position - 1);
           }
           compMonth/=2;
        }
        return intMonth;
    }

}
