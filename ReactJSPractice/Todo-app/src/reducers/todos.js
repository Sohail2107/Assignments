const initialState = {
    data:[]
}

const todos = (state=initialState,action)=>{
    switch(action.type){
        case 'ADD_TODO':
            return {
                ...state,
                data:[...state.data,{id:action.id,text:action.text,desc:action.desc,status:action.status}]
            }
        case 'DELETE_TODO':
            const todosLists = state.data.filter((todo)=>(todo.id!==action.id)); 
            return {
                ...state,
                data:todosLists
            }
            case 'DELETED_TODO':
            // const todosLists1 = state.data.filter((todo)=>(todo.id==action.id)); 
            return {
                ...state,
                data:todosLists
            }
        default:
            return state;
    }
}

export default todos;