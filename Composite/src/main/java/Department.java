import java.util.ArrayList;
import java.util.List;

public class Department extends Unit{

    private List<Unit> units = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void printData(StringBuilder sb, int level) {

        String indent = " ".repeat(level);
        sb.append(indent).append("<Department name=\"").append(this.name).append("\">\n");
        for (Unit unit : units) {
            unit.printData(sb, level + 1);
        }
    }

    @Override
    public void add(Unit unit) {
        this.units.add(unit);
    }

    @Override
    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    @Override
    public Unit getChild(int i) {
        return this.units.get(i);
    }

    @Override
    public int getTotalSalary() {
        int total = 0;
        for (Unit unit : units) {
            total += unit.getTotalSalary();
        }
        return total;
    }


}
