# Juan David Arboleda Molina.Estructura De Datos.2025

#Ejercicio 2. Comparación de Complejidad con time
import time

lista_grande = list(range(1, 1000000))

def busqueda_lineal(lista, objetivo):
    for elemento in lista:
        if elemento == objetivo:
            return True
    return False

def busqueda_binaria(lista, objetivo):
    izquierda, derecha = 0, len(lista) - 1
    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        if lista[medio] == objetivo:
            return True
        elif lista[medio] < objetivo:
            izquierda = medio + 1
        else:
            derecha = medio - 1
    return False

# Medir tiempo de búsqueda lineal
inicio = time.time()
busqueda_lineal(lista_grande, 999999)
print("Tiempo Lineal:", time.time() - inicio)

# Medir tiempo de búsqueda binaria
inicio = time.time()
busqueda_binaria(lista_grande, 999999)
print("Tiempo Binario:", time.time() - inicio)

