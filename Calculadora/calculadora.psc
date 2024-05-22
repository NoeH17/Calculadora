Algoritmo Main
    Definir calculadora1 como Calculadora
    Definir resultadoSuma, resultadoResta, resultadoDivision como Entero
    Definir resultadoMultiplicacion, resultadoPotencia como Real
    
    calculadora1 <- CrearCalculadora()
    
    resultadoSuma <- calculadora1.suma(5, 3)
    Escribir "El resultado de la suma es: " + resultadoSuma
    
    resultadoResta <- calculadora1.resta(10, 7)
    Escribir "El resultado de la resta es: " + resultadoResta
    
    resultadoDivision <- calculadora1.division(8, 2)
    Escribir "El resultado de la división es: " + resultadoDivision
    
    resultadoMultiplicacion <- calculadora1.multiplicacion(4, 6)
    Escribir "El resultado de la multiplicación es: " + resultadoMultiplicacion
    
    resultadoPotencia <- calculadora1.potencia(2, 6)
    Escribir "El resultado de la potencia es: " + resultadoPotencia
    
Fin Algoritmo
