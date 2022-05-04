// Find the character that has the highest number of occurrences within a certain string, ignoring case.
var getMax = function (string) {
 let max = 0,
     maxChar = '',
     str = str.toLowerCase(); //for ignoring case update the string to lowercase

  //function to check each chracter to its next
  str.split('').forEach(function(char){
    if(str.split(char).length > max) {
        max = str.split(char).length;
        maxChar = char;
     }
  });
  return maxChar;
};