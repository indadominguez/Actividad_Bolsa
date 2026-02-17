# Actividad_Bolsa
🧺 Práctica: La Bolsa (implementación completa)

🎯 Objetivo de la práctica

En esta práctica vas a desarrollar una clase llamada Bolsa que representa un contenedor donde podemos guardar “cosas”.

A veces serán números, otras veces palabras, letras, objetos… lo que toque en cada caso.

Tu trabajo será construir la clase y sus operaciones para que, cuando más adelante te entregue:
- un conjunto de tests automáticos, y
- una pequeña aplicación/juego,
- todo funcione correctamente sin tocar el código de tests ni el del juego.
  
✅ Qué debe poder hacer la Bolsa

Imagina una bolsa física:
- puedes meter cosas,
- puedes sacar cosas,
- puedes mirar lo que tiene dentro sin romperla,
- puedes mezclar el contenido (sin perder nada),
- puedes crear otra bolsa nueva a partir de una regla (“quédate solo con…”),
- puedes transformar las cosas en otra cosa (otra bolsa distinta),
- puedes separar por grupos,
- y también puedes volcar/copiar lo que hay dentro en una colección que te den (sin vaciar la bolsa).

📦 Requisitos funcionales (bien concretos)

1) Creación

  Debe ser posible:
- Crear una bolsa vacía.
- Crear una bolsa ya cargada con elementos que te pasan al principio (por ejemplo una lista o un set).
  
2) Operaciones básicas
   
Debe existir la posibilidad de:
- meter un elemento.
- meterTodos varios elementos.
- sacar un elemento:
- si la bolsa tiene elementos, devuelve uno y lo elimina,
- si está vacía, devuelve null.
- tamano: número de elementos actuales.
- estaVacia: si no hay elementos.
- mirarTodo: devuelve una copia del contenido (para mirar, no para modificar por detrás).
  
3) Mezcla
- mezclar: reordena internamente el contenido.
- Después de mezclar, deben estar exactamente los mismos elementos.
- No se puede perder nada ni inventarse elementos.
  
4) Operaciones “de reglas”
  
Estas operaciones no deben cambiar la bolsa original, sino devolver nuevas bolsas o estructuras nuevas.

- filtrar: devuelve una nueva bolsa con los elementos que cumplan una condición.
- transformar: devuelve una nueva bolsa con los elementos convertidos a otra cosa.
- agruparPor: separa el contenido en grupos según una regla, devolviendo un mapa (clave → bolsa del grupo).
- Cada elemento debe aparecer exactamente una vez en algún grupo.
  
5) Copiar a un destino externo
- volcarEn: copia el contenido en una colección destino que te dan.
- La bolsa no debe vaciarse.
- Debe devolver exactamente el mismo destino recibido.
  
6) Una operación con “acción” (lambda)
Además, la bolsa debe tener una operación que permita “hacer algo” con cada elemento, recibiendo una acción en forma de lambda, por ejemplo:
- recorrer lo que hay dentro aplicando una acción a cada elemento,
- o contar cuántos cumplen una condición,
- o cualquier primitiva equivalente.
  
Esa operación se usará más adelante en el juego o en los tests, así que debe estar bien diseñada y ser útil.

📌 Restricciones importantes

- No se puede exponer directamente la estructura interna mutable de la bolsa.
- Las bolsas nuevas devueltas por operaciones como filtrar/transformar deben ser independientes de la bolsa original.
- Debe funcionar correctamente para “cosas” de distintos tipos.
- La API (nombres de métodos) debe coincidir con la que se te pide aquí, porque será la que usarán los tests y el juego.
  
