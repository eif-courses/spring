package eif.viko.lt;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SpringBootApplication
public class TvarkarastisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TvarkarastisApplication.class, args);
	}


}

@Data
@Entity
class Paskaita{
    private @Id @GeneratedValue Long id;

    private String dalykas;
    private int auditorija;
    private String tipas;

    private Paskaita(){}

    public Paskaita(String dalykas, int auditorija, String tipas) {
        this.dalykas = dalykas;
        this.auditorija = auditorija;
        this.tipas = tipas;
    }
}
@RepositoryRestResource
interface PaskaitaRepository extends CrudRepository<Paskaita, Long>{

    List<Paskaita> findByAuditorija(@Param("q") String auditorija);
}