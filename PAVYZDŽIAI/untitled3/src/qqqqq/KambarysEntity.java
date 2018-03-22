package qqqqq;

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
    private GyvunaEntity gyvunaById;
    private GyvunasEntity gyvunasBySpalva;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public GyvunaEntity getGyvunaById() {
        return gyvunaById;
    }

    public void setGyvunaById(GyvunaEntity gyvunaById) {
        this.gyvunaById = gyvunaById;
    }

    @ManyToOne
    @JoinColumn(name = "spalva", referencedColumnName = "id", nullable = false)
    public GyvunasEntity getGyvunasBySpalva() {
        return gyvunasBySpalva;
    }

    public void setGyvunasBySpalva(GyvunasEntity gyvunasBySpalva) {
        this.gyvunasBySpalva = gyvunasBySpalva;
    }
}
