# Autor
Leo Vásconez y Jefferson Guerrero
## Versión 2.2.1
Se agrega archivos a la librería "lib", también se añadió archivos a la carpeta "test" con la cual se pone a prueba los métodos realizados dentro de las carpetas que fueron creadas en el "main" con el mismo nombre de las carpetas del "test" y que a su vez estas contienen cada una sus clases en donde se encuentran alojados los métodos, esto con la finalidad de que el test funcione correctamente. 

El funcionamiento de cada uno de los métodos creados son los siguientes: 
-> En la clase InsertBST, si el árbol está vacío se creará un nuevo nodo con el valor y lo devuelve como la nueva raíz. Si el valor a insertar es menor que el valor del nodo actual, inserta el valor en el subárbol izquierdo. Si el valor a insertar es mayor que el valor del nodo actual, inserta el valor en el subárbol derecho por último, el return retorna el nodo raíz actual

-> En la clase InvertBinaryTree, si el árbol está vacío (la raíz es null), nos devolverá null. Además, llama recursivamente a invertTree en el subárbol izquierdo y derecho, de manera que intercambia los subárboles izquierdo y derecho del nodo actual. Retorna el nodo raíz, que ahora tiene sus subárboles izquierdo y derecho invertidos.

-> En la clase ListLeves, el código recorre el árbol nivel por nivel y guarda los nodos de cada nivel en listas separadas dentro de una lista principal. Se usó una "cola" para poder ir guardando los nodos

-> En la clase Depth, el código recorre el árbol y devuelve la mayor profundidad encontrada desde la raíz hasta el final del mismo.

## Versión 2.2.2
Se añade la clase AVLtree dentro de la carpeta "Controllers" la misma que contiene el codigo para poder balancear un árbol, además se modificó la clase Node en donde declaramos una nueva variable privada de tipo int llamada "height" y luego hicimos su respectivo getter and setter para que logre funcionar correctamente nuestro código, ya que esta variable la utilizamos dentro de la clase AVLTree. 

## Versión 2.2.3
Se añade la clase Graph con sus respetivos métodos dentro de la carpeta "Controllers" al igual que la clase NodeGraph, que se añadió a la carpeta "Models", también se añadió la clase "Sets" dentro de "Controllers" 

