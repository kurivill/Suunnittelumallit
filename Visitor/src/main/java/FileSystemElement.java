public interface FileSystemElement {

    void accept(FileSystemVisitor visitor);
    double getSize();
    String getName();
    String getType();
    void addElement(FileSystemElement element);
}
