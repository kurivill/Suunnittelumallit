import java.util.ArrayList;

public class Directory implements FileSystemElement {

    private ArrayList<FileSystemElement> elements;

    private String name;
    private String type = "Directory";

    public Directory(String name) {
        elements = new ArrayList<FileSystemElement>();
        this.name = name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void addElement(FileSystemElement file) {
        elements.add(file);
    }

    public ArrayList<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public double getSize() {
        return 0;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
}
