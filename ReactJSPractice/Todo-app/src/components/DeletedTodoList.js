import React from 'react'
import { connect } from 'react-redux'
import { deletedTodo } from '../actions';
function DeletedTodoList(props) {
    console.log("deletedone",props);
  return (
    <div>
        
       <h2>Deleted Todo</h2>
       
       {/* <ul>
       
            {props.lists.map((list,index)=>
                    <li key={index}>{list.text}</li>
                    // { <button onClick={()=>props.dispatch(deleteTodo(list.id))}>
                    //     Delete</button></li> }
                
            )}
        </ul> */}
    </div>
  )
  
}

const mapData = (state)=>({
 lists:state.todos.data
})

export default  connect(mapData)(DeletedTodoList)