t = input();
def carTripCost(x):
    if x>300:
        return x*10
    return 300*10

while t > 0 :
    x = input()
    print(carTripCost(x))
    t = t-1