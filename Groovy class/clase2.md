# 📘 Groovy - Clase 2: Números, Métodos y Operaciones Matemáticas

En esta clase aprenderás a trabajar con números en Groovy, sus métodos más importantes, conversiones y funciones matemáticas.

---

## 🔢 1. Uso básico de números

```groovy
def numero = 5
println numero        // 5
```

En Groovy, los números son objetos, lo que significa que tienen métodos útiles.

---

## ⚖️ 2. Comparación de números

### `compareTo()`

```groovy
def a = 10
def b = 20

println a.compareTo(b)  // -1 → menor
println b.compareTo(a)  // 1  → mayor
println a.compareTo(10) // 0  → igual
```

---

### `equals()`

```groovy
def a = 10
def b = 10

println a.equals(b) // true
```

---

## 🔄 3. Conversión de datos

### `toString()`

```groovy
def numero = 123
println numero.toString()  // "123"
```

---

### Convertir String a número

```groovy
def texto = "100"
def numero = Integer.parseInt(texto)

println numero + 50  // 150
```

---

### `valueOf()`

```groovy
def numero = Integer.valueOf("200")
println numero       // 200
```

📌 Similar a `parseInt()`, pero devuelve un objeto.

---

### Conversión con métodos de Groovy

```groovy
def texto = "4.8"

def numeroConvertido = texto.toDouble()

println numeroConvertido          // 4.8
println numeroConvertido.getClass() // class java.lang.Double
```

---

## 🧠 4. Métodos matemáticos básicos

```groovy
println Math.abs(-10)     // 10
println Math.min(3, 7)    // 3
println Math.max(3, 7)    // 7
```

👉 Muy usados en lógica y validaciones.

---

## 🔁 5. Redondeo de números

```groovy
def num = 4.3

println Math.ceil(num)   // 5.0 → hacia arriba
println Math.floor(num)  // 4.0 → hacia abajo
println Math.round(num)  // 4   → más cercano
```

---

## 🔬 6. Potencias y raíces

```groovy
println Math.pow(2, 3)  // 8
println Math.sqrt(16)   // 4
```

---

## 📊 7. Funciones avanzadas

```groovy
println Math.exp(1)  // 2.718281828459045
println Math.log(10) // 2.302585092994046
```

👉 Uso más matemático/avanzado.

---

## 📐 8. Trigonometría

```groovy
println Math.sin(0) // 0.0
println Math.cos(0) // 1.0
```

👉 Útil en gráficos, simulaciones o matemáticas.

---

## 🎲 9. Números aleatorios

```groovy
println Math.random() // Ej: 0.734928374 (valor entre 0 y 1)
```

👉 Genera un número entre 0 y 1.

---

## 🔄 10. Conversión de tipos numéricos

```groovy
def numero = 3.7

println numero.intValue()     // 3
println numero.longValue()    // 3
println numero.floatValue()   // 3.7
println numero.doubleValue()  // 3.7
```

---

## ⚠️ 11. Truncamiento vs Redondeo

```groovy
def valor = 2.9

println valor.intValue()      // 2
println Math.round(valor)     // 3
println Math.ceil(valor)      // 3.0
println Math.floor(valor)     // 2.0
```

📌 Diferencia clave:

* `intValue()` → corta el decimal
* `round()` → aproxima
* `ceil()` → siempre sube
* `floor()` → siempre baja

---

## 🎯 12. Ejemplo práctico

```groovy
def numero = -5.7

println Math.abs(numero)   // 5.7
println Math.round(numero) // -6
println Math.sqrt(25)      // 5
println Math.max(10, 20)   // 20
```

---

## 🧪 13. Caso real (notas)

```groovy
def nota = 3.6

def truncada = nota.intValue()
def redondeada = Math.round(nota)

println "Nota original: $nota"     // Nota original: 3.6
println "Truncada: $truncada"      // Truncada: 3
println "Redondeada: $redondeada"  // Redondeada: 4
```

---

## 🧩 Buenas prácticas

* Usa `round()` cuando trabajes con valores reales (ej: notas, precios)
* Evita `intValue()` si necesitas precisión
* Usa `Math` para lógica matemática clara
* Prefiere métodos de Groovy (`toDouble()`, etc.) para conversiones

---

## 🚀 Ejercicio

```groovy
def numero = 7.8

println "Original: $numero"                  // Original: 7.8
println "Truncado: ${numero.intValue()}"     // Truncado: 7
println "Redondeado: ${Math.round(numero)}"  // Redondeado: 8
println "Ceil: ${Math.ceil(numero)}"         // Ceil: 8.0
println "Floor: ${Math.floor(numero)}"       // Floor: 7.0
```

---

## 📌 Conclusión

En esta clase aprendiste:

* Métodos de números (`compareTo`, `equals`)
* Conversión de tipos
* Funciones matemáticas
* Diferencias entre truncar y redondear

Esto es clave para lógica, validaciones y procesamiento de datos en Groovy 🚀
