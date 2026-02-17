fun main() {

    // 1) Crear una bolsa vacía y meter cosas
    val bolsaInts = Bolsa<Int>()
    println("¿Está vacía al principio? " + bolsaInts.estaVacia())   // true

    bolsaInts.meter(10)
    bolsaInts.meter(20)
    bolsaInts.meter(30)

    println("Tamaño después de meter 3: " + bolsaInts.tamano())     // 3
    println("Contenido (mirarTodo): " + bolsaInts.mirarTodo())      // [10, 20, 30]

    // 2) Sacar elementos
    val sacado1 = bolsaInts.sacar()
    println("Sacado: " + sacado1)                                   // 30 (o el último)
    println("Contenido después de sacar: " + bolsaInts.mirarTodo())

    // 3) Mezclar
    bolsaInts.meter(40)
    bolsaInts.meter(50)
    println("Antes de mezclar: " + bolsaInts.mirarTodo())
    bolsaInts.mezclar()
    println("Después de mezclar: " + bolsaInts.mirarTodo())

    // 4) filtrar (quedarse con pares)
    val bolsaPares = bolsaInts.filtrar { it % 2 == 0 }
    println("Original después de filtrar: " + bolsaInts.mirarTodo())
    println("Bolsa de pares: " + bolsaPares.mirarTodo())

    // 5) transformar (de Int a String)
    val bolsaStrings = bolsaInts.transformar { numero -> "número $numero" }
    println("Bolsa transformada a String: " + bolsaStrings.mirarTodo())

    // 6) agruparPor (por par/impar)
    val grupos = bolsaInts.agruparPor { numero ->
        if (numero % 2 == 0) "par" else "impar"
    }
    println("Grupos:")
    for ((clave, bolsaGrupo) in grupos) {
        println("  $clave -> " + bolsaGrupo.mirarTodo())
    }

    // 7) volcarEn (copiar a una lista externa)
    val destino = mutableListOf<Int>()
    val resultadoVolcado = bolsaInts.volcarEn(destino)
    println("Destino después de volcar: " + destino)
    println("¿resultadoVolcado y destino son el mismo objeto? " + (destino === resultadoVolcado))
    println("Bolsa original sigue igual: " + bolsaInts.mirarTodo())

    // 8) paraCada (acción con lambda)
    print("Recorriendo con paraCada: ")
    bolsaInts.paraCada { numero ->
        print("$numero ")
    }
    println()
}
