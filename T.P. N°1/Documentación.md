# Trabajo Práctico N°1
---
## Punto 1: Sistema de Biblioteca

### Clases identificadas
- Biblioteca
- Libro
- Usuario
- Prestamo


#### Clase Biblioteca
##### Atributos
- usuarios: implementado como arraylist
- libros: implementado como arraylsit.
##### Métodos
- prestarLibro(unLibro, unUsuario, fechaPrestamo, fechaDevolucion)
- registrarUsuario(unUsuario)
- registrarLibro(unLibro)

#### Clase Libro
##### Atributos
- titulo
- autor
- nroPaginas
- estado
##### Métodos
- cambiarEstado(estado)

---
## Punto 2: Sistema de Gestión de Pedidos de Restaurante
Se desea desarrollar un sistema para gestionar los pedidos de un restaurante. El sistema debe permitir registrar los pedidos que realizan los clientes, asociarlos a las mesas y hacer un seguimiento del estado de cada pedido.

Requisitos:
- Un pedido contiene uno o varios platos, y cada plato tiene un nombre, un precio y una categoría (entrada, plato principal, postre).
- Un cliente puede hacer varios pedidos, y un pedido puede estar asociado a una mesa del restaurante.
- Las mesas tienen un número de identificación único.
- Los pedidos tienen un estado (pendiente, en preparación, servido) y una hora de creación.

### Clases identificadas
- Pedido
- Cliente
- Mesa
- Plato

#### Clase Pedido
##### Atributos
- nroPedido
- platos
- mesaAsignada
- horaCreacion
- estado
- cliente
##### Métodos
- agregarPlatos(platos : Plato)
- asignarMesa(unaMesa : Mesa)
- verEstado()

#### Clase Cliente
##### Atributos
- nroCliente
- pedidos
##### Métodos
- realizarPedido(platos : Plato)

#### Clase Plato
##### Atributos
- nombre
- precio
- categoria
##### Métodos

#### Clase Mesa
##### Atributos
- nroMesa
- cliente
##### Métodos
- agregarCliente(unCliente : Cliente)
---
## Punto 3: Sistema de Reservas de Vuelos
Se desea modelar un sistema de reservas de vuelos. El sistema permite a los clientes buscar y reservar vuelos, que conectan aeropuertos específicos en determinadas fechas y horas.
Requisitos:
- Un vuelo tiene un número de vuelo, una aerolínea, una fecha y una hora de salida y llegada, y está asociado a un avión.
- Los clientes pueden reservar asientos en los vuelos, y cada reserva tiene un número de confirmación, la fecha de la reserva y el asiento asignado.
- Cada avión tiene un modelo, una capacidad máxima de pasajeros y pertenece a una aerolínea.
- Los aeropuertos tienen un código único, un nombre y una ciudad.
### Clases identificadas
- Vuelos
- Cliente
- Reserva
- Aeropuerto
- Aerolinea
- Avion

### Clase Vuelo
#### Atributos
- nroVuelo
- aerolinea
- fechaSalida
- fechaLlegada
- avion
#### Métodos
- asociarAvion(unAvion : Avion)
- asociarAerolinea(unaAerolinea: Aerolinea)

### Clase Cliente
#### Atributos
- nroCliente
- reservas
#### Métodos
- realizarReserva(nroAsiento : int)

### Clase Reserva
#### Atributos
- nroConfirmacion
- cliente
- fechaReserva
- asientoReservado
- vuelo
#### Métodos
- asociarVuelo(unVuelo : Vuelo)

### Clase Aeropuerto
#### Atributos
- codigo
- nombre
- ciudad
#### Métodos

### Clase Aerolinea
#### Atributos
- codigo
- nombre
#### Métodos

### Clase Avion
#### Atributos
- nroAvion
- modelo
- aerolinea
- capMaxima
#### Métodos
- realizarReserva(nroAsiento : int)