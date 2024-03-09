public class ManejoVariables {

    public static void main(String[] args) {
        // Variables boolean
        System.out.println("Variables boolean");
        System.out.println("---");
        boolean bool1;
        bool1 = true;
        boolean bool2 = false;
        System.out.println("Valor bool1: " + bool1);
        System.out.println("Valor bool2: " + bool2);

        // Variables byte
        System.out.println("\nVariables byte");
        System.out.println("---");
        byte b1 = 10;
        byte b2 = 012;
        byte b3 = 0xA;
        System.out.println("Valor b1: " + b1);
        System.out.println("Valor b2: " + b2);
        System.out.println("Valor b3: " + b3);

        // Variables short
        System.out.println("\nVariables short");
        System.out.println("---");
        short s1 = 2;
        System.out.println("Valor s1: " + s1);

        // Variables char
        System.out.println("\nVariables char");
        System.out.println("---");
        char char1 = 65, char2 = 'A';
        System.out.println("Valor char1: " + char1);
        System.out.println("Valor char2: " + char2);

        // Variable enteras
        System.out.println("\nVariables enteras");
        System.out.println("---");
        int decimal = 100;
        int octal = 0144;
        int hexadecimal = 0x64;
        System.out.println("Valor decimal: " + decimal);
        System.out.println("Valor octal: " + octal);
        System.out.println("Valor hexadecimal: " + hexadecimal);

        // Variables long
        System.out.println("\nVariables long");
        System.out.println("---");
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1: " + long1);
        System.out.println("Valor long2: " + long2);

        // Variables float
        System.out.println("\nVariables float");
        System.out.println("---");
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor f1: " + f1);
        System.out.println("Valor f2: " + f2);

        // Variables double
        System.out.println("\nVariables double");
        System.out.println("---");
        double d1 = 11, d2 = 30.15D;
        System.out.println("Valor d1: " + d1);
        System.out.println("Valor d2: " + d2);
    }
}
