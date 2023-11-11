import random

def change(a, b):
    return [b, a]

c = random.randint(0,100)
d = random.randint(0, 100)
e = random.randint(0, 100)
f = random.randint(0, 100)

print(f"c: {c}; d: {d}; e: {e}; f:{f};")

c, d = change(c, d)
e, f = change(e, f)
d, e = change(d, e)

print(f"New - c: {c}; d: {d}; e: {e}; f:{f};")

