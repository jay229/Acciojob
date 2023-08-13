import React, { useEffect } from 'react'
import { postFetching, postFetchSuccess, postFetchError, fetchPost } from "../redux/actions/postActions"
import { useDispatch, useSelector } from 'react-redux'
import axios from 'axios'


const PostDisplay = () => {
  const { loading, data, error } = useSelector((state) => state)
  //  console.log(data);
  const dispatch = useDispatch();
  // useEffect(
  //   () => {
  //     dispatch(postFetching())
  //     axios.get("https://gauravgitacc.github.io/postAppData/posts.json")
  //       .then((response) => dispatch(postFetchSuccess(response.data)))
  //       .catch((error) => dispatch(postFetchError(error.message)))
  //   },
  //   []

  // )
  useEffect(
    ()=>{
      dispatch(fetchPost())
    },[]
  )
  return (
    <div>
      {
        data &&
        data.map((item, index) => (
          <div key={index}>
            <h1>{item.title}</h1>
            <p>{item.body}</p>
          </div>
        
        )
        )
      }
    </div>
  )
}

export default PostDisplay