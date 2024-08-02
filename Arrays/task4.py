def print_elements_in_odd_positions(list):
    odd_elements =[]
    for odd in range(len(list)):
        if odd % 2 == 1:
            odd_elements.append(list[odd])
    return odd_elements
print(print_elements_in_odd_positions([1, 2, 3, 4, 5]))
