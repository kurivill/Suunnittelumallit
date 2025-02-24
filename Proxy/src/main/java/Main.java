public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        User user1 = new User("user1");
        User userfalse = new User("userfalse");

        library.addDocument("doc1", false, user1);
        library.addDocument("doc2", true, user1);



        testAccess(library, user1);
        testAccess(library, userfalse);


    }

    private static void testAccess(Library library, User user) {
        DocumentI doc1 = library.getDocument("doc1");
        System.out.println("User: " + user.getUsername() + " accessing doc1: " + doc1.getContent());;


        try {
            DocumentI doc2 = library.getDocument("doc2");

            if (doc2 instanceof DocumentProxy) {
                DocumentProxy proxy = (DocumentProxy) doc2;
                System.out.println(user.getUsername() + " tries to access: " + proxy.getContent(user.getUsername()));
            } else {
                System.out.println(user.getUsername() + " tries to access: " + doc2.getContent());
            }
        } catch (AccessDeniedException e) {
            System.out.println(user.getUsername() + ": " + e.getMessage());
        }
    }
}
