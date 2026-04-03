# 📘 Groovy - Clase 3: Strings y Manipulación de Texto

En esta clase aprenderás a trabajar con Strings en Groovy, incluyendo acceso, transformación, búsqueda y manipulación avanzada.

---

## 🔤 1. Definición de Strings

```groovy id="x2n9ka"
def nombre = 'Jhonnathan'
def nombre2 = "Andres"

def nombreCompleto = '''
Hola
Mi nombre es Jhonnathan
Andres
'''

println nombre           // Jhonnathan
println nombre2          // Andres
println nombreCompleto   // (texto multilínea)
```

📌 Groovy permite:

* Comillas simples `'`
* Comillas dobles `"` (permiten interpolación)
* Triple comilla `'''` para texto multilínea

---

## 🔢 2. Acceso por índice (String Index)

```groovy id="k9f2pl"
def nuevoNombre = 'Ferney Camilo Cuervo Herrera'

println nuevoNombre[4]     // e
println nuevoNombre[-1]    // a (último carácter)
println nuevoNombre[1..4]  // erne
println nuevoNombre[4..2]  // yen (rango inverso)
```

📌 Groovy permite índices negativos y rangos.

---

## 🔁 3. Repetición de Strings

```groovy id="m4d8qs"
def nombre = "Jhonnathan"

println nombre * 3  // JhonnathanJhonnathanJhonnathan
```

---

## 📏 4. Longitud de un String

```groovy id="r8c1vn"
def nombre = "Jhonnathan"

println nombre.length() // 10
```

---

## 🔍 5. Búsqueda en Strings

```groovy id="z1p7lw"
def texto = "Hola mundo"

println texto.indexOf("mundo")  // 5
println texto.endsWith("mundo") // true
println texto.contains("mundo") // true
```

---

## ⚖️ 6. Comparación de Strings

```groovy id="b6k3yd"
def a = "hola"
def b = "HOLA"

println a == b                 // false
println a.equalsIgnoreCase(b)  // true
```

📌 En Groovy puedes usar `==` para comparar contenido (a diferencia de Java).

---

## 🔄 7. Transformaciones

```groovy id="c9n2ht"
def texto = "Groovy"

println texto.toUpperCase() // GROOVY
println texto.toLowerCase() // groovy
println texto.reverse()     // yvooorG
```

---

## 🔁 8. Reemplazo

```groovy id="y5x8qp"
def texto = "Hola mundo"

println texto.replaceAll("mundo", "Groovy") // Hola Groovy
```

---

## ✂️ 9. Substrings

```groovy id="n3q7zs"
def texto = "Groovy"

println texto.substring(0, 3) // Gro
```

---

## 🧩 10. Separar texto (split)

```groovy id="w8m2lr"
def texto = "manzana,pera,uva"

def lista = texto.split(",")

println lista // [manzana, pera, uva]
```

---

## ➖ 11. Eliminar partes (Operador `-`)

```groovy id="d4v6tx"
def texto = "Hola mundo"

println texto - "mundo" // Hola 
```

📌 Muy característico de Groovy.

---

## 📐 12. Padding (relleno)

```groovy id="p2z9kc"
def texto = "7"

println texto.padLeft(3, "0")  // 007
println texto.padRight(3, "x") // 7xx
```

---

## 🧩 Buenas prácticas

* Usa `contains()` en lugar de lógica manual
* Prefiere `==` para comparar Strings
* Usa `split()` para trabajar con listas de datos
* Aprovecha operadores de Groovy como `-` para simplificar código

---

## 🚀 Ejercicio

```groovy id="h7k4mz"
def texto = "groovy lenguaje"

println texto.toUpperCase()        // GROOVY LENGUAJE
println texto.contains("groovy")   // true
println texto - "lenguaje"         // groovy 
println texto.split(" ")           // [groovy, lenguaje]
```

---

## 📌 Conclusión

En esta clase aprendiste:

* Tipos de Strings en Groovy
* Acceso por índice y rangos
* Métodos de búsqueda y comparación
* Transformaciones y manipulación avanzada

Esto es clave para trabajar con logs, datos y automatización en Groovy 🚀
