En la prueba técnica se usaron: Uso 
La versión 11 de Java,  Jakarta 8(versión estándar de java),  servidor Wildfly (anotas las version que tienes instalada), Maven 3, Jsf.
H2 Como base de datos
Para instalar la aplicación de manera manual, seguimos los siguientes pasos:
1) Previamente tener instalado Maven y Wildfly.  2) Gernerar el war que se desea desplegar, usando el comando de Maven: mvn clean install.
3) Ir a la carpeta de target, que se genera una vez se ejecuta el comando de Maven, copiar el war e ir a la carpeta standalone/deployment y pegar el war.
4) Iniciar el servidor
5) Por último compartes ir a  la URL (compartes la URL que te sale en el navegador
