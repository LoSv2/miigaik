a = input()
b = a.find("h")
c = a.rfind("h")
anew = list(a.replace("h", "H"))
anew[b],anew[c] = "h", "h"
print("".join(anew))