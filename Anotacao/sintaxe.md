# Anatomia das classes

A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.

É muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu programa seja escrita na língua inglesa.

**Sintaxe de declaração de uma nova classe:**

* 99,9% das nossas classes iniciarão com `public class;`
* Toda classe precisa de nome, exemplo `MinhaClasse;`
* O nome do arquivo deve ser idêntico ao nome da classe pública;
* Após o nome, definir o corpo `{ }` , onde iremos compor nossas classes com atributos e métodos.

* É de suma importância que agora você consiga se localizar dentro do conjunto de chaves `{ }` existentes em sua classe.
* Dentro de uma aplicação, **recomenda-se que somente uma classe possua o método** `main`, responsável por iniciar todo o nosso programa.
* O método main recebe seu nome `main`, sempre terá a visibilidade `public`, será definido como `static`, não retornará nenhum valor com `void` e receberá um parâmetro do tipo array de caracteres `String[]`.

## Padrão de nomenclatura

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo:

* **Arquivo .java**: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:
    `Calculadora.java`, `CalculadoraCientifica.java`
  
* **Nome da classe no arquivo**: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```

* **Nome de variável**: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: `ano` e `anoFabricacao`. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".&#x20;

> [!NOTE]
> Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome **br** sempre representará **"Brasil"** e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:
>

```java
String BR = "Brasil";
double PI = 3.14;
int ESTADOS_BRASILEIRO = 27;
int ANO_2000 = 2000;
```

> [!WARNING]
> Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras da linguagem.

* Deve conter apenas letras, \_ (underline), $ ou os números de 0 a 9
* Deve obrigatoriamente se iniciar por uma letra (preferencialmente), \_ ou $, jamais com número
* Deve iniciar com uma letra minúscula (boa prática – ver abaixo)
* Não pode conter espaços
* Não podemos usar palavras-chave da linguagem
* O nome deve ser único dentro de um escopo

```java
// Declaração inválida de variáveis

int numero&um = 1; //Os únicos símbolos permitidos são _ e $
int 1numero = 1;    //Uma variável não pode começar com número
int numero um = 1; //Não pode ter espaço no nome da variável
int long = 1; //long faz parte das palavras reservadas da linguagem
 
// Declaração válida de variáveis
int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
		
```

## Declarando variáveis e métodos

Como identificar entre declaração de variáveis e métodos em nosso programa? Existe uma estrutura comum para ambas as finalidades, exemplo:

* Declarar uma variável em Java segue sempre a seguinte estrutura:

```java
// Estrutura

Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; //observe que aqui a variável spike não tem valor, é normal
```

* Declarando métodos em Java segue uma estrutura bem simples:

```java
// Estrutura

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

// Exemplo

int somar(int numeroUm, int numero2);

String formatarCep(long cep);
```

> [!WARNING]
> Como parte da estrutura de declaração de variáveis e métodos também temos o aspecto da **visibilidade**, mas ainda não é necessário nesta etapa de estudos.

## Identação

Basicamente **indentar** é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

Abaixo, veja um exemplo de um algoritmo de validação de aprovação de estudante. Em uma aba, temos um código sem identação nenhuma, e na outra aba, temos o mesmo código seguindo um padrão de identação. Observe como é muito mais fácil entender a hierarquia do código na segunda aba.&#x20;

### Sem Identação
```java
// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 		
}
}
```

### Com Identação
```java
public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}
```

## Organizando arquivos

À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).

Com o uso de pacotes as nossas classes (.java) passam a possuir duas identificações, o nome simples e nome qualificado:

* **Nome Simples**: Nome do arquivo, exemplo `ContaBanco`.
* **Nome Qualificado**: Nome do pacote + nome do arquivo, exemplo: `com.suaempresa.ContaBanco`.

## Java Beans

Umas das maiores dificuldades na programação é escrever algoritmos legíveis a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso a linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

#### Variáveis

Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de nomenclatura:

* Uma variável deve ser clara, sem abreviações ou definição sem sentido;
* Uma variável é sempre no singular, **exceto quando se referir a um array ou coleção**.
* Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.&#x20;

#### Não recomendado

```java
double salMedio = 1500.23;  //variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com"; //confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH"; //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
```

#### Recomendado

```java
double salarioMedio = 1500.23;
String email = "aluno@escola.com";
String [] emails = {"aluno@escola.com", "professor@escola.com"};
String meuNome = "JOSEPH";
```

#### Métodos

Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

Exemplos sugeridos para nomenclatura de métodos:

```java
somar(int n1, int n2) {}

abrirConexao() {}

concluirProcessamento() {}

findById(int id) {} // não se assuste, você verá muito método em inglês em sua jornada

calcularImprimir() {} // há algo de errado
```

# Terminal e Argumentos

Nem sempre usamos uma IDE para executar nossos programas Java. Em muitos casos, especialmente em ambientes de produção, é necessário compilar e executar o código diretamente via terminal.

## Executando Programas Java via Terminal

Vamos criar uma classe chamada `MinhaClasse.java`:

```java
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo Terminal");
    }
}
```

Após compilar o código, os arquivos `.class` são gerados na pasta `bin`. Para executar a classe pelo terminal, siga estes passos:

1. Abra o terminal (MS-DOS, PowerShell, ou outro).
2. Navegue até o diretório do projeto: `cd C:\estudos\dio-trilha-java-basico\java-terminal`
3. Acesse a pasta `bin`: `cd bin`
4. Execute o programa com: `java MinhaClasse`

## Argumentos

O método `main` pode receber um array de argumentos do tipo `String`. Para passar argumentos, utilize o comando:

```sh
java MinhaClasse argumentoUm argumentoDois
```

Exemplo de código:

```java
public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
```

Para passar valores aos argumentos no VSCode, use a configuração JSON:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "request": "launch",
            "mainClass": "AboutMe",
            "args": ["GLEYSON", "SAMPAIO", "28", "1.58"]
        }
    ]
}
```

## Scanner

A classe `Scanner` permite interações mais intuitivas para entrada de dados pelo usuário. Atualizando o exemplo `AboutMe`:

```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
```

# Tipos e Variáveis

## Tipos de Dados

Os tipos primitivos em Java são:

- `int`, `byte`, `short`, `long`, `float`, `double`, `boolean`, `char`

Tabela dos tipos primitivos e seus valores:

| Tipo  | Memória | Valor Mínimo               | Valor Máximo              |
| ----- | ------- | -------------------------- | ------------------------- |
| byte  | 1 byte  | -128                       | 127                       |
| short | 2 bytes | -32.768                    | 32.767                    |
| int   | 4 bytes | -2.147.483.648             | 2.147.483.647             |
| long  | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |
| float | 4 bytes | -3,4028E + 38              | 3,4028E + 38              |
| double| 8 bytes | -1,7976E + 308             | 1,7976E + 308             |

## Declaração de Variáveis

A estrutura padrão para declarar uma variável é:

`<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>`

Exemplos:

```java
int idade; // Sem valor atribuído
int anoFabricacao = 2021;
double salarioMinimo = 2.500;
```

Observe as peculiaridades de alguns tipos específicos:

```java
public class TipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1275.33;
    }
}
```

## Variáveis e Constantes

Variáveis são áreas de memória que podem armazenar valores que podem mudar. Constantes são valores fixos e são declaradas com a palavra-chave `final`:

```java
public class ExemploVariavel {
    public static void main(String[] args) {
        int numero = 5;
        numero = 10;
        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 3.15; // Erro de compilação
    }
}
```

Java é fortemente tipado e não permite conversões implícitas entre tipos incompatíveis.
