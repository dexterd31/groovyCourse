# 📘 Introducción a Groovy

Groovy es un lenguaje dinámico para la JVM (Java Virtual Machine) que combina simplicidad, flexibilidad y potencia. Es muy usado en automatización, scripting y herramientas como Jenkins.

---

## 🖨️ Hola Mundo

El primer programa en cualquier lenguaje:

```groovy
// Crear un simple print en pantalla
println('Hola mundo')
```

También puedes usar comillas dobles:

```groovy
println("Hola mundo")
```

---

## 🔤 Tipos de Datos en Groovy

Groovy soporta varios tipos de datos (muchos heredados de Java):

```groovy
/*
byte    → Representa valores pequeños (ej: 2)
short   → Números cortos (ej: 10)
int     → Números enteros (ej: 1234)
long    → Números grandes (ej: 10000090)
float   → Números decimales de 32 bits (ej: 12.34)
double  → Números decimales de 64 bits (ej: 12.3456565)
char    → Un solo carácter (ej: 'a')
Boolean → true o false
String  → Texto (ej: "Hola Mundo")
*/
```

---

## 🧠 Variables con `def`

En Groovy, `def` es una palabra clave muy importante:

```groovy
// def sirve para definir variables dinámicas
def numero = 9
def nombre = 'Jhonnathan'

println(numero)
println(nombre)
```

---

## ✨ Interpolación de Strings

Groovy permite insertar variables dentro de texto fácilmente:

```groovy
println "hola ${nombre}"
```

También funciona así:

```groovy
println "La edad es $numero"
```

📌 Nota: Esto solo funciona con comillas dobles.

---

## ➕ Operaciones Básicas

```groovy
def a = 10
def b = 3

println a + b   // 13
println a - b   // 7
println a * b   // 30
println a / b   // 3.3333
```

---

## 🔀 Condicionales (if)

```groovy
def esMayor = false
def edad = 20

if (edad >= 18) {
    esMayor = true
    println(esMayor)
    println "La edad es $edad y es mayor de edad"
}
```

📌 Forma simplificada:

```groovy
def edad = 20

if (edad >= 18) {
    println "La edad es $edad y es mayor de edad"
}
```

---

## 🔢 Float vs Double

```groovy
// Por defecto los decimales son double
def c = 10.5        // double

// Para float debes especificarlo
float d = 10.5f     // float
```

---

## 🧩 Buenas prácticas iniciales

* Usa `def` cuando no necesites un tipo específico
* Usa nombres de variables claros (`edad`, `nombre`, etc.)
* Prefiere comillas dobles si usarás interpolación
* Mantén tu código limpio y comentado

---

## 🚀 Ejercicio sugerido

```groovy
def nombre = "TuNombre"
def edad = 17

if (edad < 18) {
    println "Hola $nombre, eres menor de edad"
} else {
    println "Hola $nombre, eres mayor de edad"
}
```

---

## 📌 Conclusión

Con estos conceptos ya puedes:

* Imprimir en consola
* Declarar variables
* Usar tipos de datos
* Hacer operaciones básicas
* Aplicar lógica con condicionales

Este es el primer paso para dominar Groovy 🚀
