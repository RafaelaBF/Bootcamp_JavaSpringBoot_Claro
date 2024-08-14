# Construtores

No Java, para criar um objeto utilizamos a seguinte estrutura de código:

```java
Classe novoObjeto = new Classe();
```

Esse processo é conhecido como instanciar um novo objeto, o que significa criar uma instância da classe na memória. Muitas vezes, ao criar um objeto, queremos definir algumas propriedades essenciais imediatamente. Para isso, utilizamos **construtores**.

Vamos ilustrar isso com uma classe `Pessoa` que possui os atributos: Nome, CPF, e Endereço.

```java
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //...
    // getters e setters para nome e cpf?
}
```

Sem um construtor adequado, ao criar uma instância da classe `Pessoa`, não seria possível definir os valores de `nome` e `cpf` diretamente:

```java
public class SistemaCadastro {
    public static void main(String[] args) {
        // Criando uma pessoa no sistema
        Pessoa marcos = new Pessoa();
        
        // Definindo o endereço de Marcos
        marcos.setEndereco("RUA DAS MARIAS");
        
        // Mas como definir o nome e cpf de Marcos?
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
```

Para solucionar isso, podemos utilizar um **construtor**:

```java
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    
    // Construtor da classe
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    //...
    // getters e setters
}
```

Agora, ao criar o objeto, os valores de `nome` e `cpf` já serão definidos:

```java
public class SistemaCadastro {
    public static void main(String[] args) {
        // Criando uma pessoa no sistema com nome e CPF
        Pessoa marcos = new Pessoa("06724506716", "MARCOS SILVA");
        
        // Continua...
    }
}
```

# Enums

**Enum** é um tipo especial de classe em Java onde os objetos são previamente definidos, imutáveis e disponíveis para toda a aplicação. Usamos Enum quando o nosso modelo de negócio possui valores fixos e pré-estabelecidos, como por exemplo:

- **Grau de Escolaridade**: Analfabeto, Fundamental, Médio, Superior
- **Estado Civil**: Solteiro, Casado, Divorciado, Viúvo
- **Estados Brasileiros**: São Paulo, Rio de Janeiro, Piauí, Maranhão

> [!WARNING]
> Não confunda uma lista de constantes com um enum.

Enquanto uma constante é uma variável com valor imutável, um enum é um conjunto de objetos previamente definidos. Como um enum é uma classe, ele pode ter atributos e métodos. Veja um exemplo para os estados brasileiros mencionados acima:

```java
public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piauí"),
    MARANHAO("MA", "Maranhão");
    
    private String sigla;
    private String nome;
    
    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    
    public String getSigla() {
        return sigla;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
```

Boas práticas para criar enums:

- Os valores (objetos) devem ser descritos em caixa alta separados por underline (EXEMPLO: `OPCAO_UM`)
- Encerrar a lista de valores com ponto e vírgula (`;`)
- Um enum pode ter atributos e métodos, como qualquer classe
- O construtor deve ser privado
- Não é comum um enum possuir setters, apenas getters

Agora podemos usar o enum `EstadoBrasileiro` em qualquer parte do sistema:

```java
public class SistemaIbge {
    public static void main(String[] args) {
        // Imprimindo os estados existentes no enum
        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + " - " + uf.getNomeMaiusculo());
        }
        
        // Selecionando um estado a partir das opções disponíveis
        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
        
        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
    }
}
```

# Getters e Setters

Em Java, os métodos "Getters" e "Setters" são utilizados para acessar e modificar os valores dos atributos de uma classe. Seguindo a convenção Java Beans:

- Os atributos devem ser privados (`private`)
- Getters obtêm o valor do atributo (`public`)
- Setters definem ou modificam o valor do atributo (`public`)

Exemplo:

```java
// Classe Aluno com atributos privados e métodos getters e setters
public class Aluno {
    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

Uso do `this`:

```java
// Método setter utilizando o 'this' para diferenciar o atributo do parâmetro
public void setNome(String nome) {
    this.nome = nome;
}
```

Esses conceitos são essenciais para garantir a integridade e encapsulamento dos dados em Java.
