def numero = 5

println numero

//los numbers tiene metodos y vamos a cada uno de ellos

//compareTo
def a = 10
def b = 20

println a.compareTo(b)  // -1 (menor)
println b.compareTo(a)  // 1 (mayor)
println a.compareTo(10) // 0 (igual)

//equals()
def a = 10
def b = 10

println a.equals(b) // true

//🔹 toString()
def numero = 123
println numero.toString()  // "123"
//🔹 parseInt()
def texto = "100"
def numero = Integer.parseInt(texto)

println numero + 50  // 150
//🔹 valueOf()
def numero = Integer.valueOf("200")
println numero
// 👉 Similar a parseInt, pero devuelve objeto



//🧠 4. Matemática básica (abs, min, max)
println Math.abs(-10)     // 10
println Math.min(3, 7)    // 3
println Math.max(3, 7)    // 7

//👉 Muy usados en lógica

//🧠 5. Redondeo (ceil, floor, round)
def num = 4.3

println Math.ceil(num)   // 5.0 (hacia arriba)
println Math.floor(num)  // 4.0 (hacia abajo)
println Math.round(num)  // 4 (más cercano)

//🧠 6. Potencias y raíces (pow, sqrt)
println Math.pow(2, 3)  // 8
println Math.sqrt(16)   // 4

//🧠 7. Logaritmos y exponenciales
println Math.exp(1)  // e^1
println Math.log(10) // log natural

//👉 Más avanzado, poco usado en scripting

//🧠 8. Trigonometría (sin, cos, etc.)
println Math.sin(0)
println Math.cos(0)

//👉 Solo útil en matemáticas / gráficos

//🧠 9. Random
println Math.random()

//👉 Número entre 0 y 1

//🎯 Ejemplo práctico:
def numero = -5.7

println Math.abs(numero)        // 5.7
println Math.round(numero)      // -6
println Math.sqrt(25)           // 5
println Math.max(10, 20)        // 20



// ==============================
// CLASE: CONVERSIÓN Y REDONDEO DE NÚMEROS EN GROOVY
// ==============================

// ------------------------------
// 1. NÚMERO BASE
// ------------------------------
def numero = 3.7

println "Número original: $numero"


// ------------------------------
// 2. CONVERSIÓN DE TIPOS (xxxValue)
// ------------------------------
println "\n--- Conversión de tipos ---"

println numero.intValue()     // 3
println numero.longValue()    // 3
println numero.floatValue()   // 3.7
println numero.doubleValue()  // 3.7


// ------------------------------
// 3. IMPORTANTE: intValue() TRUNCA
// ------------------------------
println "\n--- Truncamiento ---"

def n1 = 3.9
println "intValue(): ${n1.intValue()}"  // 3


// ------------------------------
// 4. REDONDEO (Math.round)
// ------------------------------
println "\n--- Redondeo ---"

def n2 = 3.4
def n3 = 3.6

println "round(3.4): ${Math.round(n2)}" // 3
println "round(3.6): ${Math.round(n3)}" // 4


// ------------------------------
// 5. CEIL (SIEMPRE HACIA ARRIBA)
// ------------------------------
println "\n--- Ceil ---"

println Math.ceil(3.1) // 4.0
println Math.ceil(3.9) // 4.0


// ------------------------------
// 6. FLOOR (SIEMPRE HACIA ABAJO)
// ------------------------------
println "\n--- Floor ---"

println Math.floor(3.1) // 3.0
println Math.floor(3.9) // 3.0


// ------------------------------
// 7. COMPARACIÓN CLAVE
// ------------------------------
println "\n--- Comparación ---"

def valor = 2.9

println "Original: $valor"
println "intValue(): ${valor.intValue()}"   // 2
println "round(): ${Math.round(valor)}"     // 3
println "ceil(): ${Math.ceil(valor)}"       // 3.0
println "floor(): ${Math.floor(valor)}"     // 2.0


// ------------------------------
// 8. CASO REAL (NOTAS)
// ------------------------------
println "\n--- Caso real ---"

def nota = 3.6

def notaEntera = nota.intValue()
def notaRedondeada = Math.round(nota)

println "Nota original: $nota"
println "Truncada: $notaEntera"
println "Redondeada: $notaRedondeada"


// ------------------------------
// 9. CONVERSIÓN DESDE STRING
// ------------------------------
println "\n--- String a número ---"

def texto = "4.8"

def numeroConvertido = texto.toDouble()

println numeroConvertido
println numeroConvertido.getClass()