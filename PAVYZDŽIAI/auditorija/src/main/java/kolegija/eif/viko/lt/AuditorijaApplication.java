package kolegija.eif.viko.lt;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class AuditorijaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditorijaApplication.class, args);


	}
    @Bean
    CommandLineRunner initData(GyvunasRepository gyvunasRepository){
        return x -> {
            for (int i = 0; i < 10; i++) {


                gyvunasRepository.save(new Gyvunas("Gyvate", "Geltona"));
                gyvunasRepository.save(new Gyvunas("Kate", "Geltona"));
                gyvunasRepository.save(new Gyvunas("Zirafa", "Balta"));
            }
        };
    }
}

@Data
@Entity
class Gyvunas{

	@Id @GeneratedValue Long id;

	private String pavadinimas;
	private String spalva;

	private Gyvunas(){}

	public Gyvunas(String pavadinimas, String spalva) {
		this.pavadinimas = pavadinimas;
		this.spalva = spalva;
	}
}

@RepositoryRestResource
interface GyvunasRepository extends CrudRepository<Gyvunas, Long>{

    List<Gyvunas> findBySpalva(@Param("q") String spalva);
    List<Gyvunas> findTop3BySpalva(@Param("q") String spalva);
}





