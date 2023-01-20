import React from 'react'
import { useNavigate } from 'react-router'
import coach from '../../images/coach.jpg'
import CoachSignUp from '../CoachSignUp/CoachSignUp'
import './Coach.css'

function Coach() {

  const navigate=useNavigate();

  const coachSignUp = () =>{
    navigate('/coachSignUp');
  }

  const coachLogin = () =>{
    navigate('/coachLogin');
  }

  return (
   <div className="coach-container">
        <img src={coach} className="coach-img"/>
        <div className="button-container">
        <button className="btn" onClick={()=>{coachLogin()}}>Login as a Coach</button>
        <button className="btn" onClick={()=>{coachSignUp()}}>Join as a Coach</button>
        </div>
    </div>
  )
}

export default Coach