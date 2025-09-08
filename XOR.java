public class XOR {
    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println("Original String: " + original);
        StringBuilder xorString = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            char character = original.charAt(i);
            char xor = (char) (character ^ 0);  // XOR with 0 (no change)
            xorString.append(xor);
        }

        System.out.println("XORed String with 0: " + xorString.toString());
    }
}
