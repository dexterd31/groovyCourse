# 📘 Groovy - Clase 4: Rangos (Ranges)

En esta clase aprenderás a usar rangos en Groovy, una de sus características más poderosas y expresivas.

---

## 🔢 1. Rango inclusivo (`..`)

```groovy id="r1a9k2"
def rangoInclusivo = 1..5
println rangoInclusivo // [1, 2, 3, 4, 5]
```

---

## 🚫 2. Rango exclusivo (`..<`)

```groovy id="x8p3mz"
def rangoExclusivo = 1..<5
println rangoExclusivo // [1, 2, 3, 4]
```

---

## 🔁 3. Iterar un rango

```groovy id="c7n2lb"
for (i in 1..3) {
    println i
}
// 1
// 2
// 3
```

---

## 🔤 4. Rangos con letras

```groovy id="z5k1tr"
def letras = 'a'..'d'
println letras // [a, b, c, d]
```

---

## 🔍 5. Acceso a elementos

```groovy id="y2f9qp"
def r = 10..15

println r[0] // 10
println r[2] // 12
```

---

## 🧠 6. Métodos básicos

### `contains()`

```groovy id="v9s3hd"
def rango = 1..10

println rango.contains(5)  // true
println rango.contains(20) // false
```

---

### `size()`

```groovy id="n4x7kc"
println (1..5).size() // 5
```

---

### `from` y `to`

```groovy id="q8b2mz"
def r2 = 3..8

println r2.from // 3
println r2.to   // 8
```

---

## ⚖️ 7. Uso en condiciones (`in`)

```groovy id="p3k9dw"
def edad = 25

if (edad in 18..30) {
    println "La edad está en el rango" // La edad está en el rango
} else {
    println "Fuera del rango"
}
```

---

## 🎯 8. Ejemplo práctico (notas)

```groovy id="h2v7rs"
def nota = 4

if (nota in 0..2) {
    println "Reprobado"
} else if (nota in 3..4) {
    println "Regular"     // Regular
} else if (nota == 5) {
    println "Excelente"
}
```

---

## 🚫 9. Importante: rangos exclusivos

```groovy id="m7q1xt"
def r3 = 1..<5

println r3.contains(5) // false
```

---

# 🧩 Métodos avanzados de Range

```groovy id="k6t4zp"
def r = 1..10
```

---

## 🔍 `get()`

```groovy id="d3p8vc"
println r.get(0) // 1
println r.get(3) // 4
```

---

## 🔽 `getFrom()` y `getTo()`

```groovy id="u9x2ln"
println r.getFrom() // 1
println r.getTo()   // 10
```

---

## 🔄 `isReverse()`

```groovy id="b5w1qa"
def normal = 1..5
def reverso = 5..1

println normal.isReverse()   // false
println reverso.isReverse()  // true
```

---

## 📏 `size()`

```groovy id="t1m7zk"
println r.size() // 10
```

---

## ✂️ `subList()`

```groovy id="g8c3vy"
def sub = r.subList(2, 5)

println sub // [3, 4, 5]
```

---

## 🔁 `step()`

```groovy id="s2r9kd"
def pasos = r.step(2)

println pasos // [1, 3, 5, 7, 9]
```

Iteración con `step`:

```groovy id="l4z6qp"
r.step(3) {
    println it
}
// 1
// 4
// 7
// 10
```

---

## 📋 `toList()`

```groovy id="a7v2xn"
def lista = r.toList()

println lista             // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
println lista.getClass()  // class java.util.ArrayList
```

---

## 🔢 `toArray()`

```groovy id="e5k8wr"
def array = r.toArray()

println array             // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
println array.getClass()  // class [Ljava.lang.Integer;
```

---

## 🧪 10. Caso real (validación tipo Jenkins)

```groovy id="j9n4pt"
def version = 9

println "Validando versión: $version" // Validando versión: 9

if (!(version in 1..10)) {
    println "❌ Versión inválida"
} else if (version in 8..10) {
    println "⚠️ Versión crítica - requiere aprobación" // ⚠️ Versión crítica - requiere aprobación
} else {
    println "✅ Versión estable"
}
```

---

## 🎯 11. Ejercicio: Control de acceso

```groovy id="o3q7lb"
def edad = 16

if (edad in 0..12){
    println "Acceso denegado"
} else if (edad in 13..17){
    println "Acceso con acompañante" // Acceso con acompañante
} else if(edad in 18..60){
    println "Acceso permitido"
} else if (edad in 61..120){
    println "Acceso preferencial"
}
```

---

## ⚠️ Validación extra (caso borde)

```groovy id="x1z8kc"
def edad = -5

if (!(edad in 0..120)) {
    println "Edad inválida" // Edad inválida
} else if (edad in 0..12){
    println "Acceso denegado"
} else if (edad in 13..17){
    println "Acceso con acompañante"
} else if(edad in 18..60){
    println "Acceso permitido"
} else if (edad in 61..120){
    println "Acceso preferencial"
}
```

---

## 🧩 Buenas prácticas

* Usa `in` para validaciones limpias
* Prefiere rangos sobre múltiples condiciones (`&&`)
* Usa `..<` cuando necesites excluir el límite superior
* `step()` es ideal para iteraciones controladas

---

## 📌 Conclusión

En esta clase aprendiste:

* Rangos inclusivos y exclusivos
* Uso del operador `in`
* Métodos de `Range`
* Aplicaciones reales en validación

Esto es MUY usado en automatización, reglas de negocio y pipelines 🚀
