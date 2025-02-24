public class File implements FileSystemElement {

    private double size;
    private String name;
    private String type;

    public File(String name, String type, double size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void addElement(FileSystemElement file) {
        throw new UnsupportedOperationException("cant add anything to files");
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
