import React from 'react'
import './Header.css'
import { useNavigate } from 'react-router'

function Header() {
  const navigate=useNavigate();
    const gohomepage = () =>{
        navigate('/home');
      }
  return (
    <div className="header-container">
        <div className="leftside" onClick={()=>{gohomepage()}}>WeCare</div>
        <div className="rightside">
          <p>Call Us : 0002233447</p>
        </div>
    </div>
  )
}

export default Header