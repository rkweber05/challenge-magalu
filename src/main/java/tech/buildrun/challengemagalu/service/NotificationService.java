package tech.buildrun.challengemagalu.service;

import org.springframework.stereotype.Service;
import tech.buildrun.challengemagalu.controller.dto.ScheduleNotificationDto;
import tech.buildrun.challengemagalu.entity.Notification;
import tech.buildrun.challengemagalu.entity.Status;
import tech.buildrun.challengemagalu.repository.NotificationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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

    public void cancelNotification(Long notificationId) {
        var notification = findById(notificationId);

        if(notification.isPresent()) {
            notification.get().setStatus(Status.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }

    public void deleteNotification(Long notificationId) {
        var notification = findById(notificationId);

        if(notification.isPresent()) {
            notificationRepository.delete(notification.get());
        }
    }

    public void checkAndSend(LocalDateTime dateTime) {
        var notification = notificationRepository.findByStatusInAndDateTimeBefore(
                List.of(Status.Values.PENDING.toStatus(),
                        Status.Values.ERROR.toStatus()),
                        dateTime);

        notification.forEach(sendNotification());
    }

    private Consumer<Notification> sendNotification() {
        return notification -> {

            // TODO - REALIZAR ENVIO DA NOTIFICACAO

            notification.setStatus(Status.Values.SUCCESS.toStatus());
            notificationRepository.save(notification);
        };
    }
}
