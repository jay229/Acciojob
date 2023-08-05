import {SELECTED_SONG} from "../actions/actionsType"

let initialState=null;
const songReducer=(state=initialState,action)=>{
    switch (action.type) {
        case SELECTED_SONG:
            return action.payload;
        default:
            return state;
    }
}
export default songReducer;