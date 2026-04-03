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



