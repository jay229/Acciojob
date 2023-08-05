import {createStore,combineReducers} from "redux";
import songReducer from "./reducer/songReducer"
import songDataReducer from "./reducer/songData"


const rootReducer=combineReducers({
    selectedSong: songReducer,
    songsData: songDataReducer
})
const store=createStore(rootReducer);
export default store;
