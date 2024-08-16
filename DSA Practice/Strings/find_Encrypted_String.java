public class find_Encrypted_String {
    //function to find encrypted string
    public String GetEncryptedString(String s, int k) {
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

    public static void main(String[] args) {
        int k = 2;
        find_Encrypted_String test = new find_Encrypted_String();
        test.GetEncryptedString("abd", k);
    }
}
