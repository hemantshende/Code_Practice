import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JsoupWebsiteHashes {

    public static void main(String[] args) {
        String url = "https://www.w3schools.com";
//        String url ="https://www.amazon.com/"; 
        try {
            // Connect to the website and get its HTML document
            Document document = Jsoup.connect(url).get();

            // Extract the website content as a string
            String websiteContent = document.toString();

            // Calculate the SHA-256 hash of the website content
            String hash = calculateSHA256Hash(websiteContent);
            System.out.println("SHA-256 Hash of " + url + ":\n" + hash);
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    private static String calculateSHA256Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes());

        // Convert the byte array to a hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte hashByte : hashBytes) {
            String hex = Integer.toHexString(0xff & hashByte);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}

