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


