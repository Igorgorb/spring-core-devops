package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by igorg on 17.02.2025
 */
@Component
@Profile("qa")
public class QADataSource  implements FakeDataSource {
    @Override
    public String getConnectionInfo() {
        return "I'm the QA DataSource";
    }
}