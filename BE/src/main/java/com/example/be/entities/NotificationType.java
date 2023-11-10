package com.example.be.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "notification_type")
public class NotificationType extends AuditEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_notification")
    private Notification notification;

	public NotificationType() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationType notificationType = (NotificationType) o;
        return Objects.equals(this.getId(), notificationType.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }
}
