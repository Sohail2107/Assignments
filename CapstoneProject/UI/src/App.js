import logo from './logo.svg';
import './App.css';
import { Route,Routes } from 'react-router';
import HomePage from './components/HomePage/HomePage';
import { BrowserRouter } from 'react-router-dom';
import CoachSignUp from './components/CoachSignUp/CoachSignUp';
import CoachLoginPage from './components/CoachLoginPage/CoachLoginPage';
import UserLoginPage from './components/UserLoginPage/UserLoginPage';



function App() {
  return (
    <BrowserRouter>
    <div className="App">
      <Routes>
      <Route path="/home" element={<HomePage/>} />
      <Route path="/coachSignUp" element={<CoachSignUp/>}/>
      <Route path="/coachLogin" element={<CoachLoginPage/>}/>
      <Route path="/userLogin" element={<UserLoginPage/>}/>
      
      </Routes>
      
    </div>
    </BrowserRouter>
  );
}

export default App;
