package pl.wsb.kregielnia.footwear.entity;

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
public class footwear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_obuwia")
    private Long idObuwia;

    @Column(name = "rozmiar", nullable = false)
    private Double rozmiar;

    @Enumerated(EnumType.STRING)
    @Column(name = "dostepnosc", nullable = false, length = 30)
    private ShoeStatus dostepnosc;

    @Column(name = "id_rezerwacji")
    private Long idRezerwacji;

    @Enumerated(EnumType.STRING)
    @Column(name = "plec", nullable = false, length = 20)
    private ShoeGender plec; // Ostatnia kolumna określająca płeć

    protected footwear() {
    }

    public footwear(Double rozmiar, ShoeStatus dostepnosc, Long idRezerwacji, ShoeGender plec) {
        this.rozmiar = rozmiar;
        this.dostepnosc = dostepnosc;
        this.idRezerwacji = idRezerwacji;
        this.plec = plec;
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

    public ShoeGender getPlec() {
        return plec;
    }
}