//  call()
// function greet() {
//    return  `Hello ${this.name},Good Morning! `;
// }
// // greet();
// const user={
//     name:"Mritunjay"
// }

// console.log(greet.call(user));

// apply()

// function sayHello(age,profession) {
//     return `Hello I'm ${this.name}.  I'm ${age} year old and my profession is ${profession}`;
// }
// const user={
//     name:"Mritunjay"
// }
// const arg=[22,"Software Engineer"]
// console.log(sayHello.apply(user,arg));

// apply()

// function sayHello(profession) {
//     return `Hello my name is ${this.name} and I'm a ${profession}.`
// }

// const user={
//     name:"Mritunjay"
// }
// const myFun=sayHello.bind(user,"Software developer")
// console.log(myFun());