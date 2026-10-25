package pl.wsb.kregielnia.footwear.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "footwear")
public class Footwear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_obuwia")
    private Long idObuwia;

    @Column(name = "rozmiar", nullable = false)
    private Double rozmiar; // Używamy Double, żeby obsłużyć np. połówki rozmiarów (np. 42.5)

    @Enumerated(EnumType.STRING)
    @Column(name = "dostepnosc", nullable = false, length = 30)
    private ShoeStatus dostepnosc;

    @Column(name = "id_rezerwacji")
    private Long idRezerwacji;

    protected Footwear() {
    }

    public Footwear(Double rozmiar, ShoeStatus dostepnosc, Long idRezerwacji) {
        this.rozmiar = rozmiar;
        this.dostepnosc = dostepnosc;
        this.idRezerwacji = idRezerwacji;
    }

    public Long getIdObuwia() {
        return idObuwia;
    }

    public Double getRozmiar() {
        return rozmiar;
    }

    public ShoeStatus getDostepnosc() {
        return dostepnosc;
    }

    public Long getIdRezerwacji() {
        return idRezerwacji;
    }
}