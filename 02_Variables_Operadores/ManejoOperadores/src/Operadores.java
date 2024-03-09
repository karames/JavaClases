public class Operadores {
    public static void main(String[] args) {
        System.out.println("Operadores Aritméticos");
        System.out.println("---");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\nOperador Módulo (residuo)");
        System.out.println("---");
        System.out.println("20 mod 3 = " + 20 % 3);

        System.out.println("\nOperador Compuesto:");
        System.out.println("---");
        // a = a + 2
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\nOperador Incremento:");
        System.out.println("---");
        // int a = a + 1;
        // Puede reescribirse como
        a++;
        System.out.println("a = " + a);

        // Preincremento/decremento (se incrementa antes de asignar el valor)
        c = ++a;
        // Postincremento/decremento (se incrementa después de asignar el valor)
        // La siguiente vez que se evalua b, es cuando se incrementa
        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("\nOperador relacional:");
        System.out.println("---");
        // a es menor que b
        boolean res = a < b;
        System.out.println("a < b -> res = " + res);

        System.out.println("\nOperador Ternario:");
        System.out.println("---");
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);

        System.out.println("\nOperador de Asignación:");
        System.out.println("---");
        int i, j, k;
        // cadena de asignación
        i = j = k = 100; // valor de x, y, and z igual a 100
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
