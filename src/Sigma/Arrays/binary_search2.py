def binary_search(arr, key):
    start = 0
    end = len(arr) - 1

    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == key:
            return mid
        elif arr[mid] > key:
            end = mid - 1
        else:
            start = mid + 1
    return -1


def main():
    arr = [1, 4, 6, 90, 108, 508, 1000]
    key = 90
    index = binary_search(arr, key)
    print("Index of the key is :" + str(index))


if __name__ == "__main__":
    main()
