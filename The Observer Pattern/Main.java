package Behavioural_pattern.ex3;

public class Main {
    public static void main(String[] args) {
        Connection myFriend = new Connection();
        SocialMediaFeed myFeed = new SocialMediaFeed();

        // Bước 1: Cập nhật status khi CHƯA quan sát (không in ra gì)
        myFriend.setStatus("Hello world!"); 
        
        // Bước 2: Đăng ký myFeed để theo dõi myFriend
        myFriend.addPropertyChangeListener(myFeed);

        // Bước 3: Cập nhật status sau khi đã kết nối
        myFriend.setStatus("Eating lunch...");
        myFriend.setStatus("Coding with Java!");

        // In kết quả cuối cùng
        myFeed.printFeed();
    }
}