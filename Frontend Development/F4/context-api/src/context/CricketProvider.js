import React,{useState} from "react";
import CricketContext from "./CricketContext";
const CricketProvider = (props) => {
    const [cricketer,setCricketer]=useState({
        name:"Sachin Tendulkar",
        age:51,
        runs:18424,
        wickets:46,
        matches:463
    })
    // let a = 10;
    return (
        <CricketContext.Provider value={{cricketer,setCricketer}}>
            {props.children}
        </CricketContext.Provider>
    )


}

export default CricketProvider