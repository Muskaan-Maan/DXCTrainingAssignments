function getRandomNumber() {
    return Math.floor(Math.random() * 100) + 1;
  }
  
  function simulateStockPrice() {
    return new Promise((resolve, reject) => {
      let count = 0;
      const intervalId = setInterval(() => {
        const stockPrice = getRandomNumber();
        console.log(`Stock price: ${stockPrice}`);
        count++;
        if (count === 5) {
          clearInterval(intervalId);
          resolve();
        }
      }, 3000);
    });
  }
  
  simulateStockPrice().then(() => {
    console.log('Stock price simulation complete');
  }).catch((error) => {
    console.error(`An error occurred: ${error}`);
  });