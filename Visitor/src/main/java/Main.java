import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FileSystemElement> elements = new ArrayList<>();
        elements.add(new Directory("root"));
        elements.get(0).addElement(new File("file1", "txt", 15.2));
        elements.get(0).addElement(new File("file2", "jpg", 10.2));
        elements.get(0).addElement(new File("file3", "mp3", 5.2));
        elements.get(0).addElement(new Directory("dir1"));

        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        elements.get(0).accept(visitor);

        SearchVisitor searchVisitor = new SearchVisitor("jpg");
        elements.get(0).accept(searchVisitor);
    }
}
