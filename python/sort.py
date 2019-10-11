def insertSort(arr):
    for i in range(1, len(arr)):
        temp = arr[i]
        j = i
        while j > 0 and temp < arr[j-1]:
            arr[j] = arr[j -1]
            j -= 1
        arr[j] = temp

def selectionSort(arr):
    for i in range(len(arr)-1):
        j = i + 1
        while j < len(arr):
            if arr[j] < arr[i]:
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            j += 1
        i += 1
