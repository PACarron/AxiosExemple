
var monObject =
    [
        {"numero":1, "couleur":"rouge"},
        {"numero":2, "couleur":"bleu"},
        {"numero":3, "couleur":"verte"}
    ];

function appel(){
    axios.post("/",monObject, {
        headers: {
            'Content-Type': 'application/json',
        }
    }).then((result) => {

    }).catch((err) => {

    })
}