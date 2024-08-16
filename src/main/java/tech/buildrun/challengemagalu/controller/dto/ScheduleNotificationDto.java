package tech.buildrun.challengemagalu.controller.dto;

import tech.buildrun.challengemagalu.entity.Channel;
import tech.buildrun.challengemagalu.entity.Notification;
import tech.buildrun.challengemagalu.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
