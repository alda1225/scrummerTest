# Test Remoto (Parte 1)

<p><strong>Documentacion</strong></p>
<p>El proyecto esta creado en Maven - Java Application</p>
<p>Dentro de el mismo se encuntra el paquete "com.scrummertest.model" donde se encuentra la aplicacion y sus Clases.
Al correr la aplicacion se imprime en consola los datos ingresado en la funcion crearFigura dentro de la clase <strong>FiguraCreacion</strong> quue resive por parametros:</p>
<p>- superficie
<p>- base
<p>- alto</p>
<p>- diametro</p>
<p>- tipoFigura</p>

<p>Todo esto puede ser probado y parametrizado en la clase Main</p>

<br></br>
<br></br>
<p><strong>MODELADO DE CLASES</strong></p>

Desarrollar una clase que permita la creación de objetos que representen figuras
geométricas dadas (cuadrado, triangulo, círculo) proveyendo un parámetro de entrada
único que identifiqué el tipo de objeto esperado como retorno. Tip de ayuda: “Factory”
La estructura del modelo de clases que deben tener las implementaciones de dichas
figuras geométricas será la siguiente:
- Se debe definir una interfaz que exija la definición de métodos que permitan la
obtención de los datos: superficie; base; altura; diámetro; tipo de figura
geométrica.
- Puede definirse alguna clase intermedia (no instanciable) para reducir la
redundancia de código.
- Cada una de sus concreciones debe, ante la invocación de alguno de sus
métodos, retornar el valor correspondiente o null en caso de que la figura
geométrica correspondiente no posea dicha característica.
- En caso de conocer la notación se valorará el diseño de su diagrama UML.


