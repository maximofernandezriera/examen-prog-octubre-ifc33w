# 📘 PARÁMETROS Y ARGUMENTOS EN JAVA
## Ejercicios 1, 2 y 3 - Programas Principales

---

## 🎯 OBJETIVO

Esta guía explica cómo utilizar los métodos de los ejercicios 1, 2 y 3 en programas principales, demostrando el concepto fundamental de **parámetros** y **argumentos** en Java.

---

## 📚 CONCEPTOS CLAVE

### ¿Qué es un PARÁMETRO?

Un **parámetro** es una variable definida en la declaración de un método que actúa como **placeholder** (marcador de posición) para recibir datos.

```java
public static boolean esPrimo(int numero) {
    //                            ^^^^^^
    //                         PARÁMETRO
    // Es la variable que "espera" recibir un valor
}
```

### ¿Qué es un ARGUMENTO?

Un **argumento** es el valor **real** que pasamos al método cuando lo llamamos.

```java
int num = 7;
boolean resultado = esPrimo(num);
//                          ^^^
//                       ARGUMENTO
// Es el valor concreto que pasamos (7)
```

### ANALOGÍA: Función Matemática

En matemáticas: `f(x) = x²`
- **Parámetro:** `x` (la variable)
- **Argumento:** Si calculamos `f(5)`, entonces `5` es el argumento
- **Resultado:** `f(5) = 25`

En Java:
```java
public static int cuadrado(int x) {  // x es el parámetro
    return x * x;
}

int resultado = cuadrado(5);  // 5 es el argumento
// resultado = 25
```

---

## 📁 ARCHIVOS CREADOS

### 1. **Ejercicio1_EsPrimo.java**
Programa principal que utiliza el método `esPrimo`.

### 2. **Ejercicio2_InvertirNumero.java**
Programa principal que utiliza el método `invertirNumero`.

### 3. **Ejercicio3_CosteConsulta.java**
Programa principal que utiliza el método `costeConsulta`.

---

## 💻 EJERCICIO 1: esPrimo

### Declaración del método:
```java
public static boolean esPrimo(int numero) {
    //                            ^^^^^^
    //                         PARÁMETRO
    // ...
}
```

### Uso en el programa principal:

```java
public static void main(String[] args) {
    // FORMA 1: Pasar un literal como argumento
    boolean res1 = esPrimo(7);
    //                     ^
    //                  ARGUMENTO
    
    // FORMA 2: Pasar una variable como argumento
    int num = 15;
    boolean res2 = esPrimo(num);
    //                     ^^^
    //                  ARGUMENTO
    
    // FORMA 3: Usar el resultado directamente
    if (esPrimo(3)) {
        System.out.println("3 es primo");
    }
}
```

### Cómo ejecutar:
```bash
javac Ejercicio1_EsPrimo.java
java Ejercicio1_EsPrimo
```

**Entrada de ejemplo:**
```
Introduce un número entero: 17
```

**Salida esperada:**
```
--- Resultado ---
El número 17 SÍ es primo.
```

---

## 💻 EJERCICIO 2: invertirNumero

### Declaración del método:
```java
public static int invertirNumero(int numero) {
    //                                 ^^^^^^
    //                              PARÁMETRO
    // ...
}
```

### Uso en el programa principal:

```java
public static void main(String[] args) {
    // FORMA 1: Guardar el resultado en una variable
    int original = 1234;
    int invertido = invertirNumero(original);
    //                             ^^^^^^^^
    //                            ARGUMENTO
    System.out.println(invertido); // 4321
    
    // FORMA 2: Usar directamente en impresión
    System.out.println("Invertido: " + invertirNumero(567));
    //                                                 ^^^
    //                                              ARGUMENTO
    
    // FORMA 3: Usar en expresiones
    int suma = invertirNumero(12) + invertirNumero(34);
    // suma = 21 + 43 = 64
}
```

### Cómo ejecutar:
```bash
javac Ejercicio2_InvertirNumero.java
java Ejercicio2_InvertirNumero
```

**Entrada de ejemplo:**
```
Introduce un número entero positivo: 3974
```

**Salida esperada:**
```
--- Resultado ---
Número original:  3974
Número invertido: 4793
```

---

## 💻 EJERCICIO 3: costeConsulta

### Declaración del método:
```java
public static int costeConsulta(int numeroCita) {
    //                                ^^^^^^^^^^
    //                               PARÁMETRO
    // ...
}
```

### Uso en el programa principal:

```java
public static void main(String[] args) {
    // FORMA 1: Calcular coste de una cita específica
    int cita = 3;
    int precio = costeConsulta(cita);
    //                         ^^^^
    //                       ARGUMENTO
    System.out.println("Coste: " + precio + "€"); // 150€
    
    // FORMA 2: Usar en bucle para calcular total
    int total = 0;
    for (int i = 1; i <= 5; i++) {
        total += costeConsulta(i);
        //                     ^
        //                  ARGUMENTO (cambia en cada iteración)
    }
    System.out.println("Total: " + total + "€");
    
    // FORMA 3: Comparar costes
    if (costeConsulta(1) > costeConsulta(6)) {
        System.out.println("La primera cita es más cara");
    }
}
```

### Cómo ejecutar:
```bash
javac Ejercicio3_CosteConsulta.java
java Ejercicio3_CosteConsulta
```

**Entrada de ejemplo:**
```
¿Qué número de cita es? (1, 2, 3...): 4
```

**Salida esperada:**
```
--- Resultado ---
Número de cita: 4
Coste: 150€
(Tarifa media: citas 3 a 5)
```

---

## 🔍 ANÁLISIS DETALLADO

### Paso de parámetros en Java

Java utiliza **paso por valor**, lo que significa:
- Para tipos primitivos (int, boolean, etc.): se pasa una **copia** del valor
- El método no puede modificar la variable original del llamador

**Ejemplo:**
```java
public static void duplicar(int numero) {
    numero = numero * 2;  // Solo modifica la copia local
}

public static void main(String[] args) {
    int x = 5;
    duplicar(x);
    System.out.println(x); // Imprime 5, NO 10
    // x no cambió porque se pasó una copia
}
```

### Valores de retorno

Los métodos pueden **devolver** un valor que podemos usar:

```java
// Ejercicio 1: Retorna boolean
boolean esPrimo = esPrimo(7);  // Recibe true o false

// Ejercicio 2: Retorna int
int invertido = invertirNumero(123);  // Recibe 321

// Ejercicio 3: Retorna int
int coste = costeConsulta(2);  // Recibe 200
```

---

## 📊 TABLA COMPARATIVA

| Aspecto | Parámetro | Argumento |
|---------|-----------|-----------|
| **Ubicación** | En la declaración del método | En la llamada al método |
| **Propósito** | Define QUÉ tipo de datos espera | Proporciona el valor REAL |
| **Sintaxis** | `tipo nombreParametro` | Valor o variable |
| **Ejemplo** | `int numero` | `7` o `miVariable` |
| **Cantidad** | Fija (definida en la declaración) | Debe coincidir con parámetros |

---

## ✅ BUENAS PRÁCTICAS

### 1. Nombres descriptivos de parámetros
```java
// ❌ MALO
public static int calcular(int n) { ... }

// ✅ BUENO
public static int costeConsulta(int numeroCita) { ... }
```

### 2. Validar parámetros
```java
public static int costeConsulta(int numeroCita) {
    // Validar que el parámetro sea válido
    if (numeroCita <= 0) {
        throw new IllegalArgumentException("Número de cita inválido");
    }
    // ...
}
```

### 3. Documentar parámetros con JavaDoc
```java
/**
 * Calcula el coste de una consulta.
 * 
 * @param numeroCita El número de cita (debe ser positivo)
 * @return El coste en euros
 */
public static int costeConsulta(int numeroCita) { ... }
```

### 4. Usar tipos apropiados
```java
// Para valores true/false: boolean
public static boolean esPrimo(int numero) { ... }

// Para números enteros: int
public static int invertirNumero(int numero) { ... }

// Para números decimales: double
public static double calcularPromedio(double nota1, double nota2) { ... }
```

---

## 🎓 EJERCICIOS PROPUESTOS

### Ejercicio A: Múltiples parámetros
Modifica `costeConsulta` para que acepte también un descuento:

```java
/**
 * @param numeroCita Número de cita
 * @param descuentoPorcentaje Descuento a aplicar (0-100)
 * @return Coste final con descuento
 */
public static int costeConsultaConDescuento(int numeroCita, int descuentoPorcentaje) {
    int costeBase = costeConsulta(numeroCita);
    int descuento = costeBase * descuentoPorcentaje / 100;
    return costeBase - descuento;
}

// Uso:
int coste = costeConsultaConDescuento(3, 10); // Cita 3 con 10% descuento
// coste = 150 - 15 = 135€
```

### Ejercicio B: Combinar métodos
Usa el resultado de un método como argumento de otro:

```java
// ¿El número invertido de 13 es primo?
int invertido = invertirNumero(13);  // invertido = 31
boolean primo = esPrimo(invertido);   // primo = true

// O en una sola línea:
boolean resultado = esPrimo(invertirNumero(13));
```

### Ejercicio C: Método con múltiples llamadas
```java
public static void mostrarRangoPrimos(int inicio, int fin) {
    for (int i = inicio; i <= fin; i++) {
        if (esPrimo(i)) {  // Llamada repetida con diferentes argumentos
            System.out.println(i + " es primo");
        }
    }
}

// Uso:
mostrarRangoPrimos(1, 20);
// Imprime: 2, 3, 5, 7, 11, 13, 17, 19
```

---

## 🔧 DEPURACIÓN Y ERRORES COMUNES

### Error 1: Número incorrecto de argumentos
```java
// ❌ ERROR
boolean resultado = esPrimo();  // Falta el argumento
// Error de compilación: method esPrimo(int) cannot be applied to ()

// ✅ CORRECTO
boolean resultado = esPrimo(7);
```

### Error 2: Tipo incorrecto de argumento
```java
// ❌ ERROR
boolean resultado = esPrimo("7");  // String en lugar de int
// Error: incompatible types: String cannot be converted to int

// ✅ CORRECTO
boolean resultado = esPrimo(7);
```

### Error 3: No usar el valor de retorno
```java
// ⚠️ FUNCIONA pero no es útil
esPrimo(7);  // El resultado se pierde

// ✅ MEJOR
boolean resultado = esPrimo(7);  // Guardamos el resultado
if (resultado) {
    System.out.println("Es primo");
}
```

### Error 4: Confundir parámetro con variable local
```java
public static boolean esPrimo(int numero) {
    int numero = 5;  // ❌ ERROR: Ya existe 'numero' como parámetro
    // Error: variable numero is already defined
}
```

---

## 📈 NIVELES DE COMPLEJIDAD

### Nivel 1: Llamada simple
```java
boolean res = esPrimo(7);
```

### Nivel 2: Llamada con variable
```java
int num = 7;
boolean res = esPrimo(num);
```

### Nivel 3: Llamada en condición
```java
if (esPrimo(7)) {
    System.out.println("Es primo");
}
```

### Nivel 4: Llamada en bucle
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(costeConsulta(i));
}
```

### Nivel 5: Llamadas anidadas
```java
boolean resultado = esPrimo(invertirNumero(13));
```

### Nivel 6: Método que llama a otro método
```java
public static void mostrarInfoNumero(int num) {
    System.out.println("Número: " + num);
    System.out.println("Invertido: " + invertirNumero(num));
    System.out.println("¿Es primo?: " + esPrimo(num));
    System.out.println("¿Su invertido es primo?: " + esPrimo(invertirNumero(num)));
}
```

---

## 🎯 RESUMEN PARA ESTUDIANTES

### Lo que debes saber:

1. **Declaración del método:** Define el parámetro
   ```java
   public static tipo nombreMetodo(tipo parametro)
   ```

2. **Llamada al método:** Proporciona el argumento
   ```java
   nombreMetodo(argumento);
   ```

3. **El argumento puede ser:**
   - Un literal: `esPrimo(7)`
   - Una variable: `esPrimo(num)`
   - Una expresión: `esPrimo(x + 1)`
   - Resultado de otro método: `esPrimo(invertirNumero(13))`

4. **El valor de retorno puede:**
   - Guardarse en variable: `int x = invertirNumero(123);`
   - Usarse directamente: `System.out.println(invertirNumero(123));`
   - Usarse en condiciones: `if (esPrimo(7)) { ... }`
   - Pasarse como argumento: `esPrimo(invertirNumero(13))`

---

## 📝 CHECKLIST PARA EL EXAMEN

Cuando uses un método en el programa principal, verifica:

- [ ] ¿Pasé el número correcto de argumentos?
- [ ] ¿Los argumentos son del tipo correcto?
- [ ] ¿Usé el valor de retorno (si el método retorna algo)?
- [ ] ¿Validé la entrada del usuario antes de pasarla como argumento?
- [ ] ¿Mi código compila sin errores?
- [ ] ¿Probé con los ejemplos del enunciado?

---

## 🚀 EJECUCIÓN DE LOS PROGRAMAS

### Compilar todos los ejercicios:
```bash
javac Ejercicio1_EsPrimo.java
javac Ejercicio2_InvertirNumero.java
javac Ejercicio3_CosteConsulta.java
```

### Ejecutar cada programa:
```bash
java Ejercicio1_EsPrimo
java Ejercicio2_InvertirNumero
java Ejercicio3_CosteConsulta
```

### Compilar y ejecutar en un paso:
```bash
javac Ejercicio1_EsPrimo.java && java Ejercicio1_EsPrimo
```

---

**FIN DE LA GUÍA**

💡 **Recuerda:** La práctica es fundamental. Ejecuta estos programas, modifica los valores, observa los resultados y experimenta con diferentes argumentos para comprender completamente el concepto de parámetros y argumentos.
