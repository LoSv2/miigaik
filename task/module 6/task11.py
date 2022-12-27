a = input()
print(a[: a.find("h") + 1],a[a.find("h") + 1 : a.rfind("h")][::-1],a[a.rfind("h") :],sep="",)