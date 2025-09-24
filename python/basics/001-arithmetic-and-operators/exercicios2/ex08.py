s1 = 'ant '
s2 = 'bat '
s3 = 'cod '

# a)
print (s1 + s2 +s3) # ant bat cod 

# b) 
print(s1 * 10) # ant ant ant ant ant ant ant ant ant ant 

# c)
print(s1 + s2 * 2 + s3 * 3) # ant bat bat cod cod cod 

# d)
print((s1 + s2) * 7) # ant bat ant bat ant bat ant bat ant bat ant bat ant bat 

# e)
mensagem = ((s2.strip() + s2.strip() + s3.strip() + ' '))
mensagem = mensagem * 5
print(mensagem) # batbatcod batbatcod batbatcod batbatcod batbatcod 