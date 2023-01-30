import React from 'react'
import coachimg from '../../images/coach.jpg'
import { useState, useEffect } from 'react'
import axios from 'axios'
import './CoachLoginPage.css'
import Header from '../Header/Header'
import Footer from '../Footer/Footer'

function CoachLoginPage() {  
   
        const [id, setId] = useState('');
        const [password, setPassword] = useState('');
    
        const handleSubmit = async (e) => {
            e.preventDefault();
        }
        const addPostHandler =()=>{
    
            axios.get(`http://localhost:9090/coach-login-service/api/coach/coachlogin/${id}/${password}`).then((response)=>{
    
              console.log(response);
    
              setId("");
    
              setPassword("");
        if(response.status==200){
            console.log('success');
        }
    
            }
    
            )
          } 
  return (
<div className="main-container">
    <Header/>
    <div className="coach-card">
        
<form className='form' onSubmit={handleSubmit}>
<img className="coach-signup-img" src={coachimg} alt="coach-img"/>
<h2>Login As Life Coach</h2>

<div className='form-row'>

<input
            type='text'
            className='form-input'
            id='id'
            value={id}
            placeholder='Coach Id'
            onChange={(e) => setId(e.target.value)}
          />
</div>
<div className='form-row'>
<input
            type='password'
            className='form-input'
            id='password'
            value={password}
            placeholder='Password'
            onChange={(e) => setPassword(e.target.value)}
          />
</div>

<button type='submit' className='btn' onClick={addPostHandler}>
          Login
</button>

</form>
</div>
    <Footer/>
</div>
  )
 
}

export default CoachLoginPage