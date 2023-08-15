import React from 'react'
import { Outlet,useNavigate } from 'react-router-dom'

const Brand = () => {
  const navigate=useNavigate();
  return (
    <div>
      <h1>Brand</h1>
      <h3>Our Top Brands</h3>
      <button onClick={()=>navigate("/brand/apple")}>Apple</button>
      <button onClick={()=>navigate("/brand/nokia")}>Nokia</button>
      <button onClick={()=>navigate("/brand/samsung")}>Samsung</button>
      <Outlet/>
    </div>
  )
}

export default Brand