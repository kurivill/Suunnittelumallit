public class EncryptedPrinter extends PrinterDecorator {
    private Encryptor encryptor = new Encryptor();

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encryptedString = encryptor.encrypt(message);
        super.print(encryptedString);
        String decryptedString = encryptor.decrypt(encryptedString);
        super.print(decryptedString);
    }

    public void decrypt(String message) {
        String decryptedString = encryptor.decrypt(message);
        super.print(decryptedString);
    }
}
