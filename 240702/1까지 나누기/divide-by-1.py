n = int(input())
count = 0
i = 1

while (n > 1):
    n = n // i
    i += 1
    if n > 1:
        count += 1
print(count+1)