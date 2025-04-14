# Análise Crítica

## As duas soluções são aceitáveis?
Se só seguirmos o príncipio de Liskov ambas são aceitáveis

## Uma das soluções é a mais adequada? Qual é? Por quê?
Sim! A solução 4 é mais aceitável, pois com a implementação de uma ‘interface’ de veículos motorizados, tem-se a possibilidade de criar funcionalidades para um tipo específico de veículos, o que ajuda no princípio do aberto e fechado, visto que não precisa alterar a classe abstrata para toda a modificação que se queira adicionar somente para um grupo específico.

## Observe que a solução adotada na parte 4, foi necessário inserir um trecho de código para testar a instância do objeto. Por que isso foi necessário?
Pois a classe Bicicleta não implementa VeiculoMotorizado, sendo assim não tem a função de calcular total de combustível.

## O príncipio da substituição de Liskov continua a ser obedecido?
Sim!

## Consegue observar a aplicação de algum princípio SOLID na análise destas soluções?
Sim! O princípio de aberto e fechado, pois a classe VeículosTransporte está fechada para modificação e caso queira adicionar mais funcionalidades a umas das classes filhas deve-se criar ‘interfaces’ e/ou modificar.