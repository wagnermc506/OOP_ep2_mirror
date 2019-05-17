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
  - **Rendimento**: 14 Km/L
  - **Carga máxima**: 360 Kg
  - **Velocidade média**: 100 Km/h
  - A cada Kg de carga, o rendimento é reduzido em 0.025 Km/L
- Moto
  - **Combustível**: Gasolina ou Álcool
  - **Rendimento**: 50 Km/L
  - **Carga máxima**: 50 kg
  - **Velocidade média**: 110 Km/h
  - A cada Kg de carga, o rendimento é reduzido em 0.3 Km/L


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
