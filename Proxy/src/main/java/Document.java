import java.util.Date;

public class Document implements DocumentI {
    private String id;
    private String content;
    private Date creationDate;

    public Document(String id, String content, Date creationDate) {
        this.id = id;
        this.content = content;
        this.creationDate = new Date();
    }

    @Override
    public String getCreationDate() {
        return creationDate.toString();
    }

    @Override
    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }
}
