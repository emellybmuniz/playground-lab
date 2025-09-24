const fizzBuzz = (fizzBuzz) => {
  if (typeof fizzBuzz !== 'number') {
    return "NaN";
  } else if (fizzBuzz % 5 === 0 && fizzBuzz % 3 === 0) {
    return "FizzBuzz";
  } else if (fizzBuzz % 3 === 0 && !fizzBuzz % 5 === 0) {
    return "Fizz";
  } else if (fizzBuzz % 5 === 0 && !fizzBuzz % 3 === 0) {
    return "Buzz";
  } else if (!fizzBuzz % 5 === 0 && !fizzBuzz % 3 === 0) {
    return fizzBuzz;
  }
};

for (let i = 0; i < 100; i++) {
  console.log(i, fizzBuzz(i));
}
