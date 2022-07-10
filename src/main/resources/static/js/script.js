function cadastrar(entidade, body){
    return fetch("/" + entidade, {
        body: body,
        method: 'POST',
        headers: {
            '':''
        }
    })
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