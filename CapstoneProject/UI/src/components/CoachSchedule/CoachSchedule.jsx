import React from 'react'
import Header1 from '../Header/Header1'
import Footer from '../Footer/Footer'
import './CoachSchedule.css'
import img from '../../images/notebook-pen-icon.jpg'

function CoachSchedule() {
  return (
    <div className="main-container">
        <Header1/>
        <div>
        <img className="img-appoint" src={img} alt="appointment-img"/>
        <p className="content">No Planned Schedules Yet.</p>
        </div>
    </div>
  )
}

export default CoachSchedule