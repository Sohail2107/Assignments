import React,{useState,useEffect} from 'react'
import Axios from 'axios';
 const Posts = () => {
const baseUrl = "http://localhost:3001/posts";
const [postArr,setPostArr] = useState([]);
const [post, setPost] = React.useState(null);
useEffect(()=>{
    Axios.get(baseUrl).then((response)=>{
        setPostArr(response.data);
    });
},[]);
if(postArr.length==0) return "<h1>There is No Data</h1>";

function updateDetails() {
    Axios
      .put(`${baseUrl}/9`, {
        name: "Hello World9!",
        desc: "This is an updated post9."
      })
      .then((response) => {
        setPost(response.data);
      });
  }

  function deletePost() {
      
    Axios
      .delete(`${baseUrl}/9`)
      .then(() => {
        alert("Post deleted!");
        setPost(null)
      });
  }

return (
    <div className="container">
        <h1>All Post ({postArr.length})</h1>
        <div className="content1">
        <ul>
        
        {postArr.map((post)=><li>{post.name}<p><button >View</button><button onClick={updateDetails}>Update</button><button onClick={deletePost}>Delete</button></p></li>)}        
        </ul>
        </div>

       
      </div>
  )
}

export default Posts;