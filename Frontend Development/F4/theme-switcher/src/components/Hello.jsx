import React,{useContext} from 'react'
import ColorContext from '../context/ColorContext'

const Hello = () => {
    const { defaultMode,whiteMode,darkMode}=useContext(ColorContext)
  return (
    <div style={{color:defaultMode.color,border:defaultMode.border,backgroundColor:defaultMode.backgroundColor}} >
        <p style={{textAlign:defaultMode.textAlign}}>
            Lorem, ipsum dolor sit amet consectetur adipisicing elit. Fuga, illum? Quibusdam, sed. Accusamus consequuntur tenetur, dolorum commodi quidem ab ex sapiente deleniti nostrum, laboriosam asperiores odio obcaecati dicta odit natus!
            Sint quis ullam placeat deserunt eum! Tenetur, eligendi error! Laudantium sed hic error sapiente quod, facilis quo. Consectetur quisquam asperiores voluptatem, veritatis a alias vitae excepturi eveniet, fuga omnis inventore!
            In nihil nisi temporibus id ex reprehenderit, aperiam fuga sed est quasi consequuntur eveniet omnis vel incidunt facilis animi harum. Odio adipisci ea aliquid, omnis accusantium labore dolore odit sed?
            Odio fugiat rem magnam ullam aliquam error asperiores beatae tempore commodi doloribus ipsam quibusdam eaque aspernatur at dignissimos non quia rerum eveniet, dolores iure ipsa ratione totam quam. Aperiam, vitae.
            Suscipit veniam nemo culpa praesentium consequuntur dolorum hic totam aperiam ducimus porro quia accusamus ullam autem ratione, perferendis enim dolor nihil et impedit eos soluta facilis! Aliquid excepturi fugiat alias!
        </p>
        <button onClick={darkMode}>Dark Mode</button>
        <button onClick={whiteMode}>White Mode</button>
    </div>
  )
}

export default Hello