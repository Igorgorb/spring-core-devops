package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by igorg on 17.02.2025
 */
@Component
@Profile("prod")
public class ProdDataSource  implements FakeDataSource {
    @Override
    public String getConnectionInfo() {
        return "I'm the Production DataSource";
    }
}