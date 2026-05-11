**Tarea 2: Sistema de Empleados con Jerarquia
Explica en 5-7 lineas tu diseno y por que elegiste cada decision

El sistema utiliza herencia y polimorfismo para organizar distintos tipos de empleados. 
Se creó una clase abstracta Empleado con atributos y métodos comunes, mientras que las subclases calculan el salario según el tipo de contrato. 
La interfaz Bonificable permite identificar a los empleados que reciben bono adicional. 
También se usó instanceof para verificar qué objetos implementan la interfaz. 
Finalmente, se manejó un arreglo de tipo Empleado para aplicar polimorfismo de forma uniforme y eficiente.
