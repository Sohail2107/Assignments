import React from 'react'
import { connect } from 'react-redux'
import { deleteTodo } from '../actions';
function CompletedTodo(props) {
    console.log(props);

    const pendingList = props.lists.filter(item => item.status==='completed')
    console.log('pending',pendingList);
  return (
<div>
    <h2>Completed Todo</h2>
<ul>
    {pendingList.map(
                (list,index)=>
        <li key={index}>{list.text}
         </li>

    )}
</ul>
</div>
  )
}

const mapData = (state)=>({
lists:state.todos.data
})
export default  connect(mapData)(CompletedTodo)