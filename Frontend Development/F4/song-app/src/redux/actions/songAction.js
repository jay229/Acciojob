import { SELECTED_SONG } from "./actionsType";

export const selected_song=(song)=>{
    // console.log(song);
    return(
        {
            type:SELECTED_SONG,
            payload:song
        }
    )
}