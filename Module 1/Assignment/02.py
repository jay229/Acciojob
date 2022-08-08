def tempConvertor(f):
  c=(f-32)*5/9
  return int(c)

f=int(input("Enter Fahrenheit :"))
print(tempConvertor(f))