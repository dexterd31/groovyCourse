//crear un simple print en pantalla
println('Hola mundo')

//tipos de datos
/*
byte − This is used to represent a byte value. An example is 2.

short − This is used to represent a short number. An example is 10.

int − This is used to represent whole numbers. An example is 1234.

long − This is used to represent a long number. An example is 10000090.

float − This is used to represent 32-bit floating point numbers. An example is 12.34.

double − This is used to represent 64-bit floating point numbers which are longer decimal number representations which may be required at times. An example is 12.3456565.

char − This defines a single character literal. An example is a.

Boolean − This represents a Boolean value which can either be true or false.

String − These are text literals which are represented in the form of chain of characters. For example Hello World.
*/
// def es un identificados que sirve para definir variables, funciones o otras variables definidas por el usuario

def numero = 9
def nombre = 'Jhonnathan'

println(numero)
println(nombre)
//forma parecida a python
println "hola ${nombre}"

//operaciones basicas
def a = 10
def b = 3

println a + b   // 13
println a - b   // 7
println a * b   // 30
println a / b   // 3.3333

def esMayor = false
def edad = 20
if (edad >= 18) {
    esMayor = true
    println(esMayor)
    println "la edad es ${edad} y es mayor de edad"
}

//ejemplo con float y double

// def c = 10.5      // double (por defecto)
// float d = 10.5f   // float
