# TallerSOLID
## Literal 1
Se violan los principios: 
Single Responsability Principle: porque pastel y helado estaban realizando funciones que no le competen como showPrecioFinal() y calcularPrecioFinal().
Open-Closed Principle: porque si queremos añadir más postres se tenía que implementar totalmente cada método en clase nueva de postre.

## Literal 2
Se violan los principios:
OCP: agregar mas postres requeriria la modificacion de la clase.

## Literal 3
Se violan los principios:
Single Responsability Principle: porque los métodos showPrecioFinal() y calcularPrecioFinal() no correspondían a las clases Helado y Pastel, que posteriormente fue Postre.

## Literal 4
Dependency Inversion Principle: el uso de los aderezos dependian de una clase concreta, los modulos deben depender de abstracciones

## Literal 5
Se violan los principios:
Liskov Substitution: porque usar usarPastel() con LecheDeslactosada nos podría lanzar una excepción.
También OCP porque para cada leche hay que implementar cada tipo de Postre, si se agregan más postres, son más métodos, eso se corrigió.
