package spectra.practice.bbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spectra.practice")
public class BbsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BbsApplication.class, args);
    }
}
