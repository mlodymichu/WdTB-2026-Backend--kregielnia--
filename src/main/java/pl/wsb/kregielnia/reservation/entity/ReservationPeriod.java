package pl.wsb.kregielnia.reservation.entity;

import jakarta.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class ReservationPeriod {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public ReservationPeriod() {}

    public ReservationPeriod(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
}