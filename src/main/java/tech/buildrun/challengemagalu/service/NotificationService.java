package tech.buildrun.challengemagalu.service;

import org.springframework.stereotype.Service;
import tech.buildrun.challengemagalu.controller.dto.ScheduleNotificationDto;
import tech.buildrun.challengemagalu.entity.Notification;
import tech.buildrun.challengemagalu.repository.NotificationRepository;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }
}
