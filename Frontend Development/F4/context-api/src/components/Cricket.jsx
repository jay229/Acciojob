import React,{useContext} from 'react'
import CricketContext from '../context/CricketContext'
const Cricket = () => {
  const {cricketer,setCricketer}=useContext(CricketContext);
  function updateWickets(){
    setCricketer({...cricketer,wickets:50})
  }
  return (
    <div>
        
        {/* <CricketContext.Consumer>
            {
                (data)=>(
                    <h2>Value of CricketContext {data}</h2>
                )
            }
        </CricketContext.Consumer> */}

        <h1>Context API demo</h1>
        <h2>Cricketer name : {cricketer.name}</h2>
        <h2>{`${cricketer.name}'s age : ${cricketer.age}`}</h2>
        <h2>{`${cricketer.name}'s total run : ${cricketer.runs}`}</h2>
        <h2>{`${cricketer.name}'s total wickets : ${cricketer.wickets}`}</h2>
        <button onClick={updateWickets}>Update wickets</button>
        <h2>{`${cricketer.name}'s total matches : ${cricketer.matches}`}</h2>
    </div>
  )
}

export default Cricket