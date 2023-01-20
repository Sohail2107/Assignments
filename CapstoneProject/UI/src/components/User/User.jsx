import React from 'react'
import user from '../../images/user.jpg'
import './User.css'
import { useNavigate } from 'react-router'

function User() {
  const navigate=useNavigate();

  const userLogin = () =>{
    navigate('/userLogin');
  }

  return (
    <div className="user-container">
        <img src={user} className="user-img"/>
        <div className="Userbtn-container">
        <button className="btn" onClick={()=>{userLogin()}}>Login as a User</button>
        <button className="btn">Join as a User</button>
        </div>
    </div>
  )
}

export default User