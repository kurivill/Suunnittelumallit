import java.util.Date;
import java.util.HashMap;

public class Library {
    private HashMap<String, DocumentI> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(String id, boolean isProtected, User user) {
        if (isProtected) {
            DocumentProxy proxy = new DocumentProxy(id, AccessControlService.getInstance());
            documents.put(id, proxy);
        } else {
            Document document = new Document(id, "content", new Date());
            documents.put(id, document);
        }
    }

    public DocumentI getDocument(String id) {
        return documents.get(id);
    }
}
