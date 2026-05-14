package Behavioural_pattern.ex5;

public class CaesarEncryption implements EncryptionStrategy {

    @Override
    public String encrypt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            ch += 3;
            result += ch;
        }
        return "Caesar Encrypted: " + result;
    }
}
