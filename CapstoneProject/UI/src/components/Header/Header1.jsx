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
  return (
    <div className="header-container">
        <div className="leftside" onClick={()=>{gohomepage()}}>WeCare</div>
        <div className="rightside">
        <p>View Profile</p>
        <p>My Schedules</p>
          <p>Call Us : 0002233447</p>
          <p className="btn-logout" onClick={()=>{coachLogout()}}>LogOut</p>
        </div>
    </div>
  )
}

export default Header