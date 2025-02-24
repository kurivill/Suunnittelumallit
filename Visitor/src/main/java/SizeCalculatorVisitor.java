public class SizeCalculatorVisitor implements FileSystemVisitor {

    @Override
    public void visit(Directory directory) {
        double size = 0;

        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
            size += element.getSize();
        }

        System.out.println("Total size:" + size);

    }

    @Override
    public void visit(File file) {
        System.out.println(file.getName() + " " + file.getSize());
    }
}
