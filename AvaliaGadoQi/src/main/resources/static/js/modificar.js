let buscado 

    function busca(){
    let elemento_id = document.getElementById("bovino_id")
    
    let urlbusca = "http://localhost:8080/Bovinos/" + elemento_id.value
    
    let buscaNoBackend = fetch(urlbusca)
       buscaNoBackend.then((res)=>{return res.json()})
       .then(res => {
        response_busca(res)
        buscado = res
    })
       .catch( () => reject_busca())
    }

    function response_busca(obj){

        let local = document.getElementById("rej_busca")
        local.innerHTML=""

        let id_bov = document.getElementById("bovino_id")
        id_bov.disabled = true

        let btn_busca = document.getElementById("btn_busca")
        btn_busca.disabled = true


        let btn_deleta = document.getElementById("btn_deleta")
        btn_deleta.disabled = false

        let btn_atualiza = document.getElementById("btn_atualiza")
        btn_atualiza.disabled = false
        

        let linha = document.getElementById("linha_peso")
        
        let col1 = document.createElement("td")
        col1.id = "coluna1"

        let col2 = document.createElement("td")
        col2.id = "coluna2"

        let caixa_peso = document.createElement("input")
        
        
    
        linha.insertAdjacentElement("afterbegin",col1)
        col1.innerHTML = "Peso"
        linha.insertAdjacentElement("beforeend",col2)
        col2.insertAdjacentElement("afterbegin",caixa_peso)
        caixa_peso.id = "caixa_p"
        caixa_peso.type = "Number"
        caixa_peso.maxLength = 4
        caixa_peso.max = 1800
        caixa_peso.min = 0
        caixa_peso.value = obj.peso
    }

    function reject_busca(){
        let local = document.getElementById("rej_busca")
        local.innerHTML="Animal inexistente"
    }


    function deleta(){
        console.log(buscado.id)

    }


    






