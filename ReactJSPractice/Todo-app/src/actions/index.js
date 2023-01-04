const ADD_TODO='ADD_TODO';

export const addTodo=(text,desc,status)=>({
    type:ADD_TODO,
    id:Math.random(),
    text,
    desc,
    status
})

const DELETE_TODO = 'DELETE_TODO';
export const deleteTodo = (id)=>({
    type:DELETE_TODO,
    id
})

const DELETED_TODO = 'DELETED_TODO';
export const deletedTodo = (id)=>({
    type:DELETED_TODO,
    id
})