function cadastrar(entidade, body){
    return fetch("http://localhost:8080/" + entidade, {
        body: JSON.stringify(body),
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            "Content-Type": 'application/json'
        }
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

function cadastrarVoluntario(){
    let nome = document.querySelector('#nome')
    let nasc = document.querySelector('#nasc')
    let cpf = document.querySelector('#cpf')
    let numero = document.querySelector('#numero')
    let uf = document.querySelector('#uf')
    let rua = document.querySelector('#rua')
    let cidade = document.querySelector('#cidade')

    cadastrar('voluntarios', {
        nome: nome.value,
        dataNascimento: nasc.value,
        cpf: cpf.value,
        endereco: {
            uf: uf.value,
            rua: rua.value,
            numero: numero.value,
            cidade: cidade.value
        }
    }).then(
        (data) => console.log(data)
    )
}