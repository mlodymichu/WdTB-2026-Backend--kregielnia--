package pl.wsb.kregielnia.reservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rezewacji")
    private Long idRezewacji;

    @Column(name = "id_toru", nullable = false)
    private Long idToru;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "dane_klienta", length = 150)
    private String daneKlienta;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_rezerwacji", nullable = false, length = 30)
    private ReservationStatus statusRezerwacji;

    @Column(name = "id_klienta", nullable = false)
    private Long idKlienta;

    @Column(name = "id_zamowienia")
    private Long idZamowienia;

    // --- TUTAJ DODAJEMY KLASĘ WBUDZOWANĄ ---
    @Embedded
    private ReservationPeriod reservationPeriod;

    protected Reservation() {
    }

    public Reservation(Long idToru, LocalDateTime timestamp, String daneKlienta, ReservationStatus statusRezerwacji, Long idKlienta, Long idZamowienia, ReservationPeriod reservationPeriod) {
        this.idToru = idToru;
        this.timestamp = timestamp;
        this.daneKlienta = daneKlienta;
        this.statusRezerwacji = statusRezerwacji;
        this.idKlienta = idKlienta;
        this.idZamowienia = idZamowienia;
        this.reservationPeriod = reservationPeriod;
    }

    public Long getIdRezewacji() {
        return idRezewacji;
    }

    public Long getIdToru() {
        return idToru;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDaneKlienta() {
        return daneKlienta;
    }

    public ReservationStatus getStatusRezerwacji() {
        return statusRezerwacji;
    }

    public Long getIdKlienta() {
        return idKlienta;
    }

    public Long getIdZamowienia() {
        return idZamowienia;
    }

    public ReservationPeriod getReservationPeriod() {
        return reservationPeriod;
    }
}