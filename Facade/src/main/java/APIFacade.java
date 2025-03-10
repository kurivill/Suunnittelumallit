import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIFacade {

    public String getAttributeValueFromJSON(String APIurl, String attributeName) throws IllegalArgumentException, IOException {

        URL url = new URL(APIurl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        StringBuilder content = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
        } finally {
            con.disconnect();
        }

        JSONParser parser = new JSONParser();

        // Alla oleva blokki tekee sen, että jos on nested json, niin se hakee sen oikean arvon. Tässä kysytty tekoälyltä neuvoa
        // Alla kommenteissa aikaisempi versio
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(content.toString());
            String[] keys = attributeName.split("\\.");
            for (int i = 0; i < keys.length - 1; i++) {
                jsonObject = (JSONObject) jsonObject.get(keys[i]);
                if (jsonObject == null) {
                    throw new IllegalArgumentException("Invalid attribute path: " + attributeName);
                }
            }

            Object value = jsonObject.get(keys[keys.length - 1]);
            if (value == null) {
                throw new IllegalArgumentException("Invalid attribute name: " + attributeName);
            }

            return value.toString();

        } catch (ParseException e) {
            throw new IllegalArgumentException("Error parsing JSON response");
        }
    }

    /*
    import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIFacade {

    public String getAttributeValueFromJSON(String APIurl, String attribute) throws IllegalArgumentException, IOException {

            URL url = new URL(APIurl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            StringBuilder content = new StringBuilder();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

            } finally {
                con.disconnect();
            }

            JSONParser parser = new JSONParser();
            try {
                JSONObject jsonObject = (JSONObject) parser.parse(content.toString());
                return (String) jsonObject.get(attribute);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid attribute name");
            }
    }

}

     */
}
