def lista = ['banano', 'leche', 'manzana', 'queso', 'fresa', 'uvas', 1, true]

println lista

//acceso a los elementos

println lista[5]
println lista[0]

//agregar elementos a la lista

lista.add('mango')
println lista

//remover elementos de la lista
lista.remove(2)
println lista


//metodo each-recorrer

lista.each {
    println it
}
// el it es cada elemento dentro de mi lista que each va a recorrer

//collect - transformacion

def numeros = [1,2,3,4,5,6,7,8,9]

def dobles = numeros.collect{
    numero -> numero *2
}

println dobles

//lo puedes hacer con el it
def dobles1 = numeros.collect{it * 2}

println dobles1

//find - primer elemento que cumple

def par = numeros.find {
    it % 2 == 0
}

println par

//findall - todos los que cumplen
def par2 = numeros.findAll {
    it % 2 == 0
}

println par2

//any - que al menos cumple

def numeros2 = [1,2,3,4,5,6]
println numeros2.any {it > 4}

//every - todos cumplen
def numeros3 = [1,2,3,4,5,6]
println numeros3.every {it > 4}


def builds = [
    [id: 1, status: "SUCCESS"],
    [id: 2, status: "FAILURE"],
    [id: 3, status: "SUCCESS"]
]

// Obtener solo fallidos
def fallidos = builds.findAll {
    it.status == "FAILURE"
}

println fallidos

// Verificar si hay fallos
if (builds.any { it.status == "FAILURE" }) {
    println "Hay builds fallidos"
}


def usuarios = [
    [nombre: "Juan", edad: 25],
    [nombre: "Ana", edad: 17],
    [nombre: "Luis", edad: 30]
]

// Obtener solo adultos
def adultos = usuarios.findAll {
    it.edad >= 18
}

println adultos

// Obtener solo nombres
def nombres = usuarios.collect {
    it.nombre
}

println nombres



/*
📝 Ejercicio 1 (nivel medio)

Dado:

def numeros = [5, 10, 15, 20, 25]

Haz:

Crear una nueva lista con todos multiplicados por 3
Obtener solo los mayores a 15
Verificar si hay algún número menor a 10

*/

def numeros = [5, 10, 15, 20, 25]

def newlist = numeros.collect {it * 3}

println newlist
def mayores = numeros.findAll {
    it > 15
}
println mayores
println numeros.any { it < 10}

/*
📝 Ejercicio 2 (nivel real 🔥)

Dado:

def productos = [
    [nombre: "Laptop", precio: 1500],
    [nombre: "Mouse", precio: 20],
    [nombre: "Teclado", precio: 50],
    [nombre: "Monitor", precio: 300]
]

Haz:

Obtener productos con precio mayor a 100
Obtener solo los nombres de los productos
Verificar si TODOS los productos cuestan más de 10

*/

def productos = [
    [nombre: "Laptop", precio: 1500],
    [nombre: "Mouse", precio: 20],
    [nombre: "Teclado", precio: 50],
    [nombre: "Monitor", precio: 300]
]

def prodMayor = productos.findAll {
    it.precio > 100
}

println prodMayor

def nomProd = productos.collect {
    it.nombre
}

println nomProd

def costoProd = productos.every {
    it.precio > 10
}

println costoProd

def productoMasCaro = productos.max {
    it.precio
}

println "Producto más caro: $productoMasCaro"


def productoMenosCaro = productos.min {
    it.precio
}

println "Producto más caro: $productoMenosCaro"

def resultado = productos.collect {
    it.precio * 2
}.findAll {
    it > 100
}

println resultado