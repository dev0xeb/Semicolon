def print_elements_in_even_positions(list):
    even_elements =[]
    for even in range(len(list)):
        if even % 2 == 0:
            even_elements.append(list[even])
    return even_elements
print(print_elements_in_even_positions([1, 2, 3, 4, 5]))
