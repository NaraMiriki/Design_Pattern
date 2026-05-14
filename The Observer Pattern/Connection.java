package Behavioural_pattern.ex3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
	private String status;
	private PropertyChangeSupport support;
	
	public Connection() {
		support = new PropertyChangeSupport(this);
	}
	
	// Phương thức để đăng ký observer
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }
	
    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        this.status = newStatus;
        // Thông báo cho tất cả observer rằng "status" đã thay đổi
        support.firePropertyChange("status", oldStatus, newStatus);
    }
}
