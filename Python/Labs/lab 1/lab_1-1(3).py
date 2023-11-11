print("Enter string: ")
inp = input()

for c in inp:
    if c.isupper():
        inp = inp.replace(c, "")

print("New string: " + inp)