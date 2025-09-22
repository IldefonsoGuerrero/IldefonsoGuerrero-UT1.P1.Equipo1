    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ DE OPERACIONES:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Dividir");
            System.out.println("6. Dividir");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Introduce el primer número: ");
                int a = scanner.nextInt();
                System.out.print("Introduce el segundo número: ");
                int b = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + sumar(a, b));
                        break;
                    case 2:
                        
                        break;
                    case 3:

                        break;
                    case 4:
                        try {
                            System.out.println("Resultado: " + dividir(a, b));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        System.out.println("¡Gracias por usar el programa!");
        scanner.close();
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }

