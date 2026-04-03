// ==============================
// CLASE: RANGOS EN GROOVY
// ==============================

// ------------------------------
// 1. RANGO INCLUSIVO (..)
// ------------------------------
def rangoInclusivo = 1..5
println "Rango inclusivo (1..5): $rangoInclusivo"

// ------------------------------
// 2. RANGO EXCLUSIVO (..<)
// ------------------------------
def rangoExclusivo = 1..<5
println "Rango exclusivo (1..<5): $rangoExclusivo"

// ------------------------------
// 3. ITERAR UN RANGO
// ------------------------------
println "\nIterando rango 1..3:"
for (i in 1..3) {
    println i
}

// ------------------------------
// 4. RANGOS CON LETRAS
// ------------------------------
def letras = 'a'..'d'
println "\nRango de letras ('a'..'d'): $letras"

// ------------------------------
// 5. ACCESO A ELEMENTOS
// ------------------------------
def r = 10..15
println "\nAcceso a elementos:"
println "Primer elemento: ${r[0]}"
println "Tercer elemento: ${r[2]}"

// ------------------------------
// 6. MÉTODOS ÚTILES
// ------------------------------

// contains()
def rango = 1..10
println "\nMétodo contains():"
println "¿Contiene 5?: ${rango.contains(5)}"
println "¿Contiene 20?: ${rango.contains(20)}"

// size()
println "\nTamaño del rango 1..5:"
println (1..5).size()

// from y to
def r2 = 3..8
println "\nInicio y fin del rango:"
println "Desde: ${r2.from}"
println "Hasta: ${r2.to}"

// ------------------------------
// 7. USO EN CONDICIONES
// ------------------------------
def edad = 25

println "\nValidación con rangos:"
if (edad in 18..30) {
    println "La edad está en el rango (18..30)"
} else {
    println "Fuera del rango"
}

// ------------------------------
// 8. EJEMPLO PRÁCTICO (NOTAS)
// ------------------------------
def nota = 4

println "\nEvaluación de nota:"
if (nota in 0..2) {
    println "Reprobado"
} else if (nota in 3..4) {
    println "Regular"
} else if (nota == 5) {
    println "Excelente"
}

// ------------------------------
// 9. EJEMPLO IMPORTANTE
// ------------------------------
def r3 = 1..<5
println "\nEjemplo contains con rango exclusivo:"
println "¿Contiene 5?: ${r3.contains(5)}"  // false


// ==============================
// MÉTODOS DE RANGES EN GROOVY
// ==============================

def r = 1..10

// ------------------------------
// 1. contains()
// ------------------------------
println "contains():"
println r.contains(5)   // true
println r.contains(20)  // false


// ------------------------------
// 2. get()
// ------------------------------
println "\nget():"
println r.get(0)  // 1
println r.get(3)  // 4


// ------------------------------
// 3. getFrom()
// ------------------------------
println "\ngetFrom():"
println r.getFrom()  // 1


// ------------------------------
// 4. getTo()
// ------------------------------
println "\ngetTo():"
println r.getTo()  // 10


// ------------------------------
// 5. isReverse()
// ------------------------------
println "\nisReverse():"
def normal = 1..5
def reverso = 5..1

println normal.isReverse()   // false
println reverso.isReverse() // true


// ------------------------------
// 6. size()
// ------------------------------
println "\nsize():"
println r.size()  // 10


// ------------------------------
// 7. subList()
// ------------------------------
println "\nsubList():"
def sub = r.subList(2, 5)
println sub  // [3, 4, 5]


// ------------------------------
// 8. toArray()
// ------------------------------
println "\ntoArray():"
def array = r.toArray()
println array
println array.getClass()  // tipo array


// ------------------------------
// 9. step()
// ------------------------------
println "\nstep():"
def pasos = r.step(2)
println pasos  // [1, 3, 5, 7, 9]


// También puedes iterar con step:
println "Iterando con step:"
r.step(3) {
    println it
}


// ------------------------------
// 10. toList()
// ------------------------------
println "\ntoList():"
def lista = r.toList()
println lista
println lista.getClass()


// Simulación de versión recibida (por ejemplo desde Jenkins)
def version = 9

println "Validando versión: $version"

// Validar si está en rango permitido
if (!(version in 1..10)) {
    println "❌ Versión inválida"
    return
}

// Validar si es crítica
if (version in 8..10) {
    println "⚠️ Versión crítica - requiere aprobación"
} else {
    println "✅ Versión estable"
}



/*
🎯 Ejercicio: Sistema de control de acceso

Tienes un sistema que valida si una persona puede entrar a un evento según su edad.

📌 Reglas:
0–12 → "Acceso denegado"
13–17 → "Acceso con acompañante"
18–60 → "Acceso permitido"
61–120 → "Acceso preferencial"
📝 Tu tarea

Dado:

def edad = 15

Debes imprimir el mensaje correspondiente usando rangos (in).

*/

def edad = 16

if (edad in 0..12){
    println "Acceso denegado"
}else if (edad in 13..17){
    println "Acceso con acompañante"
}else if(edad in 18..60){
    println "Acceso permitido"
}else if (edad in 61..120){
    println "Acceso preferencial"
}


def edad = -5

if (!(edad in 0..120)) {
    println "Edad inválida"
} else if (edad in 0..12){
    println "Acceso denegado"
} else if (edad in 13..17){
    println "Acceso con acompañante"
} else if(edad in 18..60){
    println "Acceso permitido"
} else if (edad in 61..120){
    println "Acceso preferencial"
}