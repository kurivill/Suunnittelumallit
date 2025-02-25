public class Main {

    public static void main(String[] args) {

        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter();
        adapter.setDay(1);
        adapter.setMonth(1);
        adapter.setYear(2020);

        System.out.println(adapter);

        adapter.advanceDays(10);

        System.out.println(adapter);

        adapter.advanceDays(30);

        System.out.println(adapter);
    }
}
