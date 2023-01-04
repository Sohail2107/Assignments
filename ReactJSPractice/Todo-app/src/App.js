import logo from './logo.svg';
import './App.css';
import AddTodo from './components/AddTodo';
import List from './components/List';
import DeletedTodoList from './components/DeletedTodoList';
import PendingTodo from './components/PendingTodo';
import CompletedTodo from './components/CompletedTodo';

function App() {
  return (
    <div className="App">
     <h1>Task List</h1>
     <div className="appContainer">
     <div className="div1"><AddTodo/></div>
     <div className="div1"><List/></div>
     <div className="div1"><DeletedTodoList/></div>
     <div className="div1"><PendingTodo/></div>
     <div className="div1"><CompletedTodo/></div>
     </div>
    </div>
  );
}

export default App;
