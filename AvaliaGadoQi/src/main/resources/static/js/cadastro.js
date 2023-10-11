


let pegaNumero = async () => {
    let dados_bovinos = await fetch('http://localhost:8080/Bovinos')
    let array_bovino = await  dados_bovinos.json()    
        return array_bovino.length
        }
            


window.onload = async () => {
    let numero_posicao = ((await pegaNumero()) + 1)

    let posicao = document.querySelector('#bovino_numero')
    posicao.innerHTML = numero_posicao

    let btn_hidden = document.getElementById("btn_id_escondido")
    btn_hidden.value = numero_posicao
}

let formulario = document.getElementById("form_cadastro")
formulario.addEventListener("submit",function(evt){
    console.log(evt.target)
})






