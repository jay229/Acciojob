import React from 'react'

const Section = ({key,title,desc}) => {
  return (
    
    <div className='section'>
    <hr/>
        <h1>{title}</h1>
        <p>{desc}</p>
    </div>
  )
}

export default Section