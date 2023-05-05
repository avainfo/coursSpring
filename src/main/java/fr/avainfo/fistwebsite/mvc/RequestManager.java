package fr.avainfo.fistwebsite.mvc;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Properties;

public class RequestManager {

    public static void main(String[] args) {
        checkUrl();
    }

    private static String URL = "https://emailvalidation.abstractapi.com/v1/?api_key=7dc8281dfa3f417e890339cc2b75bad6&email=";

    public static void checkUrl() {

        HttpGet req = new HttpGet(URL + "antonindosouto@gmail.com");
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        try {
            CloseableHttpResponse execute = httpClient.execute(req);
            BufferedReader is = new BufferedReader(new InputStreamReader(execute.getEntity().getContent()));
            System.out.println(is.readLine());
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

    }
}
