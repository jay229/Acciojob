import React from 'react'

const Products = ({name,img,desc,price}) => {
  return (
    <div className="products">
      <img src={img} alt={name} />
      <h3>{name}</h3>
      <p>{desc}</p>
      <p>{price}</p>
    </div>
  )
}

export default Products