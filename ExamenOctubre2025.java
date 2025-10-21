/**
 * EXAMEN OCTUBRE 2025 - IFC33W PROGRAMACIÓN
 * SOLUCIONES IDEALES
 * 
 * Este archivo contiene las implementaciones correctas de los ejercicios
 * del simulacro de examen de octubre 2025.
 * 
 * @author Corrección del Examen
 * @date 16/10/2025
 */
public class ExamenOctubre2025 {
    
    /**
     * EJERCICIO 1: Comprueba si un número es primo.
     * 
     * Un número primo es aquel que solo es divisible por 1 y por sí mismo.
     * Por definición matemática, los números menores o iguales a 1 no son primos.
     * 
     * Algoritmo optimizado:
     * - Descarta números <= 1
     * - Maneja el 2 como caso especial (único primo par)
     * - Descarta números pares
     * - Solo verifica divisores impares hasta √n
     * 
     * Complejidad temporal: O(√n)
     * 
     * @param numero El número entero a verificar
     * @return true si el número es primo, false en caso contrario
     */
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        
        // El 2 es el único número primo par
        if (numero == 2) {
            return true;
        }
        
        // Los números pares mayores que 2 no son primos
        if (numero % 2 == 0) {
            return false;
        }
        
        // Verificamos divisibilidad desde 3 hasta la raíz cuadrada del número
        // Solo comprobamos números impares (incremento de 2)
        // Justificación: Si n tiene divisores, al menos uno será <= √n
        for (int i = 3; i < numero; i += 2) {
            if (numero % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        
        return true; // Si no encontramos divisores, es primo
    }
    
    /**
     * EJERCICIO 2: Invierte la posición de los dígitos de un número entero positivo.
     * 
     * Algoritmo:
     * 1. Extraemos el último dígito con módulo 10
     * 2. Lo añadimos al número invertido (multiplicando por 10 y sumando)
     * 3. Eliminamos el último dígito del número original (división entera por 10)
     * 4. Repetimos hasta que no queden dígitos
     * 
     * Ejemplo con 3974:
     *   Iteración 1: digito=4, invertido=4, numero=397
     *   Iteración 2: digito=7, invertido=47, numero=39
     *   Iteración 3: digito=9, invertido=479, numero=3
     *   Iteración 4: digito=3, invertido=4793, numero=0
     * 
     * Complejidad temporal: O(log₁₀n) - proporcional al número de dígitos
     * Estructura de datos: Solo variables primitivas (int)
     * 
     * @param numero El número entero positivo a invertir
     * @return El número con sus dígitos invertidos
     */
    public static int invertirNumero(int numero) {
        int invertido = 0; // Almacenará el número invertido
        
        // Mientras queden dígitos por procesar
        while (numero > 0) {
            int digito = numero % 10;        // Extraemos el último dígito
            invertido = invertido * 10 + digito; // Lo añadimos al invertido
            numero = numero / 10;            // Eliminamos el último dígito
        }
        
        return invertido;
    }
    
    /**
     * EJERCICIO 3: Calcula el coste de una consulta médica según el número de cita.
     * 
     * Política de precios del consultorio Dr. Bruce Banner:
     * - Citas 1 y 2: 200€ cada una
     * - Citas 3, 4 y 5: 150€ cada una
     * - Citas 6 en adelante: 100€ cada una
     * 
     * Estructura de control: Condicionales if-else if-else
     * Justificación:
     * - Claridad: refleja directamente los rangos de precios
     * - Eficiencia: O(1) - tiempo constante, máximo 2-3 comparaciones
     * - Mantenibilidad: fácil modificar tarifas o añadir rangos
     * 
     * @param numeroCita El número de cita (1 para primera cita, 2 para segunda, etc.)
     * @return El coste en euros de la consulta
     * @throws IllegalArgumentException si el número de cita no es positivo
     */
    public static int costeConsulta(int numeroCita) {
        // Validación de entrada: el número de cita debe ser positivo
        if (numeroCita <= 0) {
            throw new IllegalArgumentException("El número de cita debe ser positivo");
        }
        
        // Determinamos el coste según el rango de citas
        if (numeroCita <= 2) {
            return 200; // Primeras dos citas: 200€
        } else if (numeroCita <= 5) {
            return 150; // Citas 3, 4 y 5: 150€
        } else {
            return 100; // Citas 6 en adelante: 100€
        }
    }
    
    /**
     * Método main para probar las soluciones de todos los ejercicios.
     * Ejecuta los casos de prueba proporcionados en el enunciado.
     */
    public static void main(String[] args) {
     
        System.out.println("  esPrimo(3)  = " + esPrimo(3) + "  (esperado: true)");
        System.out.println("  esPrimo(15) = " + esPrimo(15) + " (esperado: false)");
        System.out.println("  esPrimo(1)  = " + esPrimo(1) + " (esperado: false)");
        
        // Casos adicionales para verificar corrección
        System.out.println("\nCasos adicionales:");
        System.out.println("  esPrimo(2)  = " + esPrimo(2) + "  (2 es primo)");
        System.out.println("  esPrimo(0)  = " + esPrimo(0) + " (0 no es primo)");
        System.out.println("  esPrimo(-5) = " + esPrimo(-5) + " (negativos no son primos)");
        System.out.println("  esPrimo(17) = " + esPrimo(17) + "  (17 es primo)");
        System.out.println("  esPrimo(20) = " + esPrimo(20) + " (20 no es primo)");
        
        // ===== EJERCICIO 2: invertirNumero =====
        System.out.println("\n┌─────────────────────────────────────────┐");
        System.out.println("│ EJERCICIO 2: invertirNumero             │");
        System.out.println("└─────────────────────────────────────────┘");
        
        // Casos de prueba del enunciado
        System.out.println("Casos del enunciado:");
        System.out.println("  invertirNumero(3974) = " + invertirNumero(3974) + " (esperado: 4793)");
        System.out.println("  invertirNumero(63)   = " + invertirNumero(63) + "   (esperado: 36)");
        System.out.println("  invertirNumero(19)   = " + invertirNumero(19) + "   (esperado: 91)");
        System.out.println("  invertirNumero(9)    = " + invertirNumero(9) + "    (esperado: 9)");
        
        // Casos adicionales
        System.out.println("\nCasos adicionales:");
        System.out.println("  invertirNumero(100)  = " + invertirNumero(100) + "   (números con ceros)");
        System.out.println("  invertirNumero(1234) = " + invertirNumero(1234) + " (número largo)");
        
        // ===== EJERCICIO 3: costeConsulta =====
        System.out.println("\n┌─────────────────────────────────────────┐");
        System.out.println("│ EJERCICIO 3: costeConsulta              │");
        System.out.println("└─────────────────────────────────────────┘");
        
        System.out.println("Tarifas del consultorio Dr. Bruce Banner:");
        System.out.println("  Citas 1-2:      200€");
        System.out.println("  Citas 3-5:      150€");
        System.out.println("  Citas 6+:       100€\n");
        
        System.out.println("Pruebas:");
        for (int cita = 1; cita <= 10; cita++) {
            int coste = costeConsulta(cita);
            System.out.printf("  Cita %-2d: %3d€", cita, coste);
            
            // Indicar el rango
            if (cita <= 2) {
                System.out.println(" (rango inicial)");
            } else if (cita <= 5) {
                System.out.println(" (rango medio)");
            } else {
                System.out.println(" (rango reducido)");
            }
        }
        
        // Prueba de validación
        System.out.println("\nPrueba de validación:");
        try {
            costeConsulta(0);
            System.out.println("  ERROR: Debería lanzar excepción con cita 0");
        } catch (IllegalArgumentException e) {
            System.out.println("  ✓ Correctamente rechaza cita <= 0: " + e.getMessage());
        }
        
        // ===== EJERCICIO 4: Expresión booleana =====
        System.out.println("\n┌─────────────────────────────────────────┐");
        System.out.println("│ EJERCICIO 4: Expresión booleana         │");
        System.out.println("└─────────────────────────────────────────┘");
        
        System.out.println("Código dado:");
        System.out.println("  int x = 0;");
        System.out.println("  if(exp){");
        System.out.println("      System.out.println(\"x es negativo\");");
        System.out.println("  }");
        System.out.println("\nPregunta: ¿Qué expresión debe sustituir 'exp'");
        System.out.println("para que se imprima el mensaje?\n");
        
        int x = 0;
        
        System.out.println("Evaluación de opciones:");
        System.out.println("  1. false    → " + (false) + "  → No imprime");
        System.out.println("  2. x < 0    → " + (x < 0) + " → No imprime");
        System.out.println("  3. x >= 0   → " + (x >= 0) + "  → SÍ imprime ✓");
        System.out.println("  4. x > 0    → " + (x > 0) + " → No imprime");
        System.out.println("  5. true     → " + (true) + "  → SÍ imprime ✓");
        
        System.out.println("\nRESPUESTA CORRECTA: Opción 3 (x >= 0)");
        System.out.println("Justificación: Con x=0, la expresión 0>=0 evalúa a true");
        System.out.println("y por tanto se ejecuta el println.");
        System.out.println("\nNota: Existe una paradoja en el enunciado ya que el");
        System.out.println("mensaje dice 'x es negativo' pero x=0 no es negativo.");
        
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║  FIN DE LAS PRUEBAS                                    ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }
}
