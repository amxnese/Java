public class VowelCounter {
    public static void main(String[] args) {
        String str = "ahmed";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in '" + str + "': " + vowelCount); // 2
    }

    public static int countVowels(String str) {
        int count = 0;
        String temp = str.toLowerCase();
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
