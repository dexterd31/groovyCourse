# 📘 Groovy - Clase 5: Listas (Collections) y Métodos Funcionales

En esta clase aprenderás a trabajar con listas en Groovy, incluyendo manipulación, recorridos y métodos funcionales como `collect`, `find`, `any`, etc.

---

## 📋 1. Crear una lista

```groovy id="l1k9zm"
def lista = ['banano', 'leche', 'manzana', 'queso', 'fresa', 'uvas', 1, true]

println lista // [banano, leche, manzana, queso, fresa, uvas, 1, true]
```

---

## 🔍 2. Acceso a elementos

```groovy id="q8p2xs"
println lista[5] // uvas
println lista[0] // banano
```

---

## ➕ 3. Agregar elementos

```groovy id="m4z7ka"
lista.add('mango')

println lista // [..., uvas, 1, true, mango]
```

---

## ➖ 4. Eliminar elementos

```groovy id="x2c9pl"
lista.remove(2)

println lista // (se elimina 'manzana')
```

---

## 🔁 5. Recorrer lista (`each`)

```groovy id="b6n3yt"
lista.each {
    println it
}
// banano
// leche
// queso
// fresa
// uvas
// 1
// true
// mango
```

📌 `it` representa cada elemento.

---

## 🔄 6. Transformar datos (`collect`)

```groovy id="p7k1vd"
def numeros = [1,2,3,4,5,6,7,8,9]

def dobles = numeros.collect { numero -> numero * 2 }

println dobles // [2, 4, 6, 8, 10, 12, 14, 16, 18]
```

Forma corta:

```groovy id="c3x8qw"
def dobles1 = numeros.collect { it * 2 }

println dobles1 // [2, 4, 6, 8, 10, 12, 14, 16, 18]
```

---

## 🔍 7. Buscar elementos

### `find()` → primer elemento

```groovy id="z5k2ht"
def par = numeros.find { it % 2 == 0 }

println par // 2
```

---

### `findAll()` → todos los que cumplen

```groovy id="n9v4lm"
def pares = numeros.findAll { it % 2 == 0 }

println pares // [2, 4, 6, 8]
```

---

## ❓ 8. Validaciones

### `any()` → al menos uno cumple

```groovy id="r1y7bx"
def numeros2 = [1,2,3,4,5,6]

println numeros2.any { it > 4 } // true
```

---

### `every()` → todos cumplen

```groovy id="w8p3kc"
def numeros3 = [1,2,3,4,5,6]

println numeros3.every { it > 4 } // false
```

---

## 🧪 9. Caso real (builds tipo Jenkins)

```groovy id="g2z9qx"
def builds = [
    [id: 1, status: "SUCCESS"],
    [id: 2, status: "FAILURE"],
    [id: 3, status: "SUCCESS"]
]

def fallidos = builds.findAll {
    it.status == "FAILURE"
}

println fallidos // [[id:2, status:FAILURE]]

if (builds.any { it.status == "FAILURE" }) {
    println "Hay builds fallidos" // Hay builds fallidos
}
```

---

## 👥 10. Ejemplo con usuarios

```groovy id="t6n4vz"
def usuarios = [
    [nombre: "Juan", edad: 25],
    [nombre: "Ana", edad: 17],
    [nombre: "Luis", edad: 30]
]

def adultos = usuarios.findAll {
    it.edad >= 18
}

println adultos // [[nombre:Juan, edad:25], [nombre:Luis, edad:30]]
```

Obtener nombres:

```groovy id="k9p2wl"
def nombres = usuarios.collect {
    it.nombre
}

println nombres // [Juan, Luis]
```

---

## 🎯 11. Ejercicio 1

```groovy id="v3c7xq"
def numeros = [5, 10, 15, 20, 25]

def nuevaLista = numeros.collect { it * 3 }
println nuevaLista // [15, 30, 45, 60, 75]

def mayores = numeros.findAll { it > 15 }
println mayores // [20, 25]

println numeros.any { it < 10 } // true
```

---

## 🔥 12. Ejercicio 2 (nivel real)

```groovy id="y8m1kp"
def productos = [
    [nombre: "Laptop", precio: 1500],
    [nombre: "Mouse", precio: 20],
    [nombre: "Teclado", precio: 50],
    [nombre: "Monitor", precio: 300]
]
```

### Filtrar productos caros

```groovy id="d4z9qc"
def prodMayor = productos.findAll {
    it.precio > 100
}

println prodMayor
// [[nombre:Laptop, precio:1500], [nombre:Monitor, precio:300]]
```

---

### Obtener nombres

```groovy id="u2p6xb"
def nomProd = productos.collect {
    it.nombre
}

println nomProd // [Laptop, Mouse, Teclado, Monitor]
```

---

### Validar precios

```groovy id="m7x3zn"
def costoProd = productos.every {
    it.precio > 10
}

println costoProd // true
```

---

### Producto más caro y más barato

```groovy id="s9k2lv"
def productoMasCaro = productos.max { it.precio }
println productoMasCaro // [nombre:Laptop, precio:1500]

def productoMenosCaro = productos.min { it.precio }
println productoMenosCaro // [nombre:Mouse, precio:20]
```

---

### Encadenamiento de operaciones

```groovy id="f1v8qp"
def resultado = productos.collect {
    it.precio * 2
}.findAll {
    it > 100
}

println resultado // [3000, 600]
```

---

## 🧩 Buenas prácticas

* Usa `collect` para transformar datos
* Usa `findAll` en lugar de loops manuales
* Usa `any` y `every` para validaciones claras
* Encadena métodos para escribir código limpio

---

## 📌 Conclusión

En esta clase aprendiste:

* Manipulación de listas
* Métodos funcionales (`collect`, `find`, `any`, etc.)
* Uso con estructuras tipo JSON (muy usado en Jenkins)
* Encadenamiento de operaciones

Esto ya es **Groovy real aplicado en automatización** 🚀
