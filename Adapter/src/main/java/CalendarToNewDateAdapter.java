import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarToNewDateAdapter extends Calendar implements NewDateInterface {

    private Calendar calendar;

    public CalendarToNewDateAdapter() {
        this.calendar = new GregorianCalendar();
    }

    @Override
    public void setDay(int day) {
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setMonth(int month) {
        calendar.set(Calendar.MONTH, month);
    }

    @Override
    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int getMonth() {
        return calendar.get(Calendar.MONTH);
    }

    @Override
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        calendar.add(Calendar.DAY_OF_MONTH, days);
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }

    @Override
    public void computeTime() {
        // Nada
    }

    @Override
    public void computeFields() {
        // Nada
    }

    @Override
    public void add(int field, int amount) {
        // Nada
    }

    @Override
    public void roll(int field, boolean up) {
        // Nada
    }

    @Override
    public int getMinimum(int field) {
        return 0;
    }

    @Override
    public int getMaximum(int field) {
        return 0;
    }

    @Override
    public int getGreatestMinimum(int field) {
        return 0;
    }

    @Override
    public int getLeastMaximum(int field) {
        return 0;
    }
}
