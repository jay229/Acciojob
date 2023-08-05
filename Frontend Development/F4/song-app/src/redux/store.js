import {createStore} from "redux";
import songReducer from "./reducer/songReducer"

const store=createStore(songReducer);
export default store;
