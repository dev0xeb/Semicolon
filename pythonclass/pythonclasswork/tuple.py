tuple2 = ("Orange", [10, 20, 30], (5, 15, 25))
new_list = [[0, 1], [1, 0]]
new_list[0][1] = tuple2[1][1]
new_list[1][1] = tuple2[2][2]

new_list[0] = tuple(new_list[0])
new_list[1] = tuple(new_list[1])
new_list = tuple(new_list)
print(new_list)
