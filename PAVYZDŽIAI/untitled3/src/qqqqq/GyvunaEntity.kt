package qqqqq

import javax.persistence.*

/**
 * Created by Marius on 2/10/2017.
 */
@Entity
@Table(name = "gyvuna", schema = "test", catalog = "")
class GyvunaEntity {
    var id: Int = 0
    var vardas: String? = null
    var veisle: String? = null
    var amzius: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as GyvunaEntity?

        if (id != that!!.id) return false
        if (if (vardas != null) vardas != that.vardas else that.vardas != null) return false
        if (if (veisle != null) veisle != that.veisle else that.veisle != null) return false
        if (if (amzius != null) amzius != that.amzius else that.amzius != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + if (vardas != null) vardas!!.hashCode() else 0
        result = 31 * result + if (veisle != null) veisle!!.hashCode() else 0
        result = 31 * result + if (amzius != null) amzius!!.hashCode() else 0
        return result
    }
}
