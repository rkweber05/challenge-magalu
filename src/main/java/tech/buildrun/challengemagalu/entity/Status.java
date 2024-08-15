package tech.buildrun.challengemagalu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public class Status {

    @Id
    private Long statusId;
    private String despription;

    public Status() {
    }

    public Status(Long statusId, String despription) {
        this.statusId = statusId;
        this.despription = despription;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getDespription() {
        return despription;
    }

    public void setDespription(String despription) {
        this.despription = despription;
    }

    public enum Values {
        PENDING (1L, "pending"),
        SUCCESS (2L, "success"),
        ERROR (3L, "error"),
        CANCELED (4L, "canceled");

        private Long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Status toStatus(){
            return new Status(id, description);
        }
    }
}
