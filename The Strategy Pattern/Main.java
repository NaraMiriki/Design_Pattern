package Behavioural_pattern.ex5;

public class Main {
	public static void main(String[] args) {

        EncryptionContext context = new EncryptionContext();

        context.setStrategy(new AESEncryption());
        System.out.println(context.encrypt("Hello"));

        context.setStrategy(new DESEncryption());
        System.out.println(context.encrypt("Hello"));

        context.setStrategy(new CaesarEncryption());
        System.out.println(context.encrypt("Hello"));
    }
}
