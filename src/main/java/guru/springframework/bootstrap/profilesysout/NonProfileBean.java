package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by igorg on 17.02.2025
 */
@Component
public class NonProfileBean {
    @Autowired
    public NonProfileBean(@Value("${guru.springframework.profile.message}") String msg) {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("##         NonProfileBean       ##");
        System.out.println(msg);
        System.out.println("##################################");
        System.out.println("##################################");
    }
}
