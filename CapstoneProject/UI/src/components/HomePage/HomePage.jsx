import React from 'react'
import Coach from '../Coach/Coach'
import Footer from '../Footer/Footer'
import Header from '../Header/Header'
import User from '../User/User'
import './HomePage.css'

function HomePage() {
  return (
    <div className="homepage">
        <Header/>
     <h1>We are at the heart of appropriate care</h1>
     <div className="cards">
     <Coach/>
     <User/>
     </div>
     <Footer/>
    </div>
  )
}

export default HomePage