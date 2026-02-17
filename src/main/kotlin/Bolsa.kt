
class Bolsa<T> {

    private val elementos: MutableList<T> = mutableListOf()

    // Constructores

    constructor()
    // - Bolsa a partir de un origen (lista, set, etc.)

    constructor(origen: Iterable<T>) : this() {
        elementos.addAll(origen)
    }


    // Operaciones básicas
    fun meter(elemento: T) {
        elementos.add(elemento)
    }

    fun meterTodos(varios: Iterable<T>) {
        elementos.addAll(varios)
    }

    fun sacar(): T? {
        return if (elementos.isEmpty()) {
            null
        } else {
            elementos.removeAt(elementos.lastIndex)
        }
    }

    fun tamano() : Int {
        return elementos.size
    }

    fun estaVacia() : Boolean {
        return elementos.isEmpty()
    }

    fun mirarTodo(): List<T> {
        return elementos.toList()
    }

    // Reorganización
    fun mezclar() {
        elementos.shuffle()
    }

    // Operaciones por reglas (no modifican la bolsa original)
    fun filtrar(condicion: (T) -> Boolean) : Bolsa<T> {
        val filtrados = elementos.filter(condicion)
        return Bolsa(filtrados)
    }

    fun <R> transformar(transformador: (T) -> R) : Bolsa<R> {
        val transformados = elementos.map(transformador)
        return Bolsa(transformados)
    }

    fun <K> agruparPor(selectorClave: (T) -> K) : Map<K, Bolsa<T>> {
        val mapaListas: Map<K, List<T>> = elementos.groupBy(selectorClave)
        val resultado = mutableMapOf<K, Bolsa<T>>()
        for ((clave, lista) in mapaListas) {
            resultado[clave] = Bolsa(lista)
        }
        return resultado
    }

    // Copia a destino externo
    fun <C : MutableCollection<in T>> volcarEn(destino: C): C {
        destino.addAll(elementos)
        return destino
    }

    // Operación con lambda (acción)
    fun paraCada(accion: (T) -> Unit) {
        for (e in elementos) {
            accion(e)
        }
    }
}