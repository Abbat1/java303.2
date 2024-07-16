package glab_Java_stringmethod;//package glab_Java_stringmethod;

    public class lengthDemo {
        public static void main(String[] args) {
            String str1 = "Java";
            String str2 = "";

            System.out.println(str1.length());  // 4
            System.out.println(str2.length());  // 0
            System.out.println("Java".length());  // 4
            System.out.println("Java\n".length()); // 5
            System.out.println("Learn Java".length()); // 10
        }
        public class IsEmptyExample{
            public static void main(String args[]){
                String s1="";
                String s2="hello";
                System.out.println(s1.isEmpty());      // true
                System.out.println(s2.isEmpty());      // false
            }}
        public class StringTrimExample{
            public static void main(String args[]){
                String s1="  hello   ";
                System.out.println(s1+"how are you");        // without trim()
                System.out.println(s1.trim()+"how are you"); // with trim()
            }
        }
        public class StringLowerExample{
            public static void main(String args[]){
                String s1="HELLO HOW Are You?";
                String s1lower=s1.toLowerCase();
                System.out.println(s1lower);}
        }
        public class StringUpperExample{
            public static void main(String args[]){
                String s1="hello how are you";
                String s1upper=s1.toUpperCase();
                System.out.println(s1upper);
            }}
        public class concatDemo {
            public static void main(String[] args) {
                //------By using concat method----
                String str1 = "Learn ";
                String str2 = "Java";
                // concatenate str1 and str2
                System.out.println(str1.concat(str2)); // "Learn Java"

                // concatenate str2 and str11
                System.out.println(str2.concat(str1)); // "JavaLearn "
                //--- By using + operator---
                String s3 =  "hello";
                String s4 = "Learners";
                //  String s5 = s3.concat(s4); or
                String s5 = s3 + s4;
                //both of the above statement will give you the same result

                // Three strings are concatenated
                String message = "Welcome " + "to " + "Java";

                // String Chapter is concatenated with number 2
                String s = "Chapter" + 2; // s becomes Chapter2

                // String Supplement is concatenated with character B
                String s1 = "Supplement" + 'B'; // s1 becomes SupplementB
            }
        }
    }

