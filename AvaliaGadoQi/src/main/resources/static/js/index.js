let urlDashboard = "http://localhost:8080/Dashboard"
let urlCotacao = "http://localhost:8080/Cot"

let dash = null
let cots = null

const dinheiro = new Intl.NumberFormat("pt-BR", {
    minimumFractionDigits:2
});

async function dados() {
    await fetch(urlDashboard)
        .then(resposta => resposta.json())
        .then(resp => {
           dash = resp
        })
}

async function cotacoes(){
    await fetch(urlCotacao)
            .then(resp => resp.json())
            .then(resp => {cots = resp})
}

cotacoes().then(()=> cotacao_rodape())
dados().then(()=> seedDashboard())



    function seedDashboard(){

        let tagAlvo = document.querySelector("#info0")
        tagAlvo.innerHTML = dash.totalRebanho 
        
        tagAlvo = document.querySelector("#info1")
        tagAlvo.innerHTML = dash.totalMachos

        tagAlvo = document.querySelector("#info2")
        tagAlvo.innerHTML = dash.totalMachos0a12
        
        tagAlvo = document.querySelector("#info3")
        tagAlvo.innerHTML = dash.totalMachos0a12Peso
    
        tagAlvo = document.querySelector("#info4")
        tagAlvo.innerHTML = dinheiro.format(dash.totalMachos0a12Preco)

        tagAlvo = document.querySelector("#info5")
        tagAlvo.innerHTML = dash.totalMachos12Mais

        tagAlvo = document.querySelector("#info6")
        tagAlvo.innerHTML = dash.totalMachos12MaisPeso

        tagAlvo = document.querySelector("#info7")
        tagAlvo.innerHTML = dinheiro.format(dash.totalMachos12MaisPreco)

        tagAlvo = document.querySelector("#info8")
        tagAlvo.innerHTML = dash.totalFemeas

        tagAlvo = document.querySelector("#info9")
        tagAlvo.innerHTML = dash.totalFemeas0a12

        tagAlvo = document.querySelector("#info10")
        tagAlvo.innerHTML = dash.totalFemeas0a12Peso

        tagAlvo = document.querySelector("#info11")
        tagAlvo.innerHTML = dinheiro.format(dash.totalFemeas0a12Preco)

        tagAlvo = document.querySelector("#info12")
        tagAlvo.innerHTML = dash.totalFemeas12Mais

        tagAlvo = document.querySelector("#info13")
        tagAlvo.innerHTML = dash.totalFemeas12MaisPeso

        tagAlvo = document.querySelector("#info14")
        tagAlvo.innerHTML = dinheiro.format(dash.totalFemeas12MaisPreco)

        tagAlvo = document.querySelector("#info15")
        tagAlvo.innerHTML = dinheiro.format(dash.totalRebanhoPreco)

    }

function cotacao_rodape(){

        tagAlvo = document.querySelector("#info16")
        tagAlvo.innerHTML = cots[0]

        tagAlvo = document.querySelector("#info17")
        tagAlvo.innerHTML = cots[1]

        tagAlvo = document.querySelector("#info18")
        tagAlvo.innerHTML = cots[2]
        tagAlvo = document.querySelector("#info19")
        tagAlvo.innerHTML = cots[3]
}









