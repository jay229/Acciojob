import React from 'react'
import { useSelector } from 'react-redux/es/hooks/useSelector'
const SongInfo = () => {
    const song = useSelector(state => state.selectedSong)
    console.log(song);
    return (
        <div>
            <h1>Song Info</h1>
            {
                song &&
                <div>
                    <h3>{song.name}</h3>
                    <h3>{song.author}</h3>
                    <h3>{song.duration}</h3>
                    <h3>{song.genere}</h3>
                    <h3>{song.album}</h3>
                </div>
            }
        </div>
    )
}

export default SongInfo