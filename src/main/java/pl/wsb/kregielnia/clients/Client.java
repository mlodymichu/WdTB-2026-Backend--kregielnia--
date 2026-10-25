package pl.wsb.kregielnia.client.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_klienta")
    private Long idKlienta;

    @Column(name = "imie", nullable = false, length = 50)
    private String imie;

    @Column(name = "nazwisko", nullable = false, length = 50)
    private String nazwisko;

    @Column(name = "data_uro", nullable = false)
    private LocalDate dataUro;

    @Column(name = "nr_tel", length = 20)
    private String nrTel;

    @Column(name = "znizka", precision = 5, scale = 2)
    private BigDecimal znizka;

    protected Client() {
    }

    public Client(String imie, String nazwisko, LocalDate dataUro, String nrTel, BigDecimal znizka) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUro = dataUro;
        this.nrTel = nrTel;
        this.znizka = znizka;
    }

    public Long getIdKlienta() {
        return idKlienta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUro() {
        return dataUro;
    }

    public String getNrTel() {
        return nrTel;
    }

    public BigDecimal getZnizka() {
        return znizka;
    }
}