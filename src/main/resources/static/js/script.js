function cadastrar(entidade, body){
    return fetch("/" + entidade, {
        body: JSON.stringify(body),
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            "Content-Type": 'application/json'
        }
    })
}

function atualizar(url, body){
    return fetch(url, {
        method: 'PUT',
        headers: {
            "Content-Type": 'text/uri-list'
        },
        body: body
    })
}

function cadastrarInstituicao() {
    let nome = document.querySelector('#nome')
    let numero = document.querySelector('#numero')
    let uf = document.querySelector('#uf')
    let rua = document.querySelector('#rua')
    let cidade = document.querySelector('#cidade')

    cadastrar('instituicoes', {
        nome: nome.value,
        endereco: {
            uf: uf.value,
            rua: rua.value,
            numero: numero.value,
            cidade: cidade.value
        }
    }).then((data) => console.log(data))
}

async function cadastrarVoluntario(){
    let nome = document.querySelector('#nome')
    let nasc = document.querySelector('#nasc')
    let cpf = document.querySelector('#cpf')
    let numero = document.querySelector('#numero')
    let uf = document.querySelector('#uf')
    let rua = document.querySelector('#rua')
    let cidade = document.querySelector('#cidade')

    let bodyVolunt = {
        nome: nome.value,
        dataNascimento: nasc.value,
        cpf: cpf.value
    }

    let bodyEndereco = {
        uf: uf.value,
        rua: rua.value,
        numero: numero.value,
        cidade: cidade.value
    }

    let refVolunt
    let refEndereco

    cadastrar('voluntarios', bodyVolunt
    ).then(
        (data) => data.json()
    )
    .then(
        (data) => {
            refVolunt = data._links.self.href
            cadastrar('enderecos', bodyEndereco).then(
                (data) => data.json()
            ).then(
                (data) => {
                    refEndereco = data._links.self.href
                    atualizar(refVolunt + '/endereco', refEndereco).then()
                }
            )
        }
    )
}