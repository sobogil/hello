package org.example.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String url ="www.naver.com/books/it?page=10&size=20&name=spring-boot";

		Encoder encoder = new Encoder(new Base64Encoder());
		String result = encoder.encode(url);
		System.out.println(result);
	}

}
