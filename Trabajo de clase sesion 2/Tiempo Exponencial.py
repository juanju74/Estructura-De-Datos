# Juan David Arboleda Molina.Estructura De Datos.2025

#Tiempo Exponencial

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)

print(fibonacci(6))  # Output: 8
