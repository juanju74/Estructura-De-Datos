#Juan David Arboleda Molina.Estructura De Datos.2025.23/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA
# Recursión simple (O(2^n))
def fibonacci_recursivo(n):
    if n <= 1:
        return n
    return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2)

# Programación dinámica (O(n))
def fibonacci_dinamico(n, memo={}):
    if n in memo:
        return memo[n]
    if n <= 1:
        return n
    memo[n] = fibonacci_dinamico(n - 1, memo) + fibonacci_dinamico(n - 2, memo)
    return memo[n]

# Prueba con n=10
print(fibonacci_recursivo(10))   # Output: 55 (pero lento)
print(fibonacci_dinamico(10))    # Output: 55 (rápido)
