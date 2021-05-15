# project-calculator

## Metodología

Seguimos los principios TDD. En primer lugar crearemos los test necesarios para cubrir toda la funcionalidad exigida. Esto nos permitirá crear el esqueleto necesario en nuestro proyecto, sin necesidad de métodos o funcionalidad innecesarios.

## Documentación

Swagger disponible en la url http://localhost:8085/swagger-ui/

### Rama Develop
*Tag_Add_Sub_v1_20210515* 

Funcionalidad suma/resta de dos números cubierta.

Test unitarios funcionando correctamente.

Hemos necesitado etiquetar el controlador como @Autowired en el test para que el Servicio no nos llegara null al realizar la operación.

Con @Mock inicializamos el servicio en el test.

	
**Continuamos con la implementación para mejorar la escalabilidad de operaciones e intentar unificar código y métodos.**

*Tag_Add_Sub_v2_20210515* 

Trabajamos ahora con el fin de favorecer la escalabilidad.

Modificamos los test para unificar los métodos de sumar/restar en uno solo, añadiendo el parámetro de operador.

Añadimos la lógica necesaria para que no fallen los test.

Creamos una interfaz Operation, la cual tendrá el método 'execute', que tendrán que implementar las clases Addition y Subtraction. Delegamos la funcionalidad de las operaciones a estas clases.
