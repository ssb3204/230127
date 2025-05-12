tc =int(input())
colors = ["red", "orange", "yellow", "green", "blue", "purple"]
for _ in range(tc):
    a,b =input().split()
    x=colors.index(a)
    y=colors.index(b)
    diff = (x -y) % 6

    if x ==  y:
        print("E")
    elif diff ==1 or diff == 5 :
        print("A")
    elif diff ==3 :
        print("C")
    else:
        print("X")

