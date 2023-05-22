        // Object in Javascript

// creating object

// const user={
//     name:"Mritunjay",
//     age:22
// }
// console.log(user);
// delete user.age;
// console.log(user);

// const value=(function(a){
//     delete a; //delete only work with object
//     return a;
// })(5);
// console.log(value);


// Accessing Object Properties

// const user={
//     name:"Mritunjay",
//     age:22
// }
// console.log(user.name);
// console.log(user["age"]);

// // Modifying and Adding Properties
// user.name="Jay";
// user.age=23;
// console.log(user);

// key with space

// const user={
//     name: "Mritunjay",
//     age: 22,
//      "location":"Ara"
// }
// console.log(user["location"]);

// dynamic keys

// const key="Name";
// const value="Mritunjay";
// const user={
//     [key]:value
// }
// console.log(user);

// const user={
//     // key:value  incorrect
// }
// console.log(user);

// Object iteration

// const user={
//     name:"Mritunjay",
//     age:22
// }

// for (const key in user) {
//    console.log(key+":"+user[key]);
// }

// let num={
//     a:100,
//     b:200,
//     title:"some random"
// }

// function multiplyByTwo(num) {
//     for (const key in num) {
//         if (typeof num[key]==="number") {
//             num[key]=num[key]*2;
            
//         }
//     }
// }

// multiplyByTwo(num);
// console.log(num);


// JSON.STRINGFY and JSON.PARSE


// JSON.STRINGFY: Javascript object to JSON
// const user={
//     name:"Mritunjay",
//     age:22
// }

// // console.log(user);
// const user1=JSON.stringify(user);
// console.log(user1);

// // JSON.PARSE: JSON to Javascript object

// const user2=JSON.parse(user1);
// console.log(user2);

// Spread operator

// const user={
//     name:"Mritunjay",
//     age:22
// }
// const admin={
//     admin:true,
//     ...user
// }
// // console.log(admin);

// const obj={
//     ...admin,
//     // ...user
// }
// console.log(obj);

// Destrcuturing

// const user={
//     name:"Mritunjay",
//     age:22
// }
// const {name,age}=user;
// console.log(name);

// let obj1={
//     greetings:"Namaste!"
// }
// let obj2=obj1;
// obj1.greetings="Hello";
// console.log(obj2.greetings);

// let person={name:"pc"};
// let person2=person; //shallow copy
// person=null
// console.log(person2);

// Object methods

const user={
    name:"Mritunjay",
    age:22,
    username:"pc",
    state:"Bihar"
}

// Object.keys()

// const keys=Object.keys(user);
// console.log(keys);

// Object.values()

// const values=Object.values(user);
// console.log(values);

// Object.entries()

// const entries=Object.entries(user);
// console.log(entries);

// Object.assign()

// let target={};
// Object.assign(target,user);
// console.log(target);

// Object.freez()

// Object.freeze(user);
// user.state="AP";
// console.log(user);

// Object.seal()

Object.seal(user);
// delete user.age; this is not possible.
user.state="AP";
console.log(user);