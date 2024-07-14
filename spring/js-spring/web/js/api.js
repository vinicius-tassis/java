$(document).ready(function() {

    function getBooks() {
        const url = "https://stephen-king-api.onrender.com/api/books";

        fetch(url)
            .then(response => {
                if (!response.ok) {
                    throw new Error('Erro na requisição');
                }
                return response.json();
            })
            .then(json => {
                displayData(json.data);
            })
            .catch(error => {
                console.error('Erro:', error);
            });
    }

    function displayData(dados) {
        const tabelaBody = $("#tabelaDados tbody");
        tabelaBody.empty();

        dados.forEach(book => {
            const row = $('<tr>');

            const titleCell = $('<td>').text(book.Title);
            row.append(titleCell);

            const yearCell = $('<td>').text(book.Year);
            row.append(yearCell);

            const pagesCell = $('<td>').text(book.Pages);
            row.append(pagesCell);

            const publisherCell = $('<td>').text(book.Publisher);
            row.append(publisherCell);

            tabelaBody.append(row);
        });
    }
    
    // getBooks();

    function getApi() {
        const url = "http://localhost/api/mensagem?nome=Vinicius";

        fetch(url)
            .then(response => {
                if (!response.ok) {
                    throw new Error('Erro na requisição');
                }
                return response.json();
                
            })
            .then(data => {
                console.log(data);
                comprimentar(data);
            })
            .catch(error => {
                console.error('Erro:', error);
            });
    }

    function comprimentar(dados) {
        var texto = $("#texto");
        texto.html(`<p>${dados.mensagem}</p>`);
    }

    getApi();
    
    
});