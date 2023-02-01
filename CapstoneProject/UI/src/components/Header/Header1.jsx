import React from 'react'
import './Header1.css'
import { useNavigate } from 'react-router'

function Header() {
    const navigate=useNavigate();
    const coachLogout = () =>{
        navigate('/coachLogin');
      }
    const gohomepage = () =>{
        navigate('/home');
      }
      const goschedule = () =>{
        navigate('/coachSchedule');
      }
      const goprofile = () =>{
        navigate('/coachhome');
      }
  return (
    <div className="header-container">
        <div className="leftside" onClick={()=>{gohomepage()}}>WeCare</div>
        <div className="rightside">
        <p onClick={()=>{goprofile()}}>View Profile</p>
        <p onClick={()=>{goschedule()}}>My Schedules</p>
          <p>Call Us : 0002233447</p>
          <p className="btn-logout" onClick={()=>{coachLogout()}}>LogOut</p>
        </div>
    </div>
  )
}

export default Header