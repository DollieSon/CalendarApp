import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       CalendarYear Cy = new CalendarYear(2024);
       Cy.setMonthDay(2,22).setMonthDay(4,1);
       Cy.setMonthDay(2, 13);
       Cy.setMonthDay(2, 1)
               .setMonthDay(2, 3)
               .setMonthDay(1, 12);

       CalendarYear Cy2 = new CalendarYear(2020);
       Cy2.setMonthDay(2,22)
               .setMonthDay(2,13)
               .setMonthDay(3,13)
               .setMonthDay(2,3);

       ArrayList<Integer> intM = Cy.getMonth(2);
       ArrayList<CalendarYear> comb = new ArrayList<>(Arrays.asList(Cy,Cy2));
       ArrayList<Integer> intA = Helpers.getAverageMonthByYears(comb);
        System.out.println("");
    }
}
