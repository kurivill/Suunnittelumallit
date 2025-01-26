import java.util.Base64;

public class Encryptor {

    public static String encrypt(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

    public static String decrypt(String message) {
        return new String(Base64.getDecoder().decode(message));
    }
}
