import React from 'react'
import './Header1.css'
import { useNavigate } from 'react-router'

function Header() {
    const navigate=useNavigate();
    const userLogout = () =>{
        navigate('/userLogin');
      }
   
    const gohomepage = () =>{
        navigate('/home');
      }
      const goappointment = () =>{
        navigate('/userAppointment');
      }
      const goprofile = () =>{
        navigate('/userhome');
      }
  return (
    <div className="header-container">
        <div className="leftside" onClick={()=>{gohomepage()}}>WeCare</div>
        <div className="rightside">
        <p onClick={()=>{goprofile()}}>View Profile</p>
        <p onClick={()=>{goappointment()}}>My Appointments</p>
          <p>Call Us : 0002233447</p>
          <p className="btn-logout" onClick={()=>{userLogout()}}>LogOut</p>
        </div>
    </div>
  )
}

export default Header