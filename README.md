# project-calculator

Microservicio con SpringBoot.

Documentación generada con SpringFox + Swagger2 disponible en la url http://localhost:8085/swagger-ui/

Usaremos Lombok para generar un código más limpio. En caso de no tenerlo instalado en eclipse:

```bash
Abrir un CMD, ir al repositorio Maven ..\.m2\repository\org\projectlombok\lombok\1.18.12\ y ejecutar java -jar lombok-1.18.12.jar para instalarlo.
```

## Metodología

Seguimos los principios TDD. En primer lugar crearemos los test necesarios para cubrir toda la funcionalidad exigida. Esto nos permitirá crear el esqueleto necesario en nuestro proyecto, sin necesidad de métodos o funcionalidad innecesarios.

Después analizamos mejoras tales como unificación y limpieza de código. Mejoramos igualmente el código para permitir una mejor escalabilidad a nivel de complejidad.

Completamos con documentación de clases/métodos.

## Ejecución del microservicio

Construcción

```bash
mvn clean install
```

Ejecutar los test

```bash
mvn test
```

Ejecutar el microservicio

```bash
mvn spring-boot:run
```

### GIT: Descripción de los tags
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

*Tag_Add_Sub_v3_20210515* 

Trabajamos en la limpieza del código.

Inyectamos la librería trace para gestionar el log.

Añadimos test necesarios para cubrir el mayor porcentaje de código.
