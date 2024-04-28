import java.util.ArrayList;
import java.util.Collections;

public class Helpers {
    public static ArrayList<Integer> getAverageMonthByYears(ArrayList<CalendarYear> CyList){
        ArrayList<Integer> avgMonth = new ArrayList<>(Collections.nCopies(31,0));
        for(CalendarYear cy : CyList){
            ArrayList<Integer>  month = cy.getAverageMonths();
            for(int x = 0;x<month.size();x++){
                Integer val = avgMonth.get(x);
                val += month.get(x);
                avgMonth.set(x,val);
            }
        }
        return avgMonth;
    }
}
