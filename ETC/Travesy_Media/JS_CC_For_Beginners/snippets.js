// //String, Numbers, Boolean, null, undefined
//
// const name = 'John';
// const age = 30;
// const rating = 4.5;
// const isCool = true;
// const x = null;
// const y = undefined;
// let z;
//
// console.log(typeof name);
// console.log(typeof age);
// console.log(typeof rating);
// console.log(typeof isCool);
// console.log(typeof x);
// console.log(typeof y);
// console.log(typeof z);
//
// // Concatination
// console.log("My name is " + name + ", and i am "+ age+ " years old");
// // Template _strings
// console.log(`My name is ${name}, and i am ${age} years old`);
// const hello = `My name is ${name}, and i am ${age} years old`;
// console.log(hello);

//Methods
// const s = 'Hello World';
// const text = 'technology, computers, it, code, testing, id, ux'
// console.log(s.length);
// console.log(s.toUpperCase());
// console.log(s.toLowerCase());
// console.log(s.substring(0,5).toUpperCase());
// console.log(text.split(', '));


//Arrays
// const numbers = new Array(1,2,3,4,5,6,7);
// const fruits = ['apple', 'banana', 'orange', 'pears', 10, true];
// fruits[3] = 'grapes';
// fruits.push('Mangos'); // to end
// fruits.unshift('strawberry'); // to beginning
// const test = fruits.pop(); // pop last fruit to var
// console.log(test);
// console.log(fruits);
// console.log(Array.isArray(fruits));
// console.log(fruits.length);
// console.log(typeof fruits);
// console.log(fruits.indexOf('orange'));

// object literals
// const person = {
//   firstName: 'John',
//   lastName: 'Doe',
//   age: 30,
//   hobbies: ['music', 'movies', 'sports'],
//   adress: {
//     street: '50 main st',
//     city: 'Boston',
//     state: 'MA'
//   }
// }

// console.log(person);
// console.log(person.firstName);
// console.log(person.hobbies);
// console.log(person.hobbies[1]);
// console.log(person.hobbies[0], person.hobbies[2]);
// console.log(person.adress);
// console.log(person.adress.city);
// console.log(person.adress['street']);
// console.log(person.adress['street'], person.adress['city']);

// Deconstructing
// const {firstName, lastName, age, adress: { city }} = person;
// console.log(firstName);
// console.log(lastName);
// console.log(age);
// console.log(city);

// const {firstName, lastName, age, adress: { city }} = person;
// person.email = `${firstName}_${lastName}@mail.com`;
// console.log(person);


// const todos = [
//   {
//     id: 1,
//     text: 'Take out trash',
//     isCompleted: true
//   },
//   {
//     id: 2,
//     text: 'Walk the cat',
//     isCompleted: false
//   },
//   {
//     id: 3,
//     text: 'Go to work',
//     isCompleted: false
//   },
// ];

// const todoJSON = JSON.stringify(todos);
// console.log(todoJSON);
// console.log(todos[1].text);

// For loops
// for (let i = 1; i <= 10; i++) {
//   console.log(`For loop number: ${i}`);
// }


// while loops
// let i = 1;
// while (i <= 10) {
//   console.log(`while loop number: ${i}`);
//   i++;
// }

// for (let i = 0; i < todos.length; i++) {
//   console.log(todos[i].text);
// }

// for(let todo of todos) {
//   console.log(todo);
// }

// forEach, map, filter
// todos.forEach(function(todo) {
//   console.log(todo.text);
// });

// const todoText = todos.map(function(todo) {
//   return todo.text;
// });
// console.log(todoText);

// const todoCompleted = todos.filter(function(todo) {
//   return todo.isCompleted === true;
// });
// console.log(todoCompleted);

// const todoCompleted = todos.filter(function(todo) {
//   return todo.isCompleted === true;
// }).map(function(todo) {
//   return todo.text;
// })
// console.log(todoCompleted);

// // or
// if (x > 5 || y > 10) {
//   console.log('x is more than 5 or y is more than 10');
// }

// // and
// if (x > 5 && y > 10) {
//   console.log('x is more than 5 or y is more than 10');
// }

// if (x == 10) {
//   console.log('x is 10');
// } else if(x > 10) {
//   console.log('x > 10');
// } else {
//   console.log('x < 10');
// }

// if(x > 5) {
//   if(y > 10) {
//     console.log('y is more than');
//   }
// }

// turnery operators
// const x = 15;
// const color = x > 10 ? 'red' : 'green';
// console.log(color);

// switch(color) {
//   case 'red':
//     console.log('color is red');
//     break;
//   case 'green':
//     console.log('color is green');
//     break
//   default:
//     console.log('color is either of two');
//     break;
// }


// todos.forEach((todo) => console.log(todo));

// function addNums(num1, num2) {
//   console.log(num1 + num2);
// }
// addNums(2, 3);


// const addNums1 = (num1 = 1, num2 = 1) => {
//   console.log(num1 + num2);
// };
// addNums1(2,2);

// const addNums11 = (num1 = 1, num2 = 1) => {
//   return num1 + num2;
// };
// console.log(addNums11(2,2));


// const addNums2 = (num1 = 1, num2 = 1) => console.log(num1 + num2);
// addNums2(3,2);

// const addNums3 = (num1 = 1, num2 = 1) => num1 + num2;
// console.log(addNums3(3,2));

// const addNums4 = num1 => num1 + 5;
// console.log(addNums4(4));

// oop poo oop //

//Constructor function

// function Person(firstName, lastName, dob) {
//   this.firstName = firstName;
//   this.lastName = lastName;
//   this.dob = new Date(dob);

// }

// Person.prototype.getBirthYear = function() {
//   return this.dob.getFullYear();
// }

// Person.prototype.getFullName = function() {
//   return `${this.firstName} ${this.lastName}`

// }

//Instantiate object
// const person1 = new Person('John', 'Doe', '4-3-2019');
// const person2 = new Person('Merry', 'Six', '12-22-2015');

// console.log(person1);
// console.log(person2.dob.getMonth());
// console.log(person1.getBirthYear());
// console.log(person2.getFullName());

// console.log(person1)

// ES6 2015 OOP Sintantic sugar

// function Person(firstName, lastName, dob) {
//   this.firstName = firstName;
//   this.lastName = lastName;
//   this.dob = new Date(dob);
// }

// Person.prototype.getBirthYear = function() {
//   return this.dob.getFullYear();
// }

// Person.prototype.getFullName = function() {
//   return `${this.firstName} ${this.lastName}`
// }

// Class
// class Person1 {
//   constructor(firstName, lastName, dob) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.dob = new Date(dob);
//   }

//   getBirthYear() {
//     return this.dob.getFullYear();
//   }

//   getFullName() {
//     return `${this.firstName} ${this.lastName}`
//   }
// }

// const person1 = new Person1('John', 'Doe','4-3-1980');
// const person2 = new Person1('Jane', 'Doe','4-3-1980');

// console.log(person1);
// console.log(person2.getFullName());