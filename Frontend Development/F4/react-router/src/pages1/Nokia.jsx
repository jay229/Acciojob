import React from 'react'
import Products from '../components/Products'

const Nokia = () => {
  let productsData = [
    {
        id: 1, name: "Nokia 1", description: "Nokia 1", price: "$2000", img: "https://images.ctfassets.net/wcfotm6rrl7u/188PM7J2a2kVzLDAWjR9la/4d5860b38aa36beea79fe320b78a43e9/nokia-G42_5G-so_purple-front_back-int.png"
    },
    {
        id: 2, name: "Nokia 2", description: "Nokia 2", price: "$1500", img: "https://images.ctfassets.net/wcfotm6rrl7u/188PM7J2a2kVzLDAWjR9la/4d5860b38aa36beea79fe320b78a43e9/nokia-G42_5G-so_purple-front_back-int.png"
    },
    {
        id: 3, name: "Nokia 3", description: "Nokia 3", price: "$1000", img: "https://images.ctfassets.net/wcfotm6rrl7u/188PM7J2a2kVzLDAWjR9la/4d5860b38aa36beea79fe320b78a43e9/nokia-G42_5G-so_purple-front_back-int.png"
    }
]
  return (
    <div className="apple">
    {
      productsData.map((item)=>(
        <Products key={item.id} name={item.name} desc={item.description} price={item.price} img={item.img}/>
      ))
    }
    </div>
  )
}

export default Nokia