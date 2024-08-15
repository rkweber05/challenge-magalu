package tech.buildrun.challengemagalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.challengemagalu.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
