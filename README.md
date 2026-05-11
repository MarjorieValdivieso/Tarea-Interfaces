""Tarea 2: Sistema de Empleados con Jerarquia
Explica en 5-7 lineas tu diseno y por que elegiste cada decision

El sistema utiliza herencia y polimorfismo para organizar distintos tipos de empleados. 
Se creó una clase abstracta Empleado con atributos y métodos comunes, mientras que las subclases calculan el salario según el tipo de contrato. 
La interfaz Bonificable permite identificar a los empleados que reciben bono adicional. 
También se usó instanceof para verificar qué objetos implementan la interfaz. 
Finalmente, se manejó un arreglo de tipo Empleado para aplicar polimorfismo de forma uniforme y eficiente.

""Tarea 1: Sistema de Figuras Geometricas
Explica en 4-6 lineas tus decisiones de diseno

El sistema fue diseñado utilizando herencia para organizar las diferentes figuras geométricas de manera ordenada. 
Se creó una clase abstracta Figura para compartir atributos y métodos comunes entre todas las figuras. 
Las subclases Circulo, Rectangulo y TrianguloRectangulo implementan sus propias fórmulas de área y perímetro usando sobrescritura de métodos. 
También se utilizó polimorfismo mediante un arreglo de tipo Figura para trabajar con todos los objetos de forma uniforme. 
El método describir() permite reutilizar código y mostrar la información de cada figura de manera clara.
