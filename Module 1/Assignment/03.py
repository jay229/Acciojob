# your code here
h1=int(input())
h2=int(input())
v1=int(input())
v2=int(input())
flag=False
while h1<=10000:
    if h1==h2:
        flag=True
        break
    h1+=v1
    h2+=v2

if flag==True:
    print("true")
else:
    print("false")
