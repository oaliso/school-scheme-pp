def gerar_email(nome, curso, ano):
    # Separar o nome em partes
    partes_nome = nome.split()
    
    # Pegar as iniciais do nome
    iniciais = ''.join([parte[0].lower() for parte in partes_nome])
    
    # Pegar as duas últimas letras do curso
    curso_abreviado = curso[:3].lower()
    
    # Pegar os dois últimos dígitos do ano
    ano_abreviado = str(ano)[-2:]
    
    # Montar o e-mail
    email = f"{iniciais}.{curso_abreviado}{ano_abreviado}@uea.edu.br"
    
    return email

# Receber dados do usuário
nome = input("Digite seu nome completo: ")
curso = input("Digite seu curso: ")
ano = int(input("Digite o ano que você ingressou no curso: "))

# Gerar e mostrar o e-mail
email = gerar_email(nome, curso, ano)
print(f"\nSeu e-mail institucional é: {email}")
