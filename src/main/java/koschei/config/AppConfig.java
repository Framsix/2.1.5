package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Egg6 getDuck(Needle7 needle) {
        return new Egg6(needle);
    }
}
/* Rabbit4 связан с Duck5  через сеттер и аннтотацию @Autowired
*  Duck5 связан с Egg6 через поле и аннотации @Autowired, бин находиться в конфиге, который .
* принимает Needle7.
* Needle7 связан с Deth8 через конструктор, с @Autowired, который принимает объект Deth8.
* */