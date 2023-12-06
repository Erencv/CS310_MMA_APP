let key = '5dce2ec3f75e4ac7a45f6fa7f1d2104f'

let url = 'https://api.sportsdata.io/v3/mma/scores/json/Fighters?key=5dce2ec3f75e4ac7a45f6fa7f1d2104f'

// fetch(url)
//     .then(res => res.json())
//     .then(data => console.json(data))



const fs = require('fs');

fetch(url)
    .then(response => response.json())
    .then(data => {
        fs.writeFile('fighters.json', JSON.stringify(data), err => {
            if (err) {
                console.error(err);
                return;
            }
            console.log('Data saved to data.json');
        });
    })
    .catch(error => console.error(error));

