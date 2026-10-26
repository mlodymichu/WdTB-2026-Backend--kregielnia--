package pl.wsb.kregielnia.products.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produktu")
    private Long idProduktu;

    @Column(name = "nazwa_produktu", nullable = false, length = 100)
    private String nazwaProduktu;

    @Enumerated(EnumType.STRING)
    @Column(name = "kategoria_prod", nullable = false, length = 30)
    private ProductCategory kategoriaProd;

    @Column(name = "cena", nullable = false, precision = 10, scale = 2)
    private BigDecimal cena;

    @Column(name = "opis_produktu", length = 255)
    private String opisProduktu;

    @Column(name = "dostepny", nullable = false)
    private Boolean dostepny;

    protected Products() {
    }

    public Products(String nazwaProduktu, ProductCategory kategoriaProd, BigDecimal cena, String opisProduktu, Boolean dostepny) {
        this.nazwaProduktu = nazwaProduktu;
        this.kategoriaProd = kategoriaProd;
        this.cena = cena;
        this.opisProduktu = opisProduktu;
        this.dostepny = dostepny;
    }

    public Long getIdProduktu() {
        return idProduktu;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public ProductCategory getKategoriaProd() {
        return kategoriaProd;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public String getOpisProduktu() {
        return opisProduktu;
    }

    public Boolean getDostepny() {
        return dostepny;
    }
}