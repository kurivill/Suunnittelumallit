import java.util.Date;

public class DocumentProxy implements DocumentI {

    private Document document;
    private String id;
    private AccessControlService acs;
    private String username;

    public DocumentProxy(String id, AccessControlService acs) {
        this.id = id;
        this.acs = acs;
    }

    private void checkAccess(String username) {
        if (!acs.isAllowed(username)) {
            throw new AccessDeniedException("Access denied");
        }
    }

    @Override
    public String getContent() {
        throw new UnsupportedOperationException("Must specify user for protected documents");

    }
    public String getContent(String username) {
        checkAccess(username);
        if (document == null) {
            document = new Document(id, "content", new Date());
        }
        return document.getContent();
    }

    @Override
    public String getCreationDate() {
        if (acs.isAllowed(username)) {
            if (document == null) {
                document = new Document(id, "content", new Date());
            }
            return document.getCreationDate();
        } else {
            throw new AccessDeniedException("Access denied");
        }
    }

}
