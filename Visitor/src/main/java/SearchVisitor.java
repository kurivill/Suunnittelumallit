public class SearchVisitor implements FileSystemVisitor{

    String parameter;

    public SearchVisitor(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
            if (element.getName().equals(parameter) || element.getName().contains(parameter) || element.getType().equals(parameter)) {
                System.out.println("Found: " + element.getName());
            }
        }
    }

    @Override
    public void visit(File file) {
        if (file.getName().equals(parameter) || file.getName().contains(parameter) || file.getType().equals(parameter)) {
            System.out.println("File found: " + file.getName() + ". Type: " + file.getType() + ". Size: " + file.getSize());
        }
    }
}
