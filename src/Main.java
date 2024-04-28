import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       CalendarYear Cy = new CalendarYear(2024);
       Cy.setMonthDay(2,22).setMonthDay(4,1);
       Cy.setMonthDay(2, 13);
       Cy.setMonthDay(2, 1)
               .setMonthDay(2, 3)
               .setMonthDay(1, 12);


       ArrayList<Integer> intM = Cy.getMonth(2);

        System.out.println("");
    }
}
