package fr.avainfo.fistwebsite.test;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        try {
            String content = Files.readString(Path.of("src\\main\\resources\\songs.json"), StandardCharsets.UTF_8);
            JSONObject jsonObject = new JSONObject(content);
            System.out.println(jsonObject.getJSONArray("songs").getJSONObject(1).get("artist"));
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
