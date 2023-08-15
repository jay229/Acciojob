import React from 'react'
import ColorContextProvider from './context/ColorContextProvider'
import Hello from './components/Hello'
const App = () => {
  return (
    <div>
    <ColorContextProvider>
      <Hello/>
    </ColorContextProvider>
    </div>
  )
}

export default App