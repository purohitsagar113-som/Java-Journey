public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Whole Number
            //Byte
            //short
           //int
          // long

    byte age1 = 127;
    short age2 = 32500;
    int age3 = 4500000;
    long age4 = 500000000l ;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        // Decimals
            //float
            //double
    float mySalary = 639.8888888888f;
    double mySalary1 = 6378.64653296235763;
        System.out.println(mySalary);
        System.out.println(mySalary1);


        float mySalary11 = 62222222239.8888888888f;
        double mySalary111 = 63222222222278.64653296235763;
        System.out.println(mySalary11);
        System.out.println(mySalary111);

        //Float Range
        float floatmin = Float.MIN_VALUE ;
        float floatmax = Float.MAX_VALUE ;

        System.out.println("Float Min Value:- " +floatmin);
        System.out.println("Float Max Value:- " +floatmax);

        //Double Range
        double doublemin = Double.MIN_VALUE ;
        double doublemax = Double.MAX_VALUE ;


        System.out.println("Double Min Value:- " +doublemin);
        System.out.println("Double Max Value:- " +doublemax);






        //Charaters
        //char

        char intial = 'a' ;

        System.out.println((int)(intial)) ;

        char Charmin = Character.MIN_VALUE ;
        char Charmax = Character.MAX_VALUE ;

        System.out.println((int)(Charmin));
        System.out.println((int)(Charmax));


        //dil

        System.out.println((char)(10084));
        System.out.println((char)('\u2764'));  //unicode representation

    //charHindi
        char Hindichar = 2309 ;
        System.out.println((char)Hindichar);

    //print ASCII TABLE
        int i ;
        for (i=0 ; i<= 128; i++) {
            System.out.println((char)i);
        }

        //Boolean
            //boolean
        boolean isEligible = false;
        System.out.println(isEligible);

        //broad talk - widening conversion and implicit conversion ;

        int a = 5 ;   //4 bytes
        float b = a ; // 4 bytes
        long c = a ; //8 bytes

        long d = 34 ;
//        int e = d ; //because int is smaller than long

        float f = 1.5f ;
        int g = (int)f ;
        //here we used typecasting
        System.out.println(g);


        //
        byte byteValue = 10;    //1bytes
        short shortValue = byteValue ; //2bytes
        int intValue = shortValue; //4bytes
        long longValue = intValue; //8bytes

        float floatValue = longValue ;  //4bytes
        double doubleValue = floatValue; //8 bytes

        System.out.println("int: " +intValue);
        System.out.println("long: " +longValue);

        System.out.println("float: " +floatValue);
        System.out.println("double: " + doubleValue) ;

        char charValue = 'A' ;
        float floatValue1 = charValue ;  //widening conversion from char to float

        System.out.println("Char Value : " +charValue);
        System.out.println("Float Value :" +floatValue1);

        //narrowing conversion




        double doubleValue1 = 123.456;
        float floatValue2 = (float)doubleValue1 ;  //narrowing conversion from double to float
        long longValue1 = (long)(floatValue2);    //narrowing conversion from float to long
        int intValue1 = (int)longValue1 ;    //narrowing conversion from long to int

        long a1 = Long.MAX_VALUE ; //01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(a1);
        int b1 = (int) a1 ;    // 11111111 11111111 11111111 11111111
        System.out.println(b1);  // -1

        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println(Integer.toBinaryString(-1));
        
        //Here integer is class and .BinaryString is method

    }
}
