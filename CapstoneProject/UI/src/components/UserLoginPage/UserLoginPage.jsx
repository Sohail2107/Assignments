import React from 'react'
import userimg from '../../images/user.jpg'
import { useState, useEffect } from 'react'
import axios from 'axios'
import Header from '../Header/Header'
import Footer from '../Footer/Footer'

function UserLoginPage() {
    const [id, setId] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();
    }
    const addPostHandler =()=>{

        axios.get(`http://localhost:8082/api/user/userlogin/${id}/${password}`).then((response)=>{

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
<img className="coach-signup-img" src={userimg} alt="user-img"/>
<h2>Login As User</h2>

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

export default UserLoginPage