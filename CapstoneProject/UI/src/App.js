import logo from './logo.svg';
import './App.css';
import { Route,Routes } from 'react-router';
import HomePage from './components/HomePage/HomePage';
import { BrowserRouter } from 'react-router-dom';
import CoachSignUp from './components/CoachSignUp/CoachSignUp';
import CoachLoginPage from './components/CoachLoginPage/CoachLoginPage';
import UserLoginPage from './components/UserLoginPage/UserLoginPage';
import UserSignup from './components/UserSignUp/UserSignUp';
import CoachHome from './components/CoachHome/CoachHome';
import { useState } from 'react'
import UserHome from './components/UserHome/UserHome';


function App() {
  const [coachId, setCoachId] = useState(null);
  const [userId, setUserId] = useState(null);
  return (
    <BrowserRouter>
    <div className="App">
      <Routes>
      <Route path="/home" element={<HomePage/>} />
      <Route path="/coachSignUp" element={<CoachSignUp/>}/>
      <Route path="/coachLogin" element={<CoachLoginPage setCoachId={setCoachId}/>}/>
      <Route path="/userLogin" element={<UserLoginPage setUserId={setUserId}/>}/>
      <Route path="/userSignUp" element={<UserSignup/>}/>
      <Route path="/coachhome" element={<CoachHome coachId={coachId}/>}/>
      <Route path="/userhome" element={<UserHome userId={userId}/>}/>
      coachhome
      
      </Routes>
      
    </div>
    </BrowserRouter>
  );
}

export default App;
