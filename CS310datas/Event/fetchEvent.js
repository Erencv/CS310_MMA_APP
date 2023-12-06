let list = [284, 285, 293, 286, 288, 289, 290, 292, 287, 291, 294, 295, 296, 300, 297, 301, 303, 304, 302, 305, 306, 307, 298, 309, 308, 776, 310, 777, 750, 764, 778, 313, 765, 779, 311, 766, 751, 767, 752, 768, 312, 769, 762, 770, 774, 771, 772, 781, 773, 782, 299, 775, 763, 780, 783, 166, 167, 168, 171, 169, 172, 174, 170, 173, 176, 175, 179, 177, 178, 183, 180, 181, 182, 189, 187, 188, 184, 185, 193, 194, 206, 195, 207, 190, 208, 209, 192, 201, 196, 202, 197, 198, 204, 199, 191, 200, 205, 210, 212, 211, 215, 221, 216, 222, 203, 223, 213, 217, 218, 220, 214, 219]

let key = '5dce2ec3f75e4ac7a45f6fa7f1d2104f'
let urlTemplate = 'https://api.sportsdata.io/v3/mma/scores/json/Event/{eventid}?key=5dce2ec3f75e4ac7a45f6fa7f1d2104f'
const fs = require('fs');

const delay = ms => new Promise(resolve => setTimeout(resolve, ms));

async function fetchAndSave() {
    let allData = [];
    for (let i = 0; i < list.length; i++) {
        let url = urlTemplate.replace('{eventid}', list[i]);
        fetch(url)
            .then(response => response.json())
            .then(data => {
                allData.push(data);
                if (i === list.length - 1) { // If it's the last iteration
                    fs.writeFile(`AllEvents.json`, JSON.stringify(allData), err => {
                        if (err) {
                            console.error(err);
                            return;
                        }
                        console.log(`Data saved to AllEvents.json`);
                    });
                }
            })
            .catch(error => console.error(error));

        await delay(1000); // Wait for 1 second before the next fetch
    }
}

fetchAndSave();