import React,{useState,useEffect} from 'react'
import Axios from 'axios';
 const Posts = () => {
const baseUrl = "http://localhost:3001/posts";
const [postArr,setPostArr] = useState([]);
const [post, setPost] = React.useState(null);
const [postdetail, setPostDetail] = useState([]);
const [isShown, setIsShown] = useState(true);
const [updateisShown, setUpdateisShown] = useState(true);
useEffect(()=>{
    Axios.get(baseUrl).then((response)=>{
        setPostArr(response.data);
    });
},[]);
if(postArr.length==0) return "<h1>There is No Data</h1>";

// update
function updateDetails(id) {
  setUpdateisShown(current => !current);
  let fname=document.getElementById("fname").value
  let descrip=document.getElementById("descrip").value
    Axios
      .put(`${baseUrl}/${id}`, {
        name: fname,
        desc: descrip,
      })
      .then((response) => {
        //setPostArr(response.data);
        
      });
  }


  //  Delete Operation
  const deleteHandler = (id) => {
 
    console.log(id);
    Axios.delete(`${baseUrl}/${id}`).then(() => {
      let newArry = postArr.filter(data => data.id !== id)
      setPostArr(newArry);
      
    });
}

// view
function viewHandler(id){
  setIsShown(current => !current);
  Axios.get(`${baseUrl}/${id}`).then((response) => {
          setPostDetail(response.data);
  });
}

return (
    <div className="container">
      <div className="div1">
        <h1>All Post ({postArr.length})</h1>
        <div className="content1">
        <ul>
        
        {postArr.map((post)=><li>{post.name}<p><button onClick={() => viewHandler(post.id)} >View</button><button onClick={() => updateDetails(post.id)}>Update</button><button onClick={() => deleteHandler(post.id)}>Delete</button></p></li>)}        
        </ul>
        </div>
        </div>

<div className='view-post' style={{display: isShown ? 'none' : 'block'}}>
<h1>View Details</h1>
<p>ID : {postdetail.id}</p>
<p>Name : {postdetail.name}</p>
<p>Description : {postdetail.desc}</p>
</div>

    <div className="update-div" style={{display: updateisShown ? 'none' : 'block'}}>
     <h2>Enter details to be Updated</h2> 
    <label for="fname">Name:</label>
    <input type="text" id="fname" name="fname"/><br/>
     <label for="description">Description:</label>
      <input type="text" id="descrip" name="lname"/><br/>
      </div>   

      </div>
  )
}

export default Posts;