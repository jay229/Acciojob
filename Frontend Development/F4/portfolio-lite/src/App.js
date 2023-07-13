import React from 'react'
import Navbar from './components/Navbar'
import About from './components/About'
import Section from './components/Section'

const App = () => {
    const sectionData = [
        {
            title: "Skills",
            desc: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Minima, consequatur reprehenderit facere exercitationem ipsa quos voluptatibus, nam in molestiae, vitae beatae deserunt velit. Temporibus ea aliquam magni laborum sunt obcaecati. Reprehenderit asperiores, quae cupiditate illo qui deleniti dicta et minima accusamus labore amet quidem veritatis natus inventore error dignissimos! Similique facere quia amet reiciendis saepe eum autem nisi sunt magni?Lorem ipsum dolor sit amet consectetur adipisicing elit.Minima, consequatur reprehenderit facere exercitationem ipsa quos voluptatibus, nam in molestiae, vitae beatae deserunt velit.Temporibus ea aliquam magni laborum sunt obcaecati. Reprehenderit asperiores, quae cupiditate illo qui deleniti dicta et minima accusamus labore amet quidem veritatis natus inventore error dignissimos! Similique facere quia amet reiciendis saepe eum autem nisi sunt magni? Lorem ipsum dolor sit amet consectetur adipisicing elit.Minima."
        },
        {
            title: "Qualification",
            desc: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Minima, consequatur reprehenderit facere exercitationem ipsa quos voluptatibus, nam in molestiae, vitae beatae deserunt velit. Temporibus ea aliquam magni laborum sunt obcaecati. Reprehenderit asperiores, quae cupiditate illo qui deleniti dicta et minima accusamus labore amet quidem veritatis natus inventore error dignissimos! Similique facere quia amet reiciendis saepe eum autem nisi sunt magni?Lorem ipsum dolor sit amet consectetur adipisicing elit.Minima, consequatur reprehenderit facere exercitationem ipsa quos voluptatibus, nam in molestiae, vitae beatae deserunt velit.Temporibus ea aliquam magni laborum sunt obcaecati. Reprehenderit asperiores, quae cupiditate illo qui deleniti dicta et minima accusamus labore amet quidem veritatis natus inventore error dignissimos! Similique facere quia amet reiciendis saepe eum autem nisi sunt magni? Lorem ipsum dolor sit amet consectetur adipisicing elit.Minima."
        },
        {
            title: "Projects",
            desc: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Minima, consequatur reprehenderit facere exercitationem ipsa quos voluptatibus, nam in molestiae, vitae beatae deserunt velit. Temporibus ea aliquam magni laborum sunt obcaecati. Reprehenderit asperiores, quae cupiditate illo qui deleniti dicta et minima accusamus labore amet quidem veritatis natus inventore error dignissimos! Similique facere quia amet reiciendis saepe eum autem nisi sunt magni?Lorem ipsum dolor sit amet consectetur adipisicing elit.Minima, consequatur reprehenderit facere exercitationem ipsa quos voluptatibus, nam in molestiae, vitae beatae deserunt velit.Temporibus ea aliquam magni laborum sunt obcaecati. Reprehenderit asperiores, quae cupiditate illo qui deleniti dicta et minima accusamus labore amet quidem veritatis natus inventore error dignissimos! Similique facere quia amet reiciendis saepe eum autem nisi sunt magni? Lorem ipsum dolor sit amet consectetur adipisicing elit.Minima."
        }
       
    ]
    return (
        <div>
            <Navbar />
            <About />
            {
                sectionData.map((obj,index)=>(
                    <Section 
                        key={index}
                        title = {obj.title}
                        desc = {obj.desc}
                        />
                ))
            }
        </div>
    )
}

export default App