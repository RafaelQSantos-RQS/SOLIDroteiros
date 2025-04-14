# Análise Crítica
## Mesmo com problemas na modelagem, existe alguma solução de contorno? Caso não tenha condições de alterar o modelo no momento?
Para contornar existe envolver o gerarFatura() em um try-catch na main, entretanto é uma solução muleta.

## Consegue identificar se esta modelagem viola algum outro princípio do SOLID?
Claramente viola o princípio de Liskov, pois está a implementar uma “interface” que não usa todos os métodos dela