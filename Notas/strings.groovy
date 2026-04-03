// strings

def Nombre = 'Jhonnathan'
def Nombre2 = "Andres"
def NombreCompleto = '''
    Hola
    Mi nombre es Jhonnathan
    Andres
'''

println Nombre
println Nombre2
println NombreCompleto

//String Index

def nuevoNombre = 'Ferney Camilo Cuervo Herrera'

println nuevoNombre[4]
println nuevoNombre[-1]
println nuevoNombre[1..4]
println nuevoNombre[4..2]

//repeticion
println Nombre * 3

//longitud
println Nombre.length()

//🧠 Búsqueda (indexOf, contains, endsWith)
def texto = "Hola mundo"

println texto.indexOf("mundo")  // posición
println texto.endsWith("mundo") // true
println texto.contains("mundo") // true


//🧠 Comparaciones (equals, equalsIgnoreCase)
def a = "hola"
def b = "HOLA"

println a == b                     // false
println a.equalsIgnoreCase(b)     // true

//👉 🔥 En Groovy puedes usar == (no como en Java)

//🧠 Transformaciones (toUpperCase, toLowerCase, reverse)
def texto = "Groovy"

println texto.toUpperCase() // GROOVY
println texto.toLowerCase() // groovy
println texto.reverse()     // yvooorG

//🧠 Reemplazo (replaceAll)
def texto = "Hola mundo"

println texto.replaceAll("mundo", "Groovy")

//👉 Resultado:
//Hola Groovy

//🧠 Substrings (substring)
def texto = "Groovy"

println texto.substring(0, 3) // Gro

//🧠 Separar (split)
def texto = "manzana,pera,uva"

def lista = texto.split(",")

println lista

//👉 Resultado:[manzana, pera, uva]

//🧠 Eliminar partes (minus) 👉 muy Groovy
def texto = "Hola mundo"

println texto - "mundo"

//👉 Resultado:Hola 


//🧠 Padding (padLeft, padRight)
def texto = "7"

println texto.padLeft(3, "0")  // 007
println texto.padRight(3, "x") // 7xx


