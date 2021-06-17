/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
  
return s.split(" ").map((curr) => curr.split("").reverse().join("")).join(" ");

    
};
