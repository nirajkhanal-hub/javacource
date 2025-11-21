public class opreator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b));  // multiplication
        System.out.println("a / b = " + (a / b));  // division
        System.out.println("b / a = " + (b / a)); // division
        System.out.println("b % a = " + (b % a)); //modulas

        a++;// post-increment
        b--;
        System.out.println("After incrementing a and decrementing b:");         
        System.out.println("a = " + a);
        System.out.println("b = " + b); 
        ++a; // pre-increment
        --b;
        System.out.println("After incrementing a and decrementing b again:");         
        System.out.println("a = " + a); 
        System.out.println("b = " + b);

    }
    
}
