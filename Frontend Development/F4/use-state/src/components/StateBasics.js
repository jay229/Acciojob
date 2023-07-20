import React,{useState} from 'react'

const StateBasics = () => {
    // let count=0;
    // function increaseCount(){
    //     document.getElementsByTagName("h1").innerHtml=count
    //     count+=1;
    //     console.log(count);
    // }
    

    // power of useState
    let [count,setCount]=useState(0);

  return (
    <div>
        {/* <h1>{count}</h1>
        <button onClick={increaseCount}>Increase</button> */}

        <h1>{count}</h1>
        <button onClick={()=>setCount(count+1)}>Increase</button>
    </div>
  )
}

export default StateBasics