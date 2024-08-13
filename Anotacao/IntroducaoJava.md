# Conceito Original Linguagem Java 

O primeiro nome escolhido pela equipe de desenvolvimento da linguagem Java foi Oak. O desenvolvedor que liderou o projeto para a criação da linguagem Java foi James Gosling. A linguagem Java é baseada principalmente nas linguagens C e C++. O código originado da compilação de programas Java é denominado Bytecode. Esse Bytecode é executado pela Máquina Virtual Java (JVM). A linguagem Java foi desenvolvida e mantida pela Sun Microsystems antes de ser adquirida pela Oracle Inc.

## Execuções Paralelas
- **Multi-threading**: O conceito de execuções paralelas em uma aplicação é chamado de Multi-threading.

## Recurso Necessário para Execução
- **JVM, através de uma JDK ou JRE**: Para executar uma aplicação Java e converter os bytecodes em código de máquina, é necessário ter disponível no sistema operacional o recurso denominado JVM (Java Virtual Machine), através de uma JDK (Java Development Kit) ou JRE (Java Runtime Environment).

## Fator de Popularização
- **Write Once, Run Anywhere**: O conceito de "Write Once, Run Anywhere" ajudou a popularizar a linguagem Java, destacando sua interoperabilidade e portabilidade entre diferentes plataformas.

### Pilares da Orientação a Objetos
Os pilares são:

1. **Encapsulamento**:
   - **Definição**: Encapsulamento é o princípio de ocultar os detalhes internos de uma classe e expor apenas o necessário para o usuário. Isso é feito para proteger o estado interno do objeto e garantir que ele só possa ser modificado através de métodos específicos.
   - **Exemplo**: Imagine uma classe `ContaBancária` que tem um saldo. A classe pode ter métodos públicos como `depositar()` e `sacar()`, mas o saldo real é mantido privado. Isso evita que o saldo seja alterado diretamente de fora da classe.

2. **Polimorfismo**:
   - **Definição**: Polimorfismo é a capacidade de um objeto se comportar de diferentes maneiras dependendo do contexto. Em outras palavras, permite que diferentes classes implementem métodos com o mesmo nome de maneiras diferentes.
   - **Exemplo**: Suponha que você tenha uma classe base `Animal` com um método `fazerSom()`. As classes derivadas `Cachorro` e `Gato` podem implementar `fazerSom()` de forma diferente: um `Cachorro` pode fazer "Au Au" e um `Gato` pode fazer "Miau".

3. **Abstração**:
   - **Definição**: Abstração é o processo de esconder detalhes complexos e mostrar apenas as características essenciais de um objeto. Isso ajuda a simplificar a interação com o sistema, permitindo que você trabalhe com conceitos mais gerais sem se preocupar com a implementação detalhada.
   - **Exemplo**: Se você está dirigindo um carro, você usa o volante, acelerador e freio sem precisar entender como o motor ou a transmissão funcionam. Da mesma forma, em programação, você pode usar uma interface ou uma classe abstrata para interagir com objetos sem conhecer suas implementações internas.

4. **Herança**:
   - **Definição**: Herança é o mecanismo pelo qual uma classe pode herdar propriedades e comportamentos de outra classe. A classe que herda é chamada de subclasse ou classe derivada, e a classe da qual herda é chamada de superclasse ou classe base.
   - **Exemplo**: Se você tem uma classe base `Veículo` com propriedades como `cor` e métodos como `mover()`, você pode criar uma classe derivada `Carro` que herda essas propriedades e métodos, além de adicionar suas próprias características, como `númeroDePortas`.

