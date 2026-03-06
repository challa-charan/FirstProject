public class StringOperations {
    public static void main(String[] args) {
        String text = "Hello java World ";

        //length
        System.out.println("Length: " + text.length());

        //charAt
        System.out.println("Character at index 1: " + text.charAt(1));

        //substring
        System.out.println("Substring(1,5): " + text.substring(1,5));

        //indexOf
        System.out.println("Index of 'java': " + text.indexOf("Java"));

        //equals
        String str2 = "Hello Java World";
        System.out.println("Equals: " + text.trim().equals(str2));

        // equalsIgnoreCase
        System.out.println("Equals Ignore Case: " + str2.equalsIgnoreCase("hello java world"));

        //compareTo
        System.out.println("CompareTo: " + str2.compareTo("Hello"));

        //replace
        System.out.println("Replace: " + str2.replace("Java","Proramming"));

        //trim
        System.out.println("Trim: '" + text.trim() + "'");

        //split
        String[] words = str2.split("");
        System.out.println("Split words:");
        for(String word : words){
            System.out.println(word);
        }
    }
}
