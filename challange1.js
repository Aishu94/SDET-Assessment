// Get the nth number in the fibonacci sequence given n
let fibonacci = (n) => {
 //initalize
 let a = 0;
 let b = 1;

 //to store the sum
 let sum = 0;

 //iterate till the given num
 for(let i = 2; i <= n; i++){
    //sum of last two numbers
    sum = a + b; 
   
    //assign the last value to first     
    a = b; 

    //assign the sum to the last
    b = sum; 
 }
 
 //if the num is 0 then return a else return b;
 return n ? b : a;
}

//Print if f is a fibonacci number or not
function isFibonacci(f, a = 0, b = 1) {
  if(f === 0 || f === 1) {
    return true;
  }

  //sum of last two numbers
  let nextNumber = a+b;

  //if nextnumber equals f
  if(nextNumber === f) {
    console.log("Is a fibonacci number!");

  }
  else if(nextNumber > f) {
    onsole.log("Is not a fibonacci number!");
  }

 return isFibonacci(num, b, nextNumber);
}