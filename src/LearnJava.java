import java.util.Scanner;

//import date utility
public class LearnJava {
   // public static String main(String[] args){
        //variables
        //data Types - primitive types-storing simple values
//        int age = 19;
        //int-type of variable....age-label/identifier....=-assignment operator....30-value
//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);
//        byte age = 30;
//        int viewsCount = 123_456_789;//int cant be more than 2billion
//        long viewsCount1 = 3_123_456_789l;//long must have L in the end
//        float price = 10.99F;//float must have F in the end
//        char letter = 'A';
        //Reference types-storing complex objects
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);//shortcut sout
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        //point1 & point2 are referencing the same object
//        point1.x = 2;
//        System.out.println(point2);

        //Strings
//        String message = "Hello \"Hamso\"";   \\ are used for quotation in the string
//        String message = "Hello Hamso";
////        System.out.println(message.endsWith("!"));...check for a boolean
//        System.out.println(message);
                //StringBuffer and StringBuilder---string mutability
                    //StringBuffer
//            StringBuffer sbf = new StringBuffer("Hamso");//Note:can assign value here...String Buffer can be modified at anypoint in time
//            sbf.append(" Ace");
//            sbf.replace(0,5, "Hamisi");
//        System.out.println(sbf);
                    //StringBuilder



//
//        //Arrays
//        int[] numbers = {2, 3, 5, 4, 1};
//        System.out.println(numbers.length);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        int [][] numbers = {{1,3,2}, {6,4,5}};
////        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));

//        //Contants
//        final float PI = 3.14F;//final makes a variable a constant and are in caps
//        pi = 1;

        //Arithmetic Expressions
//        int result = 10 /3;//in Java 2 whole numbers divided gives a whole number
//        double results = (double)10 / (double)3;// (/,*,%,+,-) are operators 3 and 10 are operands
//        int x = 1;
//        int y = x++;
//
//        System.out.println(x);
//        System.out.println(y);

//        //Order of Operations
//        int x = (10 + 3) *2;//Operators follow BODMAS
//        System.out.println(x);

        //Casting
            //Implicit Casting(Automatic conversion)
            //byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
//            //Explicit casting---Importance of this is user may input a value as a string so you have to convert to integer
//        String a = "1";
//        int b = Integer.parseInt(a) + 2;
//        System.out.println(b);

        //Math Class
//        int result = Math.round(1.1F);rounds off - doubles and floats
//        int result = (int)Math.ceil(1.1F);returns the smallest integer that is greater than or equal to the number
//        int result = (int)Math.floor(1.1F);the largest integer that is smaller or equal to the number
//        int result = (int)Math.round(Math.random() * 100);//gets a number between 0 - 100 with no decimals and without fractions
//        int results = (int)(Math.random() * 100);//DRYd above code
//        System.out.println(results);

        //Formatting Numbers
            //$1,234,567---Formats numbers into currencies
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);
            //10% ---Formats into percentage
//        NumberFormat.getPercentInstance().format(0.1);
//        String result = percent.format(0.1);
//        System.out.println(result);

        //Testing--Levels of Testing
            //1. Unit Testing--Test Individual Modules - (functions etc.)
            //2. Integration Testing-- Test Immediately after unit testing (group components)
            //3. System Testing--Test the technical, function and business in a code
            //4. Acceptance Testing--User Acceptance Testing - for verification, performance requirements

        public static void encrypt(String messageText, int changeChar){
            String letterBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String letterSmall = letterBig.toLowerCase();

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter You Text:  ");
            String message = scan.next();
            int length = message.length();
            System.out.println("Enter the key: ");
            int key = scan.nextInt();

            for(int i = 0; i< length; i++){
                for (int j = 0; j< 26; j++){
                    if (message.charAt(i) == letterSmall.charAt(j)){
                        System.out.println(letterSmall.charAt((j + key) % 26));
                    }else if(message.charAt(i) == letterBig.charAt(j)){
                        System.out.println(letterBig.charAt((j + key) % 26));
                    }

                }

            }


        }
        public static void main(String[] args){
            System.out.println("The encrypted message is:  ");

        }

    }

//    private String createPhoneNumber(number) {
//
//            String format = "(xxx) xxx-xxxx";
//            for(int i=0; i<number.length; i++)
//                format = format.replace("x", number(i));
//            return format;
//        }
    //}

