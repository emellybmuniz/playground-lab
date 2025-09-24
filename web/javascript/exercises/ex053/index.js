const randomNumbers = [12, 37, 5, 48, 82, 19, 23, 60, 74, 15, 34, 91, 7, 29, 56];
const evenNumbers = randomNumbers
.filter(value => value % 2 === 0) // [12, 48, 82, 60, 74, 34, 56] <- filter
.map(value => value * 2) //  [24, 96, 164, 120, 148, 68, 112] <- map
.reduce((acumulator, value) => value + acumulator, 0) //   732 <- reduce

console.log(evenNumbers) 
                        
                       
 