import React, { useState } from 'react'
import ColorContext from './ColorContext';

const ColorContextProvider = (props) => {
    const defaultStyle = {
        color: "black",
        backgroundColor: "white",
        textAlign: "left",
        border: "2px solid red"
    }
    const [style, setStyle] = useState(defaultStyle);
    return (
        <ColorContext.Provider value={
            {
                defaultMode:style,
                whiteMode: () => setStyle(defaultStyle),
                darkMode: () => setStyle({
                    ...style,
                    color: "white",
                    backgroundColor: "black",
                    textAlign: "center",
                    border: "2px solid tomato"
                })
            }
        }>
            {props.children}
        </ColorContext.Provider>
    )
}

export default ColorContextProvider