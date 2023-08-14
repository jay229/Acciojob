import React from 'react'
import Cricket from './components/Cricket'
import CricketProvider from './context/CricketProvider'

const App = () => {
  return (
    <div>
      <CricketProvider>
        <Cricket />
      </CricketProvider>

    </div>
  )
}

export default App