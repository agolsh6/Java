package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.Internationalfiles.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.lang.Thread;
import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);


		WelcomeMessage welcomeMessageEng = new WelcomeMessage(Locale.US);
		Thread engWelcomeThread = new Thread(welcomeMessageEng);
		engWelcomeThread.start();

		WelcomeMessage welcomeMessageFr = new WelcomeMessage(Locale.CANADA_FRENCH);
		Thread frWelcomeThread = new Thread(welcomeMessageFr);
		frWelcomeThread.start();
	}
}
