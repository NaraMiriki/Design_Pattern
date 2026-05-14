package Behavioural_pattern.ex3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
    private List<String> statuses = new ArrayList<>();

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // Khi nhận được thông báo, cập nhật danh sách feed
        if ("status".equals(evt.getPropertyName())) {
            this.statuses.add((String) evt.getNewValue());
            System.out.println("[Feed Updated] New status: " + evt.getNewValue());
        }
    }

    public void printFeed() {
        System.out.println("Current Feed: " + statuses);
    }
}