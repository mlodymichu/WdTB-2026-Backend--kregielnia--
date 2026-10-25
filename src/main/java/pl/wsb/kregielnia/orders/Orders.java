package pl.wsb.kregielnia.order.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") // Warto zostawić tabelę jako "orders" lub np. "zamowienia"
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zamowienia")
    private Long idZamowienia;

    @Column(name = "id_produktu", nullable = false)
    private Long idProduktu;

    @Column(name = "ilosc_produktu", nullable = false)
    private Integer iloscProduktu;

    protected Orders() {
    }

    public Orders(Long idProduktu, Integer iloscProduktu) {
        this.idProduktu = idProduktu;
        this.iloscProduktu = iloscProduktu;
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
}