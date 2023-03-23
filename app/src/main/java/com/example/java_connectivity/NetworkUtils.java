package com.example.java_connectivity;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class NetworkUtils {

    public static String getResponseFromURL() throws IOException {
        URL url = new URL("https://android-kotlin-fun-mars-server.appspot.com/photos");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        InputStream in = urlConnection.getInputStream();
        Scanner scanner = new Scanner(in);
        scanner.useDelimiter("\\A");
        boolean hasInput = scanner.hasNext();
        if (hasInput) {
            return scanner.next();
        } else return null;
    }
}
