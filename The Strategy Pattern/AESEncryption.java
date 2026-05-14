package Behavioural_pattern.ex5;

public class AESEncryption implements EncryptionStrategy {

    @Override
    public String encrypt(String text) {
        return "AES Encrypted: " + text;
    }
}
