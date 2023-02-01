import React, { useEffect, useState } from 'react'
import { connect } from 'react-redux'
import './UserAppointment.css'
import axios from 'axios'
import { useNavigate } from 'react-router'
// import { initUser } from '../../data/user';
import Header2 from '../Header/Header2'

function UserAppointment() {
//   const initialState = { date: "",slot: "", userId: props.user.id, coachId: props.coachId};
//   const [appointment, setAppointment] = useState(initialState);
//   const { id, date, slot, userId, coachId } = appointment;
//   const [apptSuccess, setApptSuccess] = useState(false);


//   const handleConfirmAppointment = async () => {
//     console.log(JSON.stringify(appointment))
//     await axios.post(`http://localhost:9090/appointment-service/addApp`,appointment ).then((res)=> {
//         setApptSuccess(true);
        
//     }).catch((err)=>{
//         console.log(err)
//     })
//   }
const navigate=useNavigate();
const appointmentBooked = () =>{
    navigate('/appointmentBooked');
  }

//   const onSlotChange = (event) => {
//     setAppointment({...appointment, [event.target.name]: event.target.value})
   
//   }

//   const handleChange = (event) => {
//       setAppointment({...appointment, [event.target.name]: event.target.value})
//   }

//   if(!apptSuccess)
//   {
  return (
    <div className="appointment-container">
        <Header2/>
      <div className="user-appointment-card">
            <div className="user-booking-single-card">
                <h3 className="user-booking-h3">Proceed with your appointment</h3>
                <div className="appointment-elements">
                    <label>Appointment date</label>
                    <input className="appointment-input-date" type="text" name="date"  />
                </div>
                <div className="appointment-elements">
                    <div>Preferred slot</div>
                    <div className="radio-btn">
                        <input type="radio" name="slot" value="9 am to 10 am" />
                        <label >9 am to 10 am</label>
                        <input type="radio" name="slot" value="10 am to 11 am" />
                        <label >10 am to 11 am</label>
                        <input type="radio" name="slot" value="11 am to 12 pm" />
                        <label >11 am to 12 pm</label>
                        <input type="radio" name="slot" value="12 pm to 1 pm" />
                        <label >12 pm to 1 pm</label>
                        <div className="last-div">
                        <input type="radio" name="slot" value="2 pm to 3pm" />
                        <label >2 pm to 3pm</label>
                        </div>
                    </div>
                </div>
                <div className="btn-confirm-appt">
                    <button onClick={()=>{appointmentBooked()}}>Confirm appointment</button>
                </div> 
            </div>     
            </div>
      </div> 
  )
//   } else {
//       return (
//         <div className="appointment-container">
//         <div className="user-appointment-card">
//               <div className="user-booking-single-card">
//                   <h3 className="user-booking-none-h3">Your appointment is scheduled successfully</h3>
//               </div>     
//               </div>
//         </div> 
//       )
//   }
// }
  }
// const mapStateToProps = (state) => {
//     return {
//         user: state.loginUserReducer
//     }
// }
export default UserAppointment