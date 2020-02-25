import org.json.JSONArray;
import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class PriceRequest {

    public static HttpURLConnection con;
    String url =  "https://evepraisal.com/appraisal.json";
    URL obj = new URL(url);
    con = (HttpsURLConnection) obj.openConnection();

    //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
    // con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

    String urlParameters = "market=jita&raw_textarea=tritanium&persist=no&format=json";

    // Send post request
        con.setDoOutput(true);
    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

    int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();



        while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
        in.close();

    //print result
        System.out.println(response.toString());
    JSONObject jsonObject = new JSONObject(response.toString());
    double sellPrice = jsonObject.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");
        System.out.println("sell price " + sellPrice);

}
