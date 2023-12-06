let key = '5dce2ec3f75e4ac7a45f6fa7f1d2104f'
let urlTemplate = 'https://api.sportsdata.io/v3/mma/scores/json/Schedule/UFC/{season}?key=5dce2ec3f75e4ac7a45f6fa7f1d2104f'
const fs = require('fs');

const delay = ms => new Promise(resolve => setTimeout(resolve, ms));

async function fetchAndSave() {
    for (let season = 2015; season <= 2023; season++) {
        let url = urlTemplate.replace('{season}', season);
        fetch(url)
            .then(response => response.json())
            .then(data => {
                fs.writeFile(`Schedule_${season}.json`, JSON.stringify(data), err => {
                    if (err) {
                        console.error(err);
                        return;
                    }
                    console.log(`Data saved to Schedule_${season}.json`);
                });
            })
            .catch(error => console.error(error));

        await delay(1000); // Wait for 1 second before the next fetch
    }
}

fetchAndSave();