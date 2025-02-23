#Juan David Arboleda Molina.Estructura De Datos.2025.23/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA
import random
import timeit

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if not swapped:
            break
    return arr

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left_half = merge_sort(arr[:mid])
    right_half = merge_sort(arr[mid:])
    
    return merge(left_half, right_half)

def merge(left, right):
    sorted_list = []
    i = j = 0
    
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            sorted_list.append(left[i])
            i += 1
        else:
            sorted_list.append(right[j])
            j += 1
    
    sorted_list.extend(left[i:])
    sorted_list.extend(right[j:])
    
    return sorted_list

# Generamos una lista grande de números aleatorios
size = 1000
random_list = [random.randint(0, 10000) for _ in range(size)]

# Copiamos la lista para asegurar que ambas pruebas usen los mismos datos
list_for_bubble = random_list[:]
list_for_merge = random_list[:]

# Medimos el tiempo de ejecución
time_bubble = timeit.timeit(lambda: bubble_sort(list_for_bubble), number=1)
time_merge = timeit.timeit(lambda: merge_sort(list_for_merge), number=1)

print(f"Tiempo Bubble Sort: {time_bubble:.6f} segundos")
print(f"Tiempo Merge Sort: {time_merge:.6f} segundos")

# Explicación:
# - Bubble Sort (O(n^2)) compara e intercambia elementos adyacentes repetidamente.
#   Es ineficiente para listas grandes porque requiere muchas comparaciones.
# - Merge Sort (O(n log n)) divide recursivamente la lista en mitades y las combina ordenadas.
#   Es más eficiente que Bubble Sort para listas grandes.
