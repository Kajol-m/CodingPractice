class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    @Override
    int add(int a, int b) {
        super.add(a, b);
        return a + b;
    }
    
    void printSuperClass() {
        System.out.println("My superclass is: Arithmetic");
    }
}

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.printSuperClass();
        System.out.print(adder.add(30,12)+" ");
        System.out.print(adder.add(10,3)+" ");
         System.out.print(adder.add(10,10));
    }
}
