# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
def oddEven(dice,num):
    num=str(num)
    sumOdd=0
    sumEven=0
    j=0
    for i in num:
        if(j%2==0):
            sumOdd+=int(i)
            j+=1
        else:
            sumEven+=int(i)
            j+=1
    if(dice%2==0):
        return sumOdd
    else:
        return sumEven
        
dice=int(input())#Enter dice value
num=int(input())#Enter num values
print(oddEven(dice,num))
            
        
