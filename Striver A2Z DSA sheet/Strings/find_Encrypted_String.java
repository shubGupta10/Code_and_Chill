public class find_Encrypted_String {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder encryptedString = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char initialChar = s.charAt(i);
            int newCharIndex = (i + k) % n;
            char replacedChar = s.charAt(newCharIndex);
            encryptedString.append(replacedChar);
        }

        return encryptedString.toString();
    }
}
