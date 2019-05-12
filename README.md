# PhoneBook: 
Álvaro González, Lucas Raposo, Enrique Salazar, Nader Zaiter



Este proyecto tendrá dos partes técnicas claramente diferenciadas:

a. Spring MVC + HTML/JSP/EL/Thymeleaf
1. Parte Pública (FrontOffice): es la propia agenda online. Muestra el listado
de contactos y permite el acceso a diversas funcionalidades:
a. Listado de contactos con accesos para editar/eliminar
b. Alta de nuevos contactos
c. Búsqueda de contactos (básica)
d. Ficha de cada contacto. Vista detallada
Para esta parte no es necesario, en primera instancia, emplear login de
acceso.

b. Spring REST + Angular
1. Servicio Rest: Se crearán una serie de servicios REST que se puedan
consumir desde un Front y que repliquen la funcionalidad MVC (Ej, borrar
por ID, actualizar, guardar, recuperar el listado de contactos, etc.).
2. Front Angular: Se creará el Front que permita consumir el servicio REST
