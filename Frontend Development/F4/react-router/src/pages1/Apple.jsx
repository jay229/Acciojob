import React from 'react'
import Products from '../components/Products'

const Apple = () => {
  let productsData = [
    {
      id: 1, name: "Macbook Pro", description: "Apple Macbook Pro", price: "$2000", img: "https://images.unsplash.com/photo-1517336714731-489689fd1ca8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YXBwbGUlMjBsYXB0b3B8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=1200&q=60"
    },
    {
      id: 2, name: "Macbook Air", description: "Apple Macbook Air", price: "$1500", img: "https://images.unsplash.com/photo-1517336714731-489689fd1ca8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YXBwbGUlMjBsYXB0b3B8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=1200&q=60"
    },
    {
      id: 3, name: "Macbook", description: "Apple Macbook", price: "$1000", img: "https://images.unsplash.com/photo-1517336714731-489689fd1ca8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YXBwbGUlMjBsYXB0b3B8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=1200&q=60"
    }
  ]
  return (
    <div className="apple">
      {
        productsData.map((item) => (
          <Products key={item.id} name={item.name} desc={item.description} price={item.price} img={item.img} />
        ))
      }
    </div>
  )
}

export default Apple