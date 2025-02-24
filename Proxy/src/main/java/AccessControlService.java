import java.util.HashSet;

public class AccessControlService {

    private static AccessControlService instance;
    private HashSet<String> allowedUsers;

    private AccessControlService() {
        allowedUsers = new HashSet<>();
        allowedUsers.add("user1");
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(String username) {
        return allowedUsers.contains(username);
    }


}
