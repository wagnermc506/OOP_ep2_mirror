# EP2 - OO 2019.1 (UnB - Gama)

## Definições

Será obrigatório o uso da ferramenta de versionamento git. A avaliação abordará, não se limitando a estes, os pontos abaixo:
- Commits (Possui mensagens significativas? Demonstram trabalho contínuo? São atômicos?);
- Fork (Foi realizado do repositório original da disciplina?);

Além da solução em software, o aluno deverá modelar o Diagrama de Classes (UML) do sistema e colocá-lo, no repositório, em local de fácil acesso (Exemplos: imagem na raiz do repositório ou imagem no README.md).

## Problema

Uma transportadora, que possui diversos tipos de veículos e transporta diversas cargas, foi a última empresa na qual Zé do Caminhão trabalhou. Zé era o funcionário mais antigo e a sua tarefa era decidir qual o melhor veículo para o transporte de uma determinada carga. Dentre os veículos disponíveis, Zé era capaz de decidir, de acordo com a carga e a distância a ser percorrida, qual era a opção que resultava no maior lucro. Além disso, caso não fosse lucrativa, a entrega poderia ser recusada.

A tarefa não é trivial, pois leva em consideração algumas peculiaridades dos veículos disponíveis:
- Carreta
  - **Combustível**: Diesel
  - **Rendimento**: 8 Km/L
  - **Carga máxima**: 30 toneladas
  - **Velocidade média**: 60 Km/h
  - A cada Kg de carga, o rendimento é reduzido em 0.0002 Km/L
- Van
  - **Combustível**: Diesel
  - **Rendimento**: 10 Km/L
  - **Carga máxima**: 3,5 toneladas
  - **Velocidade média**: 80 Km/h
  - A cada Kg de carga, o rendimento é reduzido em 0.001 Km/L
- Carro
  - **Combustível**: Gasolina ou Álcool
  - **Rendimento**: 14 Km/L com gasolina, 12Km/L com álcool
  - **Carga máxima**: 360 Kg
  - **Velocidade média**: 100 Km/h
  - A cada Kg de carga, o rendimento é reduzido em 0.025 Km/L com gasolina e 0.0231 Km/L com álcool
- Moto
  - **Combustível**: Gasolina ou Álcool
  - **Rendimento**: 50 Km/L com gasolina, 43 Km/L com álcool
  - **Carga máxima**: 50 kg
  - **Velocidade média**: 110 Km/h
  - A cada Kg de carga, o rendimento é reduzido em 0.3 Km/L com gasolina e 0.4 Km/L com álcool


  Os valores dos combustíveis a serem utilizados são:
  - **Álcool**: R$ 3.499 por litro
  - **Gasolina**: R$ 4.449 por litro
  - **Diesel**: R$ 3.869 por litro


Com a aposentadoria de Zé, não existem outros funcionários capazes de realizar a mesma tarefa. Como um bom gestor, o proprietário deseja digitalizar todo o sistema de decisões para não correr o risco de outro funcionário deixar a empresa e, assim, fazer o problema reaparecer.	Além disso, há o desejo de sofisticar os resultados obtidos. Você foi contratado(a) como o(a) Engenheiro(a) de Software responsável pelo desenvolvimento da nova solução. Os requisitos elicitados são:

- O sistema deve persistir (armazenar) a frota de veículos da empresa, possibilitando a criação e a remoção de veículos existentes;
- O sistema deve permitir que o usuário possa configurar a margem de lucro com a qual os cálculos serão realizados;
- O sistema deve persistir (armazenar) a margem de lucro inserida pelo usuário;
- O sistema deve receber, do usuário, os seguintes dados no momento da realização dos cálculos:
  - O peso da carga a ser entregue;
  - A distância a ser percorrida na entrega;
  - O tempo máximo no qual a entrega deve ser realizada;
- O sistema deve mostrar, ao usuário, os seguintes dados após a realização dos cálculos:
  - O veículo disponível que possui o menor custo de operação para a carga dada, o tempo que levará para ele realizar a entrega e o custo de operação somado com a margem de lucro;
  - O veículo disponível que mais rápido consegue realizar a entrega, o tempo que levará para ele realizar a entrega e o custo de operação somado com a margem de lucro;
  - O veículo disponível que possui o melhor custo benefício para a empresa, o tempo que levará para ele realizar a entrega e o custo de operação somado com a margem de lucro;
- Caso exista veículo que consiga realizar a entrega sem exceder os limites de peso e de tempo, deve ser possível selecioná-lo para o serviço;
- Caso não exista veículo que consiga realizar a entrega sem exceder os limites de peso e de tempo, o usuário deve ser alertado e não pode ser possível selecionar veículos para o serviço;
- Os veículos selecionados para serviço não podem ser utilizados em outros fretes sem que o usuário os torne disponível novamente;
- A carga deve ser entregue em apenas uma viagem, por apenas um veículo;

## Critérios de correção

| ITEM                                              | COMENTÁRIO                                                                                                                                                                                                                    | VALOR |
|---------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------|
| Cadastro de veículos e margem de lucro            | Permitir ao usuário cadastrar e atualizar a fronta de veículos e a margem de lucro da empresa de modo persistente (de acordo com os requisitos)                                                                                                             | 2     |
| Cálculo do frete e alocação da frota              | O programa deve estar funcionando indicando os veículos mais adequados para cada demanda de frete e apresentar um resumo final de todas as demandas e como as mesmas estão sendo atendidas junto com o lucro total dos fretes (de acordo com os requisitos) | 2     |
| Apresentação - Interface Gráfica                  | A apresentação em interface gráfica das informações ao usuário deve ser clara                                                                                                                                                                               | 1     |
| Modelagem                                         | Referente à organização e relacionamento entre classes. Deve ser gerado/feito um diagrama do projeto                                                                                                                                                        | 1     |
| Polimorfismo                                      | Ao menos três aplicações de Polimorfismo devem ocorrer corretamente                                                                                                                                                                                         | 1     |
| Herança                                           | Implementar herança entre classes do projeto (Não serão contabilizadas heranças diretas de bibliotecas do Java)                                                                                                                                             | 1     |
| Qualidade de Código                               | O código deve conter bons nomes, ser modularizado, identado e com bom desempenho                                                                                                                                                                            | 1,5   |
| Repositório                                       | Commits frequentes e com mensagens claras, utilização correta do repositório                                                                                                                                                                                | 0,5   |
| Total                                             |                                                                                                                                                                                                                                                             | 10    |
| Pontuação Extra - Testes Unitários                | Será acrescido de pontuação extra o projeto que possuir, em uma de suas classes, testes unitários                                                                                                                                                           | 0,5   |
| Pontuação Extra - Qualidade superior de interface | Interface gráfica com usabilidade e design aprimorados                                                                                                                                                                                                      | 0,5   |
