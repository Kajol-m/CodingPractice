def odd_even(dice, num):
    num = str(num)
    sum_odd = sum(int(i) for i in num[::2])
    sum_even = sum(int(i) for i in num[1::2])
    return sum_odd if dice % 2 == 0 else sum_even

dice = int(input())  # Enter dice value
num = int(input())  # Enter num values
print(odd_even(dice, num))
