**Seja bem-vindo candidato!**

Como um desenvolvedor Back-End na Stoom uma das maiores responsabilidades que você vai ter é desenvolver funcionalidades e corrigir bugs em sistemas de e-commerce de larga escala que utilizam Spring Boot. Com base nisso, precisamos de sua ajuda para construir a nossa loja Stoom, que deve conter as seguintes funcionalidades:

1. Deve ser desenvolvida uma API de CRUD de produtos
2. Os produtos devem ser enriquecidos com as informações que você julgar relevante para o funcionamento em uma loja, algumas são obrigatórias:
    - Categorias
    - Marca
    - Preços
3. Deve existir um endpoint na API para a busca de produtos que será utilizada na loja
4. Deve existir um endpoint que lista os produtos de uma determinada Marca
5. Deve existir um endpoint que lista os produtos de uma determinada Categoria
6. Produtos podem ser inativados para não aparecerem na busca ou nas listagens sem a necessidade de serem deletados para poderem ser reativados posteriormente
7. Marcas e categorias também podem ser inativados para não aparecerem na loja

**Informações relevantes**:
- Atente-se à todos os pré-requisitos estabelecidos, porém não limite-se a eles, ideias novas ou melhorias são sempre bem-vindas :smiley:
- Você tem total liberdade para fazer qualquer tipo de alteração em qualquer ponto do código (contanto que não alterem a maneira de execução da aplicação)
- Se possível, adicione uma collection do Postman no repositório para conseguirmos testar o código da mesma forma que você
- Boas práticas, legibilidade, testes e performance são alguns dos pontos que serão considerados durante a avaliação

**Boa sorte!**

### O que foi implementado ##
**Endpoints da API**
**Produtos**

### Criar Produto ###
POST /api/products
Request Body: ProductDto
Responses:
201 Created: Produto criado com sucesso.
400 Bad Request: Detalhes do produto inválido

### Ativar Produto ###

PUT /api/products/{productId}
Parameters: productId (integer)
Responses:
204 No Content: Produto ativado com sucesso.
404 Not Found: Produto não encontrado.

### Desativar Produto ###

PUT /api/products/products/{productId}/deactivate
Parameters: productId (integer)
Responses:
204 No Content: Produto desativado com sucesso.
404 Not Found: Produto não encontrado.


### Exportar Produtos para PDF ###

GET /api/products/products/export/pdf
Parameters: active (boolean)
Responses:
200 OK: Produtos exportados com sucesso.
500 Internal Server Error: Erro ao exportar produtos.

### Exportar Produtos para Excel ###

GET /api/products/export/excel
Parameters: active (boolean)
Responses:
200 OK: Produtos exportados com sucesso.
500 Internal Server Error: Erro ao exportar produtos.

### Buscar Produtos por Categoria ###

GET /api/products/products/category/{categoryName}
Parameters: categoryName (string)
Responses:
200 OK: Produtos encontrados com sucesso.
404 Not Found: Categoria não encontrada.

### Buscar Produtos por Marca ### 

GET /api/products/products/brand/{brandName}
Parameters: brandName (string)
Responses:
200 OK: Produtos encontrados com sucesso.

### Buscar Todos os Produtos ###

GET /api/products
Responses:
200 OK: Lista de todos os produtos.


### Categorias ###

**Ativar Categoria**

PATCH /api/categories/{categoryId}
Parameters: categoryId (integer)
Responses:
204 No Content: Categoria ativada com sucesso.
404 Not Found: Categoria não encontrada.

### Desativar Categoria ###

PATCH /api/categories/categories/{categoryId}/deactivate
Parameters: categoryId (integer)
Responses:
204 No Content: Categoria desativada com sucesso.
404 Not Found: Categoria não encontrada.
Marcas
### Ativar Marca ###

PATCH /api/brands/activate/{brandId}
Parameters: brandId (integer)
Responses:
204 No Content: Marca ativada com sucesso.
404 Not Found: Marca não encontrada.
### Desativar Marca ###

PATCH /api/brands/deactivate/{brandId}
Parameters: brandId (integer)
Responses:
204 No Content: Marca desativada com sucesso.
404 Not Found: Marca não encontrada.

<p> o que foi usado, dentre as funcionalidade implementadas estão endpoints para exportar as informações de produto para excel e para pdf, achei que seria interessante, já que pode ser impresso para melhorar na tomada de decisão sobre quais produtos ativar e desativar, devido ao tempo curto fiz somente para os produtos mas deixei de uma forma de facil mudança e replicação para categoria e marcas caso necessário, também utilizei o swagger para documentar a api e facilitar os testes da api, foram implementados testes unitario para prevenção de erros.
acima foi detalhado os endpoints implementado, utilizado também o flyway uma biblioteca para fascilitar o verssioonamento do banco de dados. <p>



