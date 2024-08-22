def reverse_a_list(number):
        arraybeginning =0
        arrayend = len(number) - 1

        while arraybeginning < arrayend:
            number[arraybeginning], number[arrayend] = number[arrayend], number[arraybeginning]
            number[arraybeginning] += 1
            number[arrayend] -= 1
        return number
print(reverse_a_list([1, 2, 3, 4, 5]))
            
