# Tarea1:Sistema de Vehiculos

El sistema fue diseñado utilizando herencia y polimorfismo para organizar diferentes tipos de vehículos. 
Se creó una clase base Vehiculo con atributos y métodos comunes para reutilizar código. 
Las subclases Auto, Moto y Camion sobrescriben el método describir() para mostrar información específica de cada vehículo. 
La interfaz Electrico fue implementada en Auto para agregar comportamientos relacionados con batería y autonomía. 
Finalmente, se utilizó un arreglo de tipo Vehiculo para aplicar polimorfismo y recorrer todos los objetos de manera uniforme.

# Tarea 2: Sistema de Figuras Geometricas

Explica en 4-6 lineas tus decisiones de diseno

El sistema fue diseñado utilizando herencia para organizar las diferentes figuras geométricas de manera ordenada. 
Se creó una clase abstracta Figura para compartir atributos y métodos comunes entre todas las figuras. 
Las subclases Circulo, Rectangulo y TrianguloRectangulo implementan sus propias fórmulas de área y perímetro usando sobrescritura de métodos. 
También se utilizó polimorfismo mediante un arreglo de tipo Figura para trabajar con todos los objetos de forma uniforme. 
El método describir() permite reutilizar código y mostrar la información de cada figura de manera clara.

# Tarea 3: Sistema de Empleados con Jerarquia

Explica en 5-7 lineas tu diseno y por que elegiste cada decision

El sistema utiliza herencia y polimorfismo para organizar distintos tipos de empleados. 
Se creó una clase abstracta Empleado con atributos y métodos comunes, mientras que las subclases calculan el salario según el tipo de contrato. 
La interfaz Bonificable permite identificar a los empleados que reciben bono adicional. 
También se usó instanceof para verificar qué objetos implementan la interfaz. 
Finalmente, se manejó un arreglo de tipo Empleado para aplicar polimorfismo de forma uniforme y eficiente.
