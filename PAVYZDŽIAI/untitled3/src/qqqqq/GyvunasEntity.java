package qqqqq;

import javax.persistence.*;

/**
 * Created by Marius on 2/10/2017.
 */
@Entity
@Table(name = "gyvunas", schema = "test", catalog = "")
public class GyvunasEntity {
    private int id;
    private String vardas;
    private String veisle;
    private String amzius;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "vardas", nullable = true, length = 55)
    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Basic
    @Column(name = "veisle", nullable = true, length = 55)
    public String getVeisle() {
        return veisle;
    }

    public void setVeisle(String veisle) {
        this.veisle = veisle;
    }

    @Basic
    @Column(name = "amzius", nullable = true, length = 55)
    public String getAmzius() {
        return amzius;
    }

    public void setAmzius(String amzius) {
        this.amzius = amzius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GyvunasEntity that = (GyvunasEntity) o;

        if (id != that.id) return false;
        if (vardas != null ? !vardas.equals(that.vardas) : that.vardas != null) return false;
        if (veisle != null ? !veisle.equals(that.veisle) : that.veisle != null) return false;
        if (amzius != null ? !amzius.equals(that.amzius) : that.amzius != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (vardas != null ? vardas.hashCode() : 0);
        result = 31 * result + (veisle != null ? veisle.hashCode() : 0);
        result = 31 * result + (amzius != null ? amzius.hashCode() : 0);
        return result;
    }
}
