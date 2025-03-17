#Juan David Arboleda Molina.Estructura De Datos.2025.17/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA

# Tiempo Logaritmico

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

numeros = [1, 3, 5, 7, 9, 11, 13, 15]
print(busqueda_binaria(numeros, 7))  # Output: 3 (posición del número)
