import React from 'react'
import Products from '../components/Products'

const Samsung = () => {
  let productsData = [
    {
      id: 1, name: "Samsung 1", description: "Samsung 1", price: "$2000", img: "https://fscl01.fonpit.de/userfiles/6898953/image/android-samsung-galaxy-s6-edge-test-review-image-01.JPG"
    },
    {
      id: 2, name: "Samsung 2", description: "Samsung 2", price: "$1500", img: "https://fscl01.fonpit.de/userfiles/6898953/image/android-samsung-galaxy-s6-edge-test-review-image-01.JPG"
    },
    {
      id: 3, name: "Samsung 3", description: "Samsung 3", price: "$1000", img: "https://fscl01.fonpit.de/userfiles/6898953/image/android-samsung-galaxy-s6-edge-test-review-image-01.JPG"
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

export default Samsung