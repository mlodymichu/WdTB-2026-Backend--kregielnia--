package pl.wsb.kregielnia.orders.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zamowienia")
    private Long idZamowienia;

    @Column(name = "id_produktu", nullable = false)
    private Long idProduktu;

    @Column(name = "ilosc_produktu", nullable = false)
    private Integer iloscProduktu;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_zamowienia", nullable = false, length = 30)
    private OrderStatus statusZamowienia;

    @Column(name = "data_zamowienia", nullable = false)
    private LocalDateTime dataZamowienia;

    @Column(name = "uwagi", length = 255)
    private String uwagi;

    protected Orders() {
    }

    public Orders(Long idProduktu, Integer iloscProduktu, OrderStatus statusZamowienia, LocalDateTime dataZamowienia, String uwagi) {
        this.idProduktu = idProduktu;
        this.iloscProduktu = iloscProduktu;
        this.statusZamowienia = statusZamowienia;
        this.dataZamowienia = dataZamowienia;
        this.uwagi = uwagi;
    }

    public Long getIdZamowienia() {
        return idZamowienia;
    }

    public Long getIdProduktu() {
        return idProduktu;
    }

    public Integer getIloscProduktu() {
        return iloscProduktu;
    }

    public OrderStatus getStatusZamowienia() {
        return statusZamowienia;
    }

    public LocalDateTime getDataZamowienia() {
        return dataZamowienia;
    }

    public String getUwagi() {
        return uwagi;
    }
}