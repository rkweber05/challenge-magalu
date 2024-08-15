package tech.buildrun.challengemagalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.challengemagalu.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
