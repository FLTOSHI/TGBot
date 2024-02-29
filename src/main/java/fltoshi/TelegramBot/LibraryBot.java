package fltoshi.TelegramBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class LibraryBot {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBot.class, args);
	}
}