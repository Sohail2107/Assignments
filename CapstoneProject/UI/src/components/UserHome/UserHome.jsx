import React ,{useEffect, useState } from 'react'
// import CaochHeader from '../Header/CoachHeader'
import userimg from '../../images/user.jpg'
import './UserHome.css'
import axios from 'axios' 
import Header2 from '../Header/Header2'
import Footer from '../Footer/Footer'

const UserHome = (props) => {
  console.log(props.userId)
  const id = props.userId;
  let [user, setUser] = useState([]);
  const fetchData = async () => {
    try {
      const response = await axios.get(`http://localhost:8081/api/user/getUser/${id}`);
      console.log(response);
      user = response.data;
      // console.log("here is the data array");
      setUser(user);
      console.log(user);
    } catch (error) {
      console.log(error.response);
    }
  };   useEffect(() => {
    fetchData();   }, []);   
return (
<div>
    <Header2/> 
    <div>
        <div className="coach-home-card">
            <img src={userimg} alt="user-img"/>
        <div className="data-card">
            <h2>{user.name}</h2>
            <p>Date of birth :{user.dateOfBirth}</p>
            <p>Email ID:{user.email}</p>
            <p>Mobile No:{user.mobileNumber}</p>
            <p>Address:{user.city},{user.state}</p>
            <p>{user.country}</p>
            <p>Pincode:{user.pincode}</p>
        </div>
        </div>
    </div>
</div>
  )
}; export default UserHome