let urlDashboard = "http://localhost:8080/Dashboard"

let dash = null

async function dados() {
    await fetch(urlDashboard)
        .then(resposta => resposta.json())
        .then(resp => {
           dash = resp
        })
}

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
        tagAlvo.innerHTML = dash.totalMachos0a12Preco

        tagAlvo = document.querySelector("#info5")
        tagAlvo.innerHTML = dash.totalMachos12Mais

        tagAlvo = document.querySelector("#info6")
        tagAlvo.innerHTML = dash.totalMachos12MaisPeso

        tagAlvo = document.querySelector("#info7")
        tagAlvo.innerHTML = dash.totalMachos12MaisPreco

        tagAlvo = document.querySelector("#info8")
        tagAlvo.innerHTML = dash.totalFemeas

        tagAlvo = document.querySelector("#info9")
        tagAlvo.innerHTML = dash.totalFemeas0a12

        tagAlvo = document.querySelector("#info10")
        tagAlvo.innerHTML = dash.totalFemeas0a12Peso

        tagAlvo = document.querySelector("#info11")
        tagAlvo.innerHTML = dash.totalFemeas0a12Preco

        tagAlvo = document.querySelector("#info12")
        tagAlvo.innerHTML = dash.totalFemeas12Mais

        tagAlvo = document.querySelector("#info13")
        tagAlvo.innerHTML = dash.totalFemeas12MaisPeso

        tagAlvo = document.querySelector("#info14")
        tagAlvo.innerHTML = dash.totalFemeas12MaisPreco

        tagAlvo = document.querySelector("#info15")
        tagAlvo.innerHTML = dash.totalRebanhoPreco

    }









