package com.example;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class EifTvarkarastisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EifTvarkarastisApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(EmployeeRepository employeeRepository, ClassRoomRepository classRoomRepository, PersonRepository personRepository){
		return x -> {


			String [] templates = {
					"Marius %s",
					"%s Tomas",
					"%s Darius",
					"%s Paulius",
					"Jonas %s"
			};
			String [] buzzwords = {
					"Petraitis",
					"Jonaitis",
					"Tomaitis",
					"Daraitis",
					"Paulaitis"
			};

			String [] auditorijos = {
					"201",
					"205",
					"301",
					"104",
					"104a"
			};
			String [] pareigos = {
					"asist.",
					"lekt.",
					"doc."

			};


			//taksasRepository.save(new Taksas("aweawe"));
			List<Employee> courseList = new ArrayList<>();
			IntStream.range(0, 100).
					forEach(i ->{
						String template = templates[i % templates.length];
						String buzzword = buzzwords[i % buzzwords.length];
						String auditorija = auditorijos[i % auditorijos.length];
						String pareiga = pareigos[i % pareigos.length];
						String title = String.format(template, buzzword);
						Employee c = new Employee(title, auditorija, pareiga, classRoomRepository.save(new ClassRoom(""+(i+100))));
						//c.addReview(new Review(i % 5, String.format("Moar %s please!!!", buzzword)));
						courseList.add(c);
						personRepository.save(new Person(""+buzzword));

					});
			employeeRepository.save(courseList);
			//t.save(new ClassRoomRepository.Taksas("waeaweawe"));



		//	employeeRepository.save(new Employee("Marius","G","lekt."));
		//	employeeRepository.save(new Employee("Paulius","GG","lekt."));
		};
	}
}

@Data
@Entity
class Employee{
	@Id
	@GeneratedValue Long id;
	String firstName;
	String lastName;
	String role;

	@ManyToOne
	ClassRoom classRoom;

	protected Employee(){}

	public Employee(String firstName, String lastName, String role, ClassRoom classRoom) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.classRoom = classRoom;
	}
}

@Data
@Entity
class ClassRoom{
	@Id @GeneratedValue Long id;
	String nr;
	@OneToMany(mappedBy = "classRoom")
	List<Employee> employees;
	protected ClassRoom(){}

	public ClassRoom(String nr) {
		this.nr = nr;
	}
}















@RepositoryRestResource
interface EmployeeRepository extends CrudRepository<Employee, Long>{

	List<Employee> findTop5ByFirstName(@Param("q") String firstName);
	List<Employee> findDistinctByRoleNotIn(@Param("pareigos") String role);

}
@RepositoryRestResource
interface ClassRoomRepository extends CrudRepository<ClassRoom, Long>{

	List<ClassRoom> findByEmployeesFirstNameContains(@Param("q")String firstName);

	/**
     * Created by Marius on 2/10/2017.
     */
    @Data
    @Entity
	class Taksas {
        private Long id;

        protected Taksas() {
        }

        @Id
		@GeneratedValue
        public Long getId() {
            return id;
        }

        public Taksas(String vardas) {
            this.vardas = vardas;
        }

        public void setId(Long id) {
            this.id = id;
        }

        private String vardas;

        @Basic
        public String getVardas() {
            return vardas;
        }

        public void setVardas(String vardas) {
            this.vardas = vardas;
        }

        private ClassRoom oneToOne;

        @OneToOne
        public ClassRoom getOneToOne() {
            return oneToOne;
        }

        public void setOneToOne(ClassRoom oneToOne) {
            this.oneToOne = oneToOne;
        }
    }
}
@RepositoryRestResource
interface TaksasRepository extends CrudRepository<ClassRoomRepository.Taksas, Long>{

}