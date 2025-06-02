import java.io.FileInputStream;
import java.security.MessageDigest;

public class SimpleIntegrityChecker {

    // Method to calculate the SHA-256 hash of a file
    public static String calculateHash(String filePath) {
        try {
            // Create a SHA-256 digest object
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Read the file
            FileInputStream fis = new FileInputStream(filePath);
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Update the digest with file content
            while ((bytesRead = fis.read(buffer)) != -1) {
                digest.update(buffer, 0, bytesRead);
            }

            fis.close(); // Close file

            // Get the hash bytes
            byte[] hashBytes = digest.digest();

            // Convert hash bytes to hexadecimal format
            StringBuilder hashString = new StringBuilder();
            for (byte b : hashBytes) {
                hashString.append(String.format("%02x", b));
            }

            return hashString.toString();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    // Main method
    public static void main(String[] args) {
        String filePath = "test.txt"; // Replace with your file path
        String originalHash = "your_known_good_hash_here"; // Replace with original hash

        // Calculate current file hash
        String currentHash = calculateHash(filePath);

        // Show hash and compare
        if (currentHash != null) {
            System.out.println("Current File Hash: " + currentHash);

            if (currentHash.equals(originalHash)) {
                System.out.println("✅ File is not changed. Integrity is OK.");
            } else {
                System.out.println("⚠️ File has been modified! Integrity check failed.");
            }
        }
    }
}
