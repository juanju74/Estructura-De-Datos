#Juan David Arboleda Molina.Estructura De Datos.2025.23/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA
# Factorial con recursión O(n)
def factorial_recursivo(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial_recursivo(n - 1)

# Factorial con programación dinámica O(1)
def factorial_iterativo(n):
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado

# Prueba con un número grande
print(factorial_recursivo(5))  # Output: 120
print(factorial_iterativo(5))  # Output: 120
