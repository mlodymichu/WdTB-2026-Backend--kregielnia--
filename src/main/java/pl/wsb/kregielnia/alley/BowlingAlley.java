package pl.wsb.kregielnia.alley.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bowling_alley")
public class BowlingAlley {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alejki")
    private Long idAlejki;

    @Column(name = "numer_alejki", nullable = false, unique = true)
    private Integer numerAlejki;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 30)
    private AlleyStatus status;

    @Column(name = "nazwa_toru", length = 50)
    private String nazwaToru;

    @Column(name = "czy_dla_dzieci", nullable = false)
    private Boolean czyDlaDzieci;

    protected BowlingAlley() {
    }

    public BowlingAlley(Integer numerAlejki, AlleyStatus status, String nazwaToru, Boolean czyDlaDzieci) {
        this.numerAlejki = numerAlejki;
        this.status = status;
        this.nazwaToru = nazwaToru;
        this.czyDlaDzieci = czyDlaDzieci;
    }

    public Long getIdAlejki() {
        return idAlejki;
    }

    public Integer getNumerAlejki() {
        return numerAlejki;
    }

    public AlleyStatus getStatus() {
        return status;
    }

    public String getNazwaToru() {
        return nazwaToru;
    }

    public Boolean getCzyDlaDzieci() {
        return czyDlaDzieci;
    }
}