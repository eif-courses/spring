package generuoti;

import javax.persistence.*;

/**
 * Created by Marius on 2/10/2017.
 */
@Entity
@Table(name = "kambarys", schema = "test", catalog = "")
public class KambarysEntity {
    private int id;
    private int perimetras;
    private int duruSkaicius;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "perimetras")
    public int getPerimetras() {
        return perimetras;
    }

    public void setPerimetras(int perimetras) {
        this.perimetras = perimetras;
    }

    @Basic
    @Column(name = "duruSkaicius")
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
        if (perimetras != that.perimetras) return false;
        if (duruSkaicius != that.duruSkaicius) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + perimetras;
        result = 31 * result + duruSkaicius;
        return result;
    }
}
