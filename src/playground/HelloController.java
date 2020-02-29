package playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import playground.rough.CreateTablesLoadData;

@RestController
@RequestScope
public class HelloController {

    @Autowired
    private Environment environment;
    @Value("${AWS_ACCESS_KEY_ID}")
    private String accessId;

    @Value("${AWS_SECRET_ACCESS_KEY}")
    private String accessSecret;


    @RequestMapping("/")
    public String index() {
        CreateTablesLoadData createTablesLoadData = new CreateTablesLoadData(accessId, accessSecret);
        createTablesLoadData.createTable("CatalogItems", 10L, 5L, "Id", "N");


        return "Greetings from Spring Boot!" + accessSecret;
    }

}
