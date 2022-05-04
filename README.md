# VendasX-Brains-API
API - Listagem e cadastro de vendas e vendedores - X-Brains processo seletivo

Coforme solicitado, segue o modelo representação de recursos com os endpoints criados:

OBSERVAÇÕES: O arquivo "vendasxbrains - pro-seletivo.postman_collection.json" que está na raíz do projeto, 
deve ser importado para o POSTMAN contedo toda a estrutura dos endpoints Gets e Post para melhor análisedo projeto.

OBSERVAÇÕES: Ao inicia o projeto o Banco de dados H2 é populado automaticamete, podendo ser acrescentado novos registros posteriormente.
URL: http://localhost:8080/h2-console/login


Listar Vendas: Get
Get: http://localhost:8080/vendas - Retorna lista de vedas formato json com as respectivas propriedades: 
{
        "id": 1,
        "dataVenda": "yyyy-MM-dd",
        "valor": 999.99,
        "vendedor": {
            "id": 1,
            "nome": "Nome vendedor"
        }
}

Cadastrar Venda: Post
Post: http://localhost:8080/vendas - Cadastra uma veda com as respectivas propriedades: 
{

  "dataVenda": "2022-05-08",
  "valor": 958.55,
  "vendedor": {
        "id": 1
        }
}

Listar Vendedores por Período de data passadas por parâmetros  - Vendas: Get
Get: http://localhost:8080/vendas/listafiltrada?dateInicio=01-03-2022&dateFinal=10-05-2022 - Retorna a Lista de Vendedores 
por período de datas passadas por parâmetros com as respectivas propriedades : 
OBSERVAÇÕES: Confome passado nas instruções, esta lista não teve a nescecidade de persistência em banco H2, criada somente para visualização em tela.
OBSERVAÇÕES: parametros obrigatórios: dateInicio, dateFinal 

{
        "id": 1,
        "nome": "Nome Vendedor",
        "totalvendasvendedor": 999.99,
        "mediavendasdiarias": 199.99,
        "quantvendaperiodoinformado": 5
}

Cadastrar Vendedor: Get
Get: http://localhost:8080/vendedor - Cadastra um vendedor com as respectivas propriedades
{
    "nome": "Nome Vendedor"
}



Listar Vendedor: Get
Get: http://localhost:8080/vendedor - Retorna lista de Vendedores formato json com as respectivas propriedades:
{

    {
        "id": 1,
        "nome": "Nome Vendedor 01"
    },
    {
        "id": 2,
        "nome": "Nome Vendedor 02"
    },
    {
        "id": 3,
        "nome": "Nome Vendedor 03"
    }

}


01 "commit inicial - estrutura basica do projeto vendaxbraintest com as dependencias: h2,web,jpa,lombok,devtools - mavem"
02 "criação do pacote raíz: domain"
03 "criação dos sub pacotes: entity, controllers, repository e service"
04 "criação das entidades no pacote entity: Venda e Vendedor"
05 "criação do mapeameto relacional das entidades Venda e Vendedor"
06 "criaçao do relacionamento OneToMany e ManyToOne das entidades"	
07 "abilitar accesso ao h2 em aplications.properties: spring.h2.console.enabled=true"
08 "Verificação do mapeamento relacional das tabelas no banco H2;
09 "criação do arquivo import.sql para popular as tabelas no H2"
10 "criação das classes Repositorys: VendaRepository, VendedorRepository"
11 "criação das classes Serviços: VendaService, VendedorService"
12 "criacao das classes controllers: VendaController, VendedorController"
13 "criação e implementação dos métodos adicionar e listar em VendaController"
14 "criação e implementação dos métodos adicionar e listar em VendedorController"
15 "verificação do endpoint no postman do métodos adicioar Venda"
16 "verificação do endpoint no postman do métodos Listar Vendas"
17 "verificação do endpoint no postman do métodos adicioar Vendedor"
18 "verificação do endpoint no postman do métodos Listar Vendedor"
19 "verificação do endpoint no postman do métodos Listar Vendedor com os parametros de consulta por período de data"
20 "verificaões finais e finalização do projeto"




