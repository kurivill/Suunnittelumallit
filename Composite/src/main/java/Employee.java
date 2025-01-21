public class Employee extends Unit{

    public int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void printData(StringBuilder sb, int level) {

        String indent = " ".repeat(level);
        sb.append(indent).append("<Employee name=\"").append(this.name).append("\" salary=\"")
                .append(salary).append("\" />\n");


    }

    @Override
    public void add(Unit unit) {
        throw new UnsupportedOperationException("Cannot add to an employee");
    }

    @Override
    public void remove(Unit unit) {
        throw new UnsupportedOperationException("Cannot remove from an employee");
    }

    @Override
    public Unit getChild(int i) {
        throw new UnsupportedOperationException("Cannot get child from an employee");
    }

    @Override
    public int getTotalSalary() {
        return this.salary;
    }
}
