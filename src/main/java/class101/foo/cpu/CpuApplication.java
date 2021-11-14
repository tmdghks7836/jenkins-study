package class101.foo.cpu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class CpuApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CpuApplication.class, args);
	}

}
