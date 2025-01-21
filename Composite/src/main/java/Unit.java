public abstract class Unit{

    protected String name;

    public Unit(String name) {
        this.name = name;
    }

    public abstract void printData(StringBuilder sb, int level);

    public abstract void add(Unit unit);

    public abstract void remove(Unit unit);

    public abstract Unit getChild(int i);

    public abstract int getTotalSalary();


}
