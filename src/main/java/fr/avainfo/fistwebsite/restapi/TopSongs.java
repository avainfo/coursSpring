package fr.avainfo.fistwebsite.restapi;

import org.apache.tomcat.util.json.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TopSongs {


    public static void main(String[] args) {
        System.out.println(isInteger("4"));
        System.out.println(isInteger("a"));
        System.out.println(readFile());
    }

    public static String readFile()  {
        try {
            String content = Files.readString(Path.of("src\\main\\resources\\songs.json"), StandardCharsets.UTF_8);
            JSONObject jsonObject = new JSONObject(content);
        return jsonObject.getJSONArray("songs").getJSONObject(0).getString("artist");
        } catch(IOException e) {
            e.printStackTrace();
            return "null";
        }

    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

}
