import React from 'react'
import { Routes, Route } from 'react-router-dom'

// import Navbar from './pages/Navbar'

// import Home from './pages/Home'
// import Blog from './pages/Blog'
// import About from './pages/About'
// import Contact from './pages/Contact'

import Nokia from './pages1/Nokia'
import Apple from './pages1/Apple'
import Brand from './pages1/Brand'
import Samsung from './pages1/Samsung'
import Error from './pages1/Error'

import User from "./pages2/User"
import Marks from './pages2/Marks'
import Userinfo from './pages2/Userinfo'




const App = () => {
  return (
    <div>
      {/* <Navbar/>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/about' element={<About />} />
        <Route path='/contact' element={<Contact />} />
        <Route path='/blog' element={<Blog />} />
      </Routes> */}

      {/* <Routes>
        <Route path='/brand' element={<Brand />}>
          <Route path='nokia' element={<Nokia />} />
          <Route path='' element={<Apple />} />
          <Route path='apple' element={<Apple />} />
          <Route path='samsung' element={<Samsung />} />
          <Route path='*' element={<Error />} />
        </Route>
        <Route path='*' element={<Error />} />
      </Routes> */}

      <Routes>
        <Route path='/users' element={<User/>}/>
        <Route path='/users/3' element={<Marks/>}/>
        <Route path='/users/:x' element={<Userinfo/>}/>
      </Routes>




    </div>
  )
}

export default App