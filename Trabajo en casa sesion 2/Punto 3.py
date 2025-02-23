#Juan David Arboleda Molina.Estructura De Datos.2025.23/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA
import time

# Insertar en una lista
lista = []
inicio_lista = time.time()
for i in range(100000):
    lista.append(i)
fin_lista = time.time()

# Insertar en un diccionario
diccionario = {}
inicio_diccionario = time.time()
for i in range(100000):
    diccionario[i] = i
fin_diccionario = time.time()

# Resultados
print(f"Tiempo en lista: {fin_lista - inicio_lista:.6f} segundos")
print(f"Tiempo en diccionario: {fin_diccionario - inicio_diccionario:.6f} segundos")
