a = int(input())
result = []

for i in range(1, a + 1):
    if not (i % 2 == 0 and i % 4 != 0) and not ((i // 8) % 2 == 0) and not (i % 7 < 4):
        result.append(i)

print(" ".join(map(str, result)))