import React from 'react'
import { connect } from 'react-redux'
import { deleteTodo } from '../actions';
function List(props) {
    console.log('here',props);
    
  return (
    <div>
       <h2>All Todo List</h2>
        <ul>
            {props.lists.map(
                (list,index)=>
                    <li key={index}>{list.text}-{list.desc}
                    <button className="btn-2" onClick={()=>props.dispatch(deleteTodo(list.id))}>
                        Delete</button></li>
                
            )}
        </ul>
    </div>
  )
}

const mapData = (state)=>({
 lists:state.todos.data
})
export default  connect(mapData)(List)