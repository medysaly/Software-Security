package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
public class ServerController {

    @GetMapping("/hash")
    public String getChecksum() {
        String data = "Hello World Check Sum!";
        String name = "Mehdi Salhi";

        try {
            String checksum = calculateChecksum(data);

            return "<html><body>" +
                   "<h1>Checksum Verification</h1>" +
                   "<p><strong>Data:</strong> " + data + "</p>" +
                   "<p><strong>Name:</strong> " + name + "</p>" +
                   "<p><strong>SHA-256 Checksum:</strong> " + checksum + "</p>" +
                   "</body></html>";
        } catch (NoSuchAlgorithmException e) {
            return "Error calculating checksum: " + e.getMessage();
        }
    }

    /**
     * Calculates SHA-256 checksum for the given data
     * @param data The input string to hash
     * @return Hexadecimal string representation of the SHA-256 hash
     * @throws NoSuchAlgorithmException if SHA-256 algorithm is not available
     */
    private String calculateChecksum(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(data.getBytes());

        // Convert byte array to hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
