// All about this keyword

// in node.js
// console.log(this); global{} object
// document.writeln(this); Window object

// this.a=10;
// const getParam=()=>{
//     console.log(this.a);
// }
// getParam();
// Normal function: this->parent object
// Arrow function: this->parent normal function

// this with normal function

// const parentObj={
//     name:"Mritunjay",
//     age:22,
//     greet(){
//         console.log(`Hii, ${this.name}`);
//     }

// }
// parentObj.greet();
// const parentObj={
//     name:"Mritunjay Kumar Tiwari",
//     age:22,
//     childObj:{
//         nickName:"Jay",
//         greet(){
//             console.log(`Hii, ${this.name}(${this.nickName})`);
//         }
//     }
    

// }
// parentObj.childObj.greet();

// this with arrow function

// const user={
//     name:"Mritunjay",
//     age:22,
//     getDetail:()=>{
//          console.log(`User name is ${this.name} and age is ${this.age}`);
//         //console.log(`User name is ${name} and age is ${age}`);
//     }
// }
// user.getDetail();

// let user={
//     name:"pc",
//     age:23,
//     getDetails(){
//         const nestedArrow=()=>console.log(this.name);
//         nestedArrow();
//     }
// }
// user.getDetails();

// let user={
//     name:"pc",
//     age:23,
//     getName(){
//         var name="Jay";
//         // return this.name;
//         return this.name;
//     }
// }
// console.log(user.getName());

// let obj1={
//     a:10,
//      obj2:{
//         b:20,
//         fun(){
//             console.log(this);
//         }
//     }
// }
// obj1.obj2.fun();

// function parentFun() {
//     const childFun=()=>{
//         console.log(this);
//     }
//     childFun();
// }
// parentFun()

// const user={
//     name:"pc",
//     logMessage(){
//         console.log(this.name);
//     }
// }
// setTimeout(user.logMessage,100);
// //user.logMessage();
// setTimeout(user.logMessage.bind(user),100);