package Behavioural_pattern.ex5;

public class DESEncryption implements EncryptionStrategy {

    @Override
    public String encrypt(String text) {
        return "DES Encrypted: " + text;
    }
}
