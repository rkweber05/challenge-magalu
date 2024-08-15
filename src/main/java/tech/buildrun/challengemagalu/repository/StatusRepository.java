package tech.buildrun.challengemagalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.challengemagalu.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
