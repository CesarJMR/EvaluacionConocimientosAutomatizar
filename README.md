# EvaluacionConocimientosAutomatizar
Este repositorio es para posee un proyecto con el fin de ser revisado para evaluar mis conocimientos en pruebas automatizadas


## Notas:
El escenario fue realizado con Selenium Web Driver Java, y con Katalon Studio utlizando la función Record Web.


## Escenario de Prueba: 
Buscar y añadir al carrito de compras, una "SanDisk 128GB Ultra microSDXC UHS-I Memory Card with Adapter".

### Caso de Prueba 1:

* Título:
	* G001 Buscar el producto "SanDisk 128GB Ultra microSDXC UHS-I Memory Card with Adapter" directamente.

* Meta: 
	* Verificar que el producto fue encontrado y añadido al carrito satisfactoriamente.

* Tipo de Prueba:
	* de Sistema
	
* Precondiciones
	* Haber entrado a la pag web amazon.com
	
* Pasos:
	1. Abrir el navegador Google Chrome.
	1. Entrar a la pág web "amazon.com"
	1. Dirigirse al botón de cambiar el lenguaje, y seleccionar "English -EN".
	1. Darle al botón "Save Changes".
	1. Dirigirse a la barra de buscar y seleccionar el departamento de "Electronics".
	1. Escribir en la barra de buscar "SanDisk 128GB Ultra microSDXC UHS-I Memory Card with Adapter".
	1. Darle al botón buscar.
	1. Seleccionar la opción con el nombre: "SanDisk 128GB Ultra microSDXC UHS-I Memory Card with Adapter - C10, U1, Full HD, A1, Micro SD Card - SDSQUAR-128G-GN6MA"
	1. Presionar el botón "Add to Cart".
	1. Validar que se haya añadido el producto al carrito de compras.
	1. Cerrar Google Chrome.
	
* Resultado Esperado:
	* La ventana emergente indicando que el prodcuto fue añadido al carrito de compras.
	
	
### Caso de Prueba 2:

* Título:
	* G002 Buscar de manera más general, el producto "SanDisk 128GB Ultra microSDXC UHS-I Memory Card with Adapter", filtrando la búsqueda.

* Meta: 
	* Verificar que el producto fue encontrado y añadido al carrito satisfactoriamente.

* Tipo de Prueba:
	* de Sistema
	
* Precondiciones
	* Haber entrado a la pag web amazon.com
	
* Pasos:
	1. Abrir el navegador Google Chrome.
	1. Entrar a la pág web "amazon.com"
	1. Dirigirse al botón de cambiar el lenguaje, y seleccionar "English -EN".
	1. Darle al botón "Save Changes".
	1. Dirigirse a la barra de buscar y seleccionar el departamento de "Electronics".
	1. Escribir en la barra de buscar "micro sd card".
	1. Darle al botón buscar.
	1. Dirigirse a la sección de "Featured Brands" y seleccionar "SanDisk".
	1. Dirigirse a la sección "Price" y seleccionar "Under $25".
	1. Seleccionar la opción con el nombre: "SanDisk 128GB Ultra microSDXC UHS-I Memory Card with Adapter - C10, U1, Full HD, A1, Micro SD Card - SDSQUAR-128G-GN6MA"
	1. Presionar el botón "Add to Cart".
	1. Validar que se haya añadido el producto al carrito de compras.
	1. Cerrar Google Chrome.
	
* Resultado Esperado:
	* La ventana emergente indicando que el prodcuto fue añadido al carrito de compras.

