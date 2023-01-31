import React ,{useEffect, useState } from 'react'
// import CaochHeader from '../Header/CoachHeader'
import coachimg from '../../images/coach.jpg'
import './CoachHome.css'
import axios from 'axios' 
import Header1 from '../Header/Header1'
import Footer from '../Footer/Footer'

const CoachHome = (props) => {
  console.log(props.coachId)
  const id = props.coachId;
  let [coach, setCoach] = useState([]);
  const fetchData = async () => {
    try {
      const response = await axios.get(`http://localhost:8083/api/coach/getCoach/${id}`);
      console.log(response);
      coach = response.data;
      // console.log("here is the data array");
      setCoach(coach);
      console.log(coach);
    } catch (error) {
      console.log(error.response);
    }
  };   useEffect(() => {
    fetchData();   }, []);   
return (
<div>
    <Header1/> 
    <div>
        <div className="coach-home-card">
            <img src={coachimg} alt="coach-img"/>
        <div className="data-card">
            <p>Coach id : {coach.id}</p>
            <p>Date of birth :{coach.dateOfBirth}</p>
            <p>Mobile number:{coach.mobileNumber}</p>
            <p>Speciality:{coach.speciality}</p>
        </div>
        </div>
    </div>
</div>
  )
}; export default CoachHome