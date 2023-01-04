import React from 'react'
import { connect } from 'react-redux';
import { addTodo } from '../actions';
import '../styles/style.css';
function AddTodo(props) {
    console.log(props);
  return (
    <form onSubmit={(event)=>{
        event.preventDefault();
        
        let input = event.target.userInput.value;
        let desc = event.target.userInput1.value;
        let status = event.target.status.value;
        props.dispatch(addTodo(input,desc,status));
        console.log(input);
    }}>
        <div className="container">
        <h2>Add Todo</h2>  
        Task Name: <input type="text" name="userInput" className="input-box1" /> <br/>
        Description: <input type="text" name="userInput1" className="input-box2" /> <br/>
        <select name='status' id='checkbox'>
        <option value='completed'>Completed</option>
        <option value='pending' defaultChecked>Pending</option>
         </select><br/>
        <button className="btn">Add</button>
        </div>
    </form>
  )
}

export default connect()(AddTodo)