package GUVI.Project.Mini1;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(
        info = @Info(
                title = "EMPLOYEE MANAGEMENT APPLICATION - GUVI [ MINI PROJECT 1 ]",
                description = "Spring boot API doc to handle CRUD operations of employee data",
                version = "1.0",
                contact = @Contact(
                        name = "PRANAV VISHAL",
                        email = "pranav13vishal@gmail.com"
                )
        )
)
@SpringBootApplication
public class Mini1Application {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(Mini1Application.class, args);
    }

}
