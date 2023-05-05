package fr.avainfo.fistwebsite;

import fr.avainfo.fistwebsite.utils.Colors;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;

public class RequestManager {
    public static void main(String[] args) {
        System.out.println(Colors.ANSI_RED + "coucou");
    }

    public String getRequest(String pathUrl) {
        try {
            URL url = new URL(pathUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch(MalformedURLException e) {
            System.out.println(Colors.ANSI_RED + "[Error] L'url n'est pas bonne !");
        } catch(ProtocolException e) {
            System.out.println(Colors.ANSI_RED + "[Error] " + pathUrl.split(":")[0].toUpperCase() + " n'est pas supporté !");
        } catch(IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getRequest(String pathUrl, Map<String, String> params) {
        try {
            pathUrl += "?";
            URL url = new URL(pathUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.flush();
            out.close();
        } catch(MalformedURLException e) {
            System.out.println(Colors.ANSI_RED + "[Error] L'url n'est pas bonne !");
        } catch(ProtocolException e) {
            System.out.println(Colors.ANSI_RED + "[Error] " + pathUrl.split(":")[0].toUpperCase() + " n'est pas supporté !");
        } catch(IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
