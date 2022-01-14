import MovieStars from "components/movieStars";
import './styles.css';


type props ={
    score : number;
    count : number;
}

function MovieScore({score, count} : props) {

    return (
        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars score={score}/>
            <p className="dsmovie-score-count">{count} avaliações</p>
        </div>
    )
}

export default MovieScore;