public class logicalopreator {
    public static void main (String[] args){
        // Logical Operators: AND, OR, NOT compare two boolean values and return a boolean result
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        boolean result;
        result= a>b && c<d; // AND operator
        System.out.println("The result of AND operator is: " + result);
        result= a>b || c<d; // OR operator
        System.out.println("The result of OR operator is: " + result);
        result=a!=b; // NOT operator
        System.out.println("The result of NOT operator is: " + result);
        
    }
}
