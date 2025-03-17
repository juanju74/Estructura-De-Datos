#Juan David Arboleda Molina.Estructura De Datos.2025.23/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA
import time

# Búsqueda lineal O(n)
def busqueda_lineal(lista, objetivo):
    for i in range(len(lista)):
        if lista[i] == objetivo:
            return i
    return -1

# Búsqueda binaria O(log n)
def busqueda_binaria(lista, objetivo):
    inicio, fin = 0, len(lista) - 1
    while inicio <= fin:
        medio = (inicio + fin) // 2
        if lista[medio] == objetivo:
            return medio
        elif lista[medio] < objetivo:
            inicio = medio + 1
        else:
            fin = medio - 1
    return -1

# Generamos una lista ordenada grande
lista_grande = list(range(1, 1000000))

# Medimos tiempos
inicio = time.time()
busqueda_lineal(lista_grande, 999999)
print(f"Tiempo búsqueda lineal: {time.time() - inicio:.6f} segundos")

inicio = time.time()
busqueda_binaria(lista_grande, 999999)
print(f"Tiempo búsqueda binaria: {time.time() - inicio:.6f} segundos")
