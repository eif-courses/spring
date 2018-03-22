package gyvunas;

import javax.persistence.*;

/**
 * Created by Marius on 2/10/2017.
 */
@Entity
@Table(name = "kambarys", schema = "test", catalog = "")
public class KambarysEntity {
    private int id;
    private int spalva;
    private int perimetras;
    private int duruSkaicius;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "spalva", nullable = false)
    public int getSpalva() {
        return spalva;
    }

    public void setSpalva(int spalva) {
        this.spalva = spalva;
    }

    @Basic
    @Column(name = "perimetras", nullable = false)
    public int getPerimetras() {
        return perimetras;
    }

    public void setPerimetras(int perimetras) {
        this.perimetras = perimetras;
    }

    @Basic
    @Column(name = "duruSkaicius", nullable = false)
    public int getDuruSkaicius() {
        return duruSkaicius;
    }

    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KambarysEntity that = (KambarysEntity) o;

        if (id != that.id) return false;
        if (spalva != that.spalva) return false;
        if (perimetras != that.perimetras) return false;
        if (duruSkaicius != that.duruSkaicius) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + spalva;
        result = 31 * result + perimetras;
        result = 31 * result + duruSkaicius;
        return result;
    }
}
