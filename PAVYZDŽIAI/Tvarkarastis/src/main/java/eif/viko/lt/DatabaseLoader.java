package eif.viko.lt;

/**
 * Created by Marius on 2/8/2017.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by Marius on 2/6/2017.
 */
@Component
public class DatabaseLoader implements ApplicationRunner{
    private final PaskaitaRepository paskaitos;

    @Autowired
    public DatabaseLoader(PaskaitaRepository paskaitos) {
        this.paskaitos = paskaitos;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Course course = new Course("Java programavimas", "http://eif-courses.github.io/Programavimas-Java/");
        //course.addReview(new Review(3, "Restful easy"));
        //courses.save(course);

        String [] templates = {
                "Up and Running with %s",
                "%s Basics",
                "%s for Beginners",
                "%s for NeckBeards",
                "Under the hood: %s"
        };
        String [] buzzwords = {
                "Spring Rest Data",
                "Java 9",
                "Scala",
                "Groovy",
                "Hibernate"
        };

        List<Paskaita> courseList = new ArrayList<>();
        IntStream.range(0, 100).
                forEach(i ->{
                    String template = templates[i % templates.length];
                    String buzzword = buzzwords[i % buzzwords.length];
                    String title = String.format(template, buzzword);
                    Paskaita c = new Paskaita(title,i, "pc");
                    //c.addReview(new Review(i % 5, String.format("Moar %s please!!!", buzzword)));
                    courseList.add(c);
                });
        paskaitos.save(courseList);
    }
}