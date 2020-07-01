# Prueba3

Para solucioanr el problema se crearon 6 clases: Carro, Kromi, Caguano, Trupalla, Huevo, Tablero.

Se implementó una matriz de carros de 15x15 que guardaba objetos de tipo Carro.

Los objetos que pueden ingresar en la matriz son Kromi, Trupalla, Caguano y Huevos, ya que se implementaron como clases hijas de Carro (incluyendo los Huevos, para más facilidad al momento de representar o imprimir la matriz con sus objetos dentro). 

Además se implementó una lista dinámica que guardaba los objetos Huevos para posteriormente calcular el puntaje obtenido al lanzar huevos.

Al lanzar huevos se hace una verificacón de si existe un objeto en la matriz (que puede ser Kromi, Caguano y Trupalla). Si el objeto existe en la matriz, entonces este cambia su atributo "nombre" a "H" con los métodos Set de cada subclase y además, se agrega a la lista dinámica de huevos. Si no existe un objeto en la matriz (en esa coordenada), se crea un objeto Huevo en la matriz y además se agrega a la lista dinámica de Huevos. 
